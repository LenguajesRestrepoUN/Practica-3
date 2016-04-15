// Generated from C:/Users/jccaleroe/Documents/Practica-3/practica3\Psicoder.g4 by ANTLR 4.5.1
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
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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
		RULE_params = 5, RULE_optargs = 6, RULE_args = 7, RULE_statements = 8, 
		RULE_statements3 = 9, RULE_statements4 = 10, RULE_stmt = 11, RULE_cases = 12, 
		RULE_cases2 = 13, RULE_deft = 14, RULE_imp_params = 15, RULE_optexp = 16, 
		RULE_chain = 17, RULE_exp = 18, RULE_stmt2 = 19, RULE_stmt4 = 20;
	public static final String[] ruleNames = {
		"ps", "b", "element", "type", "optparams", "params", "optargs", "args", 
		"statements", "statements3", "statements4", "stmt", "cases", "cases2", 
		"deft", "imp_params", "optexp", "chain", "exp", "stmt2", "stmt4"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitPsElement(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitPsEpsilon(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitPsB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PsContext ps() throws RecognitionException {
		PsContext _localctx = new PsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ps);
		try {
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new PsElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				element();
				setState(43);
				ps();
				}
				break;
			case 2:
				_localctx = new PsBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitBFuncionPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_b);
		try {
			_localctx = new BFuncionPrincipalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(FUNCION_PRINCIPAL);
			setState(50);
			statements();
			setState(51);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitElementFuncion(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitElementEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		try {
			setState(71);
			switch (_input.LA(1)) {
			case FUNCION:
				_localctx = new ElementFuncionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(FUNCION);
				setState(54);
				type();
				setState(55);
				match(ID);
				setState(56);
				match(TK_PAR_IZQ);
				setState(57);
				optparams();
				setState(58);
				match(TK_PAR_DER);
				setState(59);
				match(HACER);
				setState(60);
				statements();
				setState(61);
				match(RETORNAR);
				setState(62);
				exp(0);
				setState(63);
				match(TK_PYC);
				setState(64);
				match(FIN_FUNCION);
				}
				break;
			case ESTRUCTURA:
				_localctx = new ElementEstructuraContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(ESTRUCTURA);
				setState(67);
				match(ID);
				setState(68);
				statements4();
				setState(69);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitTypeBooleano(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitTypeCaracter(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitTypeReal(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitTypeEntero(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitTypeID(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitTypeCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case ENTERO:
				_localctx = new TypeEnteroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(ENTERO);
				}
				break;
			case CARACTER:
				_localctx = new TypeCaracterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(CARACTER);
				}
				break;
			case CADENA:
				_localctx = new TypeCadenaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(CADENA);
				}
				break;
			case REAL:
				_localctx = new TypeRealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(REAL);
				}
				break;
			case BOOLEANO:
				_localctx = new TypeBooleanoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				match(BOOLEANO);
				}
				break;
			case ID:
				_localctx = new TypeIDContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitOptparamsP(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitOptparamsEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptparamsContext optparams() throws RecognitionException {
		OptparamsContext _localctx = new OptparamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_optparams);
		try {
			setState(83);
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
				setState(81);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitParamsTypeIDComa(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitParamsTypeID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ParamsTypeIDComaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				type();
				setState(86);
				match(ID);
				setState(87);
				match(TK_COMA);
				setState(88);
				params();
				}
				break;
			case 2:
				_localctx = new ParamsTypeIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				type();
				setState(91);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitOptargsEpsilon(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitOptargsArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptargsContext optargs() throws RecognitionException {
		OptargsContext _localctx = new OptargsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_optargs);
		try {
			setState(97);
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
				setState(95);
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
	public static class ArgsExpArgsContext extends ArgsContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsExpArgsContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterArgsExpArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitArgsExpArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitArgsExpArgs(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitArgsExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_args);
		try {
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ArgsExpArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				exp(0);
				setState(100);
				match(TK_COMA);
				setState(101);
				args();
				}
				break;
			case 2:
				_localctx = new ArgsExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStatementsEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementsStmtContext extends StatementsContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsStmtContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStatementsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStatementsStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStatementsStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statements);
		try {
			setState(110);
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
				_localctx = new StatementsStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				stmt();
				setState(107);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStatements3Epsilon(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStatements3Stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statements3Context statements3() throws RecognitionException {
		Statements3Context _localctx = new Statements3Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_statements3);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Statements3StmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				stmt2();
				setState(113);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStatements4Stmt(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStatements4Epsilon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statements4Context statements4() throws RecognitionException {
		Statements4Context _localctx = new Statements4Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_statements4);
		try {
			setState(122);
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
				setState(118);
				stmt4();
				setState(119);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtMientras(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtSeleccionar(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtTypeAsig(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtTypeAsifExp(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtPara(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtLeerID(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtHacer(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtSi(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtID(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtIDAsig(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtImprimir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtCallFunctionContext extends StmtContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public OptargsContext optargs() {
			return getRuleContext(OptargsContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtCallFunction(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtSiNo(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtLeerChain(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtTypeAsigOptexp(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtIDChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt);
		try {
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new StmtCallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(ID);
				setState(125);
				match(TK_PAR_IZQ);
				setState(126);
				optargs();
				setState(127);
				match(TK_PAR_DER);
				setState(128);
				match(TK_PYC);
				}
				break;
			case 2:
				_localctx = new StmtTypeAsigContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				type();
				setState(131);
				match(ID);
				setState(132);
				match(TK_ASIG);
				setState(133);
				exp(0);
				setState(134);
				match(TK_COMA);
				setState(135);
				optexp();
				setState(136);
				match(TK_PYC);
				}
				break;
			case 3:
				_localctx = new StmtTypeAsigOptexpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				type();
				setState(139);
				match(ID);
				setState(140);
				match(TK_COMA);
				setState(141);
				optexp();
				setState(142);
				match(TK_PYC);
				}
				break;
			case 4:
				_localctx = new StmtIDAsigContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(ID);
				setState(145);
				match(TK_ASIG);
				setState(146);
				exp(0);
				setState(147);
				match(TK_PYC);
				}
				break;
			case 5:
				_localctx = new StmtTypeAsifExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				type();
				setState(150);
				match(ID);
				setState(151);
				match(TK_ASIG);
				setState(152);
				exp(0);
				setState(153);
				match(TK_PYC);
				}
				break;
			case 6:
				_localctx = new StmtIDChainContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				match(ID);
				setState(156);
				match(TK_PUNTO);
				setState(157);
				chain();
				setState(158);
				match(TK_ASIG);
				setState(159);
				exp(0);
				setState(160);
				match(TK_PYC);
				}
				break;
			case 7:
				_localctx = new StmtIDContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				type();
				setState(163);
				match(ID);
				setState(164);
				match(TK_PYC);
				}
				break;
			case 8:
				_localctx = new StmtSiContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(166);
				match(SI);
				setState(167);
				match(TK_PAR_IZQ);
				setState(168);
				exp(0);
				setState(169);
				match(TK_PAR_DER);
				setState(170);
				match(ENTONCES);
				setState(171);
				statements();
				setState(172);
				match(FIN_SI);
				}
				break;
			case 9:
				_localctx = new StmtSiNoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(174);
				match(SI);
				setState(175);
				match(TK_PAR_IZQ);
				setState(176);
				exp(0);
				setState(177);
				match(TK_PAR_DER);
				setState(178);
				match(ENTONCES);
				setState(179);
				statements();
				setState(180);
				match(SI_NO);
				setState(181);
				statements();
				setState(182);
				match(FIN_SI);
				}
				break;
			case 10:
				_localctx = new StmtLeerIDContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(184);
				match(LEER);
				setState(185);
				match(TK_PAR_IZQ);
				setState(186);
				match(ID);
				setState(187);
				match(TK_PAR_DER);
				setState(188);
				match(TK_PYC);
				}
				break;
			case 11:
				_localctx = new StmtLeerChainContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(189);
				match(LEER);
				setState(190);
				match(TK_PAR_IZQ);
				setState(191);
				match(ID);
				setState(192);
				match(TK_PUNTO);
				setState(193);
				chain();
				setState(194);
				match(TK_PAR_DER);
				setState(195);
				match(TK_PYC);
				}
				break;
			case 12:
				_localctx = new StmtImprimirContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(197);
				match(IMPRIMIR);
				setState(198);
				match(TK_PAR_IZQ);
				setState(199);
				imp_params();
				setState(200);
				match(TK_PAR_DER);
				setState(201);
				match(TK_PYC);
				}
				break;
			case 13:
				_localctx = new StmtParaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(203);
				match(PARA);
				setState(204);
				match(TK_PAR_IZQ);
				setState(205);
				stmt();
				setState(206);
				exp(0);
				setState(207);
				match(TK_PYC);
				setState(208);
				exp(0);
				setState(209);
				match(TK_PAR_DER);
				setState(210);
				match(HACER);
				setState(211);
				statements3();
				setState(212);
				match(FIN_PARA);
				}
				break;
			case 14:
				_localctx = new StmtMientrasContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(214);
				match(MIENTRAS);
				setState(215);
				match(TK_PAR_IZQ);
				setState(216);
				exp(0);
				setState(217);
				match(TK_PAR_DER);
				setState(218);
				match(HACER);
				setState(219);
				statements3();
				setState(220);
				match(FIN_MIENTRAS);
				}
				break;
			case 15:
				_localctx = new StmtHacerContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(222);
				match(HACER);
				setState(223);
				statements3();
				setState(224);
				match(MIENTRAS);
				setState(225);
				match(TK_PAR_IZQ);
				setState(226);
				exp(0);
				setState(227);
				match(TK_PAR_DER);
				setState(228);
				match(TK_PYC);
				}
				break;
			case 16:
				_localctx = new StmtSeleccionarContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(230);
				match(SELECCIONAR);
				setState(231);
				match(TK_PAR_IZQ);
				setState(232);
				match(ID);
				setState(233);
				match(TK_PAR_DER);
				setState(234);
				match(ENTRE);
				setState(235);
				cases();
				setState(236);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCasesDefecto(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCasesCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cases);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case CASO:
				_localctx = new CasesCasoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(CASO);
				setState(241);
				exp(0);
				setState(242);
				match(TK_POSD);
				setState(243);
				statements3();
				setState(244);
				cases2();
				}
				break;
			case DEFECTO:
				_localctx = new CasesDefectoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCases2Epsilon(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCases2Defecto(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCases2cacso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cases2Context cases2() throws RecognitionException {
		Cases2Context _localctx = new Cases2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_cases2);
		try {
			setState(257);
			switch (_input.LA(1)) {
			case CASO:
				_localctx = new Cases2cacsoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(CASO);
				setState(250);
				exp(0);
				setState(251);
				match(TK_POSD);
				setState(252);
				statements3();
				setState(253);
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
				setState(256);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitDeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeftContext deft() throws RecognitionException {
		DeftContext _localctx = new DeftContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_deft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(DEFECTO);
			setState(260);
			match(TK_POSD);
			setState(261);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitImp_paramsExp(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitImp_paramsChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Imp_paramsContext imp_params() throws RecognitionException {
		Imp_paramsContext _localctx = new Imp_paramsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_imp_params);
		try {
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Imp_paramsChainContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				exp(0);
				setState(264);
				match(TK_COMA);
				setState(265);
				imp_params();
				}
				break;
			case 2:
				_localctx = new Imp_paramsExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitOptexpID(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitOptexpIDComa(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitOptexpIDAsigExpComa(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitOptexpIDAsigExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptexpContext optexp() throws RecognitionException {
		OptexpContext _localctx = new OptexpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_optexp);
		try {
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new OptexpIDComaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(ID);
				setState(271);
				match(TK_COMA);
				setState(272);
				optexp();
				}
				break;
			case 2:
				_localctx = new OptexpIDAsigExpComaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(ID);
				setState(274);
				match(TK_ASIG);
				setState(275);
				exp(0);
				setState(276);
				match(TK_COMA);
				setState(277);
				optexp();
				}
				break;
			case 3:
				_localctx = new OptexpIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				match(ID);
				}
				break;
			case 4:
				_localctx = new OptexpIDAsigExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				match(ID);
				setState(281);
				match(TK_ASIG);
				setState(282);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitChainID(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitChainIDPunto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainContext chain() throws RecognitionException {
		ChainContext _localctx = new ChainContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chain);
		try {
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ChainIDPuntoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(ID);
				setState(286);
				match(TK_PUNTO);
				setState(287);
				chain();
				}
				break;
			case 2:
				_localctx = new ChainIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpNegParExp(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpMult(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpModulo(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpIDChain(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpDif(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpFuncion(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpMenos(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpMenor(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpAnd(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpMenosID(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpNegID(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpDiv(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpEntero(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpMayorIgual(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpNegChain(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpOr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpMayor(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpMenorIgual(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpMas(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpNegVerdadero(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpCadena(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpNegFalso(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpParExp(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpVerdadero(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpMenosReal(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpIgual(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpMenosEntero(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpReal(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpCaracter(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpFalso(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpID(this);
			else return visitor.visitChildren(this);
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
			setState(341);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new ExpCaracterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(292);
				match(TK_CARACTER);
				}
				break;
			case 2:
				{
				_localctx = new ExpIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ExpIDChainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				match(ID);
				setState(295);
				match(TK_PUNTO);
				setState(296);
				chain();
				}
				break;
			case 4:
				{
				_localctx = new ExpEnteroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(TK_ENTERO);
				}
				break;
			case 5:
				{
				_localctx = new ExpRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				match(TK_REAL);
				}
				break;
			case 6:
				{
				_localctx = new ExpCadenaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299);
				match(TK_CADENA);
				}
				break;
			case 7:
				{
				_localctx = new ExpVerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				match(VERDADERO);
				}
				break;
			case 8:
				{
				_localctx = new ExpFalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				match(FALSO);
				}
				break;
			case 9:
				{
				_localctx = new ExpMenosRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				match(TK_MENOS);
				setState(303);
				match(TK_REAL);
				}
				break;
			case 10:
				{
				_localctx = new ExpMenosEnteroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				match(TK_MENOS);
				setState(305);
				match(TK_ENTERO);
				}
				break;
			case 11:
				{
				_localctx = new ExpMenosIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(TK_MENOS);
				setState(307);
				match(ID);
				}
				break;
			case 12:
				{
				_localctx = new ExpIDChainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308);
				match(TK_MENOS);
				setState(309);
				match(ID);
				setState(310);
				match(TK_PUNTO);
				setState(311);
				chain();
				}
				break;
			case 13:
				{
				_localctx = new ExpParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(312);
				match(TK_MENOS);
				setState(313);
				match(TK_PAR_IZQ);
				setState(314);
				exp(0);
				setState(315);
				match(TK_PAR_DER);
				}
				break;
			case 14:
				{
				_localctx = new ExpNegIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(TK_NEG);
				setState(318);
				match(ID);
				}
				break;
			case 15:
				{
				_localctx = new ExpNegChainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319);
				match(TK_NEG);
				setState(320);
				match(ID);
				setState(321);
				match(TK_PUNTO);
				setState(322);
				chain();
				}
				break;
			case 16:
				{
				_localctx = new ExpNegVerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323);
				match(TK_NEG);
				setState(324);
				match(VERDADERO);
				}
				break;
			case 17:
				{
				_localctx = new ExpNegFalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(325);
				match(TK_NEG);
				setState(326);
				match(FALSO);
				}
				break;
			case 18:
				{
				_localctx = new ExpNegParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				match(TK_NEG);
				setState(328);
				match(TK_PAR_IZQ);
				setState(329);
				exp(0);
				setState(330);
				match(TK_PAR_DER);
				}
				break;
			case 19:
				{
				_localctx = new ExpParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332);
				match(TK_PAR_IZQ);
				setState(333);
				exp(0);
				setState(334);
				match(TK_PAR_DER);
				}
				break;
			case 20:
				{
				_localctx = new ExpFuncionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				match(ID);
				setState(337);
				match(TK_PAR_IZQ);
				setState(338);
				optargs();
				setState(339);
				match(TK_PAR_DER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(382);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpOrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(343);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(344);
						match(TK_O);
						setState(345);
						exp(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpAndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(346);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(347);
						match(TK_Y);
						setState(348);
						exp(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpIgualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(349);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(350);
						match(TK_IGUAL);
						setState(351);
						exp(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpMenorContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(352);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(353);
						match(TK_MENOR);
						setState(354);
						exp(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpMayorContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(355);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(356);
						match(TK_MAYOR);
						setState(357);
						exp(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpMenorIgualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(358);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(359);
						match(TK_MENOR_IGUAL);
						setState(360);
						exp(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpMayorIgualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(361);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(362);
						match(TK_MAYOR_IGUAL);
						setState(363);
						exp(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpDifContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(364);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(365);
						match(TK_DIF);
						setState(366);
						exp(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpMasContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(367);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(368);
						match(TK_MAS);
						setState(369);
						exp(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpMenosContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(370);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(371);
						match(TK_MENOS);
						setState(372);
						exp(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpMultContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(373);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(374);
						match(TK_MULT);
						setState(375);
						exp(4);
						}
						break;
					case 12:
						{
						_localctx = new ExpDivContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(376);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(377);
						match(TK_DIV);
						setState(378);
						exp(3);
						}
						break;
					case 13:
						{
						_localctx = new ExpModuloContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(379);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(380);
						match(TK_MOD);
						setState(381);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(386);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2IDAsig(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2Hacer(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2SiNo(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2Para(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2TypeAsifExp(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2Imprimir(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2ID(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2LeerChain(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2Romper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stmt2CallFunctionContext extends Stmt2Context {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public OptargsContext optargs() {
			return getRuleContext(OptargsContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2CallFunction(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2Si(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2TypeAsig(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2Seleccionar(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2Mientras(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2TypeAsigOptexp(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2IDChain(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2LeerID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt2Context stmt2() throws RecognitionException {
		Stmt2Context _localctx = new Stmt2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_stmt2);
		try {
			setState(503);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new Stmt2RomperContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(ROMPER);
				setState(388);
				match(TK_PYC);
				}
				break;
			case 2:
				_localctx = new Stmt2CallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(ID);
				setState(390);
				match(TK_PAR_IZQ);
				setState(391);
				optargs();
				setState(392);
				match(TK_PAR_DER);
				setState(393);
				match(TK_PYC);
				}
				break;
			case 3:
				_localctx = new Stmt2TypeAsigContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				type();
				setState(396);
				match(ID);
				setState(397);
				match(TK_ASIG);
				setState(398);
				exp(0);
				setState(399);
				match(TK_COMA);
				setState(400);
				optexp();
				setState(401);
				match(TK_PYC);
				}
				break;
			case 4:
				_localctx = new Stmt2TypeAsigOptexpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(403);
				type();
				setState(404);
				match(ID);
				setState(405);
				match(TK_COMA);
				setState(406);
				optexp();
				setState(407);
				match(TK_PYC);
				}
				break;
			case 5:
				_localctx = new Stmt2IDAsigContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(409);
				match(ID);
				setState(410);
				match(TK_ASIG);
				setState(411);
				exp(0);
				setState(412);
				match(TK_PYC);
				}
				break;
			case 6:
				_localctx = new Stmt2TypeAsifExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(414);
				type();
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
			case 7:
				_localctx = new Stmt2IDChainContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(420);
				match(ID);
				setState(421);
				match(TK_PUNTO);
				setState(422);
				chain();
				setState(423);
				match(TK_ASIG);
				setState(424);
				exp(0);
				setState(425);
				match(TK_PYC);
				}
				break;
			case 8:
				_localctx = new Stmt2IDContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(427);
				type();
				setState(428);
				match(ID);
				setState(429);
				match(TK_PYC);
				}
				break;
			case 9:
				_localctx = new Stmt2SiContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(431);
				match(SI);
				setState(432);
				match(TK_PAR_IZQ);
				setState(433);
				exp(0);
				setState(434);
				match(TK_PAR_DER);
				setState(435);
				match(ENTONCES);
				setState(436);
				statements3();
				setState(437);
				match(FIN_SI);
				}
				break;
			case 10:
				_localctx = new Stmt2SiNoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(439);
				match(SI);
				setState(440);
				match(TK_PAR_IZQ);
				setState(441);
				exp(0);
				setState(442);
				match(TK_PAR_DER);
				setState(443);
				match(ENTONCES);
				setState(444);
				statements3();
				setState(445);
				match(SI_NO);
				setState(446);
				statements3();
				setState(447);
				match(FIN_SI);
				}
				break;
			case 11:
				_localctx = new Stmt2LeerIDContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(449);
				match(LEER);
				setState(450);
				match(TK_PAR_IZQ);
				setState(451);
				match(ID);
				setState(452);
				match(TK_PUNTO);
				setState(453);
				chain();
				setState(454);
				match(TK_PAR_DER);
				setState(455);
				match(TK_PYC);
				}
				break;
			case 12:
				_localctx = new Stmt2LeerChainContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(457);
				match(LEER);
				setState(458);
				match(TK_PAR_IZQ);
				setState(459);
				match(ID);
				setState(460);
				match(TK_PAR_DER);
				setState(461);
				match(TK_PYC);
				}
				break;
			case 13:
				_localctx = new Stmt2ImprimirContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(462);
				match(IMPRIMIR);
				setState(463);
				match(TK_PAR_IZQ);
				setState(464);
				imp_params();
				setState(465);
				match(TK_PAR_DER);
				setState(466);
				match(TK_PYC);
				}
				break;
			case 14:
				_localctx = new Stmt2ParaContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(468);
				match(PARA);
				setState(469);
				match(TK_PAR_IZQ);
				setState(470);
				stmt();
				setState(471);
				exp(0);
				setState(472);
				match(TK_PYC);
				setState(473);
				exp(0);
				setState(474);
				match(TK_PAR_DER);
				setState(475);
				match(HACER);
				setState(476);
				statements3();
				setState(477);
				match(FIN_PARA);
				}
				break;
			case 15:
				_localctx = new Stmt2MientrasContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(479);
				match(MIENTRAS);
				setState(480);
				match(TK_PAR_IZQ);
				setState(481);
				exp(0);
				setState(482);
				match(TK_PAR_DER);
				setState(483);
				match(HACER);
				setState(484);
				statements3();
				setState(485);
				match(FIN_MIENTRAS);
				}
				break;
			case 16:
				_localctx = new Stmt2HacerContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(487);
				match(HACER);
				setState(488);
				statements3();
				setState(489);
				match(MIENTRAS);
				setState(490);
				match(TK_PAR_IZQ);
				setState(491);
				exp(0);
				setState(492);
				match(TK_PAR_DER);
				setState(493);
				match(TK_PYC);
				}
				break;
			case 17:
				_localctx = new Stmt2SeleccionarContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(495);
				match(SELECCIONAR);
				setState(496);
				match(TK_PAR_IZQ);
				setState(497);
				match(ID);
				setState(498);
				match(TK_PAR_DER);
				setState(499);
				match(ENTRE);
				setState(500);
				cases();
				setState(501);
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
		public OptargsContext optargs() {
			return getRuleContext(OptargsContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt4Funcion(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt4IDChainAsig(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt4IDAsig(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt4TypeIDComa(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt4TypeID(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt4TypeIDAsig(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt4TypeIDAsigComa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt4Context stmt4() throws RecognitionException {
		Stmt4Context _localctx = new Stmt4Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_stmt4);
		try {
			setState(547);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new Stmt4FuncionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(ID);
				setState(506);
				match(TK_PAR_IZQ);
				setState(507);
				optargs();
				setState(508);
				match(TK_PAR_DER);
				setState(509);
				match(TK_PYC);
				}
				break;
			case 2:
				_localctx = new Stmt4TypeIDAsigComaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				type();
				setState(512);
				match(ID);
				setState(513);
				match(TK_ASIG);
				setState(514);
				exp(0);
				setState(515);
				match(TK_COMA);
				setState(516);
				optexp();
				setState(517);
				match(TK_PYC);
				}
				break;
			case 3:
				_localctx = new Stmt4TypeIDComaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				type();
				setState(520);
				match(ID);
				setState(521);
				match(TK_COMA);
				setState(522);
				optexp();
				setState(523);
				match(TK_PYC);
				}
				break;
			case 4:
				_localctx = new Stmt4IDAsigContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(525);
				match(ID);
				setState(526);
				match(TK_ASIG);
				setState(527);
				exp(0);
				setState(528);
				match(TK_PYC);
				}
				break;
			case 5:
				_localctx = new Stmt4TypeIDAsigContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(530);
				type();
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
			case 6:
				_localctx = new Stmt4IDChainAsigContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(536);
				match(ID);
				setState(537);
				match(TK_PUNTO);
				setState(538);
				chain();
				setState(539);
				match(TK_ASIG);
				setState(540);
				exp(0);
				setState(541);
				match(TK_PYC);
				}
				break;
			case 7:
				_localctx = new Stmt4TypeIDContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(543);
				type();
				setState(544);
				match(ID);
				setState(545);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u0228\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\5\2\62\n"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6"+
		"\5\6V\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\b\3\b\5\bd\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\5\tk\n\t\3\n\3\n\3\n\3\n\5\nq\n\n\3\13\3\13\3\13\3"+
		"\13\5\13w\n\13\3\f\3\f\3\f\3\f\5\f}\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00f1\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fa\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0104\n\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u010f\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u011e\n\22\3\23\3\23\3\23"+
		"\3\23\5\23\u0124\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0158"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0181"+
		"\n\24\f\24\16\24\u0184\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01fa\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0226\n\26\3\26\2\3&\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*\2\2\u026e\2\61\3\2\2\2\4\63\3\2\2\2\6I\3\2\2\2\bQ\3\2\2\2\nU\3\2\2\2"+
		"\f_\3\2\2\2\16c\3\2\2\2\20j\3\2\2\2\22p\3\2\2\2\24v\3\2\2\2\26|\3\2\2"+
		"\2\30\u00f0\3\2\2\2\32\u00f9\3\2\2\2\34\u0103\3\2\2\2\36\u0105\3\2\2\2"+
		" \u010e\3\2\2\2\"\u011d\3\2\2\2$\u0123\3\2\2\2&\u0157\3\2\2\2(\u01f9\3"+
		"\2\2\2*\u0225\3\2\2\2,-\5\6\4\2-.\5\2\2\2.\62\3\2\2\2/\62\5\4\3\2\60\62"+
		"\3\2\2\2\61,\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\3\3\2\2\2\63\64\7\32"+
		"\2\2\64\65\5\22\n\2\65\66\7\34\2\2\66\5\3\2\2\2\678\7\33\2\289\5\b\5\2"+
		"9:\7?\2\2:;\7=\2\2;<\5\n\6\2<=\7>\2\2=>\7\n\2\2>?\5\22\n\2?@\7\24\2\2"+
		"@A\5&\24\2AB\7:\2\2BC\7\3\2\2CJ\3\2\2\2DE\7\25\2\2EF\7?\2\2FG\5\26\f\2"+
		"GH\7\26\2\2HJ\3\2\2\2I\67\3\2\2\2ID\3\2\2\2J\7\3\2\2\2KR\7\"\2\2LR\7\30"+
		"\2\2MR\7\31\2\2NR\7!\2\2OR\7\35\2\2PR\7?\2\2QK\3\2\2\2QL\3\2\2\2QM\3\2"+
		"\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\t\3\2\2\2SV\5\f\7\2TV\3\2\2\2US\3"+
		"\2\2\2UT\3\2\2\2V\13\3\2\2\2WX\5\b\5\2XY\7?\2\2YZ\7;\2\2Z[\5\f\7\2[`\3"+
		"\2\2\2\\]\5\b\5\2]^\7?\2\2^`\3\2\2\2_W\3\2\2\2_\\\3\2\2\2`\r\3\2\2\2a"+
		"d\5\20\t\2bd\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\17\3\2\2\2ef\5&\24\2fg\7;\2"+
		"\2gh\5\20\t\2hk\3\2\2\2ik\5&\24\2je\3\2\2\2ji\3\2\2\2k\21\3\2\2\2lm\5"+
		"\30\r\2mn\5\22\n\2nq\3\2\2\2oq\3\2\2\2pl\3\2\2\2po\3\2\2\2q\23\3\2\2\2"+
		"rs\5(\25\2st\5\24\13\2tw\3\2\2\2uw\3\2\2\2vr\3\2\2\2vu\3\2\2\2w\25\3\2"+
		"\2\2xy\5*\26\2yz\5\26\f\2z}\3\2\2\2{}\3\2\2\2|x\3\2\2\2|{\3\2\2\2}\27"+
		"\3\2\2\2~\177\7?\2\2\177\u0080\7=\2\2\u0080\u0081\5\16\b\2\u0081\u0082"+
		"\7>\2\2\u0082\u0083\7:\2\2\u0083\u00f1\3\2\2\2\u0084\u0085\5\b\5\2\u0085"+
		"\u0086\7?\2\2\u0086\u0087\7-\2\2\u0087\u0088\5&\24\2\u0088\u0089\7;\2"+
		"\2\u0089\u008a\5\"\22\2\u008a\u008b\7:\2\2\u008b\u00f1\3\2\2\2\u008c\u008d"+
		"\5\b\5\2\u008d\u008e\7?\2\2\u008e\u008f\7;\2\2\u008f\u0090\5\"\22\2\u0090"+
		"\u0091\7:\2\2\u0091\u00f1\3\2\2\2\u0092\u0093\7?\2\2\u0093\u0094\7-\2"+
		"\2\u0094\u0095\5&\24\2\u0095\u0096\7:\2\2\u0096\u00f1\3\2\2\2\u0097\u0098"+
		"\5\b\5\2\u0098\u0099\7?\2\2\u0099\u009a\7-\2\2\u009a\u009b\5&\24\2\u009b"+
		"\u009c\7:\2\2\u009c\u00f1\3\2\2\2\u009d\u009e\7?\2\2\u009e\u009f\7<\2"+
		"\2\u009f\u00a0\5$\23\2\u00a0\u00a1\7-\2\2\u00a1\u00a2\5&\24\2\u00a2\u00a3"+
		"\7:\2\2\u00a3\u00f1\3\2\2\2\u00a4\u00a5\5\b\5\2\u00a5\u00a6\7?\2\2\u00a6"+
		"\u00a7\7:\2\2\u00a7\u00f1\3\2\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\7=\2"+
		"\2\u00aa\u00ab\5&\24\2\u00ab\u00ac\7>\2\2\u00ac\u00ad\7\7\2\2\u00ad\u00ae"+
		"\5\22\n\2\u00ae\u00af\7\b\2\2\u00af\u00f1\3\2\2\2\u00b0\u00b1\7\6\2\2"+
		"\u00b1\u00b2\7=\2\2\u00b2\u00b3\5&\24\2\u00b3\u00b4\7>\2\2\u00b4\u00b5"+
		"\7\7\2\2\u00b5\u00b6\5\22\n\2\u00b6\u00b7\7\5\2\2\u00b7\u00b8\5\22\n\2"+
		"\u00b8\u00b9\7\b\2\2\u00b9\u00f1\3\2\2\2\u00ba\u00bb\7\4\2\2\u00bb\u00bc"+
		"\7=\2\2\u00bc\u00bd\7?\2\2\u00bd\u00be\7>\2\2\u00be\u00f1\7:\2\2\u00bf"+
		"\u00c0\7\4\2\2\u00c0\u00c1\7=\2\2\u00c1\u00c2\7?\2\2\u00c2\u00c3\7<\2"+
		"\2\u00c3\u00c4\5$\23\2\u00c4\u00c5\7>\2\2\u00c5\u00c6\7:\2\2\u00c6\u00f1"+
		"\3\2\2\2\u00c7\u00c8\7\27\2\2\u00c8\u00c9\7=\2\2\u00c9\u00ca\5 \21\2\u00ca"+
		"\u00cb\7>\2\2\u00cb\u00cc\7:\2\2\u00cc\u00f1\3\2\2\2\u00cd\u00ce\7\f\2"+
		"\2\u00ce\u00cf\7=\2\2\u00cf\u00d0\5\30\r\2\u00d0\u00d1\5&\24\2\u00d1\u00d2"+
		"\7:\2\2\u00d2\u00d3\5&\24\2\u00d3\u00d4\7>\2\2\u00d4\u00d5\7\n\2\2\u00d5"+
		"\u00d6\5\24\13\2\u00d6\u00d7\7\r\2\2\u00d7\u00f1\3\2\2\2\u00d8\u00d9\7"+
		"\t\2\2\u00d9\u00da\7=\2\2\u00da\u00db\5&\24\2\u00db\u00dc\7>\2\2\u00dc"+
		"\u00dd\7\n\2\2\u00dd\u00de\5\24\13\2\u00de\u00df\7\13\2\2\u00df\u00f1"+
		"\3\2\2\2\u00e0\u00e1\7\n\2\2\u00e1\u00e2\5\24\13\2\u00e2\u00e3\7\t\2\2"+
		"\u00e3\u00e4\7=\2\2\u00e4\u00e5\5&\24\2\u00e5\u00e6\7>\2\2\u00e6\u00e7"+
		"\7:\2\2\u00e7\u00f1\3\2\2\2\u00e8\u00e9\7\16\2\2\u00e9\u00ea\7=\2\2\u00ea"+
		"\u00eb\7?\2\2\u00eb\u00ec\7>\2\2\u00ec\u00ed\7\17\2\2\u00ed\u00ee\5\32"+
		"\16\2\u00ee\u00ef\7\23\2\2\u00ef\u00f1\3\2\2\2\u00f0~\3\2\2\2\u00f0\u0084"+
		"\3\2\2\2\u00f0\u008c\3\2\2\2\u00f0\u0092\3\2\2\2\u00f0\u0097\3\2\2\2\u00f0"+
		"\u009d\3\2\2\2\u00f0\u00a4\3\2\2\2\u00f0\u00a8\3\2\2\2\u00f0\u00b0\3\2"+
		"\2\2\u00f0\u00ba\3\2\2\2\u00f0\u00bf\3\2\2\2\u00f0\u00c7\3\2\2\2\u00f0"+
		"\u00cd\3\2\2\2\u00f0\u00d8\3\2\2\2\u00f0\u00e0\3\2\2\2\u00f0\u00e8\3\2"+
		"\2\2\u00f1\31\3\2\2\2\u00f2\u00f3\7\20\2\2\u00f3\u00f4\5&\24\2\u00f4\u00f5"+
		"\7\67\2\2\u00f5\u00f6\5\24\13\2\u00f6\u00f7\5\34\17\2\u00f7\u00fa\3\2"+
		"\2\2\u00f8\u00fa\5\36\20\2\u00f9\u00f2\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\33\3\2\2\2\u00fb\u00fc\7\20\2\2\u00fc\u00fd\5&\24\2\u00fd\u00fe\7\67"+
		"\2\2\u00fe\u00ff\5\24\13\2\u00ff\u0100\5\34\17\2\u0100\u0104\3\2\2\2\u0101"+
		"\u0104\3\2\2\2\u0102\u0104\5\36\20\2\u0103\u00fb\3\2\2\2\u0103\u0101\3"+
		"\2\2\2\u0103\u0102\3\2\2\2\u0104\35\3\2\2\2\u0105\u0106\7\22\2\2\u0106"+
		"\u0107\7\67\2\2\u0107\u0108\5\24\13\2\u0108\37\3\2\2\2\u0109\u010a\5&"+
		"\24\2\u010a\u010b\7;\2\2\u010b\u010c\5 \21\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010f\5&\24\2\u010e\u0109\3\2\2\2\u010e\u010d\3\2\2\2\u010f!\3\2\2\2"+
		"\u0110\u0111\7?\2\2\u0111\u0112\7;\2\2\u0112\u011e\5\"\22\2\u0113\u0114"+
		"\7?\2\2\u0114\u0115\7-\2\2\u0115\u0116\5&\24\2\u0116\u0117\7;\2\2\u0117"+
		"\u0118\5\"\22\2\u0118\u011e\3\2\2\2\u0119\u011e\7?\2\2\u011a\u011b\7?"+
		"\2\2\u011b\u011c\7-\2\2\u011c\u011e\5&\24\2\u011d\u0110\3\2\2\2\u011d"+
		"\u0113\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011a\3\2\2\2\u011e#\3\2\2\2"+
		"\u011f\u0120\7?\2\2\u0120\u0121\7<\2\2\u0121\u0124\5$\23\2\u0122\u0124"+
		"\7?\2\2\u0123\u011f\3\2\2\2\u0123\u0122\3\2\2\2\u0124%\3\2\2\2\u0125\u0126"+
		"\b\24\1\2\u0126\u0158\7\36\2\2\u0127\u0158\7?\2\2\u0128\u0129\7?\2\2\u0129"+
		"\u012a\7<\2\2\u012a\u0158\5$\23\2\u012b\u0158\7#\2\2\u012c\u0158\7@\2"+
		"\2\u012d\u0158\7A\2\2\u012e\u0158\7\37\2\2\u012f\u0158\7 \2\2\u0130\u0131"+
		"\7)\2\2\u0131\u0158\7@\2\2\u0132\u0133\7)\2\2\u0133\u0158\7#\2\2\u0134"+
		"\u0135\7)\2\2\u0135\u0158\7?\2\2\u0136\u0137\7)\2\2\u0137\u0138\7?\2\2"+
		"\u0138\u0139\7<\2\2\u0139\u0158\5$\23\2\u013a\u013b\7)\2\2\u013b\u013c"+
		"\7=\2\2\u013c\u013d\5&\24\2\u013d\u013e\7>\2\2\u013e\u0158\3\2\2\2\u013f"+
		"\u0140\7\66\2\2\u0140\u0158\7?\2\2\u0141\u0142\7\66\2\2\u0142\u0143\7"+
		"?\2\2\u0143\u0144\7<\2\2\u0144\u0158\5$\23\2\u0145\u0146\7\66\2\2\u0146"+
		"\u0158\7\37\2\2\u0147\u0148\7\66\2\2\u0148\u0158\7 \2\2\u0149\u014a\7"+
		"\66\2\2\u014a\u014b\7=\2\2\u014b\u014c\5&\24\2\u014c\u014d\7>\2\2\u014d"+
		"\u0158\3\2\2\2\u014e\u014f\7=\2\2\u014f\u0150\5&\24\2\u0150\u0151\7>\2"+
		"\2\u0151\u0158\3\2\2\2\u0152\u0153\7?\2\2\u0153\u0154\7=\2\2\u0154\u0155"+
		"\5\16\b\2\u0155\u0156\7>\2\2\u0156\u0158\3\2\2\2\u0157\u0125\3\2\2\2\u0157"+
		"\u0127\3\2\2\2\u0157\u0128\3\2\2\2\u0157\u012b\3\2\2\2\u0157\u012c\3\2"+
		"\2\2\u0157\u012d\3\2\2\2\u0157\u012e\3\2\2\2\u0157\u012f\3\2\2\2\u0157"+
		"\u0130\3\2\2\2\u0157\u0132\3\2\2\2\u0157\u0134\3\2\2\2\u0157\u0136\3\2"+
		"\2\2\u0157\u013a\3\2\2\2\u0157\u013f\3\2\2\2\u0157\u0141\3\2\2\2\u0157"+
		"\u0145\3\2\2\2\u0157\u0147\3\2\2\2\u0157\u0149\3\2\2\2\u0157\u014e\3\2"+
		"\2\2\u0157\u0152\3\2\2\2\u0158\u0182\3\2\2\2\u0159\u015a\f\17\2\2\u015a"+
		"\u015b\7\64\2\2\u015b\u0181\5&\24\20\u015c\u015d\f\16\2\2\u015d\u015e"+
		"\7\63\2\2\u015e\u0181\5&\24\17\u015f\u0160\f\r\2\2\u0160\u0161\7\62\2"+
		"\2\u0161\u0181\5&\24\16\u0162\u0163\f\f\2\2\u0163\u0164\7.\2\2\u0164\u0181"+
		"\5&\24\r\u0165\u0166\f\13\2\2\u0166\u0167\7/\2\2\u0167\u0181\5&\24\f\u0168"+
		"\u0169\f\n\2\2\u0169\u016a\7\60\2\2\u016a\u0181\5&\24\13\u016b\u016c\f"+
		"\t\2\2\u016c\u016d\7\61\2\2\u016d\u0181\5&\24\n\u016e\u016f\f\b\2\2\u016f"+
		"\u0170\7\65\2\2\u0170\u0181\5&\24\t\u0171\u0172\f\7\2\2\u0172\u0173\7"+
		"(\2\2\u0173\u0181\5&\24\b\u0174\u0175\f\6\2\2\u0175\u0176\7)\2\2\u0176"+
		"\u0181\5&\24\7\u0177\u0178\f\5\2\2\u0178\u0179\7*\2\2\u0179\u0181\5&\24"+
		"\6\u017a\u017b\f\4\2\2\u017b\u017c\7+\2\2\u017c\u0181\5&\24\5\u017d\u017e"+
		"\f\3\2\2\u017e\u017f\7,\2\2\u017f\u0181\5&\24\4\u0180\u0159\3\2\2\2\u0180"+
		"\u015c\3\2\2\2\u0180\u015f\3\2\2\2\u0180\u0162\3\2\2\2\u0180\u0165\3\2"+
		"\2\2\u0180\u0168\3\2\2\2\u0180\u016b\3\2\2\2\u0180\u016e\3\2\2\2\u0180"+
		"\u0171\3\2\2\2\u0180\u0174\3\2\2\2\u0180\u0177\3\2\2\2\u0180\u017a\3\2"+
		"\2\2\u0180\u017d\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\'\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7\21\2"+
		"\2\u0186\u01fa\7:\2\2\u0187\u0188\7?\2\2\u0188\u0189\7=\2\2\u0189\u018a"+
		"\5\16\b\2\u018a\u018b\7>\2\2\u018b\u018c\7:\2\2\u018c\u01fa\3\2\2\2\u018d"+
		"\u018e\5\b\5\2\u018e\u018f\7?\2\2\u018f\u0190\7-\2\2\u0190\u0191\5&\24"+
		"\2\u0191\u0192\7;\2\2\u0192\u0193\5\"\22\2\u0193\u0194\7:\2\2\u0194\u01fa"+
		"\3\2\2\2\u0195\u0196\5\b\5\2\u0196\u0197\7?\2\2\u0197\u0198\7;\2\2\u0198"+
		"\u0199\5\"\22\2\u0199\u019a\7:\2\2\u019a\u01fa\3\2\2\2\u019b\u019c\7?"+
		"\2\2\u019c\u019d\7-\2\2\u019d\u019e\5&\24\2\u019e\u019f\7:\2\2\u019f\u01fa"+
		"\3\2\2\2\u01a0\u01a1\5\b\5\2\u01a1\u01a2\7?\2\2\u01a2\u01a3\7-\2\2\u01a3"+
		"\u01a4\5&\24\2\u01a4\u01a5\7:\2\2\u01a5\u01fa\3\2\2\2\u01a6\u01a7\7?\2"+
		"\2\u01a7\u01a8\7<\2\2\u01a8\u01a9\5$\23\2\u01a9\u01aa\7-\2\2\u01aa\u01ab"+
		"\5&\24\2\u01ab\u01ac\7:\2\2\u01ac\u01fa\3\2\2\2\u01ad\u01ae\5\b\5\2\u01ae"+
		"\u01af\7?\2\2\u01af\u01b0\7:\2\2\u01b0\u01fa\3\2\2\2\u01b1\u01b2\7\6\2"+
		"\2\u01b2\u01b3\7=\2\2\u01b3\u01b4\5&\24\2\u01b4\u01b5\7>\2\2\u01b5\u01b6"+
		"\7\7\2\2\u01b6\u01b7\5\24\13\2\u01b7\u01b8\7\b\2\2\u01b8\u01fa\3\2\2\2"+
		"\u01b9\u01ba\7\6\2\2\u01ba\u01bb\7=\2\2\u01bb\u01bc\5&\24\2\u01bc\u01bd"+
		"\7>\2\2\u01bd\u01be\7\7\2\2\u01be\u01bf\5\24\13\2\u01bf\u01c0\7\5\2\2"+
		"\u01c0\u01c1\5\24\13\2\u01c1\u01c2\7\b\2\2\u01c2\u01fa\3\2\2\2\u01c3\u01c4"+
		"\7\4\2\2\u01c4\u01c5\7=\2\2\u01c5\u01c6\7?\2\2\u01c6\u01c7\7<\2\2\u01c7"+
		"\u01c8\5$\23\2\u01c8\u01c9\7>\2\2\u01c9\u01ca\7:\2\2\u01ca\u01fa\3\2\2"+
		"\2\u01cb\u01cc\7\4\2\2\u01cc\u01cd\7=\2\2\u01cd\u01ce\7?\2\2\u01ce\u01cf"+
		"\7>\2\2\u01cf\u01fa\7:\2\2\u01d0\u01d1\7\27\2\2\u01d1\u01d2\7=\2\2\u01d2"+
		"\u01d3\5 \21\2\u01d3\u01d4\7>\2\2\u01d4\u01d5\7:\2\2\u01d5\u01fa\3\2\2"+
		"\2\u01d6\u01d7\7\f\2\2\u01d7\u01d8\7=\2\2\u01d8\u01d9\5\30\r\2\u01d9\u01da"+
		"\5&\24\2\u01da\u01db\7:\2\2\u01db\u01dc\5&\24\2\u01dc\u01dd\7>\2\2\u01dd"+
		"\u01de\7\n\2\2\u01de\u01df\5\24\13\2\u01df\u01e0\7\r\2\2\u01e0\u01fa\3"+
		"\2\2\2\u01e1\u01e2\7\t\2\2\u01e2\u01e3\7=\2\2\u01e3\u01e4\5&\24\2\u01e4"+
		"\u01e5\7>\2\2\u01e5\u01e6\7\n\2\2\u01e6\u01e7\5\24\13\2\u01e7\u01e8\7"+
		"\13\2\2\u01e8\u01fa\3\2\2\2\u01e9\u01ea\7\n\2\2\u01ea\u01eb\5\24\13\2"+
		"\u01eb\u01ec\7\t\2\2\u01ec\u01ed\7=\2\2\u01ed\u01ee\5&\24\2\u01ee\u01ef"+
		"\7>\2\2\u01ef\u01f0\7:\2\2\u01f0\u01fa\3\2\2\2\u01f1\u01f2\7\16\2\2\u01f2"+
		"\u01f3\7=\2\2\u01f3\u01f4\7?\2\2\u01f4\u01f5\7>\2\2\u01f5\u01f6\7\17\2"+
		"\2\u01f6\u01f7\5\32\16\2\u01f7\u01f8\7\23\2\2\u01f8\u01fa\3\2\2\2\u01f9"+
		"\u0185\3\2\2\2\u01f9\u0187\3\2\2\2\u01f9\u018d\3\2\2\2\u01f9\u0195\3\2"+
		"\2\2\u01f9\u019b\3\2\2\2\u01f9\u01a0\3\2\2\2\u01f9\u01a6\3\2\2\2\u01f9"+
		"\u01ad\3\2\2\2\u01f9\u01b1\3\2\2\2\u01f9\u01b9\3\2\2\2\u01f9\u01c3\3\2"+
		"\2\2\u01f9\u01cb\3\2\2\2\u01f9\u01d0\3\2\2\2\u01f9\u01d6\3\2\2\2\u01f9"+
		"\u01e1\3\2\2\2\u01f9\u01e9\3\2\2\2\u01f9\u01f1\3\2\2\2\u01fa)\3\2\2\2"+
		"\u01fb\u01fc\7?\2\2\u01fc\u01fd\7=\2\2\u01fd\u01fe\5\16\b\2\u01fe\u01ff"+
		"\7>\2\2\u01ff\u0200\7:\2\2\u0200\u0226\3\2\2\2\u0201\u0202\5\b\5\2\u0202"+
		"\u0203\7?\2\2\u0203\u0204\7-\2\2\u0204\u0205\5&\24\2\u0205\u0206\7;\2"+
		"\2\u0206\u0207\5\"\22\2\u0207\u0208\7:\2\2\u0208\u0226\3\2\2\2\u0209\u020a"+
		"\5\b\5\2\u020a\u020b\7?\2\2\u020b\u020c\7;\2\2\u020c\u020d\5\"\22\2\u020d"+
		"\u020e\7:\2\2\u020e\u0226\3\2\2\2\u020f\u0210\7?\2\2\u0210\u0211\7-\2"+
		"\2\u0211\u0212\5&\24\2\u0212\u0213\7:\2\2\u0213\u0226\3\2\2\2\u0214\u0215"+
		"\5\b\5\2\u0215\u0216\7?\2\2\u0216\u0217\7-\2\2\u0217\u0218\5&\24\2\u0218"+
		"\u0219\7:\2\2\u0219\u0226\3\2\2\2\u021a\u021b\7?\2\2\u021b\u021c\7<\2"+
		"\2\u021c\u021d\5$\23\2\u021d\u021e\7-\2\2\u021e\u021f\5&\24\2\u021f\u0220"+
		"\7:\2\2\u0220\u0226\3\2\2\2\u0221\u0222\5\b\5\2\u0222\u0223\7?\2\2\u0223"+
		"\u0224\7:\2\2\u0224\u0226\3\2\2\2\u0225\u01fb\3\2\2\2\u0225\u0201\3\2"+
		"\2\2\u0225\u0209\3\2\2\2\u0225\u020f\3\2\2\2\u0225\u0214\3\2\2\2\u0225"+
		"\u021a\3\2\2\2\u0225\u0221\3\2\2\2\u0226+\3\2\2\2\27\61IQU_cjpv|\u00f0"+
		"\u00f9\u0103\u010e\u011d\u0123\u0157\u0180\u0182\u01f9\u0225";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}