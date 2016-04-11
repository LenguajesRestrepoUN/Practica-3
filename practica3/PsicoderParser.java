// Generated from Psicoder.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PsicoderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FIN_FUNCION=1, LEER=2, SI_NO=3, SI=4, ENTONCES=5, FIN_SI=6, MIENTRAS=7, 
		HACER=8, FIN_MIENTRAS=9, PARA=10, FIN_PARA=11, SELECCIONAR=12, ENTRE=13, 
		CASO=14, ROMPER=15, DEFECTO=16, FIN_SELECCIONAR=17, RETORNAR=18, ESTRUCTURA=19, 
		FIN_ESTRUCTURA=20, IMPRIMIR=21, CARACTER=22, CADENA=23, FUNCION_PRINCIPAL=24, 
		FUNCION=25, FIN_PRINCIPAL=26, BOOLEANO=27, TK_CARACTER=28, VERDADERO=29, 
		FALSO=30, REAL=31, ENTERO=32, TK_ENTERO=33, Whitespace=34, Newline=35, 
		BlockComment=36, LineComment=37, TK_MAS=38, TK_MENOS=39, TK_MULT=40, TK_DIV=41, 
		TK_MOD=42, TK_ASIG=43, TK_MENOR=44, TK_MAYOR=45, TK_MENOR_IGUAL=46, TK_MAYOR_IGUAL=47, 
		TK_IGUAL=48, TK_Y=49, TK_O=50, TK_DIF=51, TK_NEG=52, TK_POSD=53, TK_COMILLA_SEN=54, 
		TK_COMILLA_DOB=55, TK_PYC=56, TK_COMA=57, TK_PUNTO=58, TK_PAR_IZQ=59, 
		TK_PAR_DER=60, ID=61, TK_REAL=62, TK_CADENA=63;
	public static final int
		RULE_ps = 0, RULE_b = 1, RULE_element = 2, RULE_type = 3, RULE_optparams = 4, 
		RULE_params = 5, RULE_optpargs = 6, RULE_args = 7, RULE_statements = 8, 
		RULE_statements3 = 9, RULE_statements4 = 10, RULE_stmt = 11, RULE_cases = 12, 
		RULE_cases2 = 13, RULE_deft = 14, RULE_imp_params = 15, RULE_optexp = 16, 
		RULE_chain = 17, RULE_exp = 18, RULE_optargs = 19, RULE_stmt2 = 20, RULE_stmt4 = 21;
	public static final String[] ruleNames = {
		"ps", "b", "element", "type", "optparams", "params", "optpargs", "args", 
		"statements", "statements3", "statements4", "stmt", "cases", "cases2", 
		"deft", "imp_params", "optexp", "chain", "exp", "optargs", "stmt2", "stmt4"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fin_funcion'", "'leer'", "'si_no'", "'si'", "'entonces'", "'fin_si'", 
		"'mientras'", "'hacer'", "'fin_mientras'", "'para'", "'fin_para'", "'seleccionar'", 
		"'entre'", "'caso'", "'romper'", "'defecto'", "'fin_seleccionar'", "'retornar'", 
		"'estructura'", "'fin_estructura'", "'imprimir'", "'caracter'", "'cadena'", 
		"'funcion_principal'", "'funcion'", "'fin_principal'", "'booleano'", null, 
		"'verdadero'", "'falso'", "'real'", "'entero'", null, null, null, null, 
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'&&'", "'||'", "'!='", "'!'", "':'", "'''", "'\"'", "';'", 
		"','", "'.'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FIN_FUNCION", "LEER", "SI_NO", "SI", "ENTONCES", "FIN_SI", "MIENTRAS", 
		"HACER", "FIN_MIENTRAS", "PARA", "FIN_PARA", "SELECCIONAR", "ENTRE", "CASO", 
		"ROMPER", "DEFECTO", "FIN_SELECCIONAR", "RETORNAR", "ESTRUCTURA", "FIN_ESTRUCTURA", 
		"IMPRIMIR", "CARACTER", "CADENA", "FUNCION_PRINCIPAL", "FUNCION", "FIN_PRINCIPAL", 
		"BOOLEANO", "TK_CARACTER", "VERDADERO", "FALSO", "REAL", "ENTERO", "TK_ENTERO", 
		"Whitespace", "Newline", "BlockComment", "LineComment", "TK_MAS", "TK_MENOS", 
		"TK_MULT", "TK_DIV", "TK_MOD", "TK_ASIG", "TK_MENOR", "TK_MAYOR", "TK_MENOR_IGUAL", 
		"TK_MAYOR_IGUAL", "TK_IGUAL", "TK_Y", "TK_O", "TK_DIF", "TK_NEG", "TK_POSD", 
		"TK_COMILLA_SEN", "TK_COMILLA_DOB", "TK_PYC", "TK_COMA", "TK_PUNTO", "TK_PAR_IZQ", 
		"TK_PAR_DER", "ID", "TK_REAL", "TK_CADENA"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Psicoder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PsicoderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PsContext extends ParserRuleContext {
		public PsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ps; }
	 
		public PsContext() { }
		public void copyFrom(PsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PsElementContext extends PsContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public PsContext ps() {
			return getRuleContext(PsContext.class,0);
		}
		public PsElementContext(PsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterPsElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitPsElement(this);
		}
	}
	public static class PsEpsilonContext extends PsContext {
		public PsEpsilonContext(PsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterPsEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitPsEpsilon(this);
		}
	}
	public static class PsBContext extends PsContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public PsBContext(PsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterPsB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitPsB(this);
		}
	}

	public final PsContext ps() throws RecognitionException {
		PsContext _localctx = new PsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ps);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new PsElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				element();
				setState(45);
				ps();
				}
				break;
			case 2:
				_localctx = new PsBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				b();
				}
				break;
			case 3:
				_localctx = new PsEpsilonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BContext extends ParserRuleContext {
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
	 
		public BContext() { }
		public void copyFrom(BContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BFuncionPrincipalContext extends BContext {
		public TerminalNode FUNCION_PRINCIPAL() { return getToken(PsicoderParser.FUNCION_PRINCIPAL, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode FIN_PRINCIPAL() { return getToken(PsicoderParser.FIN_PRINCIPAL, 0); }
		public BFuncionPrincipalContext(BContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterBFuncionPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitBFuncionPrincipal(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_b);
		try {
			_localctx = new BFuncionPrincipalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(FUNCION_PRINCIPAL);
			setState(52);
			statements();
			setState(53);
			match(FIN_PRINCIPAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElementFuncionContext extends ElementContext {
		public TerminalNode FUNCION() { return getToken(PsicoderParser.FUNCION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public OptparamsContext optparams() {
			return getRuleContext(OptparamsContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode HACER() { return getToken(PsicoderParser.HACER, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RETORNAR() { return getToken(PsicoderParser.RETORNAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public TerminalNode FIN_FUNCION() { return getToken(PsicoderParser.FIN_FUNCION, 0); }
		public ElementFuncionContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterElementFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitElementFuncion(this);
		}
	}
	public static class ElementEstructuraContext extends ElementContext {
		public TerminalNode ESTRUCTURA() { return getToken(PsicoderParser.ESTRUCTURA, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public Statements4Context statements4() {
			return getRuleContext(Statements4Context.class,0);
		}
		public TerminalNode FIN_ESTRUCTURA() { return getToken(PsicoderParser.FIN_ESTRUCTURA, 0); }
		public ElementEstructuraContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterElementEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitElementEstructura(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		try {
			setState(73);
			switch (_input.LA(1)) {
			case FUNCION:
				_localctx = new ElementFuncionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(FUNCION);
				setState(56);
				type();
				setState(57);
				match(ID);
				setState(58);
				match(TK_PAR_IZQ);
				setState(59);
				optparams();
				setState(60);
				match(TK_PAR_DER);
				setState(61);
				match(HACER);
				setState(62);
				statements();
				setState(63);
				match(RETORNAR);
				setState(64);
				exp(0);
				setState(65);
				match(TK_PYC);
				setState(66);
				match(FIN_FUNCION);
				}
				break;
			case ESTRUCTURA:
				_localctx = new ElementEstructuraContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(ESTRUCTURA);
				setState(69);
				match(ID);
				setState(70);
				statements4();
				setState(71);
				match(FIN_ESTRUCTURA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeBooleanoContext extends TypeContext {
		public TerminalNode BOOLEANO() { return getToken(PsicoderParser.BOOLEANO, 0); }
		public TypeBooleanoContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterTypeBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitTypeBooleano(this);
		}
	}
	public static class TypeCaracterContext extends TypeContext {
		public TerminalNode CARACTER() { return getToken(PsicoderParser.CARACTER, 0); }
		public TypeCaracterContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterTypeCaracter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitTypeCaracter(this);
		}
	}
	public static class TypeRealContext extends TypeContext {
		public TerminalNode REAL() { return getToken(PsicoderParser.REAL, 0); }
		public TypeRealContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterTypeReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitTypeReal(this);
		}
	}
	public static class TypeEnteroContext extends TypeContext {
		public TerminalNode ENTERO() { return getToken(PsicoderParser.ENTERO, 0); }
		public TypeEnteroContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterTypeEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitTypeEntero(this);
		}
	}
	public static class TypeIDContext extends TypeContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TypeIDContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterTypeID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitTypeID(this);
		}
	}
	public static class TypeCadenaContext extends TypeContext {
		public TerminalNode CADENA() { return getToken(PsicoderParser.CADENA, 0); }
		public TypeCadenaContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterTypeCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitTypeCadena(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(81);
			switch (_input.LA(1)) {
			case ENTERO:
				_localctx = new TypeEnteroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(ENTERO);
				}
				break;
			case CARACTER:
				_localctx = new TypeCaracterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(CARACTER);
				}
				break;
			case CADENA:
				_localctx = new TypeCadenaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(CADENA);
				}
				break;
			case REAL:
				_localctx = new TypeRealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(REAL);
				}
				break;
			case BOOLEANO:
				_localctx = new TypeBooleanoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				match(BOOLEANO);
				}
				break;
			case ID:
				_localctx = new TypeIDContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptparamsContext extends ParserRuleContext {
		public OptparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optparams; }
	 
		public OptparamsContext() { }
		public void copyFrom(OptparamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptparamsPContext extends OptparamsContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public OptparamsPContext(OptparamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOptparamsP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOptparamsP(this);
		}
	}
	public static class OptparamsEpsilonContext extends OptparamsContext {
		public OptparamsEpsilonContext(OptparamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOptparamsEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOptparamsEpsilon(this);
		}
	}

	public final OptparamsContext optparams() throws RecognitionException {
		OptparamsContext _localctx = new OptparamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_optparams);
		try {
			setState(85);
			switch (_input.LA(1)) {
			case CARACTER:
			case CADENA:
			case BOOLEANO:
			case REAL:
			case ENTERO:
			case ID:
				_localctx = new OptparamsPContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				params();
				}
				break;
			case TK_PAR_DER:
				_localctx = new OptparamsEpsilonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	 
		public ParamsContext() { }
		public void copyFrom(ParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamsTypeIDComaContext extends ParamsContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsTypeIDComaContext(ParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterParamsTypeIDComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitParamsTypeIDComa(this);
		}
	}
	public static class ParamsTypeIDContext extends ParamsContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public ParamsTypeIDContext(ParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterParamsTypeID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitParamsTypeID(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ParamsTypeIDComaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				type();
				setState(88);
				match(ID);
				setState(89);
				match(TK_COMA);
				setState(90);
				params();
				}
				break;
			case 2:
				_localctx = new ParamsTypeIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				type();
				setState(93);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptpargsContext extends ParserRuleContext {
		public OptpargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optpargs; }
	 
		public OptpargsContext() { }
		public void copyFrom(OptpargsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptpargsEpsilonContext extends OptpargsContext {
		public OptpargsEpsilonContext(OptpargsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOptpargsEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOptpargsEpsilon(this);
		}
	}
	public static class OptpargsArgsContext extends OptpargsContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public OptpargsArgsContext(OptpargsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOptpargsArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOptpargsArgs(this);
		}
	}

	public final OptpargsContext optpargs() throws RecognitionException {
		OptpargsContext _localctx = new OptpargsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_optpargs);
		try {
			setState(99);
			switch (_input.LA(1)) {
			case TK_CARACTER:
			case VERDADERO:
			case FALSO:
			case TK_ENTERO:
			case TK_MENOS:
			case TK_NEG:
			case TK_PAR_IZQ:
			case ID:
			case TK_REAL:
			case TK_CADENA:
				_localctx = new OptpargsArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				args();
				}
				break;
			case TK_PAR_DER:
				_localctx = new OptpargsEpsilonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	 
		public ArgsContext() { }
		public void copyFrom(ArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgsExpContext extends ArgsContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ArgsExpContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterArgsExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitArgsExp(this);
		}
	}
	public static class ArgsExpParamsContext extends ArgsContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ArgsExpParamsContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterArgsExpParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitArgsExpParams(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_args);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ArgsExpParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				exp(0);
				setState(102);
				match(TK_COMA);
				setState(103);
				params();
				}
				break;
			case 2:
				_localctx = new ArgsExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				exp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	 
		public StatementsContext() { }
		public void copyFrom(StatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementsEpsilonStmtContext extends StatementsContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsEpsilonStmtContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStatementsEpsilonStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStatementsEpsilonStmt(this);
		}
	}
	public static class StatementsEpsilonContext extends StatementsContext {
		public StatementsEpsilonContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStatementsEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStatementsEpsilon(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statements);
		try {
			setState(112);
			switch (_input.LA(1)) {
			case LEER:
			case SI:
			case MIENTRAS:
			case HACER:
			case PARA:
			case SELECCIONAR:
			case IMPRIMIR:
			case CARACTER:
			case CADENA:
			case BOOLEANO:
			case REAL:
			case ENTERO:
			case ID:
				_localctx = new StatementsEpsilonStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				stmt();
				setState(109);
				statements();
				}
				break;
			case SI_NO:
			case FIN_SI:
			case RETORNAR:
			case FIN_PRINCIPAL:
				_localctx = new StatementsEpsilonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statements3Context extends ParserRuleContext {
		public Statements3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements3; }
	 
		public Statements3Context() { }
		public void copyFrom(Statements3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Statements3EpsilonContext extends Statements3Context {
		public Statements3EpsilonContext(Statements3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStatements3Epsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStatements3Epsilon(this);
		}
	}
	public static class Statements3StmtContext extends Statements3Context {
		public Stmt2Context stmt2() {
			return getRuleContext(Stmt2Context.class,0);
		}
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public Statements3StmtContext(Statements3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStatements3Stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStatements3Stmt(this);
		}
	}

	public final Statements3Context statements3() throws RecognitionException {
		Statements3Context _localctx = new Statements3Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_statements3);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Statements3StmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				stmt2();
				setState(115);
				statements3();
				}
				break;
			case 2:
				_localctx = new Statements3EpsilonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statements4Context extends ParserRuleContext {
		public Statements4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements4; }
	 
		public Statements4Context() { }
		public void copyFrom(Statements4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Statements4StmtContext extends Statements4Context {
		public Stmt4Context stmt4() {
			return getRuleContext(Stmt4Context.class,0);
		}
		public Statements4Context statements4() {
			return getRuleContext(Statements4Context.class,0);
		}
		public Statements4StmtContext(Statements4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStatements4Stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStatements4Stmt(this);
		}
	}
	public static class Statements4EpsilonContext extends Statements4Context {
		public Statements4EpsilonContext(Statements4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStatements4Epsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStatements4Epsilon(this);
		}
	}

	public final Statements4Context statements4() throws RecognitionException {
		Statements4Context _localctx = new Statements4Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_statements4);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case CARACTER:
			case CADENA:
			case BOOLEANO:
			case REAL:
			case ENTERO:
			case ID:
				_localctx = new Statements4StmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				stmt4();
				setState(121);
				statements4();
				}
				break;
			case FIN_ESTRUCTURA:
				_localctx = new Statements4EpsilonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtMientrasContext extends StmtContext {
		public TerminalNode MIENTRAS() { return getToken(PsicoderParser.MIENTRAS, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode HACER() { return getToken(PsicoderParser.HACER, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public TerminalNode FIN_MIENTRAS() { return getToken(PsicoderParser.FIN_MIENTRAS, 0); }
		public StmtMientrasContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtMientras(this);
		}
	}
	public static class StmtSeleccionarContext extends StmtContext {
		public TerminalNode SELECCIONAR() { return getToken(PsicoderParser.SELECCIONAR, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode ENTRE() { return getToken(PsicoderParser.ENTRE, 0); }
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public TerminalNode FIN_SELECCIONAR() { return getToken(PsicoderParser.FIN_SELECCIONAR, 0); }
		public StmtSeleccionarContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtSeleccionar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtSeleccionar(this);
		}
	}
	public static class StmtTypeAsigContext extends StmtContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public OptexpContext optexp() {
			return getRuleContext(OptexpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public StmtTypeAsigContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtTypeAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtTypeAsig(this);
		}
	}
	public static class StmtTypeAsifExpContext extends StmtContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public StmtTypeAsifExpContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtTypeAsifExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtTypeAsifExp(this);
		}
	}
	public static class StmtParaContext extends StmtContext {
		public TerminalNode PARA() { return getToken(PsicoderParser.PARA, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode HACER() { return getToken(PsicoderParser.HACER, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public TerminalNode FIN_PARA() { return getToken(PsicoderParser.FIN_PARA, 0); }
		public StmtParaContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtPara(this);
		}
	}
	public static class StmtLeerIDContext extends StmtContext {
		public TerminalNode LEER() { return getToken(PsicoderParser.LEER, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public StmtLeerIDContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtLeerID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtLeerID(this);
		}
	}
	public static class StmtHacerContext extends StmtContext {
		public TerminalNode HACER() { return getToken(PsicoderParser.HACER, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public TerminalNode MIENTRAS() { return getToken(PsicoderParser.MIENTRAS, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public StmtHacerContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtHacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtHacer(this);
		}
	}
	public static class StmtSiContext extends StmtContext {
		public TerminalNode SI() { return getToken(PsicoderParser.SI, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode ENTONCES() { return getToken(PsicoderParser.ENTONCES, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode FIN_SI() { return getToken(PsicoderParser.FIN_SI, 0); }
		public StmtSiContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtSi(this);
		}
	}
	public static class StmtIDContext extends StmtContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public StmtIDContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtID(this);
		}
	}
	public static class StmtIDAsigContext extends StmtContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public StmtIDAsigContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtIDAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtIDAsig(this);
		}
	}
	public static class StmtImprimirContext extends StmtContext {
		public TerminalNode IMPRIMIR() { return getToken(PsicoderParser.IMPRIMIR, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public Imp_paramsContext imp_params() {
			return getRuleContext(Imp_paramsContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public StmtImprimirContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtImprimir(this);
		}
	}
	public static class StmtCallFunctionContext extends StmtContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public OptpargsContext optpargs() {
			return getRuleContext(OptpargsContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public StmtCallFunctionContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtCallFunction(this);
		}
	}
	public static class StmtSiNoContext extends StmtContext {
		public TerminalNode SI() { return getToken(PsicoderParser.SI, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode ENTONCES() { return getToken(PsicoderParser.ENTONCES, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode SI_NO() { return getToken(PsicoderParser.SI_NO, 0); }
		public TerminalNode FIN_SI() { return getToken(PsicoderParser.FIN_SI, 0); }
		public StmtSiNoContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtSiNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtSiNo(this);
		}
	}
	public static class StmtLeerChainContext extends StmtContext {
		public TerminalNode LEER() { return getToken(PsicoderParser.LEER, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public StmtLeerChainContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtLeerChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtLeerChain(this);
		}
	}
	public static class StmtTypeAsigOptexpContext extends StmtContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public OptexpContext optexp() {
			return getRuleContext(OptexpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public StmtTypeAsigOptexpContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtTypeAsigOptexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtTypeAsigOptexp(this);
		}
	}
	public static class StmtIDChainContext extends StmtContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public StmtIDChainContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtIDChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtIDChain(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new StmtCallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(ID);
				setState(127);
				match(TK_PAR_IZQ);
				setState(128);
				optpargs();
				setState(129);
				match(TK_PAR_DER);
				setState(130);
				match(TK_PYC);
				}
				break;
			case 2:
				_localctx = new StmtTypeAsigContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				type();
				setState(133);
				match(ID);
				setState(134);
				match(TK_ASIG);
				setState(135);
				exp(0);
				setState(136);
				match(TK_COMA);
				setState(137);
				optexp();
				setState(138);
				match(TK_PYC);
				}
				break;
			case 3:
				_localctx = new StmtTypeAsigOptexpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				type();
				setState(141);
				match(ID);
				setState(142);
				match(TK_COMA);
				setState(143);
				optexp();
				setState(144);
				match(TK_PYC);
				}
				break;
			case 4:
				_localctx = new StmtIDAsigContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(ID);
				setState(147);
				match(TK_ASIG);
				setState(148);
				exp(0);
				setState(149);
				match(TK_PYC);
				}
				break;
			case 5:
				_localctx = new StmtTypeAsifExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				type();
				setState(152);
				match(ID);
				setState(153);
				match(TK_ASIG);
				setState(154);
				exp(0);
				setState(155);
				match(TK_PYC);
				}
				break;
			case 6:
				_localctx = new StmtIDChainContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				match(ID);
				setState(158);
				match(TK_PUNTO);
				setState(159);
				chain();
				setState(160);
				match(TK_ASIG);
				setState(161);
				exp(0);
				setState(162);
				match(TK_PYC);
				}
				break;
			case 7:
				_localctx = new StmtIDContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				type();
				setState(165);
				match(ID);
				setState(166);
				match(TK_PYC);
				}
				break;
			case 8:
				_localctx = new StmtSiContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				match(SI);
				setState(169);
				match(TK_PAR_IZQ);
				setState(170);
				exp(0);
				setState(171);
				match(TK_PAR_DER);
				setState(172);
				match(ENTONCES);
				setState(173);
				statements();
				setState(174);
				match(FIN_SI);
				}
				break;
			case 9:
				_localctx = new StmtSiNoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				match(SI);
				setState(177);
				match(TK_PAR_IZQ);
				setState(178);
				exp(0);
				setState(179);
				match(TK_PAR_DER);
				setState(180);
				match(ENTONCES);
				setState(181);
				statements();
				setState(182);
				match(SI_NO);
				setState(183);
				statements();
				setState(184);
				match(FIN_SI);
				}
				break;
			case 10:
				_localctx = new StmtLeerIDContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(186);
				match(LEER);
				setState(187);
				match(TK_PAR_IZQ);
				setState(188);
				match(ID);
				setState(189);
				match(TK_PAR_DER);
				setState(190);
				match(TK_PYC);
				}
				break;
			case 11:
				_localctx = new StmtLeerChainContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(191);
				match(LEER);
				setState(192);
				match(TK_PAR_IZQ);
				setState(193);
				match(ID);
				setState(194);
				match(TK_PUNTO);
				setState(195);
				chain();
				setState(196);
				match(TK_PAR_DER);
				setState(197);
				match(TK_PYC);
				}
				break;
			case 12:
				_localctx = new StmtImprimirContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(199);
				match(IMPRIMIR);
				setState(200);
				match(TK_PAR_IZQ);
				setState(201);
				imp_params();
				setState(202);
				match(TK_PAR_DER);
				setState(203);
				match(TK_PYC);
				}
				break;
			case 13:
				_localctx = new StmtParaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(205);
				match(PARA);
				setState(206);
				match(TK_PAR_IZQ);
				setState(207);
				stmt();
				setState(208);
				exp(0);
				setState(209);
				match(TK_PYC);
				setState(210);
				exp(0);
				setState(211);
				match(TK_PAR_DER);
				setState(212);
				match(HACER);
				setState(213);
				statements3();
				setState(214);
				match(FIN_PARA);
				}
				break;
			case 14:
				_localctx = new StmtMientrasContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(216);
				match(MIENTRAS);
				setState(217);
				match(TK_PAR_IZQ);
				setState(218);
				exp(0);
				setState(219);
				match(TK_PAR_DER);
				setState(220);
				match(HACER);
				setState(221);
				statements3();
				setState(222);
				match(FIN_MIENTRAS);
				}
				break;
			case 15:
				_localctx = new StmtHacerContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(224);
				match(HACER);
				setState(225);
				statements3();
				setState(226);
				match(MIENTRAS);
				setState(227);
				match(TK_PAR_IZQ);
				setState(228);
				exp(0);
				setState(229);
				match(TK_PAR_DER);
				setState(230);
				match(TK_PYC);
				}
				break;
			case 16:
				_localctx = new StmtSeleccionarContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(232);
				match(SELECCIONAR);
				setState(233);
				match(TK_PAR_IZQ);
				setState(234);
				match(ID);
				setState(235);
				match(TK_PAR_DER);
				setState(236);
				match(ENTRE);
				setState(237);
				cases();
				setState(238);
				match(FIN_SELECCIONAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasesContext extends ParserRuleContext {
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
	 
		public CasesContext() { }
		public void copyFrom(CasesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CasesDefectoContext extends CasesContext {
		public DeftContext deft() {
			return getRuleContext(DeftContext.class,0);
		}
		public CasesDefectoContext(CasesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCasesDefecto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCasesDefecto(this);
		}
	}
	public static class CasesCasoContext extends CasesContext {
		public TerminalNode CASO() { return getToken(PsicoderParser.CASO, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_POSD() { return getToken(PsicoderParser.TK_POSD, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public Cases2Context cases2() {
			return getRuleContext(Cases2Context.class,0);
		}
		public CasesCasoContext(CasesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCasesCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCasesCaso(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cases);
		try {
			setState(249);
			switch (_input.LA(1)) {
			case CASO:
				_localctx = new CasesCasoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(CASO);
				setState(243);
				exp(0);
				setState(244);
				match(TK_POSD);
				setState(245);
				statements3();
				setState(246);
				cases2();
				}
				break;
			case DEFECTO:
				_localctx = new CasesDefectoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				deft();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cases2Context extends ParserRuleContext {
		public Cases2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases2; }
	 
		public Cases2Context() { }
		public void copyFrom(Cases2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Cases2EpsilonContext extends Cases2Context {
		public Cases2EpsilonContext(Cases2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCases2Epsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCases2Epsilon(this);
		}
	}
	public static class Cases2DefectoContext extends Cases2Context {
		public DeftContext deft() {
			return getRuleContext(DeftContext.class,0);
		}
		public Cases2DefectoContext(Cases2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCases2Defecto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCases2Defecto(this);
		}
	}
	public static class Cases2cacsoContext extends Cases2Context {
		public TerminalNode CASO() { return getToken(PsicoderParser.CASO, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_POSD() { return getToken(PsicoderParser.TK_POSD, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public Cases2Context cases2() {
			return getRuleContext(Cases2Context.class,0);
		}
		public Cases2cacsoContext(Cases2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCases2cacso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCases2cacso(this);
		}
	}

	public final Cases2Context cases2() throws RecognitionException {
		Cases2Context _localctx = new Cases2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_cases2);
		try {
			setState(259);
			switch (_input.LA(1)) {
			case CASO:
				_localctx = new Cases2cacsoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(CASO);
				setState(252);
				exp(0);
				setState(253);
				match(TK_POSD);
				setState(254);
				statements3();
				setState(255);
				cases2();
				}
				break;
			case FIN_SELECCIONAR:
				_localctx = new Cases2EpsilonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case DEFECTO:
				_localctx = new Cases2DefectoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				deft();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeftContext extends ParserRuleContext {
		public TerminalNode DEFECTO() { return getToken(PsicoderParser.DEFECTO, 0); }
		public TerminalNode TK_POSD() { return getToken(PsicoderParser.TK_POSD, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public DeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterDeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitDeft(this);
		}
	}

	public final DeftContext deft() throws RecognitionException {
		DeftContext _localctx = new DeftContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_deft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(DEFECTO);
			setState(262);
			match(TK_POSD);
			setState(263);
			statements3();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Imp_paramsContext extends ParserRuleContext {
		public Imp_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp_params; }
	 
		public Imp_paramsContext() { }
		public void copyFrom(Imp_paramsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Imp_paramsExpContext extends Imp_paramsContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Imp_paramsExpContext(Imp_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterImp_paramsExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitImp_paramsExp(this);
		}
	}
	public static class Imp_paramsChainContext extends Imp_paramsContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public Imp_paramsContext imp_params() {
			return getRuleContext(Imp_paramsContext.class,0);
		}
		public Imp_paramsChainContext(Imp_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterImp_paramsChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitImp_paramsChain(this);
		}
	}

	public final Imp_paramsContext imp_params() throws RecognitionException {
		Imp_paramsContext _localctx = new Imp_paramsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_imp_params);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Imp_paramsChainContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				exp(0);
				setState(266);
				match(TK_COMA);
				setState(267);
				imp_params();
				}
				break;
			case 2:
				_localctx = new Imp_paramsExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				exp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptexpContext extends ParserRuleContext {
		public OptexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optexp; }
	 
		public OptexpContext() { }
		public void copyFrom(OptexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptexpIDContext extends OptexpContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public OptexpIDContext(OptexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOptexpID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOptexpID(this);
		}
	}
	public static class OptexpIDComaContext extends OptexpContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public OptexpContext optexp() {
			return getRuleContext(OptexpContext.class,0);
		}
		public OptexpIDComaContext(OptexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOptexpIDComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOptexpIDComa(this);
		}
	}
	public static class OptexpIDAsigExpComaContext extends OptexpContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public OptexpContext optexp() {
			return getRuleContext(OptexpContext.class,0);
		}
		public OptexpIDAsigExpComaContext(OptexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOptexpIDAsigExpComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOptexpIDAsigExpComa(this);
		}
	}
	public static class OptexpIDAsigExpContext extends OptexpContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OptexpIDAsigExpContext(OptexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOptexpIDAsigExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOptexpIDAsigExp(this);
		}
	}

	public final OptexpContext optexp() throws RecognitionException {
		OptexpContext _localctx = new OptexpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_optexp);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new OptexpIDComaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(ID);
				setState(273);
				match(TK_COMA);
				setState(274);
				optexp();
				}
				break;
			case 2:
				_localctx = new OptexpIDAsigExpComaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(ID);
				setState(276);
				match(TK_ASIG);
				setState(277);
				exp(0);
				setState(278);
				match(TK_COMA);
				setState(279);
				optexp();
				}
				break;
			case 3:
				_localctx = new OptexpIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(ID);
				}
				break;
			case 4:
				_localctx = new OptexpIDAsigExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				match(ID);
				setState(283);
				match(TK_ASIG);
				setState(284);
				exp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChainContext extends ParserRuleContext {
		public ChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chain; }
	 
		public ChainContext() { }
		public void copyFrom(ChainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChainIDContext extends ChainContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public ChainIDContext(ChainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterChainID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitChainID(this);
		}
	}
	public static class ChainIDPuntoContext extends ChainContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ChainIDPuntoContext(ChainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterChainIDPunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitChainIDPunto(this);
		}
	}

	public final ChainContext chain() throws RecognitionException {
		ChainContext _localctx = new ChainContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chain);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ChainIDPuntoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(ID);
				setState(288);
				match(TK_PUNTO);
				setState(289);
				chain();
				}
				break;
			case 2:
				_localctx = new ChainIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpNegParExpContext extends ExpContext {
		public TerminalNode TK_NEG() { return getToken(PsicoderParser.TK_NEG, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public ExpNegParExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpNegParExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpNegParExp(this);
		}
	}
	public static class ExpMultContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_MULT() { return getToken(PsicoderParser.TK_MULT, 0); }
		public ExpMultContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpMult(this);
		}
	}
	public static class ExpModuloContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_MOD() { return getToken(PsicoderParser.TK_MOD, 0); }
		public ExpModuloContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpModulo(this);
		}
	}
	public static class ExpIDChainContext extends ExpContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode TK_MENOS() { return getToken(PsicoderParser.TK_MENOS, 0); }
		public ExpIDChainContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpIDChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpIDChain(this);
		}
	}
	public static class ExpDifContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_DIF() { return getToken(PsicoderParser.TK_DIF, 0); }
		public ExpDifContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpDif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpDif(this);
		}
	}
	public static class ExpFuncionContext extends ExpContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public OptargsContext optargs() {
			return getRuleContext(OptargsContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public ExpFuncionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpFuncion(this);
		}
	}
	public static class ExpMenosContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_MENOS() { return getToken(PsicoderParser.TK_MENOS, 0); }
		public ExpMenosContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpMenos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpMenos(this);
		}
	}
	public static class ExpMenorContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_MENOR() { return getToken(PsicoderParser.TK_MENOR, 0); }
		public ExpMenorContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpMenor(this);
		}
	}
	public static class ExpAndContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_Y() { return getToken(PsicoderParser.TK_Y, 0); }
		public ExpAndContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpAnd(this);
		}
	}
	public static class ExpMenosIDContext extends ExpContext {
		public TerminalNode TK_MENOS() { return getToken(PsicoderParser.TK_MENOS, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public ExpMenosIDContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpMenosID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpMenosID(this);
		}
	}
	public static class ExpNegIDContext extends ExpContext {
		public TerminalNode TK_NEG() { return getToken(PsicoderParser.TK_NEG, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public ExpNegIDContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpNegID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpNegID(this);
		}
	}
	public static class ExpDivContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_DIV() { return getToken(PsicoderParser.TK_DIV, 0); }
		public ExpDivContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpDiv(this);
		}
	}
	public static class ExpEnteroContext extends ExpContext {
		public TerminalNode TK_ENTERO() { return getToken(PsicoderParser.TK_ENTERO, 0); }
		public ExpEnteroContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpEntero(this);
		}
	}
	public static class ExpMayorIgualContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_MAYOR_IGUAL() { return getToken(PsicoderParser.TK_MAYOR_IGUAL, 0); }
		public ExpMayorIgualContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpMayorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpMayorIgual(this);
		}
	}
	public static class ExpNegChainContext extends ExpContext {
		public TerminalNode TK_NEG() { return getToken(PsicoderParser.TK_NEG, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ExpNegChainContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpNegChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpNegChain(this);
		}
	}
	public static class ExpOrContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_O() { return getToken(PsicoderParser.TK_O, 0); }
		public ExpOrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpOr(this);
		}
	}
	public static class ExpMayorContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_MAYOR() { return getToken(PsicoderParser.TK_MAYOR, 0); }
		public ExpMayorContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpMayor(this);
		}
	}
	public static class ExpMenorIgualContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_MENOR_IGUAL() { return getToken(PsicoderParser.TK_MENOR_IGUAL, 0); }
		public ExpMenorIgualContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpMenorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpMenorIgual(this);
		}
	}
	public static class ExpMasContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_MAS() { return getToken(PsicoderParser.TK_MAS, 0); }
		public ExpMasContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpMas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpMas(this);
		}
	}
	public static class ExpNegVerdaderoContext extends ExpContext {
		public TerminalNode TK_NEG() { return getToken(PsicoderParser.TK_NEG, 0); }
		public TerminalNode VERDADERO() { return getToken(PsicoderParser.VERDADERO, 0); }
		public ExpNegVerdaderoContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpNegVerdadero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpNegVerdadero(this);
		}
	}
	public static class ExpCadenaContext extends ExpContext {
		public TerminalNode TK_CADENA() { return getToken(PsicoderParser.TK_CADENA, 0); }
		public ExpCadenaContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpCadena(this);
		}
	}
	public static class ExpNegFalsoContext extends ExpContext {
		public TerminalNode TK_NEG() { return getToken(PsicoderParser.TK_NEG, 0); }
		public TerminalNode FALSO() { return getToken(PsicoderParser.FALSO, 0); }
		public ExpNegFalsoContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpNegFalso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpNegFalso(this);
		}
	}
	public static class ExpParExpContext extends ExpContext {
		public TerminalNode TK_MENOS() { return getToken(PsicoderParser.TK_MENOS, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public ExpParExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpParExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpParExp(this);
		}
	}
	public static class ExpVerdaderoContext extends ExpContext {
		public TerminalNode VERDADERO() { return getToken(PsicoderParser.VERDADERO, 0); }
		public ExpVerdaderoContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpVerdadero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpVerdadero(this);
		}
	}
	public static class ExpMenosRealContext extends ExpContext {
		public TerminalNode TK_MENOS() { return getToken(PsicoderParser.TK_MENOS, 0); }
		public TerminalNode TK_REAL() { return getToken(PsicoderParser.TK_REAL, 0); }
		public ExpMenosRealContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpMenosReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpMenosReal(this);
		}
	}
	public static class ExpIgualContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_IGUAL() { return getToken(PsicoderParser.TK_IGUAL, 0); }
		public ExpIgualContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpIgual(this);
		}
	}
	public static class ExpMenosEnteroContext extends ExpContext {
		public TerminalNode TK_MENOS() { return getToken(PsicoderParser.TK_MENOS, 0); }
		public TerminalNode TK_ENTERO() { return getToken(PsicoderParser.TK_ENTERO, 0); }
		public ExpMenosEnteroContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpMenosEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpMenosEntero(this);
		}
	}
	public static class ExpRealContext extends ExpContext {
		public TerminalNode TK_REAL() { return getToken(PsicoderParser.TK_REAL, 0); }
		public ExpRealContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpReal(this);
		}
	}
	public static class ExpCaracterContext extends ExpContext {
		public TerminalNode TK_CARACTER() { return getToken(PsicoderParser.TK_CARACTER, 0); }
		public ExpCaracterContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpCaracter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpCaracter(this);
		}
	}
	public static class ExpFalsoContext extends ExpContext {
		public TerminalNode FALSO() { return getToken(PsicoderParser.FALSO, 0); }
		public ExpFalsoContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpFalso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpFalso(this);
		}
	}
	public static class ExpIDContext extends ExpContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public ExpIDContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpID(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new ExpCaracterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(294);
				match(TK_CARACTER);
				}
				break;
			case 2:
				{
				_localctx = new ExpIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ExpIDChainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296);
				match(ID);
				setState(297);
				match(TK_PUNTO);
				setState(298);
				chain();
				}
				break;
			case 4:
				{
				_localctx = new ExpEnteroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299);
				match(TK_ENTERO);
				}
				break;
			case 5:
				{
				_localctx = new ExpRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				match(TK_REAL);
				}
				break;
			case 6:
				{
				_localctx = new ExpCadenaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				match(TK_CADENA);
				}
				break;
			case 7:
				{
				_localctx = new ExpVerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				match(VERDADERO);
				}
				break;
			case 8:
				{
				_localctx = new ExpFalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				match(FALSO);
				}
				break;
			case 9:
				{
				_localctx = new ExpMenosRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				match(TK_MENOS);
				setState(305);
				match(TK_REAL);
				}
				break;
			case 10:
				{
				_localctx = new ExpMenosEnteroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(TK_MENOS);
				setState(307);
				match(TK_ENTERO);
				}
				break;
			case 11:
				{
				_localctx = new ExpMenosIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308);
				match(TK_MENOS);
				setState(309);
				match(ID);
				}
				break;
			case 12:
				{
				_localctx = new ExpIDChainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				match(TK_MENOS);
				setState(311);
				match(ID);
				setState(312);
				match(TK_PUNTO);
				setState(313);
				chain();
				}
				break;
			case 13:
				{
				_localctx = new ExpParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				match(TK_MENOS);
				setState(315);
				match(TK_PAR_IZQ);
				setState(316);
				exp(0);
				setState(317);
				match(TK_PAR_DER);
				}
				break;
			case 14:
				{
				_localctx = new ExpNegIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319);
				match(TK_NEG);
				setState(320);
				match(ID);
				}
				break;
			case 15:
				{
				_localctx = new ExpNegChainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				match(TK_NEG);
				setState(322);
				match(ID);
				setState(323);
				match(TK_PUNTO);
				setState(324);
				chain();
				}
				break;
			case 16:
				{
				_localctx = new ExpNegVerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(325);
				match(TK_NEG);
				setState(326);
				match(VERDADERO);
				}
				break;
			case 17:
				{
				_localctx = new ExpNegFalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				match(TK_NEG);
				setState(328);
				match(FALSO);
				}
				break;
			case 18:
				{
				_localctx = new ExpNegParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329);
				match(TK_NEG);
				setState(330);
				match(TK_PAR_IZQ);
				setState(331);
				exp(0);
				setState(332);
				match(TK_PAR_DER);
				}
				break;
			case 19:
				{
				_localctx = new ExpParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334);
				match(TK_PAR_IZQ);
				setState(335);
				exp(0);
				setState(336);
				match(TK_PAR_DER);
				}
				break;
			case 20:
				{
				_localctx = new ExpFuncionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				match(ID);
				setState(339);
				match(TK_PAR_IZQ);
				setState(340);
				optargs();
				setState(341);
				match(TK_PAR_DER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(384);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpOrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(345);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(346);
						match(TK_O);
						setState(347);
						exp(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpAndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(348);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(349);
						match(TK_Y);
						setState(350);
						exp(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpIgualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(351);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(352);
						match(TK_IGUAL);
						setState(353);
						exp(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpMenorContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(354);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(355);
						match(TK_MENOR);
						setState(356);
						exp(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpMayorContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(357);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(358);
						match(TK_MAYOR);
						setState(359);
						exp(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpMenorIgualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(360);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(361);
						match(TK_MENOR_IGUAL);
						setState(362);
						exp(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpMayorIgualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(363);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(364);
						match(TK_MAYOR_IGUAL);
						setState(365);
						exp(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpDifContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(366);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(367);
						match(TK_DIF);
						setState(368);
						exp(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpMasContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(369);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(370);
						match(TK_MAS);
						setState(371);
						exp(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpMenosContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(372);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(373);
						match(TK_MENOS);
						setState(374);
						exp(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpMultContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(375);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(376);
						match(TK_MULT);
						setState(377);
						exp(4);
						}
						break;
					case 12:
						{
						_localctx = new ExpDivContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(378);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(379);
						match(TK_DIV);
						setState(380);
						exp(3);
						}
						break;
					case 13:
						{
						_localctx = new ExpModuloContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(381);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(382);
						match(TK_MOD);
						setState(383);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OptargsContext extends ParserRuleContext {
		public OptargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optargs; }
	 
		public OptargsContext() { }
		public void copyFrom(OptargsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptargsEpsilonContext extends OptargsContext {
		public OptargsEpsilonContext(OptargsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOptargsEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOptargsEpsilon(this);
		}
	}
	public static class OptargsArgsContext extends OptargsContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public OptargsArgsContext(OptargsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOptargsArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOptargsArgs(this);
		}
	}

	public final OptargsContext optargs() throws RecognitionException {
		OptargsContext _localctx = new OptargsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_optargs);
		try {
			setState(391);
			switch (_input.LA(1)) {
			case TK_CARACTER:
			case VERDADERO:
			case FALSO:
			case TK_ENTERO:
			case TK_MENOS:
			case TK_NEG:
			case TK_PAR_IZQ:
			case ID:
			case TK_REAL:
			case TK_CADENA:
				_localctx = new OptargsArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				args();
				}
				break;
			case TK_PAR_DER:
				_localctx = new OptargsEpsilonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt2Context extends ParserRuleContext {
		public Stmt2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt2; }
	 
		public Stmt2Context() { }
		public void copyFrom(Stmt2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Stmt2IDAsigContext extends Stmt2Context {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt2IDAsigContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2IDAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2IDAsig(this);
		}
	}
	public static class Stmt2HacerContext extends Stmt2Context {
		public TerminalNode HACER() { return getToken(PsicoderParser.HACER, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public TerminalNode MIENTRAS() { return getToken(PsicoderParser.MIENTRAS, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt2HacerContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2Hacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2Hacer(this);
		}
	}
	public static class Stmt2SiNoContext extends Stmt2Context {
		public TerminalNode SI() { return getToken(PsicoderParser.SI, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode ENTONCES() { return getToken(PsicoderParser.ENTONCES, 0); }
		public List<Statements3Context> statements3() {
			return getRuleContexts(Statements3Context.class);
		}
		public Statements3Context statements3(int i) {
			return getRuleContext(Statements3Context.class,i);
		}
		public TerminalNode SI_NO() { return getToken(PsicoderParser.SI_NO, 0); }
		public TerminalNode FIN_SI() { return getToken(PsicoderParser.FIN_SI, 0); }
		public Stmt2SiNoContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2SiNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2SiNo(this);
		}
	}
	public static class Stmt2ParaContext extends Stmt2Context {
		public TerminalNode PARA() { return getToken(PsicoderParser.PARA, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode HACER() { return getToken(PsicoderParser.HACER, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public TerminalNode FIN_PARA() { return getToken(PsicoderParser.FIN_PARA, 0); }
		public Stmt2ParaContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2Para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2Para(this);
		}
	}
	public static class Stmt2TypeAsifExpContext extends Stmt2Context {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt2TypeAsifExpContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2TypeAsifExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2TypeAsifExp(this);
		}
	}
	public static class Stmt2ImprimirContext extends Stmt2Context {
		public TerminalNode IMPRIMIR() { return getToken(PsicoderParser.IMPRIMIR, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public Imp_paramsContext imp_params() {
			return getRuleContext(Imp_paramsContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt2ImprimirContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2Imprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2Imprimir(this);
		}
	}
	public static class Stmt2IDContext extends Stmt2Context {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt2IDContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2ID(this);
		}
	}
	public static class Stmt2LeerChainContext extends Stmt2Context {
		public TerminalNode LEER() { return getToken(PsicoderParser.LEER, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt2LeerChainContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2LeerChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2LeerChain(this);
		}
	}
	public static class Stmt2RomperContext extends Stmt2Context {
		public TerminalNode ROMPER() { return getToken(PsicoderParser.ROMPER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt2RomperContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2Romper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2Romper(this);
		}
	}
	public static class Stmt2CallFunctionContext extends Stmt2Context {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public OptpargsContext optpargs() {
			return getRuleContext(OptpargsContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt2CallFunctionContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2CallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2CallFunction(this);
		}
	}
	public static class Stmt2SiContext extends Stmt2Context {
		public TerminalNode SI() { return getToken(PsicoderParser.SI, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode ENTONCES() { return getToken(PsicoderParser.ENTONCES, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public TerminalNode FIN_SI() { return getToken(PsicoderParser.FIN_SI, 0); }
		public Stmt2SiContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2Si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2Si(this);
		}
	}
	public static class Stmt2TypeAsigContext extends Stmt2Context {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public OptexpContext optexp() {
			return getRuleContext(OptexpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt2TypeAsigContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2TypeAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2TypeAsig(this);
		}
	}
	public static class Stmt2SeleccionarContext extends Stmt2Context {
		public TerminalNode SELECCIONAR() { return getToken(PsicoderParser.SELECCIONAR, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode ENTRE() { return getToken(PsicoderParser.ENTRE, 0); }
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public TerminalNode FIN_SELECCIONAR() { return getToken(PsicoderParser.FIN_SELECCIONAR, 0); }
		public Stmt2SeleccionarContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2Seleccionar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2Seleccionar(this);
		}
	}
	public static class Stmt2MientrasContext extends Stmt2Context {
		public TerminalNode MIENTRAS() { return getToken(PsicoderParser.MIENTRAS, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode HACER() { return getToken(PsicoderParser.HACER, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public TerminalNode FIN_MIENTRAS() { return getToken(PsicoderParser.FIN_MIENTRAS, 0); }
		public Stmt2MientrasContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2Mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2Mientras(this);
		}
	}
	public static class Stmt2TypeAsigOptexpContext extends Stmt2Context {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public OptexpContext optexp() {
			return getRuleContext(OptexpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt2TypeAsigOptexpContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2TypeAsigOptexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2TypeAsigOptexp(this);
		}
	}
	public static class Stmt2IDChainContext extends Stmt2Context {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt2IDChainContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2IDChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2IDChain(this);
		}
	}
	public static class Stmt2LeerIDContext extends Stmt2Context {
		public TerminalNode LEER() { return getToken(PsicoderParser.LEER, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt2LeerIDContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2LeerID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2LeerID(this);
		}
	}

	public final Stmt2Context stmt2() throws RecognitionException {
		Stmt2Context _localctx = new Stmt2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_stmt2);
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new Stmt2RomperContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(ROMPER);
				setState(394);
				match(TK_PYC);
				}
				break;
			case 2:
				_localctx = new Stmt2CallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(ID);
				setState(396);
				match(TK_PAR_IZQ);
				setState(397);
				optpargs();
				setState(398);
				match(TK_PAR_DER);
				setState(399);
				match(TK_PYC);
				}
				break;
			case 3:
				_localctx = new Stmt2TypeAsigContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				type();
				setState(402);
				match(ID);
				setState(403);
				match(TK_ASIG);
				setState(404);
				exp(0);
				setState(405);
				match(TK_COMA);
				setState(406);
				optexp();
				setState(407);
				match(TK_PYC);
				}
				break;
			case 4:
				_localctx = new Stmt2TypeAsigOptexpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				type();
				setState(410);
				match(ID);
				setState(411);
				match(TK_COMA);
				setState(412);
				optexp();
				setState(413);
				match(TK_PYC);
				}
				break;
			case 5:
				_localctx = new Stmt2IDAsigContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				match(ID);
				setState(416);
				match(TK_ASIG);
				setState(417);
				exp(0);
				setState(418);
				match(TK_PYC);
				}
				break;
			case 6:
				_localctx = new Stmt2TypeAsifExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(420);
				type();
				setState(421);
				match(ID);
				setState(422);
				match(TK_ASIG);
				setState(423);
				exp(0);
				setState(424);
				match(TK_PYC);
				}
				break;
			case 7:
				_localctx = new Stmt2IDChainContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(426);
				match(ID);
				setState(427);
				match(TK_PUNTO);
				setState(428);
				chain();
				setState(429);
				match(TK_ASIG);
				setState(430);
				exp(0);
				setState(431);
				match(TK_PYC);
				}
				break;
			case 8:
				_localctx = new Stmt2IDContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(433);
				type();
				setState(434);
				match(ID);
				setState(435);
				match(TK_PYC);
				}
				break;
			case 9:
				_localctx = new Stmt2SiContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(437);
				match(SI);
				setState(438);
				match(TK_PAR_IZQ);
				setState(439);
				exp(0);
				setState(440);
				match(TK_PAR_DER);
				setState(441);
				match(ENTONCES);
				setState(442);
				statements3();
				setState(443);
				match(FIN_SI);
				}
				break;
			case 10:
				_localctx = new Stmt2SiNoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(445);
				match(SI);
				setState(446);
				match(TK_PAR_IZQ);
				setState(447);
				exp(0);
				setState(448);
				match(TK_PAR_DER);
				setState(449);
				match(ENTONCES);
				setState(450);
				statements3();
				setState(451);
				match(SI_NO);
				setState(452);
				statements3();
				setState(453);
				match(FIN_SI);
				}
				break;
			case 11:
				_localctx = new Stmt2LeerIDContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(455);
				match(LEER);
				setState(456);
				match(TK_PAR_IZQ);
				setState(457);
				match(ID);
				setState(458);
				match(TK_PUNTO);
				setState(459);
				chain();
				setState(460);
				match(TK_PAR_DER);
				setState(461);
				match(TK_PYC);
				}
				break;
			case 12:
				_localctx = new Stmt2LeerChainContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(463);
				match(LEER);
				setState(464);
				match(TK_PAR_IZQ);
				setState(465);
				match(ID);
				setState(466);
				match(TK_PAR_DER);
				setState(467);
				match(TK_PYC);
				}
				break;
			case 13:
				_localctx = new Stmt2ImprimirContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(468);
				match(IMPRIMIR);
				setState(469);
				match(TK_PAR_IZQ);
				setState(470);
				imp_params();
				setState(471);
				match(TK_PAR_DER);
				setState(472);
				match(TK_PYC);
				}
				break;
			case 14:
				_localctx = new Stmt2ParaContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(474);
				match(PARA);
				setState(475);
				match(TK_PAR_IZQ);
				setState(476);
				stmt();
				setState(477);
				exp(0);
				setState(478);
				match(TK_PYC);
				setState(479);
				exp(0);
				setState(480);
				match(TK_PAR_DER);
				setState(481);
				match(HACER);
				setState(482);
				statements3();
				setState(483);
				match(FIN_PARA);
				}
				break;
			case 15:
				_localctx = new Stmt2MientrasContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(485);
				match(MIENTRAS);
				setState(486);
				match(TK_PAR_IZQ);
				setState(487);
				exp(0);
				setState(488);
				match(TK_PAR_DER);
				setState(489);
				match(HACER);
				setState(490);
				statements3();
				setState(491);
				match(FIN_MIENTRAS);
				}
				break;
			case 16:
				_localctx = new Stmt2HacerContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(493);
				match(HACER);
				setState(494);
				statements3();
				setState(495);
				match(MIENTRAS);
				setState(496);
				match(TK_PAR_IZQ);
				setState(497);
				exp(0);
				setState(498);
				match(TK_PAR_DER);
				setState(499);
				match(TK_PYC);
				}
				break;
			case 17:
				_localctx = new Stmt2SeleccionarContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(501);
				match(SELECCIONAR);
				setState(502);
				match(TK_PAR_IZQ);
				setState(503);
				match(ID);
				setState(504);
				match(TK_PAR_DER);
				setState(505);
				match(ENTRE);
				setState(506);
				cases();
				setState(507);
				match(FIN_SELECCIONAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt4Context extends ParserRuleContext {
		public Stmt4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt4; }
	 
		public Stmt4Context() { }
		public void copyFrom(Stmt4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Stmt4FuncionContext extends Stmt4Context {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public OptpargsContext optpargs() {
			return getRuleContext(OptpargsContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt4FuncionContext(Stmt4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt4Funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt4Funcion(this);
		}
	}
	public static class Stmt4IDChainAsigContext extends Stmt4Context {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt4IDChainAsigContext(Stmt4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt4IDChainAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt4IDChainAsig(this);
		}
	}
	public static class Stmt4IDAsigContext extends Stmt4Context {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt4IDAsigContext(Stmt4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt4IDAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt4IDAsig(this);
		}
	}
	public static class Stmt4TypeIDComaContext extends Stmt4Context {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public OptexpContext optexp() {
			return getRuleContext(OptexpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt4TypeIDComaContext(Stmt4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt4TypeIDComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt4TypeIDComa(this);
		}
	}
	public static class Stmt4TypeIDContext extends Stmt4Context {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt4TypeIDContext(Stmt4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt4TypeID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt4TypeID(this);
		}
	}
	public static class Stmt4TypeIDAsigContext extends Stmt4Context {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt4TypeIDAsigContext(Stmt4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt4TypeIDAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt4TypeIDAsig(this);
		}
	}
	public static class Stmt4TypeIDAsigComaContext extends Stmt4Context {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public OptexpContext optexp() {
			return getRuleContext(OptexpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt4TypeIDAsigComaContext(Stmt4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt4TypeIDAsigComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt4TypeIDAsigComa(this);
		}
	}

	public final Stmt4Context stmt4() throws RecognitionException {
		Stmt4Context _localctx = new Stmt4Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_stmt4);
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Stmt4FuncionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(ID);
				setState(512);
				match(TK_PAR_IZQ);
				setState(513);
				optpargs();
				setState(514);
				match(TK_PAR_DER);
				setState(515);
				match(TK_PYC);
				}
				break;
			case 2:
				_localctx = new Stmt4TypeIDAsigComaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				type();
				setState(518);
				match(ID);
				setState(519);
				match(TK_ASIG);
				setState(520);
				exp(0);
				setState(521);
				match(TK_COMA);
				setState(522);
				optexp();
				setState(523);
				match(TK_PYC);
				}
				break;
			case 3:
				_localctx = new Stmt4TypeIDComaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				type();
				setState(526);
				match(ID);
				setState(527);
				match(TK_COMA);
				setState(528);
				optexp();
				setState(529);
				match(TK_PYC);
				}
				break;
			case 4:
				_localctx = new Stmt4IDAsigContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				match(ID);
				setState(532);
				match(TK_ASIG);
				setState(533);
				exp(0);
				setState(534);
				match(TK_PYC);
				}
				break;
			case 5:
				_localctx = new Stmt4TypeIDAsigContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(536);
				type();
				setState(537);
				match(ID);
				setState(538);
				match(TK_ASIG);
				setState(539);
				exp(0);
				setState(540);
				match(TK_PYC);
				}
				break;
			case 6:
				_localctx = new Stmt4IDChainAsigContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(542);
				match(ID);
				setState(543);
				match(TK_PUNTO);
				setState(544);
				chain();
				setState(545);
				match(TK_ASIG);
				setState(546);
				exp(0);
				setState(547);
				match(TK_PYC);
				}
				break;
			case 7:
				_localctx = new Stmt4TypeIDContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(549);
				type();
				setState(550);
				match(ID);
				setState(551);
				match(TK_PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u022e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\64\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5T\n"+
		"\5\3\6\3\6\5\6X\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7b\n\7\3\b\3\b\5"+
		"\bf\n\b\3\t\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n\5\ns\n\n\3\13\3\13"+
		"\3\13\3\13\5\13y\n\13\3\f\3\f\3\f\3\f\5\f\177\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00f3\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00fc\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0106\n\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u0111\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0120\n\22"+
		"\3\23\3\23\3\23\3\23\5\23\u0126\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u015a\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u0183\n\24\f\24\16\24\u0186\13\24\3\25\3\25\5\25\u018a\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0200\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u022c\n\27\3\27\2\3&\30\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\u0274\2\63\3\2\2\2\4\65"+
		"\3\2\2\2\6K\3\2\2\2\bS\3\2\2\2\nW\3\2\2\2\fa\3\2\2\2\16e\3\2\2\2\20l\3"+
		"\2\2\2\22r\3\2\2\2\24x\3\2\2\2\26~\3\2\2\2\30\u00f2\3\2\2\2\32\u00fb\3"+
		"\2\2\2\34\u0105\3\2\2\2\36\u0107\3\2\2\2 \u0110\3\2\2\2\"\u011f\3\2\2"+
		"\2$\u0125\3\2\2\2&\u0159\3\2\2\2(\u0189\3\2\2\2*\u01ff\3\2\2\2,\u022b"+
		"\3\2\2\2./\5\6\4\2/\60\5\2\2\2\60\64\3\2\2\2\61\64\5\4\3\2\62\64\3\2\2"+
		"\2\63.\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\3\3\2\2\2\65\66\7\32\2\2"+
		"\66\67\5\22\n\2\678\7\34\2\28\5\3\2\2\29:\7\33\2\2:;\5\b\5\2;<\7?\2\2"+
		"<=\7=\2\2=>\5\n\6\2>?\7>\2\2?@\7\n\2\2@A\5\22\n\2AB\7\24\2\2BC\5&\24\2"+
		"CD\7:\2\2DE\7\3\2\2EL\3\2\2\2FG\7\25\2\2GH\7?\2\2HI\5\26\f\2IJ\7\26\2"+
		"\2JL\3\2\2\2K9\3\2\2\2KF\3\2\2\2L\7\3\2\2\2MT\7\"\2\2NT\7\30\2\2OT\7\31"+
		"\2\2PT\7!\2\2QT\7\35\2\2RT\7?\2\2SM\3\2\2\2SN\3\2\2\2SO\3\2\2\2SP\3\2"+
		"\2\2SQ\3\2\2\2SR\3\2\2\2T\t\3\2\2\2UX\5\f\7\2VX\3\2\2\2WU\3\2\2\2WV\3"+
		"\2\2\2X\13\3\2\2\2YZ\5\b\5\2Z[\7?\2\2[\\\7;\2\2\\]\5\f\7\2]b\3\2\2\2^"+
		"_\5\b\5\2_`\7?\2\2`b\3\2\2\2aY\3\2\2\2a^\3\2\2\2b\r\3\2\2\2cf\5\20\t\2"+
		"df\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\17\3\2\2\2gh\5&\24\2hi\7;\2\2ij\5\f\7"+
		"\2jm\3\2\2\2km\5&\24\2lg\3\2\2\2lk\3\2\2\2m\21\3\2\2\2no\5\30\r\2op\5"+
		"\22\n\2ps\3\2\2\2qs\3\2\2\2rn\3\2\2\2rq\3\2\2\2s\23\3\2\2\2tu\5*\26\2"+
		"uv\5\24\13\2vy\3\2\2\2wy\3\2\2\2xt\3\2\2\2xw\3\2\2\2y\25\3\2\2\2z{\5,"+
		"\27\2{|\5\26\f\2|\177\3\2\2\2}\177\3\2\2\2~z\3\2\2\2~}\3\2\2\2\177\27"+
		"\3\2\2\2\u0080\u0081\7?\2\2\u0081\u0082\7=\2\2\u0082\u0083\5\16\b\2\u0083"+
		"\u0084\7>\2\2\u0084\u0085\7:\2\2\u0085\u00f3\3\2\2\2\u0086\u0087\5\b\5"+
		"\2\u0087\u0088\7?\2\2\u0088\u0089\7-\2\2\u0089\u008a\5&\24\2\u008a\u008b"+
		"\7;\2\2\u008b\u008c\5\"\22\2\u008c\u008d\7:\2\2\u008d\u00f3\3\2\2\2\u008e"+
		"\u008f\5\b\5\2\u008f\u0090\7?\2\2\u0090\u0091\7;\2\2\u0091\u0092\5\"\22"+
		"\2\u0092\u0093\7:\2\2\u0093\u00f3\3\2\2\2\u0094\u0095\7?\2\2\u0095\u0096"+
		"\7-\2\2\u0096\u0097\5&\24\2\u0097\u0098\7:\2\2\u0098\u00f3\3\2\2\2\u0099"+
		"\u009a\5\b\5\2\u009a\u009b\7?\2\2\u009b\u009c\7-\2\2\u009c\u009d\5&\24"+
		"\2\u009d\u009e\7:\2\2\u009e\u00f3\3\2\2\2\u009f\u00a0\7?\2\2\u00a0\u00a1"+
		"\7<\2\2\u00a1\u00a2\5$\23\2\u00a2\u00a3\7-\2\2\u00a3\u00a4\5&\24\2\u00a4"+
		"\u00a5\7:\2\2\u00a5\u00f3\3\2\2\2\u00a6\u00a7\5\b\5\2\u00a7\u00a8\7?\2"+
		"\2\u00a8\u00a9\7:\2\2\u00a9\u00f3\3\2\2\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac"+
		"\7=\2\2\u00ac\u00ad\5&\24\2\u00ad\u00ae\7>\2\2\u00ae\u00af\7\7\2\2\u00af"+
		"\u00b0\5\22\n\2\u00b0\u00b1\7\b\2\2\u00b1\u00f3\3\2\2\2\u00b2\u00b3\7"+
		"\6\2\2\u00b3\u00b4\7=\2\2\u00b4\u00b5\5&\24\2\u00b5\u00b6\7>\2\2\u00b6"+
		"\u00b7\7\7\2\2\u00b7\u00b8\5\22\n\2\u00b8\u00b9\7\5\2\2\u00b9\u00ba\5"+
		"\22\n\2\u00ba\u00bb\7\b\2\2\u00bb\u00f3\3\2\2\2\u00bc\u00bd\7\4\2\2\u00bd"+
		"\u00be\7=\2\2\u00be\u00bf\7?\2\2\u00bf\u00c0\7>\2\2\u00c0\u00f3\7:\2\2"+
		"\u00c1\u00c2\7\4\2\2\u00c2\u00c3\7=\2\2\u00c3\u00c4\7?\2\2\u00c4\u00c5"+
		"\7<\2\2\u00c5\u00c6\5$\23\2\u00c6\u00c7\7>\2\2\u00c7\u00c8\7:\2\2\u00c8"+
		"\u00f3\3\2\2\2\u00c9\u00ca\7\27\2\2\u00ca\u00cb\7=\2\2\u00cb\u00cc\5 "+
		"\21\2\u00cc\u00cd\7>\2\2\u00cd\u00ce\7:\2\2\u00ce\u00f3\3\2\2\2\u00cf"+
		"\u00d0\7\f\2\2\u00d0\u00d1\7=\2\2\u00d1\u00d2\5\30\r\2\u00d2\u00d3\5&"+
		"\24\2\u00d3\u00d4\7:\2\2\u00d4\u00d5\5&\24\2\u00d5\u00d6\7>\2\2\u00d6"+
		"\u00d7\7\n\2\2\u00d7\u00d8\5\24\13\2\u00d8\u00d9\7\r\2\2\u00d9\u00f3\3"+
		"\2\2\2\u00da\u00db\7\t\2\2\u00db\u00dc\7=\2\2\u00dc\u00dd\5&\24\2\u00dd"+
		"\u00de\7>\2\2\u00de\u00df\7\n\2\2\u00df\u00e0\5\24\13\2\u00e0\u00e1\7"+
		"\13\2\2\u00e1\u00f3\3\2\2\2\u00e2\u00e3\7\n\2\2\u00e3\u00e4\5\24\13\2"+
		"\u00e4\u00e5\7\t\2\2\u00e5\u00e6\7=\2\2\u00e6\u00e7\5&\24\2\u00e7\u00e8"+
		"\7>\2\2\u00e8\u00e9\7:\2\2\u00e9\u00f3\3\2\2\2\u00ea\u00eb\7\16\2\2\u00eb"+
		"\u00ec\7=\2\2\u00ec\u00ed\7?\2\2\u00ed\u00ee\7>\2\2\u00ee\u00ef\7\17\2"+
		"\2\u00ef\u00f0\5\32\16\2\u00f0\u00f1\7\23\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u0080\3\2\2\2\u00f2\u0086\3\2\2\2\u00f2\u008e\3\2\2\2\u00f2\u0094\3\2"+
		"\2\2\u00f2\u0099\3\2\2\2\u00f2\u009f\3\2\2\2\u00f2\u00a6\3\2\2\2\u00f2"+
		"\u00aa\3\2\2\2\u00f2\u00b2\3\2\2\2\u00f2\u00bc\3\2\2\2\u00f2\u00c1\3\2"+
		"\2\2\u00f2\u00c9\3\2\2\2\u00f2\u00cf\3\2\2\2\u00f2\u00da\3\2\2\2\u00f2"+
		"\u00e2\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f3\31\3\2\2\2\u00f4\u00f5\7\20\2"+
		"\2\u00f5\u00f6\5&\24\2\u00f6\u00f7\7\67\2\2\u00f7\u00f8\5\24\13\2\u00f8"+
		"\u00f9\5\34\17\2\u00f9\u00fc\3\2\2\2\u00fa\u00fc\5\36\20\2\u00fb\u00f4"+
		"\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\33\3\2\2\2\u00fd\u00fe\7\20\2\2\u00fe"+
		"\u00ff\5&\24\2\u00ff\u0100\7\67\2\2\u0100\u0101\5\24\13\2\u0101\u0102"+
		"\5\34\17\2\u0102\u0106\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0106\5\36\20"+
		"\2\u0105\u00fd\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\35"+
		"\3\2\2\2\u0107\u0108\7\22\2\2\u0108\u0109\7\67\2\2\u0109\u010a\5\24\13"+
		"\2\u010a\37\3\2\2\2\u010b\u010c\5&\24\2\u010c\u010d\7;\2\2\u010d\u010e"+
		"\5 \21\2\u010e\u0111\3\2\2\2\u010f\u0111\5&\24\2\u0110\u010b\3\2\2\2\u0110"+
		"\u010f\3\2\2\2\u0111!\3\2\2\2\u0112\u0113\7?\2\2\u0113\u0114\7;\2\2\u0114"+
		"\u0120\5\"\22\2\u0115\u0116\7?\2\2\u0116\u0117\7-\2\2\u0117\u0118\5&\24"+
		"\2\u0118\u0119\7;\2\2\u0119\u011a\5\"\22\2\u011a\u0120\3\2\2\2\u011b\u0120"+
		"\7?\2\2\u011c\u011d\7?\2\2\u011d\u011e\7-\2\2\u011e\u0120\5&\24\2\u011f"+
		"\u0112\3\2\2\2\u011f\u0115\3\2\2\2\u011f\u011b\3\2\2\2\u011f\u011c\3\2"+
		"\2\2\u0120#\3\2\2\2\u0121\u0122\7?\2\2\u0122\u0123\7<\2\2\u0123\u0126"+
		"\5$\23\2\u0124\u0126\7?\2\2\u0125\u0121\3\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"%\3\2\2\2\u0127\u0128\b\24\1\2\u0128\u015a\7\36\2\2\u0129\u015a\7?\2\2"+
		"\u012a\u012b\7?\2\2\u012b\u012c\7<\2\2\u012c\u015a\5$\23\2\u012d\u015a"+
		"\7#\2\2\u012e\u015a\7@\2\2\u012f\u015a\7A\2\2\u0130\u015a\7\37\2\2\u0131"+
		"\u015a\7 \2\2\u0132\u0133\7)\2\2\u0133\u015a\7@\2\2\u0134\u0135\7)\2\2"+
		"\u0135\u015a\7#\2\2\u0136\u0137\7)\2\2\u0137\u015a\7?\2\2\u0138\u0139"+
		"\7)\2\2\u0139\u013a\7?\2\2\u013a\u013b\7<\2\2\u013b\u015a\5$\23\2\u013c"+
		"\u013d\7)\2\2\u013d\u013e\7=\2\2\u013e\u013f\5&\24\2\u013f\u0140\7>\2"+
		"\2\u0140\u015a\3\2\2\2\u0141\u0142\7\66\2\2\u0142\u015a\7?\2\2\u0143\u0144"+
		"\7\66\2\2\u0144\u0145\7?\2\2\u0145\u0146\7<\2\2\u0146\u015a\5$\23\2\u0147"+
		"\u0148\7\66\2\2\u0148\u015a\7\37\2\2\u0149\u014a\7\66\2\2\u014a\u015a"+
		"\7 \2\2\u014b\u014c\7\66\2\2\u014c\u014d\7=\2\2\u014d\u014e\5&\24\2\u014e"+
		"\u014f\7>\2\2\u014f\u015a\3\2\2\2\u0150\u0151\7=\2\2\u0151\u0152\5&\24"+
		"\2\u0152\u0153\7>\2\2\u0153\u015a\3\2\2\2\u0154\u0155\7?\2\2\u0155\u0156"+
		"\7=\2\2\u0156\u0157\5(\25\2\u0157\u0158\7>\2\2\u0158\u015a\3\2\2\2\u0159"+
		"\u0127\3\2\2\2\u0159\u0129\3\2\2\2\u0159\u012a\3\2\2\2\u0159\u012d\3\2"+
		"\2\2\u0159\u012e\3\2\2\2\u0159\u012f\3\2\2\2\u0159\u0130\3\2\2\2\u0159"+
		"\u0131\3\2\2\2\u0159\u0132\3\2\2\2\u0159\u0134\3\2\2\2\u0159\u0136\3\2"+
		"\2\2\u0159\u0138\3\2\2\2\u0159\u013c\3\2\2\2\u0159\u0141\3\2\2\2\u0159"+
		"\u0143\3\2\2\2\u0159\u0147\3\2\2\2\u0159\u0149\3\2\2\2\u0159\u014b\3\2"+
		"\2\2\u0159\u0150\3\2\2\2\u0159\u0154\3\2\2\2\u015a\u0184\3\2\2\2\u015b"+
		"\u015c\f\17\2\2\u015c\u015d\7\64\2\2\u015d\u0183\5&\24\20\u015e\u015f"+
		"\f\16\2\2\u015f\u0160\7\63\2\2\u0160\u0183\5&\24\17\u0161\u0162\f\r\2"+
		"\2\u0162\u0163\7\62\2\2\u0163\u0183\5&\24\16\u0164\u0165\f\f\2\2\u0165"+
		"\u0166\7.\2\2\u0166\u0183\5&\24\r\u0167\u0168\f\13\2\2\u0168\u0169\7/"+
		"\2\2\u0169\u0183\5&\24\f\u016a\u016b\f\n\2\2\u016b\u016c\7\60\2\2\u016c"+
		"\u0183\5&\24\13\u016d\u016e\f\t\2\2\u016e\u016f\7\61\2\2\u016f\u0183\5"+
		"&\24\n\u0170\u0171\f\b\2\2\u0171\u0172\7\65\2\2\u0172\u0183\5&\24\t\u0173"+
		"\u0174\f\7\2\2\u0174\u0175\7(\2\2\u0175\u0183\5&\24\b\u0176\u0177\f\6"+
		"\2\2\u0177\u0178\7)\2\2\u0178\u0183\5&\24\7\u0179\u017a\f\5\2\2\u017a"+
		"\u017b\7*\2\2\u017b\u0183\5&\24\6\u017c\u017d\f\4\2\2\u017d\u017e\7+\2"+
		"\2\u017e\u0183\5&\24\5\u017f\u0180\f\3\2\2\u0180\u0181\7,\2\2\u0181\u0183"+
		"\5&\24\4\u0182\u015b\3\2\2\2\u0182\u015e\3\2\2\2\u0182\u0161\3\2\2\2\u0182"+
		"\u0164\3\2\2\2\u0182\u0167\3\2\2\2\u0182\u016a\3\2\2\2\u0182\u016d\3\2"+
		"\2\2\u0182\u0170\3\2\2\2\u0182\u0173\3\2\2\2\u0182\u0176\3\2\2\2\u0182"+
		"\u0179\3\2\2\2\u0182\u017c\3\2\2\2\u0182\u017f\3\2\2\2\u0183\u0186\3\2"+
		"\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\'\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0187\u018a\5\20\t\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2"+
		"\u0189\u0188\3\2\2\2\u018a)\3\2\2\2\u018b\u018c\7\21\2\2\u018c\u0200\7"+
		":\2\2\u018d\u018e\7?\2\2\u018e\u018f\7=\2\2\u018f\u0190\5\16\b\2\u0190"+
		"\u0191\7>\2\2\u0191\u0192\7:\2\2\u0192\u0200\3\2\2\2\u0193\u0194\5\b\5"+
		"\2\u0194\u0195\7?\2\2\u0195\u0196\7-\2\2\u0196\u0197\5&\24\2\u0197\u0198"+
		"\7;\2\2\u0198\u0199\5\"\22\2\u0199\u019a\7:\2\2\u019a\u0200\3\2\2\2\u019b"+
		"\u019c\5\b\5\2\u019c\u019d\7?\2\2\u019d\u019e\7;\2\2\u019e\u019f\5\"\22"+
		"\2\u019f\u01a0\7:\2\2\u01a0\u0200\3\2\2\2\u01a1\u01a2\7?\2\2\u01a2\u01a3"+
		"\7-\2\2\u01a3\u01a4\5&\24\2\u01a4\u01a5\7:\2\2\u01a5\u0200\3\2\2\2\u01a6"+
		"\u01a7\5\b\5\2\u01a7\u01a8\7?\2\2\u01a8\u01a9\7-\2\2\u01a9\u01aa\5&\24"+
		"\2\u01aa\u01ab\7:\2\2\u01ab\u0200\3\2\2\2\u01ac\u01ad\7?\2\2\u01ad\u01ae"+
		"\7<\2\2\u01ae\u01af\5$\23\2\u01af\u01b0\7-\2\2\u01b0\u01b1\5&\24\2\u01b1"+
		"\u01b2\7:\2\2\u01b2\u0200\3\2\2\2\u01b3\u01b4\5\b\5\2\u01b4\u01b5\7?\2"+
		"\2\u01b5\u01b6\7:\2\2\u01b6\u0200\3\2\2\2\u01b7\u01b8\7\6\2\2\u01b8\u01b9"+
		"\7=\2\2\u01b9\u01ba\5&\24\2\u01ba\u01bb\7>\2\2\u01bb\u01bc\7\7\2\2\u01bc"+
		"\u01bd\5\24\13\2\u01bd\u01be\7\b\2\2\u01be\u0200\3\2\2\2\u01bf\u01c0\7"+
		"\6\2\2\u01c0\u01c1\7=\2\2\u01c1\u01c2\5&\24\2\u01c2\u01c3\7>\2\2\u01c3"+
		"\u01c4\7\7\2\2\u01c4\u01c5\5\24\13\2\u01c5\u01c6\7\5\2\2\u01c6\u01c7\5"+
		"\24\13\2\u01c7\u01c8\7\b\2\2\u01c8\u0200\3\2\2\2\u01c9\u01ca\7\4\2\2\u01ca"+
		"\u01cb\7=\2\2\u01cb\u01cc\7?\2\2\u01cc\u01cd\7<\2\2\u01cd\u01ce\5$\23"+
		"\2\u01ce\u01cf\7>\2\2\u01cf\u01d0\7:\2\2\u01d0\u0200\3\2\2\2\u01d1\u01d2"+
		"\7\4\2\2\u01d2\u01d3\7=\2\2\u01d3\u01d4\7?\2\2\u01d4\u01d5\7>\2\2\u01d5"+
		"\u0200\7:\2\2\u01d6\u01d7\7\27\2\2\u01d7\u01d8\7=\2\2\u01d8\u01d9\5 \21"+
		"\2\u01d9\u01da\7>\2\2\u01da\u01db\7:\2\2\u01db\u0200\3\2\2\2\u01dc\u01dd"+
		"\7\f\2\2\u01dd\u01de\7=\2\2\u01de\u01df\5\30\r\2\u01df\u01e0\5&\24\2\u01e0"+
		"\u01e1\7:\2\2\u01e1\u01e2\5&\24\2\u01e2\u01e3\7>\2\2\u01e3\u01e4\7\n\2"+
		"\2\u01e4\u01e5\5\24\13\2\u01e5\u01e6\7\r\2\2\u01e6\u0200\3\2\2\2\u01e7"+
		"\u01e8\7\t\2\2\u01e8\u01e9\7=\2\2\u01e9\u01ea\5&\24\2\u01ea\u01eb\7>\2"+
		"\2\u01eb\u01ec\7\n\2\2\u01ec\u01ed\5\24\13\2\u01ed\u01ee\7\13\2\2\u01ee"+
		"\u0200\3\2\2\2\u01ef\u01f0\7\n\2\2\u01f0\u01f1\5\24\13\2\u01f1\u01f2\7"+
		"\t\2\2\u01f2\u01f3\7=\2\2\u01f3\u01f4\5&\24\2\u01f4\u01f5\7>\2\2\u01f5"+
		"\u01f6\7:\2\2\u01f6\u0200\3\2\2\2\u01f7\u01f8\7\16\2\2\u01f8\u01f9\7="+
		"\2\2\u01f9\u01fa\7?\2\2\u01fa\u01fb\7>\2\2\u01fb\u01fc\7\17\2\2\u01fc"+
		"\u01fd\5\32\16\2\u01fd\u01fe\7\23\2\2\u01fe\u0200\3\2\2\2\u01ff\u018b"+
		"\3\2\2\2\u01ff\u018d\3\2\2\2\u01ff\u0193\3\2\2\2\u01ff\u019b\3\2\2\2\u01ff"+
		"\u01a1\3\2\2\2\u01ff\u01a6\3\2\2\2\u01ff\u01ac\3\2\2\2\u01ff\u01b3\3\2"+
		"\2\2\u01ff\u01b7\3\2\2\2\u01ff\u01bf\3\2\2\2\u01ff\u01c9\3\2\2\2\u01ff"+
		"\u01d1\3\2\2\2\u01ff\u01d6\3\2\2\2\u01ff\u01dc\3\2\2\2\u01ff\u01e7\3\2"+
		"\2\2\u01ff\u01ef\3\2\2\2\u01ff\u01f7\3\2\2\2\u0200+\3\2\2\2\u0201\u0202"+
		"\7?\2\2\u0202\u0203\7=\2\2\u0203\u0204\5\16\b\2\u0204\u0205\7>\2\2\u0205"+
		"\u0206\7:\2\2\u0206\u022c\3\2\2\2\u0207\u0208\5\b\5\2\u0208\u0209\7?\2"+
		"\2\u0209\u020a\7-\2\2\u020a\u020b\5&\24\2\u020b\u020c\7;\2\2\u020c\u020d"+
		"\5\"\22\2\u020d\u020e\7:\2\2\u020e\u022c\3\2\2\2\u020f\u0210\5\b\5\2\u0210"+
		"\u0211\7?\2\2\u0211\u0212\7;\2\2\u0212\u0213\5\"\22\2\u0213\u0214\7:\2"+
		"\2\u0214\u022c\3\2\2\2\u0215\u0216\7?\2\2\u0216\u0217\7-\2\2\u0217\u0218"+
		"\5&\24\2\u0218\u0219\7:\2\2\u0219\u022c\3\2\2\2\u021a\u021b\5\b\5\2\u021b"+
		"\u021c\7?\2\2\u021c\u021d\7-\2\2\u021d\u021e\5&\24\2\u021e\u021f\7:\2"+
		"\2\u021f\u022c\3\2\2\2\u0220\u0221\7?\2\2\u0221\u0222\7<\2\2\u0222\u0223"+
		"\5$\23\2\u0223\u0224\7-\2\2\u0224\u0225\5&\24\2\u0225\u0226\7:\2\2\u0226"+
		"\u022c\3\2\2\2\u0227\u0228\5\b\5\2\u0228\u0229\7?\2\2\u0229\u022a\7:\2"+
		"\2\u022a\u022c\3\2\2\2\u022b\u0201\3\2\2\2\u022b\u0207\3\2\2\2\u022b\u020f"+
		"\3\2\2\2\u022b\u0215\3\2\2\2\u022b\u021a\3\2\2\2\u022b\u0220\3\2\2\2\u022b"+
		"\u0227\3\2\2\2\u022c-\3\2\2\2\30\63KSWaelrx~\u00f2\u00fb\u0105\u0110\u011f"+
		"\u0125\u0159\u0182\u0184\u0189\u01ff\u022b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}