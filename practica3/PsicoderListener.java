// Generated from C:/Users/jccaleroe/Documents/Practica-3/practica3\Psicoder.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PsicoderParser}.
 */
public interface PsicoderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code psElement}
	 * labeled alternative in {@link PsicoderParser#ps}.
	 * @param ctx the parse tree
	 */
	void enterPsElement(PsicoderParser.PsElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code psElement}
	 * labeled alternative in {@link PsicoderParser#ps}.
	 * @param ctx the parse tree
	 */
	void exitPsElement(PsicoderParser.PsElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code psB}
	 * labeled alternative in {@link PsicoderParser#ps}.
	 * @param ctx the parse tree
	 */
	void enterPsB(PsicoderParser.PsBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code psB}
	 * labeled alternative in {@link PsicoderParser#ps}.
	 * @param ctx the parse tree
	 */
	void exitPsB(PsicoderParser.PsBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code psEpsilon}
	 * labeled alternative in {@link PsicoderParser#ps}.
	 * @param ctx the parse tree
	 */
	void enterPsEpsilon(PsicoderParser.PsEpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code psEpsilon}
	 * labeled alternative in {@link PsicoderParser#ps}.
	 * @param ctx the parse tree
	 */
	void exitPsEpsilon(PsicoderParser.PsEpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bFuncionPrincipal}
	 * labeled alternative in {@link PsicoderParser#b}.
	 * @param ctx the parse tree
	 */
	void enterBFuncionPrincipal(PsicoderParser.BFuncionPrincipalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bFuncionPrincipal}
	 * labeled alternative in {@link PsicoderParser#b}.
	 * @param ctx the parse tree
	 */
	void exitBFuncionPrincipal(PsicoderParser.BFuncionPrincipalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementFuncion}
	 * labeled alternative in {@link PsicoderParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementFuncion(PsicoderParser.ElementFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementFuncion}
	 * labeled alternative in {@link PsicoderParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementFuncion(PsicoderParser.ElementFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementEstructura}
	 * labeled alternative in {@link PsicoderParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementEstructura(PsicoderParser.ElementEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementEstructura}
	 * labeled alternative in {@link PsicoderParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementEstructura(PsicoderParser.ElementEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeEntero}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeEntero(PsicoderParser.TypeEnteroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeEntero}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeEntero(PsicoderParser.TypeEnteroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeCaracter}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeCaracter(PsicoderParser.TypeCaracterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeCaracter}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeCaracter(PsicoderParser.TypeCaracterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeCadena}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeCadena(PsicoderParser.TypeCadenaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeCadena}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeCadena(PsicoderParser.TypeCadenaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeReal}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeReal(PsicoderParser.TypeRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeReal}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeReal(PsicoderParser.TypeRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeBooleano}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBooleano(PsicoderParser.TypeBooleanoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeBooleano}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBooleano(PsicoderParser.TypeBooleanoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeID}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeID(PsicoderParser.TypeIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeID}
	 * labeled alternative in {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeID(PsicoderParser.TypeIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optparamsP}
	 * labeled alternative in {@link PsicoderParser#optparams}.
	 * @param ctx the parse tree
	 */
	void enterOptparamsP(PsicoderParser.OptparamsPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optparamsP}
	 * labeled alternative in {@link PsicoderParser#optparams}.
	 * @param ctx the parse tree
	 */
	void exitOptparamsP(PsicoderParser.OptparamsPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optparamsEpsilon}
	 * labeled alternative in {@link PsicoderParser#optparams}.
	 * @param ctx the parse tree
	 */
	void enterOptparamsEpsilon(PsicoderParser.OptparamsEpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optparamsEpsilon}
	 * labeled alternative in {@link PsicoderParser#optparams}.
	 * @param ctx the parse tree
	 */
	void exitOptparamsEpsilon(PsicoderParser.OptparamsEpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramsTypeIDComa}
	 * labeled alternative in {@link PsicoderParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParamsTypeIDComa(PsicoderParser.ParamsTypeIDComaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramsTypeIDComa}
	 * labeled alternative in {@link PsicoderParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParamsTypeIDComa(PsicoderParser.ParamsTypeIDComaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramsTypeID}
	 * labeled alternative in {@link PsicoderParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParamsTypeID(PsicoderParser.ParamsTypeIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramsTypeID}
	 * labeled alternative in {@link PsicoderParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParamsTypeID(PsicoderParser.ParamsTypeIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optargsArgs}
	 * labeled alternative in {@link PsicoderParser#optargs}.
	 * @param ctx the parse tree
	 */
	void enterOptargsArgs(PsicoderParser.OptargsArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optargsArgs}
	 * labeled alternative in {@link PsicoderParser#optargs}.
	 * @param ctx the parse tree
	 */
	void exitOptargsArgs(PsicoderParser.OptargsArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optargsEpsilon}
	 * labeled alternative in {@link PsicoderParser#optargs}.
	 * @param ctx the parse tree
	 */
	void enterOptargsEpsilon(PsicoderParser.OptargsEpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optargsEpsilon}
	 * labeled alternative in {@link PsicoderParser#optargs}.
	 * @param ctx the parse tree
	 */
	void exitOptargsEpsilon(PsicoderParser.OptargsEpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argsExpArgs}
	 * labeled alternative in {@link PsicoderParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgsExpArgs(PsicoderParser.ArgsExpArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argsExpArgs}
	 * labeled alternative in {@link PsicoderParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgsExpArgs(PsicoderParser.ArgsExpArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argsExp}
	 * labeled alternative in {@link PsicoderParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgsExp(PsicoderParser.ArgsExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argsExp}
	 * labeled alternative in {@link PsicoderParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgsExp(PsicoderParser.ArgsExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementsStmt}
	 * labeled alternative in {@link PsicoderParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatementsStmt(PsicoderParser.StatementsStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementsStmt}
	 * labeled alternative in {@link PsicoderParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatementsStmt(PsicoderParser.StatementsStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementsEpsilon}
	 * labeled alternative in {@link PsicoderParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatementsEpsilon(PsicoderParser.StatementsEpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementsEpsilon}
	 * labeled alternative in {@link PsicoderParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatementsEpsilon(PsicoderParser.StatementsEpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statements3Stmt}
	 * labeled alternative in {@link PsicoderParser#statements3}.
	 * @param ctx the parse tree
	 */
	void enterStatements3Stmt(PsicoderParser.Statements3StmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statements3Stmt}
	 * labeled alternative in {@link PsicoderParser#statements3}.
	 * @param ctx the parse tree
	 */
	void exitStatements3Stmt(PsicoderParser.Statements3StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statements3Epsilon}
	 * labeled alternative in {@link PsicoderParser#statements3}.
	 * @param ctx the parse tree
	 */
	void enterStatements3Epsilon(PsicoderParser.Statements3EpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statements3Epsilon}
	 * labeled alternative in {@link PsicoderParser#statements3}.
	 * @param ctx the parse tree
	 */
	void exitStatements3Epsilon(PsicoderParser.Statements3EpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statements4Stmt}
	 * labeled alternative in {@link PsicoderParser#statements4}.
	 * @param ctx the parse tree
	 */
	void enterStatements4Stmt(PsicoderParser.Statements4StmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statements4Stmt}
	 * labeled alternative in {@link PsicoderParser#statements4}.
	 * @param ctx the parse tree
	 */
	void exitStatements4Stmt(PsicoderParser.Statements4StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statements4Epsilon}
	 * labeled alternative in {@link PsicoderParser#statements4}.
	 * @param ctx the parse tree
	 */
	void enterStatements4Epsilon(PsicoderParser.Statements4EpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statements4Epsilon}
	 * labeled alternative in {@link PsicoderParser#statements4}.
	 * @param ctx the parse tree
	 */
	void exitStatements4Epsilon(PsicoderParser.Statements4EpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtCallFunction}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtCallFunction(PsicoderParser.StmtCallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtCallFunction}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtCallFunction(PsicoderParser.StmtCallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtTypeAsig}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtTypeAsig(PsicoderParser.StmtTypeAsigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtTypeAsig}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtTypeAsig(PsicoderParser.StmtTypeAsigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtTypeAsigOptexp}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtTypeAsigOptexp(PsicoderParser.StmtTypeAsigOptexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtTypeAsigOptexp}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtTypeAsigOptexp(PsicoderParser.StmtTypeAsigOptexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIDAsig}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtIDAsig(PsicoderParser.StmtIDAsigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIDAsig}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtIDAsig(PsicoderParser.StmtIDAsigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtTypeAsifExp}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtTypeAsifExp(PsicoderParser.StmtTypeAsifExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtTypeAsifExp}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtTypeAsifExp(PsicoderParser.StmtTypeAsifExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtIDChain}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtIDChain(PsicoderParser.StmtIDChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtIDChain}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtIDChain(PsicoderParser.StmtIDChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtID}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtID(PsicoderParser.StmtIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtID}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtID(PsicoderParser.StmtIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtSi}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtSi(PsicoderParser.StmtSiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtSi}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtSi(PsicoderParser.StmtSiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtSiNo}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtSiNo(PsicoderParser.StmtSiNoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtSiNo}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtSiNo(PsicoderParser.StmtSiNoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtLeerID}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtLeerID(PsicoderParser.StmtLeerIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtLeerID}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtLeerID(PsicoderParser.StmtLeerIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtLeerChain}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtLeerChain(PsicoderParser.StmtLeerChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtLeerChain}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtLeerChain(PsicoderParser.StmtLeerChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtImprimir}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtImprimir(PsicoderParser.StmtImprimirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtImprimir}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtImprimir(PsicoderParser.StmtImprimirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtPara}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtPara(PsicoderParser.StmtParaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtPara}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtPara(PsicoderParser.StmtParaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtMientras}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtMientras(PsicoderParser.StmtMientrasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtMientras}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtMientras(PsicoderParser.StmtMientrasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtHacer}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtHacer(PsicoderParser.StmtHacerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtHacer}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtHacer(PsicoderParser.StmtHacerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtSeleccionar}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtSeleccionar(PsicoderParser.StmtSeleccionarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtSeleccionar}
	 * labeled alternative in {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtSeleccionar(PsicoderParser.StmtSeleccionarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casesCaso}
	 * labeled alternative in {@link PsicoderParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCasesCaso(PsicoderParser.CasesCasoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casesCaso}
	 * labeled alternative in {@link PsicoderParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCasesCaso(PsicoderParser.CasesCasoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casesDefecto}
	 * labeled alternative in {@link PsicoderParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCasesDefecto(PsicoderParser.CasesDefectoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casesDefecto}
	 * labeled alternative in {@link PsicoderParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCasesDefecto(PsicoderParser.CasesDefectoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cases2cacso}
	 * labeled alternative in {@link PsicoderParser#cases2}.
	 * @param ctx the parse tree
	 */
	void enterCases2cacso(PsicoderParser.Cases2cacsoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cases2cacso}
	 * labeled alternative in {@link PsicoderParser#cases2}.
	 * @param ctx the parse tree
	 */
	void exitCases2cacso(PsicoderParser.Cases2cacsoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cases2Epsilon}
	 * labeled alternative in {@link PsicoderParser#cases2}.
	 * @param ctx the parse tree
	 */
	void enterCases2Epsilon(PsicoderParser.Cases2EpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cases2Epsilon}
	 * labeled alternative in {@link PsicoderParser#cases2}.
	 * @param ctx the parse tree
	 */
	void exitCases2Epsilon(PsicoderParser.Cases2EpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cases2Defecto}
	 * labeled alternative in {@link PsicoderParser#cases2}.
	 * @param ctx the parse tree
	 */
	void enterCases2Defecto(PsicoderParser.Cases2DefectoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cases2Defecto}
	 * labeled alternative in {@link PsicoderParser#cases2}.
	 * @param ctx the parse tree
	 */
	void exitCases2Defecto(PsicoderParser.Cases2DefectoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#deft}.
	 * @param ctx the parse tree
	 */
	void enterDeft(PsicoderParser.DeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#deft}.
	 * @param ctx the parse tree
	 */
	void exitDeft(PsicoderParser.DeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imp_paramsChain}
	 * labeled alternative in {@link PsicoderParser#imp_params}.
	 * @param ctx the parse tree
	 */
	void enterImp_paramsChain(PsicoderParser.Imp_paramsChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imp_paramsChain}
	 * labeled alternative in {@link PsicoderParser#imp_params}.
	 * @param ctx the parse tree
	 */
	void exitImp_paramsChain(PsicoderParser.Imp_paramsChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imp_paramsExp}
	 * labeled alternative in {@link PsicoderParser#imp_params}.
	 * @param ctx the parse tree
	 */
	void enterImp_paramsExp(PsicoderParser.Imp_paramsExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imp_paramsExp}
	 * labeled alternative in {@link PsicoderParser#imp_params}.
	 * @param ctx the parse tree
	 */
	void exitImp_paramsExp(PsicoderParser.Imp_paramsExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optexpIDComa}
	 * labeled alternative in {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 */
	void enterOptexpIDComa(PsicoderParser.OptexpIDComaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optexpIDComa}
	 * labeled alternative in {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 */
	void exitOptexpIDComa(PsicoderParser.OptexpIDComaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optexpIDAsigExpComa}
	 * labeled alternative in {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 */
	void enterOptexpIDAsigExpComa(PsicoderParser.OptexpIDAsigExpComaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optexpIDAsigExpComa}
	 * labeled alternative in {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 */
	void exitOptexpIDAsigExpComa(PsicoderParser.OptexpIDAsigExpComaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optexpID}
	 * labeled alternative in {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 */
	void enterOptexpID(PsicoderParser.OptexpIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optexpID}
	 * labeled alternative in {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 */
	void exitOptexpID(PsicoderParser.OptexpIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optexpIDAsigExp}
	 * labeled alternative in {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 */
	void enterOptexpIDAsigExp(PsicoderParser.OptexpIDAsigExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optexpIDAsigExp}
	 * labeled alternative in {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 */
	void exitOptexpIDAsigExp(PsicoderParser.OptexpIDAsigExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chainIDPunto}
	 * labeled alternative in {@link PsicoderParser#chain}.
	 * @param ctx the parse tree
	 */
	void enterChainIDPunto(PsicoderParser.ChainIDPuntoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chainIDPunto}
	 * labeled alternative in {@link PsicoderParser#chain}.
	 * @param ctx the parse tree
	 */
	void exitChainIDPunto(PsicoderParser.ChainIDPuntoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chainID}
	 * labeled alternative in {@link PsicoderParser#chain}.
	 * @param ctx the parse tree
	 */
	void enterChainID(PsicoderParser.ChainIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chainID}
	 * labeled alternative in {@link PsicoderParser#chain}.
	 * @param ctx the parse tree
	 */
	void exitChainID(PsicoderParser.ChainIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNegParExp}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpNegParExp(PsicoderParser.ExpNegParExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNegParExp}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpNegParExp(PsicoderParser.ExpNegParExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMult}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpMult(PsicoderParser.ExpMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMult}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpMult(PsicoderParser.ExpMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expModulo}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpModulo(PsicoderParser.ExpModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expModulo}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpModulo(PsicoderParser.ExpModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expIDChain}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpIDChain(PsicoderParser.ExpIDChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expIDChain}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpIDChain(PsicoderParser.ExpIDChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expDif}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpDif(PsicoderParser.ExpDifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expDif}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpDif(PsicoderParser.ExpDifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expFuncion}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpFuncion(PsicoderParser.ExpFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFuncion}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpFuncion(PsicoderParser.ExpFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMenos}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpMenos(PsicoderParser.ExpMenosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMenos}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpMenos(PsicoderParser.ExpMenosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMenor}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpMenor(PsicoderParser.ExpMenorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMenor}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpMenor(PsicoderParser.ExpMenorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expAnd}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpAnd(PsicoderParser.ExpAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expAnd}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpAnd(PsicoderParser.ExpAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMenosID}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpMenosID(PsicoderParser.ExpMenosIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMenosID}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpMenosID(PsicoderParser.ExpMenosIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNegID}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpNegID(PsicoderParser.ExpNegIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNegID}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpNegID(PsicoderParser.ExpNegIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expDiv}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpDiv(PsicoderParser.ExpDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expDiv}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpDiv(PsicoderParser.ExpDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expEntero}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpEntero(PsicoderParser.ExpEnteroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expEntero}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpEntero(PsicoderParser.ExpEnteroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMayorIgual}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpMayorIgual(PsicoderParser.ExpMayorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMayorIgual}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpMayorIgual(PsicoderParser.ExpMayorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNegChain}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpNegChain(PsicoderParser.ExpNegChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNegChain}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpNegChain(PsicoderParser.ExpNegChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expOr}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpOr(PsicoderParser.ExpOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expOr}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpOr(PsicoderParser.ExpOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMayor}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpMayor(PsicoderParser.ExpMayorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMayor}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpMayor(PsicoderParser.ExpMayorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMenorIgual}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpMenorIgual(PsicoderParser.ExpMenorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMenorIgual}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpMenorIgual(PsicoderParser.ExpMenorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMas}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpMas(PsicoderParser.ExpMasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMas}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpMas(PsicoderParser.ExpMasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNegVerdadero}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpNegVerdadero(PsicoderParser.ExpNegVerdaderoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNegVerdadero}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpNegVerdadero(PsicoderParser.ExpNegVerdaderoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expCadena}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpCadena(PsicoderParser.ExpCadenaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expCadena}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpCadena(PsicoderParser.ExpCadenaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNegFalso}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpNegFalso(PsicoderParser.ExpNegFalsoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNegFalso}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpNegFalso(PsicoderParser.ExpNegFalsoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expParExp}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpParExp(PsicoderParser.ExpParExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expParExp}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpParExp(PsicoderParser.ExpParExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expVerdadero}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpVerdadero(PsicoderParser.ExpVerdaderoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expVerdadero}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpVerdadero(PsicoderParser.ExpVerdaderoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMenosReal}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpMenosReal(PsicoderParser.ExpMenosRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMenosReal}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpMenosReal(PsicoderParser.ExpMenosRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expIgual}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpIgual(PsicoderParser.ExpIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expIgual}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpIgual(PsicoderParser.ExpIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMenosEntero}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpMenosEntero(PsicoderParser.ExpMenosEnteroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMenosEntero}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpMenosEntero(PsicoderParser.ExpMenosEnteroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expReal}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpReal(PsicoderParser.ExpRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expReal}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpReal(PsicoderParser.ExpRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expCaracter}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpCaracter(PsicoderParser.ExpCaracterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expCaracter}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpCaracter(PsicoderParser.ExpCaracterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expFalso}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpFalso(PsicoderParser.ExpFalsoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFalso}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpFalso(PsicoderParser.ExpFalsoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expID}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpID(PsicoderParser.ExpIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expID}
	 * labeled alternative in {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpID(PsicoderParser.ExpIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2Romper}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2Romper(PsicoderParser.Stmt2RomperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2Romper}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2Romper(PsicoderParser.Stmt2RomperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2CallFunction}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2CallFunction(PsicoderParser.Stmt2CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2CallFunction}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2CallFunction(PsicoderParser.Stmt2CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2TypeAsig}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2TypeAsig(PsicoderParser.Stmt2TypeAsigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2TypeAsig}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2TypeAsig(PsicoderParser.Stmt2TypeAsigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2TypeAsigOptexp}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2TypeAsigOptexp(PsicoderParser.Stmt2TypeAsigOptexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2TypeAsigOptexp}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2TypeAsigOptexp(PsicoderParser.Stmt2TypeAsigOptexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2IDAsig}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2IDAsig(PsicoderParser.Stmt2IDAsigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2IDAsig}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2IDAsig(PsicoderParser.Stmt2IDAsigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2TypeAsifExp}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2TypeAsifExp(PsicoderParser.Stmt2TypeAsifExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2TypeAsifExp}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2TypeAsifExp(PsicoderParser.Stmt2TypeAsifExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2IDChain}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2IDChain(PsicoderParser.Stmt2IDChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2IDChain}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2IDChain(PsicoderParser.Stmt2IDChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2ID}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2ID(PsicoderParser.Stmt2IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2ID}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2ID(PsicoderParser.Stmt2IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2Si}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2Si(PsicoderParser.Stmt2SiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2Si}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2Si(PsicoderParser.Stmt2SiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2SiNo}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2SiNo(PsicoderParser.Stmt2SiNoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2SiNo}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2SiNo(PsicoderParser.Stmt2SiNoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2LeerID}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2LeerID(PsicoderParser.Stmt2LeerIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2LeerID}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2LeerID(PsicoderParser.Stmt2LeerIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2LeerChain}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2LeerChain(PsicoderParser.Stmt2LeerChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2LeerChain}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2LeerChain(PsicoderParser.Stmt2LeerChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2Imprimir}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2Imprimir(PsicoderParser.Stmt2ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2Imprimir}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2Imprimir(PsicoderParser.Stmt2ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2Para}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2Para(PsicoderParser.Stmt2ParaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2Para}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2Para(PsicoderParser.Stmt2ParaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2Mientras}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2Mientras(PsicoderParser.Stmt2MientrasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2Mientras}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2Mientras(PsicoderParser.Stmt2MientrasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2Hacer}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2Hacer(PsicoderParser.Stmt2HacerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2Hacer}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2Hacer(PsicoderParser.Stmt2HacerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2Seleccionar}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2Seleccionar(PsicoderParser.Stmt2SeleccionarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2Seleccionar}
	 * labeled alternative in {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2Seleccionar(PsicoderParser.Stmt2SeleccionarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt4Funcion}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void enterStmt4Funcion(PsicoderParser.Stmt4FuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt4Funcion}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void exitStmt4Funcion(PsicoderParser.Stmt4FuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt4TypeIDAsigComa}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void enterStmt4TypeIDAsigComa(PsicoderParser.Stmt4TypeIDAsigComaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt4TypeIDAsigComa}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void exitStmt4TypeIDAsigComa(PsicoderParser.Stmt4TypeIDAsigComaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt4TypeIDComa}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void enterStmt4TypeIDComa(PsicoderParser.Stmt4TypeIDComaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt4TypeIDComa}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void exitStmt4TypeIDComa(PsicoderParser.Stmt4TypeIDComaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt4IDAsig}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void enterStmt4IDAsig(PsicoderParser.Stmt4IDAsigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt4IDAsig}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void exitStmt4IDAsig(PsicoderParser.Stmt4IDAsigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt4TypeIDAsig}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void enterStmt4TypeIDAsig(PsicoderParser.Stmt4TypeIDAsigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt4TypeIDAsig}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void exitStmt4TypeIDAsig(PsicoderParser.Stmt4TypeIDAsigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt4IDChainAsig}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void enterStmt4IDChainAsig(PsicoderParser.Stmt4IDChainAsigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt4IDChainAsig}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void exitStmt4IDChainAsig(PsicoderParser.Stmt4IDChainAsigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt4TypeID}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void enterStmt4TypeID(PsicoderParser.Stmt4TypeIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt4TypeID}
	 * labeled alternative in {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void exitStmt4TypeID(PsicoderParser.Stmt4TypeIDContext ctx);
}