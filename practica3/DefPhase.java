import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class DefPhase extends PsicoderBaseListener{

    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope;

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
        FunctionSymbol function = new FunctionSymbol(name, type, currentScope);
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
        defineVar(ctx.type(), ctx.ID().getSymbol());
    }

    //stmt4: type  ID  TK_ASIG  exp  TK_PYC
    @Override
    public void exitStmt4TypeIDAsig(PsicoderParser.Stmt4TypeIDAsigContext ctx) {
        defineVar(ctx.type(), ctx.ID().getSymbol());
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
        int typeTokenType = typeCtx.start.getType();
        Symbol.Type type = Interpreter.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var);
    }
}
