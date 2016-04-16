import org.antlr.v4.runtime.Token;

import java.util.HashMap;

public class DefPhase extends PsicoderBaseListener{

    //static ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    static HashMap<String, Scope> scopes = new HashMap<String, Scope>();
    static GlobalScope globals;
    public static Scope currentScope;
    private FunctionSymbol tmp;
    private TypeVisitor visitor = new TypeVisitor();
    private Integer functionArgument = 0;

    //ps : element ps
    @Override
    public void enterPsElement(PsicoderParser.PsElementContext ctx) {
        if(globals == null){
            globals = new GlobalScope(null);
        }
        currentScope = globals;
    }

    //ps: b
    @Override
    public void enterPsB(PsicoderParser.PsBContext ctx) {
        if(globals == null){
            globals = new GlobalScope(null);
        }
        currentScope = globals;
    }

    //b :FUNCION_PRINCIPAL statements FIN_PRINCIPAL
    @Override
    public void enterBFuncionPrincipal(PsicoderParser.BFuncionPrincipalContext ctx) {
        FunctionSymbol function = new FunctionSymbol("funcionPrincipal", Symbol.Type.tINVALID, currentScope);
        currentScope.define(function);
        saveScope("funcionPrincipal", function);
        currentScope = function;
    }

    @Override
    public void exitBFuncionPrincipal(PsicoderParser.BFuncionPrincipalContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
        System.out.println(currentScope);
    }

    //element : FUNCION type ID TK_PAR_IZQ optparams TK_PAR_DER HACER statements RETORNAR exp TK_PYC FIN_FUNCION
    @Override
    public void enterElementFuncion(PsicoderParser.ElementFuncionContext ctx) {
        String name = ctx.ID().getText();
        int typeTokenType = ctx.type().start.getType();
        Symbol.Type type = Interpreter.getType(typeTokenType);
        FunctionSymbol function = new FunctionSymbol(name, type, currentScope);
        currentScope.define(function);
        saveScope(name, function);
        currentScope = function;
        functionArgument = 0;
    }

    @Override
    public void exitElementFuncion(PsicoderParser.ElementFuncionContext ctx) {
        System.out.println(currentScope);
        //System.out.println(((FunctionSymbol) currentScope).parameters.size());
        currentScope = currentScope.getEnclosingScope();
    }

    //params : type ID TK_COMA params
    @Override
    public void exitParamsTypeIDComa(PsicoderParser.ParamsTypeIDComaContext ctx) {
        Symbol.Type type = defineType(ctx.type());
        if (type == Symbol.Type.tID) {
            String name = ctx.type().getText();
            Symbol var = currentScope.resolve(name);
            if ( var==null )
                Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + type + " pero se le asigno " + var.type);
            if ( var instanceof StructSymbol ) {
                name = ctx.ID().getText();
                StructSymbol struct = new StructSymbol(name, var.type, currentScope);
                currentScope.define(struct);
                saveScope(name, struct);
                struct.arguments = ((StructSymbol) var).arguments;
                ((FunctionSymbol) currentScope).parameters.put(functionArgument,name);
                functionArgument ++;
            }
        }
        else{
            ((FunctionSymbol) currentScope).parameters.put(functionArgument,ctx.ID().getText());
            functionArgument ++;
            defineVar(ctx.type(), ctx.ID().getSymbol());
        }
    }

    //params : type ID
    @Override
    public void exitParamsTypeID(PsicoderParser.ParamsTypeIDContext ctx) {
        Symbol.Type type = defineType(ctx.type());
        if (type == Symbol.Type.tID) {
            String name = ctx.type().getText();
            Symbol var = currentScope.resolve(name);
            if ( var==null )
                Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + type + " pero se le asigno " + var.type);
            if ( var instanceof StructSymbol ) {
                StructSymbol struct = new StructSymbol(ctx.ID().getText(), var.type, currentScope);
                currentScope.define(struct);
                saveScope(ctx.ID().getText(), struct);
                struct.arguments = ((StructSymbol) var).arguments;
                ((FunctionSymbol) currentScope).parameters.put(functionArgument,name);
                functionArgument ++;
            }
        }
        else{
            ((FunctionSymbol) currentScope).parameters.put(functionArgument,ctx.ID().getText());
            functionArgument ++;
            defineVar(ctx.type(), ctx.ID().getSymbol());
        }
    }

    @Override
    public void enterExpFuncion(PsicoderParser.ExpFuncionContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = currentScope.resolve(name);
        if(var == null)
            System.out.println("La funcion " + name + " no se ha declarado");
        else{
            tmp = ((FunctionSymbol) scopes.get(name));
            //System.out.println("llamando" + currentScope);
            functionArgument = 0;
        }
    }

    @Override
    public void exitExpFuncion(PsicoderParser.ExpFuncionContext ctx) {
        functionArgument = 0;
    }

    //stmt: ID  TK_PAR_IZQ  optargs  TK_PAR_DER  TK_PYC
    @Override
    public void enterStmtCallFunction(PsicoderParser.StmtCallFunctionContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = currentScope.resolve(name);
        if(var == null)
            System.out.println("La funcion " + name + " no se ha declarado");
        else{
            tmp = ((FunctionSymbol) scopes.get(name));
            functionArgument = 0;
        }
    }

    @Override
    public void exitStmtCallFunction(PsicoderParser.StmtCallFunctionContext ctx) {
        functionArgument = 0;
    }

    //optargs :
    @Override
    public void enterOptargsEpsilon(PsicoderParser.OptargsEpsilonContext ctx) {
        if( tmp.parameters.size() != 0 )
            Interpreter.error(ctx.start, " Numero de argumentos menor a " + tmp.parameters.size());
    }
    //args : exp
    @Override
    public void enterArgsExp(PsicoderParser.ArgsExpContext ctx) {
        FunctionSymbol fs = tmp;
        if(functionArgument >= fs.parameters.size()){
            Interpreter.error(ctx.start, "Numero de argumentos mayor a " + fs.parameters.size());
            return;
        }
        if(functionArgument < fs.parameters.size()-1){
            Interpreter.error(ctx.start, "Numero de argumentos menor a " + fs.parameters.size());
            return;
        }
        Symbol.Type type = visitor.visit(ctx.exp());
        if(type != fs.arguments.get(fs.parameters.get(functionArgument)).type )
            Interpreter.error(ctx.start, "Argumentos con tipo distinto a " + fs.arguments.get(fs.parameters.get(functionArgument)).type);
    }

    //args : exp TK_COMA args
    @Override
    public void enterArgsExpArgs(PsicoderParser.ArgsExpArgsContext ctx) {
        FunctionSymbol fs = tmp;
        if(functionArgument >= fs.parameters.size()){
            Interpreter.error(ctx.start, "Numero de argumentos mayor a :( " + fs.parameters.size());
            functionArgument ++;
            return;
        }

        Symbol.Type type = visitor.visit(ctx.exp());
        if(type != fs.arguments.get(fs.parameters.get(functionArgument)).type ){
            Interpreter.error(ctx.start, "Argumentos con tipo distinto a " + fs.arguments.get(fs.parameters.get(functionArgument)).type);
        }
        functionArgument ++;
    }

    //element: ESTRUCTURA ID statements4 FIN_ESTRUCTURA
    @Override
    public void enterElementEstructura(PsicoderParser.ElementEstructuraContext ctx) {
        String name = ctx.ID().getText();
        int typeTokenType = ctx.ESTRUCTURA().getSymbol().getType();
        Symbol.Type type = Interpreter.getType(typeTokenType);
        StructSymbol function = new StructSymbol(name, type, currentScope);
        currentScope.define(function);
        saveScope(name, function);
        currentScope = function;
    }

    @Override
    public void exitElementEstructura(PsicoderParser.ElementEstructuraContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    //stmt: type  ID  TK_ASIG  exp  TK_PYC
    @Override
    public void exitStmtTypeAsifExp(PsicoderParser.StmtTypeAsifExpContext ctx) {
        Symbol.Type type = defineType(ctx.type());
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (type == type2)
            defineVar(type, ctx.ID().getSymbol());
        else
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + type + " pero se le asigno " + type2);
    }

    //stmt: type  ID  TK_PYC
    @Override
    public void exitStmtID(PsicoderParser.StmtIDContext ctx) {
        Symbol.Type type = defineType(ctx.type());
        if (type == Symbol.Type.tID) {
            String name = ctx.type().getText();
            Symbol var = currentScope.resolve(name);
            if ( var==null )
                Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + type + " pero se le asigno " + var.type);
            if ( var instanceof StructSymbol ) {
                StructSymbol struct = new StructSymbol(ctx.ID().getText(), var.type, currentScope);
                currentScope.define(struct);
                saveScope(ctx.ID().getText(), struct);
                struct.arguments = ((StructSymbol) var).arguments;
            }
        }
        else{
            defineVar(ctx.type(), ctx.ID().getSymbol());
        }
    }

    //stmt4: type  ID  TK_ASIG  exp  TK_PYC
    @Override
    public void exitStmt4TypeIDAsig(PsicoderParser.Stmt4TypeIDAsigContext ctx) {
        Symbol.Type type = defineType(ctx.type());
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (type == type2)
            defineVar(type, ctx.ID().getSymbol());
        else
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+" es de tipo " + type + " pero se le asigno " + type2);
    }

    //stmt4: type  ID  TK_PYC
    @Override
    public void exitStmt4TypeID(PsicoderParser.Stmt4TypeIDContext ctx) {
        Symbol.Type type = defineType(ctx.type());
        if (type == Symbol.Type.tID) {
            String name = ctx.type().getText();
            Symbol var = currentScope.resolve(name);
            if ( var==null )
                Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + type + " pero se le asigno " + var.type);
            if ( var instanceof StructSymbol ) {
                StructSymbol struct = new StructSymbol(ctx.ID().getText(), var.type, currentScope);
                currentScope.define(struct);
                saveScope(ctx.ID().getText(), struct);
                struct.arguments = ((StructSymbol) var).arguments;
            }
        }
        else{
            defineVar(ctx.type(), ctx.ID().getSymbol());
        }
    }

    void saveScope(String id, Scope s) {
        scopes.put(id, s);
    }

    void defineVar(PsicoderParser.TypeContext typeCtx, Token nameToken) {
        Symbol.Type type = defineType(typeCtx);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var);
    }

    void defineVar(Symbol.Type type, Token nameToken) {
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var);
    }

    Symbol.Type defineType(PsicoderParser.TypeContext typeCtx){
        int typeTokenType = typeCtx.start.getType();
        Symbol.Type type = Interpreter.getType(typeTokenType);
        return type;
    }
}
