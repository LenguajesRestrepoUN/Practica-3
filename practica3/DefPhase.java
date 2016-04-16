import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class DefPhase extends PsicoderBaseListener{

    static ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    static GlobalScope globals;
    public static Scope currentScope;
    private TypeVisitor visitor = new TypeVisitor();

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
    public void enterPsB(PsicoderParser.PsBContext ctx) {}

    //element : FUNCION type ID TK_PAR_IZQ optparams TK_PAR_DER HACER statements RETORNAR exp TK_PYC FIN_FUNCION
    @Override
    public void enterElementFuncion(PsicoderParser.ElementFuncionContext ctx) {
        String name = ctx.ID().getText();
        int typeTokenType = ctx.type().start.getType();
        Symbol.Type type = Interpreter.getType(typeTokenType);
        FunctionSymbol function = new FunctionSymbol(name, type, currentScope);
        currentScope.define(function);
        saveScope(ctx, function);
        currentScope = function;
    }

    @Override
    public void exitElementFuncion(PsicoderParser.ElementFuncionContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    //element: ESTRUCTURA ID statements4 FIN_ESTRUCTURA
    @Override
    public void enterElementEstructura(PsicoderParser.ElementEstructuraContext ctx) {
        String name = ctx.ID().getText();
        int typeTokenType = ctx.ESTRUCTURA().getSymbol().getType();
        Symbol.Type type = Interpreter.getType(typeTokenType);
        StructSymbol function = new StructSymbol(name, type, currentScope);
        currentScope.define(function);
        saveScope(ctx, function);
        currentScope = function;
    }

    @Override
    public void exitElementEstructura(PsicoderParser.ElementEstructuraContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    //params : type ID TK_COMA params
    @Override
    public void exitParamsTypeIDComa(PsicoderParser.ParamsTypeIDComaContext ctx) {
        defineVar(ctx.type(), ctx.ID().getSymbol());
    }

    //params : type ID
    @Override
    public void exitParamsTypeID(PsicoderParser.ParamsTypeIDContext ctx) {
        defineVar(ctx.type(), ctx.ID().getSymbol());
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
        defineVar(ctx.type(), ctx.ID().getSymbol());
    }

    void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
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
