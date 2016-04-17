import org.antlr.v4.runtime.Token;
import java.util.HashMap;

public class DefPhase extends PsicoderBaseListener{

    public static HashMap<String, Scope> scopes = new HashMap<String, Scope>();
    public static GlobalScope globals;
    public static Scope currentScope;
    private TypeVisitor visitor = new TypeVisitor();

    private Integer functionArgument = 0;
    private Integer functionScopes = 0;
    private FunctionSymbol tmp;
    private Symbol.Type symbolTmp;

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
        functionScopes = 1;
    }

    @Override
    public void exitBFuncionPrincipal(PsicoderParser.BFuncionPrincipalContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
        System.out.println(currentScope);
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
        functionScopes = 1;
    }

    @Override
    public void exitElementFuncion(PsicoderParser.ElementFuncionContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
        functionScopes = 0;
    }

    //params : type ID TK_COMA params
    @Override
    public void exitParamsTypeIDComa(PsicoderParser.ParamsTypeIDComaContext ctx) {
        Symbol.Type type = defineType(ctx.type());
        if (type == Symbol.Type.tID) {
            String name = ctx.type().getText();
            Symbol var = currentScope.resolve(name);
            if ( var==null )
                Interpreter.error(ctx.ID().getSymbol(), "Tipo de vairable no definido");
            if ( var instanceof StructSymbol ) {
                name = ctx.ID().getText();
                StructSymbol struct = new StructSymbol(name, var.type, currentScope);
                currentScope.define(struct);
                saveScope(name, struct);
                struct.arguments = ((StructSymbol) var).arguments;
                ((FunctionSymbol) currentScope).parameters.put(functionArgument,name);
                functionArgument ++;
            }
            else
                Interpreter.error(ctx.ID().getSymbol(), "Tipo de vairable no definido");
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
                Interpreter.error(ctx.ID().getSymbol(), "Tipo de vairable no definido");
            if ( var instanceof StructSymbol ) {
                StructSymbol struct = new StructSymbol(ctx.ID().getText(), var.type, currentScope);
                currentScope.define(struct);
                saveScope(ctx.ID().getText(), struct);
                struct.arguments = ((StructSymbol) var).arguments;
                ((FunctionSymbol) currentScope).parameters.put(functionArgument,name);
                functionArgument ++;
            }
            else
                Interpreter.error(ctx.ID().getSymbol(), "Tipo de vairable no definido");
        }
        else{
            ((FunctionSymbol) currentScope).parameters.put(functionArgument,ctx.ID().getText());
            functionArgument ++;
            defineVar(ctx.type(), ctx.ID().getSymbol());
        }
    }

    //exp: ID  TK_PAR_IZQ  optargs  TK_PAR_DER  TK_PYC
    @Override
    public void enterExpFuncion(PsicoderParser.ExpFuncionContext ctx) {
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

    //stmt: type  ID  TK_ASIG  exp  TK_COMA  optexp  TK_PYC
    @Override
    public void enterStmtTypeAsig(PsicoderParser.StmtTypeAsigContext ctx) {
        symbolTmp = defineType(ctx.type());
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (symbolTmp == type2)
            defineVar(symbolTmp, ctx.ID().getSymbol());
        else
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + symbolTmp + " pero se le asigno " + type2);
    }

    //stmt: type  ID  TK_COMA  optexp  TK_PYC
    @Override
    public void enterStmtTypeAsigOptexp(PsicoderParser.StmtTypeAsigOptexpContext ctx) {
        symbolTmp = defineType(ctx.type());
        defineVar(symbolTmp, ctx.ID().getSymbol());
    }

    //optexp: ID  TK_COMA  optexp
    @Override
    public void enterOptexpIDComa(PsicoderParser.OptexpIDComaContext ctx) {
        defineVar(symbolTmp, ctx.ID().getSymbol());
    }

    //optexp: ID  TK_ASIG  exp  TK_COMA  optexp
    @Override
    public void enterOptexpIDAsigExpComa(PsicoderParser.OptexpIDAsigExpComaContext ctx) {
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (symbolTmp == type2)
            defineVar(symbolTmp, ctx.ID().getSymbol());
        else
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + symbolTmp + " pero se le asigno " + type2);
    }

    //optexp: ID
    @Override
    public void enterOptexpID(PsicoderParser.OptexpIDContext ctx) {
        defineVar(symbolTmp, ctx.ID().getSymbol());
    }

    //optexp: ID  TK_ASIG  exp
    @Override
    public void enterOptexpIDAsigExp(PsicoderParser.OptexpIDAsigExpContext ctx) {
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (symbolTmp == type2)
            defineVar(symbolTmp, ctx.ID().getSymbol());
        else
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + symbolTmp + " pero se le asigno " + type2);
    }

    //stmt: ID  TK_ASIG  exp  TK_PYC
    @Override
    public void enterStmtIDAsig(PsicoderParser.StmtIDAsigContext ctx) {
        Symbol var = currentScope.resolve(ctx.ID().getText());
        if(var == null) {
            Interpreter.error(ctx.ID().getSymbol(), "Variable" + ctx.ID().getText() + "no definida");
            return;
        }
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (var.type != type2)
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + var.type + " pero se le asigno " + type2);
    }

    //para_stmt: ID  TK_ASIG  exp  TK_PYC
    @Override
    public void enterParaStmtIDAsig(PsicoderParser.ParaStmtIDAsigContext ctx) {
        Symbol var = currentScope.resolve(ctx.ID().getText());
        if(var == null) {
            Interpreter.error(ctx.ID().getSymbol(), "Variable" + ctx.ID().getText() + "no definida");
            return;
        }
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (var.type != type2)
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + var.type + " pero se le asigno " + type2);
    }

    //stmt: type  ID  TK_ASIG  exp  TK_PYC
    @Override
    public void enterStmtTypeAsigExp(PsicoderParser.StmtTypeAsigExpContext ctx) {
        Symbol.Type type = defineType(ctx.type());
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (type == type2)
            defineVar(type, ctx.ID().getSymbol());
        else
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + type + " pero se le asigno " + type2);
    }

    //para_stmt: type  ID  TK_ASIG  exp  TK_PYC
    @Override
    public void exitParaStmtTypeAsigExp(PsicoderParser.ParaStmtTypeAsigExpContext ctx) {
        Symbol.Type type = defineType(ctx.type());
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (type == type2)
            defineVar(type, ctx.ID().getSymbol());
        else
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + type + " pero se le asigno " + type2);
    }


    //stmt: ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC
    @Override
    public void enterStmtIDChain(PsicoderParser.StmtIDChainContext ctx) {
        Symbol.Type type = visitor.visitStmtIDChain(ctx);
        if(type == Symbol.Type.tINVALID){
            return;
        }
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (type != type2)
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + type + " pero se le asigno " + type2);
    }

    //para_stmt: ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC
    @Override
    public void enterParaStmtIDChain(PsicoderParser.ParaStmtIDChainContext ctx) {
        Symbol.Type type = visitor.visitParaStmtIDChain(ctx);
        if(type == Symbol.Type.tINVALID){
            return;
        }
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (type != type2)
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
                Interpreter.error(ctx.ID().getSymbol(), "Tipo de vairable no definido");
            if ( var instanceof StructSymbol ) {
                StructSymbol struct = new StructSymbol(ctx.ID().getText(), var.type, currentScope);
                currentScope.define(struct);
                saveScope(ctx.ID().getText(), struct);
                struct.arguments = ((StructSymbol) var).arguments;
            }
            else
                Interpreter.error(ctx.ID().getSymbol(), "Tipo de vairable no definido");
        }
        else{
            defineVar(ctx.type(), ctx.ID().getSymbol());
        }
    }

    //stmt: SI TK_PAR_IZQ  exp  TK_PAR_DER  ENTONCES  statements  FIN_SI
    @Override
    public void enterStmtSi(PsicoderParser.StmtSiContext ctx) {
        Symbol.Type type = visitor.visit(ctx.exp());
        if(type != Symbol.Type.tBOOLEANO){
            Interpreter.error(ctx.exp().getStart(), "no se tiene una expresion booleana");
        }
        BlockScope bs = new BlockScope(currentScope.getScopeName() + functionScopes, currentScope);
        saveScope(bs.getScopeName(), bs);
        currentScope = bs;
        functionScopes++;
    }

    @Override
    public void exitStmtSi(PsicoderParser.StmtSiContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    //stmt: SI  TK_PAR_IZQ  exp  TK_PAR_DER  ENTONCES  statements si_noBlock
    @Override
    public void enterStmtSiNo(PsicoderParser.StmtSiNoContext ctx) {
        Symbol.Type type = visitor.visit(ctx.exp());
        if(type != Symbol.Type.tBOOLEANO){
            Interpreter.error(ctx.exp().getStart(), "no se tiene una expresion booleana");
        }
        BlockScope bs = new BlockScope(currentScope.getScopeName() + functionScopes, currentScope);
        saveScope(bs.getScopeName(), bs);
        currentScope = bs;
        functionScopes++;
    }

    //si_noBlock: SI_NO  statements  FIN_SI
    @Override public void enterSi_no(PsicoderParser.Si_noContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
        BlockScope bs = new BlockScope(currentScope.getScopeName() + functionScopes, currentScope);
        saveScope(bs.getScopeName(), bs);
        currentScope = bs;
        functionScopes++;
    }

    @Override public void exitSi_no(PsicoderParser.Si_noContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    //stmt: LEER  TK_PAR_IZQ  ID  TK_PAR_DER  TK_PYC
    @Override public void enterStmtLeerID(PsicoderParser.StmtLeerIDContext ctx) {
        Symbol symbol = currentScope.resolve(ctx.ID().getText());
        if(symbol == null)
            Interpreter.error(ctx.ID().getSymbol(), "no se ha declarado la variable");
    }

    //stmt: LEER  TK_PAR_IZQ  ID  TK_PUNTO  chain  TK_PAR_DER  TK_PYC
    @Override
    public void enterStmtLeerChain(PsicoderParser.StmtLeerChainContext ctx) {
        Symbol.Type type = visitor.visitStmtLeerChain(ctx);
        if(type == Symbol.Type.tINVALID){
            return;
        }
    }

    //imp_params : exp  TK_COMA  imp_params
    @Override public void enterImp_paramsChain(PsicoderParser.Imp_paramsChainContext ctx) {
        Symbol.Type type = visitor.visit(ctx.exp());
        if(type == Symbol.Type.tINVALID){
            Interpreter.error(ctx.exp().getStart(), "operacion no valida");
        }
    }

    //imp_params : exp
    @Override public void enterImp_paramsExp(PsicoderParser.Imp_paramsExpContext ctx) {
        Symbol.Type type = visitor.visit(ctx.exp());
        if(type == Symbol.Type.tINVALID){
            Interpreter.error(ctx.exp().getStart(), "operacion no valida");
        }
    }

    //PARA  TK_PAR_IZQ  para_stmt  exp  TK_PYC  exp TK_PAR_DER  HACER  statements3  FIN_PARA
    @Override
    public void enterStmtPara(PsicoderParser.StmtParaContext ctx) {
        BlockScope bs = new BlockScope(currentScope.getScopeName() + functionScopes, currentScope);
        saveScope(bs.getScopeName(), bs);
        currentScope = bs;
        functionScopes++;
    }

    @Override
    public void exitStmtPara(PsicoderParser.StmtParaContext ctx) {
        Symbol.Type type = visitor.visit(ctx.exp(0));
        if(type != Symbol.Type.tBOOLEANO){
            Interpreter.error(ctx.exp(0).getStart(), "no se tiene una expresion booleana");
        }
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    //stmt: MIENTRAS  TK_PAR_IZQ  exp  TK_PAR_DER  HACER statements3  FIN_MIENTRAS
    @Override
    public void enterStmtMientras(PsicoderParser.StmtMientrasContext ctx) {
        Symbol.Type type = visitor.visit(ctx.exp());
        if(type != Symbol.Type.tBOOLEANO){
            Interpreter.error(ctx.exp().getStart(), "no se tiene una expresion booleana");
        }
        BlockScope bs = new BlockScope(currentScope.getScopeName() + functionScopes, currentScope);
        saveScope(bs.getScopeName(), bs);
        currentScope = bs;
        functionScopes++;
    }

    @Override
    public void exitStmtMientras(PsicoderParser.StmtMientrasContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    //stmt: HACER  statements3  MIENTRAS  TK_PAR_IZQ  exp TK_PAR_DER  TK_PYC
    @Override
    public void enterStmtHacer(PsicoderParser.StmtHacerContext ctx) {
        BlockScope bs = new BlockScope(currentScope.getScopeName() + functionScopes, currentScope);
        saveScope(bs.getScopeName(), bs);
        currentScope = bs;
        functionScopes++;
    }

    @Override
    public void exitStmtHacer(PsicoderParser.StmtHacerContext ctx) {
        Symbol.Type type = visitor.visit(ctx.exp());
        if(type != Symbol.Type.tBOOLEANO){
            Interpreter.error(ctx.exp().getStart(), "no se tiene una expresion booleana");
        }
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    //SELECCIONAR  TK_PAR_IZQ  ID  TK_PAR_DER  ENTRE  cases FIN_SELECCIONAR
    @Override public void enterStmtSeleccionar(PsicoderParser.StmtSeleccionarContext ctx) {
        Symbol symbol = currentScope.resolve(ctx.ID().getText());
        if(symbol == null) {
            Interpreter.error(ctx.ID().getSymbol(), "Variable no definida");
            return;
        }
        symbolTmp = symbol.type;
    }

    //cases: CASO  exp  TK_POSD  statements3  cases2
    @Override public void enterCasesCaso(PsicoderParser.CasesCasoContext ctx) {
        Symbol.Type type = visitor.visit(ctx.exp());
        if(type != symbolTmp){
            Interpreter.error(ctx.exp().getStart(), "Tipo de variables no iguales");
        }
    }

    //cases2 : CASO  exp  TK_POSD  statements3  cases2
    @Override
    public void enterCases2Caso(PsicoderParser.Cases2CasoContext ctx) {
        Symbol.Type type = visitor.visit(ctx.exp());
        if(type != symbolTmp){
            Interpreter.error(ctx.exp().getStart(), "Tipo de variables no iguales");
        }
    }

    //stmt4: type  ID  TK_ASIG  exp  TK_PYC
    @Override
    public void enterStmt4TypeIDAsig(PsicoderParser.Stmt4TypeIDAsigContext ctx) {
        Symbol.Type type = defineType(ctx.type());
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (type == type2)
            defineVar(type, ctx.ID().getSymbol());
        else
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+" es de tipo " + type + " pero se le asigno " + type2);
    }

    //stmt4: type  ID  TK_PYC
    @Override
    public void enterStmt4TypeID(PsicoderParser.Stmt4TypeIDContext ctx) {
        Symbol.Type type = defineType(ctx.type());
        if (type == Symbol.Type.tID) {
            String name = ctx.type().getText();
            Symbol var = currentScope.resolve(name);
            if ( var==null )
                Interpreter.error(ctx.ID().getSymbol(), "Tipo de vairable no definido");
            if ( var instanceof StructSymbol ) {
                StructSymbol struct = new StructSymbol(ctx.ID().getText(), var.type, currentScope);
                currentScope.define(struct);
                saveScope(ctx.ID().getText(), struct);
                struct.arguments = ((StructSymbol) var).arguments;
            }
            else
                Interpreter.error(ctx.ID().getSymbol(), "Tipo de vairable no definido");
        }
        else{
            defineVar(ctx.type(), ctx.ID().getSymbol());
        }
    }

    //stmt4: ID  TK_PAR_IZQ  optargs  TK_PAR_DER  TK_PYC
    @Override
    public void enterStmt4Funcion(PsicoderParser.Stmt4FuncionContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = currentScope.resolve(name);
        if(var == null)
            System.out.println("La funcion " + name + " no se ha declarado");
        else{
            tmp = ((FunctionSymbol) scopes.get(name));
            functionArgument = 0;
        }
    }

    //stmt4: type  ID  TK_COMA  optexp  TK_PYC
    @Override
    public void enterStmt4TypeIDComa(PsicoderParser.Stmt4TypeIDComaContext ctx) {
        symbolTmp = defineType(ctx.type());
        defineVar(symbolTmp, ctx.ID().getSymbol());
    }

    @Override
    public void exitStmt4Funcion(PsicoderParser.Stmt4FuncionContext ctx) {
        functionArgument = 0;
    }

    //stmt4: type  ID  TK_ASIG  exp  TK_COMA  optexp  TK_PYC
    @Override
    public void enterStmt4TypeIDAsigComa(PsicoderParser.Stmt4TypeIDAsigComaContext ctx) {
        symbolTmp = defineType(ctx.type());
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (symbolTmp == type2)
            defineVar(symbolTmp, ctx.ID().getSymbol());
        else
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + symbolTmp + " pero se le asigno " + type2);
    }

    //stmt4: ID  TK_ASIG  exp  TK_PYC
    @Override
    public void enterStmt4IDAsig(PsicoderParser.Stmt4IDAsigContext ctx) {
        Symbol var = currentScope.resolve(ctx.ID().getText());
        if(var == null) {
            Interpreter.error(ctx.ID().getSymbol(), "Variable" + ctx.ID().getText() + "no definida");
            return;
        }
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (var.type != type2)
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + var.type + " pero se le asigno " + type2);
    }

    //stmt: ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC
    @Override
    public void enterStmt4IDChainAsig(PsicoderParser.Stmt4IDChainAsigContext ctx) {
        Symbol.Type type = visitor.visitStmt4IDChainAsig(ctx);
        if(type == Symbol.Type.tINVALID){
            return;
        }
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (type != type2)
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + type + " pero se le asigno " + type2);
    }

    private void saveScope(String id, Scope s) {
        scopes.put(id, s);
    }

    private void defineVar(PsicoderParser.TypeContext typeCtx, Token nameToken) {
        Symbol.Type type = defineType(typeCtx);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var);
    }

    private void defineVar(Symbol.Type type, Token nameToken) {
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var);
    }

    private Symbol.Type defineType(PsicoderParser.TypeContext typeCtx){
        int typeTokenType = typeCtx.start.getType();
        return Interpreter.getType(typeTokenType);
    }



    /// --------------- Statements 2 -------------------------

    //stmt2: ID  TK_PAR_IZQ  optargs  TK_PAR_DER  TK_PYC
    @Override
    public void enterStmt2CallFunction(PsicoderParser.Stmt2CallFunctionContext ctx) {
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
    public void exitStmt2CallFunction(PsicoderParser.Stmt2CallFunctionContext ctx) {
        functionArgument = 0;
    }

    //stmt2: type  ID  TK_ASIG  exp  TK_PYC
    @Override
    public void enterStmt2TypeAsigExp(PsicoderParser.Stmt2TypeAsigExpContext ctx) {
        Symbol.Type type = defineType(ctx.type());
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (type == type2)
            defineVar(type, ctx.ID().getSymbol());
        else
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + type + " pero se le asigno " + type2);
    }

    //stmt2: type  ID  TK_PYC
    @Override
    public void enterStmt2ID(PsicoderParser.Stmt2IDContext ctx) {
        Symbol.Type type = defineType(ctx.type());
        if (type == Symbol.Type.tID) {
            String name = ctx.type().getText();
            Symbol var = currentScope.resolve(name);
            if ( var==null )
                Interpreter.error(ctx.ID().getSymbol(), "Tipo de vairable no definido");
            if ( var instanceof StructSymbol ) {
                StructSymbol struct = new StructSymbol(ctx.ID().getText(), var.type, currentScope);
                currentScope.define(struct);
                saveScope(ctx.ID().getText(), struct);
                struct.arguments = ((StructSymbol) var).arguments;
            }
            else
                Interpreter.error(ctx.ID().getSymbol(), "Tipo de vairable no definido");
        }
        else{
            defineVar(ctx.type(), ctx.ID().getSymbol());
        }
    }

    //stmt: type  ID  TK_ASIG  exp  TK_COMA  optexp  TK_PYC
    @Override
    public void enterStmt2TypeAsig(PsicoderParser.Stmt2TypeAsigContext ctx) {
        symbolTmp = defineType(ctx.type());
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (symbolTmp == type2)
            defineVar(symbolTmp, ctx.ID().getSymbol());
        else
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + symbolTmp + " pero se le asigno " + type2);
    }

    //stmt: type  ID  TK_COMA  optexp  TK_PYC
    @Override
    public void enterStmt2TypeAsigOptexp(PsicoderParser.Stmt2TypeAsigOptexpContext ctx) {
        symbolTmp = defineType(ctx.type());
        defineVar(symbolTmp, ctx.ID().getSymbol());
    }

    //stmt: ID  TK_ASIG  exp  TK_PYC
    @Override
    public void enterStmt2IDAsig(PsicoderParser.Stmt2IDAsigContext ctx) {
        Symbol var = currentScope.resolve(ctx.ID().getText());
        if(var == null) {
            Interpreter.error(ctx.ID().getSymbol(), "Variable" + ctx.ID().getText() + "no definida");
            return;
        }
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (var.type != type2)
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + var.type + " pero se le asigno " + type2);
    }

    //stmt: ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC
    @Override
    public void enterStmt2IDChain(PsicoderParser.Stmt2IDChainContext ctx) {
        Symbol.Type type = visitor.visitStmt2IDChain(ctx);
        if(type == Symbol.Type.tINVALID){
            return;
        }
        Symbol.Type type2 = visitor.visit(ctx.exp());
        if (type != type2)
            Interpreter.error(ctx.ID().getSymbol(), ctx.ID().getSymbol().getText()+ " es de tipo " + type + " pero se le asigno " + type2);
    }

    //stmt: SI TK_PAR_IZQ  exp  TK_PAR_DER  ENTONCES  statements  FIN_SI
    @Override
    public void enterStmt2Si(PsicoderParser.Stmt2SiContext ctx) {
        Symbol.Type type = visitor.visit(ctx.exp());
        if(type != Symbol.Type.tBOOLEANO){
            Interpreter.error(ctx.exp().getStart(), "no se tiene una expresion booleana");
        }
        BlockScope bs = new BlockScope(currentScope.getScopeName() + functionScopes, currentScope);
        saveScope(bs.getScopeName(), bs);
        currentScope = bs;
        functionScopes++;
    }

    @Override
    public void exitStmt2Si(PsicoderParser.Stmt2SiContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    //stmt: SI  TK_PAR_IZQ  exp  TK_PAR_DER  ENTONCES  statements si_noBlock2
    @Override
    public void enterStmt2SiNo(PsicoderParser.Stmt2SiNoContext ctx) {
        Symbol.Type type = visitor.visit(ctx.exp());
        if(type != Symbol.Type.tBOOLEANO){
            Interpreter.error(ctx.exp().getStart(), "no se tiene una expresion booleana");
        }
        BlockScope bs = new BlockScope(currentScope.getScopeName() + functionScopes, currentScope);
        saveScope(bs.getScopeName(), bs);
        currentScope = bs;
        functionScopes++;
    }

    @Override public void enterSi_no2(PsicoderParser.Si_no2Context ctx) {
        currentScope = currentScope.getEnclosingScope();
        BlockScope bs = new BlockScope(currentScope.getScopeName() + functionScopes, currentScope);
        saveScope(bs.getScopeName(), bs);
        currentScope = bs;
        functionScopes++;
    }

    @Override public void exitSi_no2(PsicoderParser.Si_no2Context ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    //stmt: LEER  TK_PAR_IZQ  ID  TK_PAR_DER  TK_PYC
    @Override public void enterStmt2LeerID(PsicoderParser.Stmt2LeerIDContext ctx) {
        Symbol symbol = currentScope.resolve(ctx.ID().getText());
        if(symbol == null)
            Interpreter.error(ctx.ID().getSymbol(), "no se ha declarado la variable");
    }

    //stmt: LEER  TK_PAR_IZQ  ID  TK_PUNTO  chain  TK_PAR_DER  TK_PYC
    @Override
    public void enterStmt2LeerChain(PsicoderParser.Stmt2LeerChainContext ctx) {
        Symbol.Type type = visitor.visitStmt2LeerChain(ctx);
        if(type == Symbol.Type.tINVALID){
            return;
        }
    }

    //PARA  TK_PAR_IZQ  para_stmt  exp  TK_PYC  exp TK_PAR_DER  HACER  statements3  FIN_PARA
    @Override
    public void enterStmt2Para(PsicoderParser.Stmt2ParaContext ctx) {
        BlockScope bs = new BlockScope(currentScope.getScopeName() + functionScopes, currentScope);
        saveScope(bs.getScopeName(), bs);
        currentScope = bs;
        functionScopes++;
    }

    @Override
    public void exitStmt2Para(PsicoderParser.Stmt2ParaContext ctx) {
        Symbol.Type type = visitor.visit(ctx.exp(0));
        if(type != Symbol.Type.tBOOLEANO){
            Interpreter.error(ctx.exp(0).getStart(), "no se tiene una expresion booleana");
        }
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    //stmt: MIENTRAS  TK_PAR_IZQ  exp  TK_PAR_DER  HACER statements3  FIN_MIENTRAS
    @Override
    public void enterStmt2Mientras(PsicoderParser.Stmt2MientrasContext ctx) {
        Symbol.Type type = visitor.visit(ctx.exp());
        if(type != Symbol.Type.tBOOLEANO){
            Interpreter.error(ctx.exp().getStart(), "no se tiene una expresion booleana");
        }
        BlockScope bs = new BlockScope(currentScope.getScopeName() + functionScopes, currentScope);
        saveScope(bs.getScopeName(), bs);
        currentScope = bs;
        functionScopes++;
    }

    @Override
    public void exitStmt2Mientras(PsicoderParser.Stmt2MientrasContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    //stmt: HACER  statements3  MIENTRAS  TK_PAR_IZQ  exp TK_PAR_DER  TK_PYC
    @Override
    public void enterStmt2Hacer(PsicoderParser.Stmt2HacerContext ctx) {
        BlockScope bs = new BlockScope(currentScope.getScopeName() + functionScopes, currentScope);
        saveScope(bs.getScopeName(), bs);
        currentScope = bs;
        functionScopes++;
    }

    @Override
    public void exitStmt2Hacer(PsicoderParser.Stmt2HacerContext ctx) {
        Symbol.Type type = visitor.visit(ctx.exp());
        if(type != Symbol.Type.tBOOLEANO){
            Interpreter.error(ctx.exp().getStart(), "no se tiene una expresion booleana");
        }
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    //SELECCIONAR  TK_PAR_IZQ  ID  TK_PAR_DER  ENTRE  cases FIN_SELECCIONAR
    @Override public void enterStmt2Seleccionar(PsicoderParser.Stmt2SeleccionarContext ctx) {
        Symbol symbol = currentScope.resolve(ctx.ID().getText());
        if(symbol == null) {
            Interpreter.error(ctx.ID().getSymbol(), "Variable no definida");
            return;
        }
        symbolTmp = symbol.type;
    }
}
