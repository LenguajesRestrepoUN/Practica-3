import java.util.ArrayList;
import java.util.HashMap;

public class Visitor extends PsicoderBaseVisitor<String> {
    HashMap<String, ArrayList<String>> global = new HashMap<String, ArrayList<String>>();

    // FUNCION type ID TK_PAR_IZQ optparams TK_PAR_DER HACER statements RETORNAR exp TK_PYC FIN_FUNCION
    @Override
    public String visitElementFuncion(PsicoderParser.ElementFuncionContext ctx) {
        String name = ctx.ID().getText();
        global.put(name, new ArrayList<>());
        global.get(name).add(ctx.type().getText());
        System.out.println(global.get(name));
        System.out.println(ctx.optparams().getChildCount());
        return visitChildren(ctx);
    }

    //exp -> exp  TK_MAS  exp
    @Override
    public String visitExpMas(PsicoderParser.ExpMasContext ctx) {
        //int left = Integer.parseInt(visit(ctx.exp(0)));
        //int right = Integer.parseInt(visit(ctx.exp(1)));
        //return Integer.toString(left + right);
        return visitChildren(ctx);
    }

    //IMPRIMIR  TK_PAR_IZQ  imp_params  TK_PAR_DER  TK_PYC
    @Override
    public String visitStmtImprimir(PsicoderParser.StmtImprimirContext ctx) {
        return visit(ctx.imp_params());
    }

    @Override
    //imp_params : exp  TK_COMA  imp_params
    public String visitImp_paramsChain(PsicoderParser.Imp_paramsChainContext ctx) {
        System.out.print(visit(ctx.exp()));
        visit(ctx.imp_params());
        return null;
    }

    //imp_params : exp
    @Override
    public String visitImp_paramsExp(PsicoderParser.Imp_paramsExpContext ctx) {
        System.out.print(visit(ctx.exp()));
        return null;
    }

    // exp: ID
    @Override
    public String visitExpID(PsicoderParser.ExpIDContext ctx) {
        return ctx.getText();
    }

    // exp: TK_ENTERO
    @Override
    public String visitExpEntero(PsicoderParser.ExpEnteroContext ctx) {
        //System.out.println(ctx.getText());
        return ctx.getText();
    }

    // exp: TK_REAL
    @Override
    public String visitExpReal(PsicoderParser.ExpRealContext ctx) {
        //System.out.println(ctx.getText());
        return ctx.getText();
    }

    // exp: TK_CADENA
    @Override
    public String visitExpCadena(PsicoderParser.ExpCadenaContext ctx) {
        //System.out.println(ctx.getText());
        return ctx.getText();
    }
}
