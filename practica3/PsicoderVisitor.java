// Generated from C:/Users/jccaleroe/Documents/Practica-3/practica3\Psicoder.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PsicoderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PsicoderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code psElement}
	 * labeled alternative in {@link PsicoderParser#ps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPsElement(PsicoderParser.PsElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code psB}
	 * labeled alternative in {@link PsicoderParser#ps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPsB(PsicoderParser.PsBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code psEpsilon}
	 * labeled alternative in {@link PsicoderParser#ps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPsEpsilon(PsicoderParser.PsEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bFuncionPrincipal}
	 * labeled alternative in {@link PsicoderParser#b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBFuncionPrincipal(PsicoderParser.BFuncionPrincipalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementFuncion}
	 * labeled alternative in {@link PsicoderParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementFuncion(PsicoderParser.ElementFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementEstructura}
	 * labeled alternative in {@link PsicoderParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementEstructura(PsicoderParser.ElementEstructuraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeEntero}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeEntero(PsicoderParser.TypeEnteroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeCaracter}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCaracter(PsicoderParser.TypeCaracterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeCadena}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCadena(PsicoderParser.TypeCadenaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeReal}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReal(PsicoderParser.TypeRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBooleano}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBooleano(PsicoderParser.TypeBooleanoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeID}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeID(PsicoderParser.TypeIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optparamsP}
	 * labeled alternative in {@link PsicoderParser#optparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptparamsP(PsicoderParser.OptparamsPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optparamsEpsilon}
	 * labeled alternative in {@link PsicoderParser#optparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptparamsEpsilon(PsicoderParser.OptparamsEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramsTypeIDComa}
	 * labeled alternative in {@link PsicoderParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsTypeIDComa(PsicoderParser.ParamsTypeIDComaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramsTypeID}
	 * labeled alternative in {@link PsicoderParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsTypeID(PsicoderParser.ParamsTypeIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optargsArgs}
	 * labeled alternative in {@link PsicoderParser#optargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptargsArgs(PsicoderParser.OptargsArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optargsEpsilon}
	 * labeled alternative in {@link PsicoderParser#optargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptargsEpsilon(PsicoderParser.OptargsEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argsExpArgs}
	 * labeled alternative in {@link PsicoderParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsExpArgs(PsicoderParser.ArgsExpArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argsExp}
	 * labeled alternative in {@link PsicoderParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsExp(PsicoderParser.ArgsExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementsEpsilonStmt}
	 * labeled alternative in {@link PsicoderParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementsEpsilonStmt(PsicoderParser.StatementsEpsilonStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementsEpsilon}
	 * labeled alternative in {@link PsicoderParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementsEpsilon(PsicoderParser.StatementsEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statements3Stmt}
	 * labeled alternative in {@link PsicoderParser#statements3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements3Stmt(PsicoderParser.Statements3StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statements3Epsilon}
	 * labeled alternative in {@link PsicoderParser#statements3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements3Epsilon(PsicoderParser.Statements3EpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statements4Stmt}
	 * labeled alternative in {@link PsicoderParser#statements4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements4Stmt(PsicoderParser.Statements4StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statements4Epsilon}
	 * labeled alternative in {@link PsicoderParser#statements4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements4Epsilon(PsicoderParser.Statements4EpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtCallFunction}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtCallFunction(PsicoderParser.StmtCallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtTypeAsig}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtTypeAsig(PsicoderParser.StmtTypeAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtTypeAsigOptexp}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtTypeAsigOptexp(PsicoderParser.StmtTypeAsigOptexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIDAsig}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIDAsig(PsicoderParser.StmtIDAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtTypeAsifExp}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtTypeAsifExp(PsicoderParser.StmtTypeAsifExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIDChain}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIDChain(PsicoderParser.StmtIDChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtID}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtID(PsicoderParser.StmtIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtSi}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtSi(PsicoderParser.StmtSiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtSiNo}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtSiNo(PsicoderParser.StmtSiNoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtLeerID}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtLeerID(PsicoderParser.StmtLeerIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtLeerChain}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtLeerChain(PsicoderParser.StmtLeerChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtImprimir}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtImprimir(PsicoderParser.StmtImprimirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtPara}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPara(PsicoderParser.StmtParaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtMientras}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtMientras(PsicoderParser.StmtMientrasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtHacer}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtHacer(PsicoderParser.StmtHacerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtSeleccionar}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtSeleccionar(PsicoderParser.StmtSeleccionarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code casesCaso}
	 * labeled alternative in {@link PsicoderParser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasesCaso(PsicoderParser.CasesCasoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code casesDefecto}
	 * labeled alternative in {@link PsicoderParser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasesDefecto(PsicoderParser.CasesDefectoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cases2cacso}
	 * labeled alternative in {@link PsicoderParser#cases2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases2cacso(PsicoderParser.Cases2cacsoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cases2Epsilon}
	 * labeled alternative in {@link PsicoderParser#cases2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases2Epsilon(PsicoderParser.Cases2EpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cases2Defecto}
	 * labeled alternative in {@link PsicoderParser#cases2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases2Defecto(PsicoderParser.Cases2DefectoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#deft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeft(PsicoderParser.DeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imp_paramsChain}
	 * labeled alternative in {@link PsicoderParser#imp_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImp_paramsChain(PsicoderParser.Imp_paramsChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imp_paramsExp}
	 * labeled alternative in {@link PsicoderParser#imp_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImp_paramsExp(PsicoderParser.Imp_paramsExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optexpIDComa}
	 * labeled alternative in {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptexpIDComa(PsicoderParser.OptexpIDComaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optexpIDAsigExpComa}
	 * labeled alternative in {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptexpIDAsigExpComa(PsicoderParser.OptexpIDAsigExpComaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optexpID}
	 * labeled alternative in {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptexpID(PsicoderParser.OptexpIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optexpIDAsigExp}
	 * labeled alternative in {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptexpIDAsigExp(PsicoderParser.OptexpIDAsigExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chainIDPunto}
	 * labeled alternative in {@link PsicoderParser#chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainIDPunto(PsicoderParser.ChainIDPuntoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chainID}
	 * labeled alternative in {@link PsicoderParser#chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainID(PsicoderParser.ChainIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNegParExp}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNegParExp(PsicoderParser.ExpNegParExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMult}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMult(PsicoderParser.ExpMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expModulo}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpModulo(PsicoderParser.ExpModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expIDChain}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpIDChain(PsicoderParser.ExpIDChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expDif}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDif(PsicoderParser.ExpDifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFuncion}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFuncion(PsicoderParser.ExpFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMenos}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMenos(PsicoderParser.ExpMenosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMenor}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMenor(PsicoderParser.ExpMenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expAnd}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAnd(PsicoderParser.ExpAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMenosID}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMenosID(PsicoderParser.ExpMenosIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNegID}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNegID(PsicoderParser.ExpNegIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expDiv}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDiv(PsicoderParser.ExpDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expEntero}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpEntero(PsicoderParser.ExpEnteroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMayorIgual}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMayorIgual(PsicoderParser.ExpMayorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNegChain}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNegChain(PsicoderParser.ExpNegChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expOr}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOr(PsicoderParser.ExpOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMayor}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMayor(PsicoderParser.ExpMayorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMenorIgual}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMenorIgual(PsicoderParser.ExpMenorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMas}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMas(PsicoderParser.ExpMasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNegVerdadero}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNegVerdadero(PsicoderParser.ExpNegVerdaderoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expCadena}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCadena(PsicoderParser.ExpCadenaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNegFalso}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNegFalso(PsicoderParser.ExpNegFalsoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expParExp}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParExp(PsicoderParser.ExpParExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expVerdadero}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpVerdadero(PsicoderParser.ExpVerdaderoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMenosReal}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMenosReal(PsicoderParser.ExpMenosRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expIgual}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpIgual(PsicoderParser.ExpIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMenosEntero}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMenosEntero(PsicoderParser.ExpMenosEnteroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expReal}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpReal(PsicoderParser.ExpRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expCaracter}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCaracter(PsicoderParser.ExpCaracterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFalso}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFalso(PsicoderParser.ExpFalsoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expID}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpID(PsicoderParser.ExpIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2Romper}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2Romper(PsicoderParser.Stmt2RomperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2CallFunction}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2CallFunction(PsicoderParser.Stmt2CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2TypeAsig}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2TypeAsig(PsicoderParser.Stmt2TypeAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2TypeAsigOptexp}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2TypeAsigOptexp(PsicoderParser.Stmt2TypeAsigOptexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2IDAsig}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2IDAsig(PsicoderParser.Stmt2IDAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2TypeAsifExp}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2TypeAsifExp(PsicoderParser.Stmt2TypeAsifExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2IDChain}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2IDChain(PsicoderParser.Stmt2IDChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2ID}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2ID(PsicoderParser.Stmt2IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2Si}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2Si(PsicoderParser.Stmt2SiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2SiNo}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2SiNo(PsicoderParser.Stmt2SiNoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2LeerID}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2LeerID(PsicoderParser.Stmt2LeerIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2LeerChain}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2LeerChain(PsicoderParser.Stmt2LeerChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2Imprimir}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2Imprimir(PsicoderParser.Stmt2ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2Para}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2Para(PsicoderParser.Stmt2ParaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2Mientras}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2Mientras(PsicoderParser.Stmt2MientrasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2Hacer}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2Hacer(PsicoderParser.Stmt2HacerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2Seleccionar}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2Seleccionar(PsicoderParser.Stmt2SeleccionarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt4Funcion}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt4Funcion(PsicoderParser.Stmt4FuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt4TypeIDAsigComa}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt4TypeIDAsigComa(PsicoderParser.Stmt4TypeIDAsigComaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt4TypeIDComa}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt4TypeIDComa(PsicoderParser.Stmt4TypeIDComaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt4IDAsig}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt4IDAsig(PsicoderParser.Stmt4IDAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt4TypeIDAsig}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt4TypeIDAsig(PsicoderParser.Stmt4TypeIDAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt4IDChainAsig}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt4IDChainAsig(PsicoderParser.Stmt4IDChainAsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt4TypeID}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt4TypeID(PsicoderParser.Stmt4TypeIDContext ctx);
}