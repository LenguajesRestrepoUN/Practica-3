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
		RULE_statements3 = 9, RULE_statements4 = 10, RULE_stmt = 11, RULE_para_stmt = 12, 
		RULE_si_noBlock = 13, RULE_si_noBlock2 = 14, RULE_cases = 15, RULE_cases2 = 16, 
		RULE_deft = 17, RULE_imp_params = 18, RULE_optexp = 19, RULE_chain = 20, 
		RULE_exp = 21, RULE_stmt2 = 22, RULE_stmt4 = 23;
	public static final String[] ruleNames = {
		"ps", "b", "element", "type", "optparams", "params", "optargs", "args", 
		"statements", "statements3", "statements4", "stmt", "para_stmt", "si_noBlock", 
		"si_noBlock2", "cases", "cases2", "deft", "imp_params", "optexp", "chain", 
		"exp", "stmt2", "stmt4"
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
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new PsElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				element();
				setState(49);
				ps();
				}
				break;
			case 2:
				_localctx = new PsBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
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
			setState(55);
			match(FUNCION_PRINCIPAL);
			setState(56);
			statements();
			setState(57);
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
			setState(77);
			switch (_input.LA(1)) {
			case FUNCION:
				_localctx = new ElementFuncionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(FUNCION);
				setState(60);
				type();
				setState(61);
				match(ID);
				setState(62);
				match(TK_PAR_IZQ);
				setState(63);
				optparams();
				setState(64);
				match(TK_PAR_DER);
				setState(65);
				match(HACER);
				setState(66);
				statements();
				setState(67);
				match(RETORNAR);
				setState(68);
				exp(0);
				setState(69);
				match(TK_PYC);
				setState(70);
				match(FIN_FUNCION);
				}
				break;
			case ESTRUCTURA:
				_localctx = new ElementEstructuraContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(ESTRUCTURA);
				setState(73);
				match(ID);
				setState(74);
				statements4();
				setState(75);
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
			setState(85);
			switch (_input.LA(1)) {
			case ENTERO:
				_localctx = new TypeEnteroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(ENTERO);
				}
				break;
			case CARACTER:
				_localctx = new TypeCaracterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(CARACTER);
				}
				break;
			case CADENA:
				_localctx = new TypeCadenaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(CADENA);
				}
				break;
			case REAL:
				_localctx = new TypeRealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(REAL);
				}
				break;
			case BOOLEANO:
				_localctx = new TypeBooleanoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				match(BOOLEANO);
				}
				break;
			case ID:
				_localctx = new TypeIDContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
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
			setState(89);
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
				setState(87);
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
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ParamsTypeIDComaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				type();
				setState(92);
				match(ID);
				setState(93);
				match(TK_COMA);
				setState(94);
				params();
				}
				break;
			case 2:
				_localctx = new ParamsTypeIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				type();
				setState(97);
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
			setState(103);
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
				setState(101);
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
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ArgsExpArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				exp(0);
				setState(106);
				match(TK_COMA);
				setState(107);
				args();
				}
				break;
			case 2:
				_localctx = new ArgsExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
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
			setState(116);
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
				setState(112);
				stmt();
				setState(113);
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
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Statements3StmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				stmt2();
				setState(119);
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
			setState(128);
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
				setState(124);
				stmt4();
				setState(125);
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
	public static class StmtTypeAsigExpContext extends StmtContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public StmtTypeAsigExpContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmtTypeAsigExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmtTypeAsigExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmtTypeAsigExp(this);
			else return visitor.visitChildren(this);
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
	public static class StmtParaContext extends StmtContext {
		public TerminalNode PARA() { return getToken(PsicoderParser.PARA, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public Para_stmtContext para_stmt() {
			return getRuleContext(Para_stmtContext.class,0);
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
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Si_noBlockContext si_noBlock() {
			return getRuleContext(Si_noBlockContext.class,0);
		}
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
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new StmtCallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(ID);
				setState(131);
				match(TK_PAR_IZQ);
				setState(132);
				optargs();
				setState(133);
				match(TK_PAR_DER);
				setState(134);
				match(TK_PYC);
				}
				break;
			case 2:
				_localctx = new StmtTypeAsigContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				type();
				setState(137);
				match(ID);
				setState(138);
				match(TK_ASIG);
				setState(139);
				exp(0);
				setState(140);
				match(TK_COMA);
				setState(141);
				optexp();
				setState(142);
				match(TK_PYC);
				}
				break;
			case 3:
				_localctx = new StmtTypeAsigOptexpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				type();
				setState(145);
				match(ID);
				setState(146);
				match(TK_COMA);
				setState(147);
				optexp();
				setState(148);
				match(TK_PYC);
				}
				break;
			case 4:
				_localctx = new StmtIDAsigContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
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
			case 5:
				_localctx = new StmtTypeAsigExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				type();
				setState(156);
				match(ID);
				setState(157);
				match(TK_ASIG);
				setState(158);
				exp(0);
				setState(159);
				match(TK_PYC);
				}
				break;
			case 6:
				_localctx = new StmtIDChainContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				match(ID);
				setState(162);
				match(TK_PUNTO);
				setState(163);
				chain();
				setState(164);
				match(TK_ASIG);
				setState(165);
				exp(0);
				setState(166);
				match(TK_PYC);
				}
				break;
			case 7:
				_localctx = new StmtIDContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				type();
				setState(169);
				match(ID);
				setState(170);
				match(TK_PYC);
				}
				break;
			case 8:
				_localctx = new StmtSiContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(172);
				match(SI);
				setState(173);
				match(TK_PAR_IZQ);
				setState(174);
				exp(0);
				setState(175);
				match(TK_PAR_DER);
				setState(176);
				match(ENTONCES);
				setState(177);
				statements();
				setState(178);
				match(FIN_SI);
				}
				break;
			case 9:
				_localctx = new StmtSiNoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(180);
				match(SI);
				setState(181);
				match(TK_PAR_IZQ);
				setState(182);
				exp(0);
				setState(183);
				match(TK_PAR_DER);
				setState(184);
				match(ENTONCES);
				setState(185);
				statements();
				setState(186);
				si_noBlock();
				}
				break;
			case 10:
				_localctx = new StmtLeerIDContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(188);
				match(LEER);
				setState(189);
				match(TK_PAR_IZQ);
				setState(190);
				match(ID);
				setState(191);
				match(TK_PAR_DER);
				setState(192);
				match(TK_PYC);
				}
				break;
			case 11:
				_localctx = new StmtLeerChainContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(193);
				match(LEER);
				setState(194);
				match(TK_PAR_IZQ);
				setState(195);
				match(ID);
				setState(196);
				match(TK_PUNTO);
				setState(197);
				chain();
				setState(198);
				match(TK_PAR_DER);
				setState(199);
				match(TK_PYC);
				}
				break;
			case 12:
				_localctx = new StmtImprimirContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(201);
				match(IMPRIMIR);
				setState(202);
				match(TK_PAR_IZQ);
				setState(203);
				imp_params();
				setState(204);
				match(TK_PAR_DER);
				setState(205);
				match(TK_PYC);
				}
				break;
			case 13:
				_localctx = new StmtParaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(207);
				match(PARA);
				setState(208);
				match(TK_PAR_IZQ);
				setState(209);
				para_stmt();
				setState(210);
				exp(0);
				setState(211);
				match(TK_PYC);
				setState(212);
				exp(0);
				setState(213);
				match(TK_PAR_DER);
				setState(214);
				match(HACER);
				setState(215);
				statements3();
				setState(216);
				match(FIN_PARA);
				}
				break;
			case 14:
				_localctx = new StmtMientrasContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(218);
				match(MIENTRAS);
				setState(219);
				match(TK_PAR_IZQ);
				setState(220);
				exp(0);
				setState(221);
				match(TK_PAR_DER);
				setState(222);
				match(HACER);
				setState(223);
				statements3();
				setState(224);
				match(FIN_MIENTRAS);
				}
				break;
			case 15:
				_localctx = new StmtHacerContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(226);
				match(HACER);
				setState(227);
				statements3();
				setState(228);
				match(MIENTRAS);
				setState(229);
				match(TK_PAR_IZQ);
				setState(230);
				exp(0);
				setState(231);
				match(TK_PAR_DER);
				setState(232);
				match(TK_PYC);
				}
				break;
			case 16:
				_localctx = new StmtSeleccionarContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(234);
				match(SELECCIONAR);
				setState(235);
				match(TK_PAR_IZQ);
				setState(236);
				match(ID);
				setState(237);
				match(TK_PAR_DER);
				setState(238);
				match(ENTRE);
				setState(239);
				cases();
				setState(240);
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

	public static class Para_stmtContext extends ParserRuleContext {
		public Para_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_stmt; }
	 
		public Para_stmtContext() { }
		public void copyFrom(Para_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParaStmtTypeAsigExpContext extends Para_stmtContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public ParaStmtTypeAsigExpContext(Para_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterParaStmtTypeAsigExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitParaStmtTypeAsigExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitParaStmtTypeAsigExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParaStmtIDChainContext extends Para_stmtContext {
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
		public ParaStmtIDChainContext(Para_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterParaStmtIDChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitParaStmtIDChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitParaStmtIDChain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParaStmtIDAsigContext extends Para_stmtContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public ParaStmtIDAsigContext(Para_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterParaStmtIDAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitParaStmtIDAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitParaStmtIDAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Para_stmtContext para_stmt() throws RecognitionException {
		Para_stmtContext _localctx = new Para_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_para_stmt);
		try {
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ParaStmtIDAsigContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(ID);
				setState(245);
				match(TK_ASIG);
				setState(246);
				exp(0);
				setState(247);
				match(TK_PYC);
				}
				break;
			case 2:
				_localctx = new ParaStmtTypeAsigExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				type();
				setState(250);
				match(ID);
				setState(251);
				match(TK_ASIG);
				setState(252);
				exp(0);
				setState(253);
				match(TK_PYC);
				}
				break;
			case 3:
				_localctx = new ParaStmtIDChainContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(ID);
				setState(256);
				match(TK_PUNTO);
				setState(257);
				chain();
				setState(258);
				match(TK_ASIG);
				setState(259);
				exp(0);
				setState(260);
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

	public static class Si_noBlockContext extends ParserRuleContext {
		public Si_noBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_noBlock; }
	 
		public Si_noBlockContext() { }
		public void copyFrom(Si_noBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Si_noContext extends Si_noBlockContext {
		public TerminalNode SI_NO() { return getToken(PsicoderParser.SI_NO, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode FIN_SI() { return getToken(PsicoderParser.FIN_SI, 0); }
		public Si_noContext(Si_noBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterSi_no(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitSi_no(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitSi_no(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Si_noBlockContext si_noBlock() throws RecognitionException {
		Si_noBlockContext _localctx = new Si_noBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_si_noBlock);
		try {
			_localctx = new Si_noContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(SI_NO);
			setState(265);
			statements();
			setState(266);
			match(FIN_SI);
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

	public static class Si_noBlock2Context extends ParserRuleContext {
		public Si_noBlock2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_noBlock2; }
	 
		public Si_noBlock2Context() { }
		public void copyFrom(Si_noBlock2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Si_no2Context extends Si_noBlock2Context {
		public TerminalNode SI_NO() { return getToken(PsicoderParser.SI_NO, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public TerminalNode FIN_SI() { return getToken(PsicoderParser.FIN_SI, 0); }
		public Si_no2Context(Si_noBlock2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterSi_no2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitSi_no2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitSi_no2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Si_noBlock2Context si_noBlock2() throws RecognitionException {
		Si_noBlock2Context _localctx = new Si_noBlock2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_si_noBlock2);
		try {
			_localctx = new Si_no2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(SI_NO);
			setState(269);
			statements3();
			setState(270);
			match(FIN_SI);
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
		enterRule(_localctx, 30, RULE_cases);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case CASO:
				_localctx = new CasesCasoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(CASO);
				setState(273);
				exp(0);
				setState(274);
				match(TK_POSD);
				setState(275);
				statements3();
				setState(276);
				cases2();
				}
				break;
			case DEFECTO:
				_localctx = new CasesDefectoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
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
	public static class Cases2CasoContext extends Cases2Context {
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
		public Cases2CasoContext(Cases2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCases2Caso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCases2Caso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCases2Caso(this);
			else return visitor.visitChildren(this);
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

	public final Cases2Context cases2() throws RecognitionException {
		Cases2Context _localctx = new Cases2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_cases2);
		try {
			setState(289);
			switch (_input.LA(1)) {
			case CASO:
				_localctx = new Cases2CasoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(CASO);
				setState(282);
				exp(0);
				setState(283);
				match(TK_POSD);
				setState(284);
				statements3();
				setState(285);
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
				setState(288);
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
		enterRule(_localctx, 34, RULE_deft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(DEFECTO);
			setState(292);
			match(TK_POSD);
			setState(293);
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
		enterRule(_localctx, 36, RULE_imp_params);
		try {
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Imp_paramsChainContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				exp(0);
				setState(296);
				match(TK_COMA);
				setState(297);
				imp_params();
				}
				break;
			case 2:
				_localctx = new Imp_paramsExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
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
		enterRule(_localctx, 38, RULE_optexp);
		try {
			setState(315);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new OptexpIDComaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(ID);
				setState(303);
				match(TK_COMA);
				setState(304);
				optexp();
				}
				break;
			case 2:
				_localctx = new OptexpIDAsigExpComaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(ID);
				setState(306);
				match(TK_ASIG);
				setState(307);
				exp(0);
				setState(308);
				match(TK_COMA);
				setState(309);
				optexp();
				}
				break;
			case 3:
				_localctx = new OptexpIDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(ID);
				}
				break;
			case 4:
				_localctx = new OptexpIDAsigExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				match(ID);
				setState(313);
				match(TK_ASIG);
				setState(314);
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
		enterRule(_localctx, 40, RULE_chain);
		try {
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ChainIDPuntoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(ID);
				setState(318);
				match(TK_PUNTO);
				setState(319);
				chain();
				}
				break;
			case 2:
				_localctx = new ChainIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
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
	public static class ExpMenosParExpContext extends ExpContext {
		public TerminalNode TK_MENOS() { return getToken(PsicoderParser.TK_MENOS, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public ExpMenosParExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpMenosParExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpMenosParExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpMenosParExp(this);
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
	public static class ExpMenosIDChainContext extends ExpContext {
		public TerminalNode TK_MENOS() { return getToken(PsicoderParser.TK_MENOS, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ExpMenosIDChainContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpMenosIDChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpMenosIDChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpMenosIDChain(this);
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
	public static class ExpNegExpContext extends ExpContext {
		public TerminalNode TK_NEG() { return getToken(PsicoderParser.TK_NEG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpNegExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpNegExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpNegExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpNegExp(this);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new ExpNegExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(324);
				match(TK_NEG);
				setState(325);
				exp(16);
				}
				break;
			case 2:
				{
				_localctx = new ExpCaracterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326);
				match(TK_CARACTER);
				}
				break;
			case 3:
				{
				_localctx = new ExpIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new ExpIDChainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328);
				match(ID);
				setState(329);
				match(TK_PUNTO);
				setState(330);
				chain();
				}
				break;
			case 5:
				{
				_localctx = new ExpEnteroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(331);
				match(TK_ENTERO);
				}
				break;
			case 6:
				{
				_localctx = new ExpRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332);
				match(TK_REAL);
				}
				break;
			case 7:
				{
				_localctx = new ExpCadenaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333);
				match(TK_CADENA);
				}
				break;
			case 8:
				{
				_localctx = new ExpVerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334);
				match(VERDADERO);
				}
				break;
			case 9:
				{
				_localctx = new ExpFalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335);
				match(FALSO);
				}
				break;
			case 10:
				{
				_localctx = new ExpMenosRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				match(TK_MENOS);
				setState(337);
				match(TK_REAL);
				}
				break;
			case 11:
				{
				_localctx = new ExpMenosEnteroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				match(TK_MENOS);
				setState(339);
				match(TK_ENTERO);
				}
				break;
			case 12:
				{
				_localctx = new ExpMenosIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				match(TK_MENOS);
				setState(341);
				match(ID);
				}
				break;
			case 13:
				{
				_localctx = new ExpMenosIDChainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(342);
				match(TK_MENOS);
				setState(343);
				match(ID);
				setState(344);
				match(TK_PUNTO);
				setState(345);
				chain();
				}
				break;
			case 14:
				{
				_localctx = new ExpMenosParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(346);
				match(TK_MENOS);
				setState(347);
				match(TK_PAR_IZQ);
				setState(348);
				exp(0);
				setState(349);
				match(TK_PAR_DER);
				}
				break;
			case 15:
				{
				_localctx = new ExpNegIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351);
				match(TK_NEG);
				setState(352);
				match(ID);
				}
				break;
			case 16:
				{
				_localctx = new ExpNegChainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				match(TK_NEG);
				setState(354);
				match(ID);
				setState(355);
				match(TK_PUNTO);
				setState(356);
				chain();
				}
				break;
			case 17:
				{
				_localctx = new ExpNegVerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(357);
				match(TK_NEG);
				setState(358);
				match(VERDADERO);
				}
				break;
			case 18:
				{
				_localctx = new ExpNegFalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359);
				match(TK_NEG);
				setState(360);
				match(FALSO);
				}
				break;
			case 19:
				{
				_localctx = new ExpNegParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361);
				match(TK_NEG);
				setState(362);
				match(TK_PAR_IZQ);
				setState(363);
				exp(0);
				setState(364);
				match(TK_PAR_DER);
				}
				break;
			case 20:
				{
				_localctx = new ExpParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				match(TK_PAR_IZQ);
				setState(367);
				exp(0);
				setState(368);
				match(TK_PAR_DER);
				}
				break;
			case 21:
				{
				_localctx = new ExpFuncionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(370);
				match(ID);
				setState(371);
				match(TK_PAR_IZQ);
				setState(372);
				optargs();
				setState(373);
				match(TK_PAR_DER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(416);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpMultContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(377);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(378);
						match(TK_MULT);
						setState(379);
						exp(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpDivContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(380);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(381);
						match(TK_DIV);
						setState(382);
						exp(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpModuloContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(383);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(384);
						match(TK_MOD);
						setState(385);
						exp(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpMasContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(386);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(387);
						match(TK_MAS);
						setState(388);
						exp(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpMenosContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(389);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(390);
						match(TK_MENOS);
						setState(391);
						exp(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpMenorContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(392);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(393);
						match(TK_MENOR);
						setState(394);
						exp(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpMayorContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(395);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(396);
						match(TK_MAYOR);
						setState(397);
						exp(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpMenorIgualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(398);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(399);
						match(TK_MENOR_IGUAL);
						setState(400);
						exp(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpMayorIgualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(401);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(402);
						match(TK_MAYOR_IGUAL);
						setState(403);
						exp(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpIgualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(404);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(405);
						match(TK_IGUAL);
						setState(406);
						exp(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpDifContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(407);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(408);
						match(TK_DIF);
						setState(409);
						exp(4);
						}
						break;
					case 12:
						{
						_localctx = new ExpAndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(410);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(411);
						match(TK_Y);
						setState(412);
						exp(3);
						}
						break;
					case 13:
						{
						_localctx = new ExpOrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(413);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(414);
						match(TK_O);
						setState(415);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public Si_noBlock2Context si_noBlock2() {
			return getRuleContext(Si_noBlock2Context.class,0);
		}
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
	public static class Stmt2TypeAsigExpContext extends Stmt2Context {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public Stmt2TypeAsigExpContext(Stmt2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2TypeAsigExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2TypeAsigExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitStmt2TypeAsigExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stmt2ParaContext extends Stmt2Context {
		public TerminalNode PARA() { return getToken(PsicoderParser.PARA, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public Para_stmtContext para_stmt() {
			return getRuleContext(Para_stmtContext.class,0);
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
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_stmt2);
		try {
			setState(535);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new Stmt2RomperContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(ROMPER);
				setState(422);
				match(TK_PYC);
				}
				break;
			case 2:
				_localctx = new Stmt2CallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(ID);
				setState(424);
				match(TK_PAR_IZQ);
				setState(425);
				optargs();
				setState(426);
				match(TK_PAR_DER);
				setState(427);
				match(TK_PYC);
				}
				break;
			case 3:
				_localctx = new Stmt2TypeAsigContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				type();
				setState(430);
				match(ID);
				setState(431);
				match(TK_ASIG);
				setState(432);
				exp(0);
				setState(433);
				match(TK_COMA);
				setState(434);
				optexp();
				setState(435);
				match(TK_PYC);
				}
				break;
			case 4:
				_localctx = new Stmt2TypeAsigOptexpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				type();
				setState(438);
				match(ID);
				setState(439);
				match(TK_COMA);
				setState(440);
				optexp();
				setState(441);
				match(TK_PYC);
				}
				break;
			case 5:
				_localctx = new Stmt2IDAsigContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				match(ID);
				setState(444);
				match(TK_ASIG);
				setState(445);
				exp(0);
				setState(446);
				match(TK_PYC);
				}
				break;
			case 6:
				_localctx = new Stmt2TypeAsigExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(448);
				type();
				setState(449);
				match(ID);
				setState(450);
				match(TK_ASIG);
				setState(451);
				exp(0);
				setState(452);
				match(TK_PYC);
				}
				break;
			case 7:
				_localctx = new Stmt2IDChainContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(454);
				match(ID);
				setState(455);
				match(TK_PUNTO);
				setState(456);
				chain();
				setState(457);
				match(TK_ASIG);
				setState(458);
				exp(0);
				setState(459);
				match(TK_PYC);
				}
				break;
			case 8:
				_localctx = new Stmt2IDContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(461);
				type();
				setState(462);
				match(ID);
				setState(463);
				match(TK_PYC);
				}
				break;
			case 9:
				_localctx = new Stmt2SiContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(465);
				match(SI);
				setState(466);
				match(TK_PAR_IZQ);
				setState(467);
				exp(0);
				setState(468);
				match(TK_PAR_DER);
				setState(469);
				match(ENTONCES);
				setState(470);
				statements3();
				setState(471);
				match(FIN_SI);
				}
				break;
			case 10:
				_localctx = new Stmt2SiNoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(473);
				match(SI);
				setState(474);
				match(TK_PAR_IZQ);
				setState(475);
				exp(0);
				setState(476);
				match(TK_PAR_DER);
				setState(477);
				match(ENTONCES);
				setState(478);
				statements3();
				setState(479);
				si_noBlock2();
				}
				break;
			case 11:
				_localctx = new Stmt2LeerChainContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(481);
				match(LEER);
				setState(482);
				match(TK_PAR_IZQ);
				setState(483);
				match(ID);
				setState(484);
				match(TK_PUNTO);
				setState(485);
				chain();
				setState(486);
				match(TK_PAR_DER);
				setState(487);
				match(TK_PYC);
				}
				break;
			case 12:
				_localctx = new Stmt2LeerIDContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(489);
				match(LEER);
				setState(490);
				match(TK_PAR_IZQ);
				setState(491);
				match(ID);
				setState(492);
				match(TK_PAR_DER);
				setState(493);
				match(TK_PYC);
				}
				break;
			case 13:
				_localctx = new Stmt2ImprimirContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(494);
				match(IMPRIMIR);
				setState(495);
				match(TK_PAR_IZQ);
				setState(496);
				imp_params();
				setState(497);
				match(TK_PAR_DER);
				setState(498);
				match(TK_PYC);
				}
				break;
			case 14:
				_localctx = new Stmt2ParaContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(500);
				match(PARA);
				setState(501);
				match(TK_PAR_IZQ);
				setState(502);
				para_stmt();
				setState(503);
				exp(0);
				setState(504);
				match(TK_PYC);
				setState(505);
				exp(0);
				setState(506);
				match(TK_PAR_DER);
				setState(507);
				match(HACER);
				setState(508);
				statements3();
				setState(509);
				match(FIN_PARA);
				}
				break;
			case 15:
				_localctx = new Stmt2MientrasContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(511);
				match(MIENTRAS);
				setState(512);
				match(TK_PAR_IZQ);
				setState(513);
				exp(0);
				setState(514);
				match(TK_PAR_DER);
				setState(515);
				match(HACER);
				setState(516);
				statements3();
				setState(517);
				match(FIN_MIENTRAS);
				}
				break;
			case 16:
				_localctx = new Stmt2HacerContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(519);
				match(HACER);
				setState(520);
				statements3();
				setState(521);
				match(MIENTRAS);
				setState(522);
				match(TK_PAR_IZQ);
				setState(523);
				exp(0);
				setState(524);
				match(TK_PAR_DER);
				setState(525);
				match(TK_PYC);
				}
				break;
			case 17:
				_localctx = new Stmt2SeleccionarContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(527);
				match(SELECCIONAR);
				setState(528);
				match(TK_PAR_IZQ);
				setState(529);
				match(ID);
				setState(530);
				match(TK_PAR_DER);
				setState(531);
				match(ENTRE);
				setState(532);
				cases();
				setState(533);
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
		enterRule(_localctx, 46, RULE_stmt4);
		try {
			setState(579);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Stmt4FuncionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(ID);
				setState(538);
				match(TK_PAR_IZQ);
				setState(539);
				optargs();
				setState(540);
				match(TK_PAR_DER);
				setState(541);
				match(TK_PYC);
				}
				break;
			case 2:
				_localctx = new Stmt4TypeIDAsigComaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				type();
				setState(544);
				match(ID);
				setState(545);
				match(TK_ASIG);
				setState(546);
				exp(0);
				setState(547);
				match(TK_COMA);
				setState(548);
				optexp();
				setState(549);
				match(TK_PYC);
				}
				break;
			case 3:
				_localctx = new Stmt4TypeIDComaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				type();
				setState(552);
				match(ID);
				setState(553);
				match(TK_COMA);
				setState(554);
				optexp();
				setState(555);
				match(TK_PYC);
				}
				break;
			case 4:
				_localctx = new Stmt4IDAsigContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				match(ID);
				setState(558);
				match(TK_ASIG);
				setState(559);
				exp(0);
				setState(560);
				match(TK_PYC);
				}
				break;
			case 5:
				_localctx = new Stmt4TypeIDAsigContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(562);
				type();
				setState(563);
				match(ID);
				setState(564);
				match(TK_ASIG);
				setState(565);
				exp(0);
				setState(566);
				match(TK_PYC);
				}
				break;
			case 6:
				_localctx = new Stmt4IDChainAsigContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(568);
				match(ID);
				setState(569);
				match(TK_PUNTO);
				setState(570);
				chain();
				setState(571);
				match(TK_ASIG);
				setState(572);
				exp(0);
				setState(573);
				match(TK_PYC);
				}
				break;
			case 7:
				_localctx = new Stmt4TypeIDContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(575);
				type();
				setState(576);
				match(ID);
				setState(577);
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
		case 21:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u0248\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\5\28\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5X\n\5\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7f\n\7\3\b\3\b\5\bj\n\b\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\n\3\n\3\n"+
		"\3\n\5\nw\n\n\3\13\3\13\3\13\3\13\5\13}\n\13\3\f\3\f\3\f\3\f\5\f\u0083"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f5\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0109\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u011a\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0124\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u012f"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u013e\n\25\3\26\3\26\3\26\3\26\5\26\u0144\n\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u017a\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01a3\n\27\f\27\16\27\u01a6\13"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u021a\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0246\n\31\3\31\2\3,\32\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\2\u028e\2\67\3\2\2\2\49\3"+
		"\2\2\2\6O\3\2\2\2\bW\3\2\2\2\n[\3\2\2\2\fe\3\2\2\2\16i\3\2\2\2\20p\3\2"+
		"\2\2\22v\3\2\2\2\24|\3\2\2\2\26\u0082\3\2\2\2\30\u00f4\3\2\2\2\32\u0108"+
		"\3\2\2\2\34\u010a\3\2\2\2\36\u010e\3\2\2\2 \u0119\3\2\2\2\"\u0123\3\2"+
		"\2\2$\u0125\3\2\2\2&\u012e\3\2\2\2(\u013d\3\2\2\2*\u0143\3\2\2\2,\u0179"+
		"\3\2\2\2.\u0219\3\2\2\2\60\u0245\3\2\2\2\62\63\5\6\4\2\63\64\5\2\2\2\64"+
		"8\3\2\2\2\658\5\4\3\2\668\3\2\2\2\67\62\3\2\2\2\67\65\3\2\2\2\67\66\3"+
		"\2\2\28\3\3\2\2\29:\7\32\2\2:;\5\22\n\2;<\7\34\2\2<\5\3\2\2\2=>\7\33\2"+
		"\2>?\5\b\5\2?@\7?\2\2@A\7=\2\2AB\5\n\6\2BC\7>\2\2CD\7\n\2\2DE\5\22\n\2"+
		"EF\7\24\2\2FG\5,\27\2GH\7:\2\2HI\7\3\2\2IP\3\2\2\2JK\7\25\2\2KL\7?\2\2"+
		"LM\5\26\f\2MN\7\26\2\2NP\3\2\2\2O=\3\2\2\2OJ\3\2\2\2P\7\3\2\2\2QX\7\""+
		"\2\2RX\7\30\2\2SX\7\31\2\2TX\7!\2\2UX\7\35\2\2VX\7?\2\2WQ\3\2\2\2WR\3"+
		"\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\t\3\2\2\2Y\\\5\f\7\2Z"+
		"\\\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\13\3\2\2\2]^\5\b\5\2^_\7?\2\2_`\7;\2"+
		"\2`a\5\f\7\2af\3\2\2\2bc\5\b\5\2cd\7?\2\2df\3\2\2\2e]\3\2\2\2eb\3\2\2"+
		"\2f\r\3\2\2\2gj\5\20\t\2hj\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\17\3\2\2\2kl\5"+
		",\27\2lm\7;\2\2mn\5\20\t\2nq\3\2\2\2oq\5,\27\2pk\3\2\2\2po\3\2\2\2q\21"+
		"\3\2\2\2rs\5\30\r\2st\5\22\n\2tw\3\2\2\2uw\3\2\2\2vr\3\2\2\2vu\3\2\2\2"+
		"w\23\3\2\2\2xy\5.\30\2yz\5\24\13\2z}\3\2\2\2{}\3\2\2\2|x\3\2\2\2|{\3\2"+
		"\2\2}\25\3\2\2\2~\177\5\60\31\2\177\u0080\5\26\f\2\u0080\u0083\3\2\2\2"+
		"\u0081\u0083\3\2\2\2\u0082~\3\2\2\2\u0082\u0081\3\2\2\2\u0083\27\3\2\2"+
		"\2\u0084\u0085\7?\2\2\u0085\u0086\7=\2\2\u0086\u0087\5\16\b\2\u0087\u0088"+
		"\7>\2\2\u0088\u0089\7:\2\2\u0089\u00f5\3\2\2\2\u008a\u008b\5\b\5\2\u008b"+
		"\u008c\7?\2\2\u008c\u008d\7-\2\2\u008d\u008e\5,\27\2\u008e\u008f\7;\2"+
		"\2\u008f\u0090\5(\25\2\u0090\u0091\7:\2\2\u0091\u00f5\3\2\2\2\u0092\u0093"+
		"\5\b\5\2\u0093\u0094\7?\2\2\u0094\u0095\7;\2\2\u0095\u0096\5(\25\2\u0096"+
		"\u0097\7:\2\2\u0097\u00f5\3\2\2\2\u0098\u0099\7?\2\2\u0099\u009a\7-\2"+
		"\2\u009a\u009b\5,\27\2\u009b\u009c\7:\2\2\u009c\u00f5\3\2\2\2\u009d\u009e"+
		"\5\b\5\2\u009e\u009f\7?\2\2\u009f\u00a0\7-\2\2\u00a0\u00a1\5,\27\2\u00a1"+
		"\u00a2\7:\2\2\u00a2\u00f5\3\2\2\2\u00a3\u00a4\7?\2\2\u00a4\u00a5\7<\2"+
		"\2\u00a5\u00a6\5*\26\2\u00a6\u00a7\7-\2\2\u00a7\u00a8\5,\27\2\u00a8\u00a9"+
		"\7:\2\2\u00a9\u00f5\3\2\2\2\u00aa\u00ab\5\b\5\2\u00ab\u00ac\7?\2\2\u00ac"+
		"\u00ad\7:\2\2\u00ad\u00f5\3\2\2\2\u00ae\u00af\7\6\2\2\u00af\u00b0\7=\2"+
		"\2\u00b0\u00b1\5,\27\2\u00b1\u00b2\7>\2\2\u00b2\u00b3\7\7\2\2\u00b3\u00b4"+
		"\5\22\n\2\u00b4\u00b5\7\b\2\2\u00b5\u00f5\3\2\2\2\u00b6\u00b7\7\6\2\2"+
		"\u00b7\u00b8\7=\2\2\u00b8\u00b9\5,\27\2\u00b9\u00ba\7>\2\2\u00ba\u00bb"+
		"\7\7\2\2\u00bb\u00bc\5\22\n\2\u00bc\u00bd\5\34\17\2\u00bd\u00f5\3\2\2"+
		"\2\u00be\u00bf\7\4\2\2\u00bf\u00c0\7=\2\2\u00c0\u00c1\7?\2\2\u00c1\u00c2"+
		"\7>\2\2\u00c2\u00f5\7:\2\2\u00c3\u00c4\7\4\2\2\u00c4\u00c5\7=\2\2\u00c5"+
		"\u00c6\7?\2\2\u00c6\u00c7\7<\2\2\u00c7\u00c8\5*\26\2\u00c8\u00c9\7>\2"+
		"\2\u00c9\u00ca\7:\2\2\u00ca\u00f5\3\2\2\2\u00cb\u00cc\7\27\2\2\u00cc\u00cd"+
		"\7=\2\2\u00cd\u00ce\5&\24\2\u00ce\u00cf\7>\2\2\u00cf\u00d0\7:\2\2\u00d0"+
		"\u00f5\3\2\2\2\u00d1\u00d2\7\f\2\2\u00d2\u00d3\7=\2\2\u00d3\u00d4\5\32"+
		"\16\2\u00d4\u00d5\5,\27\2\u00d5\u00d6\7:\2\2\u00d6\u00d7\5,\27\2\u00d7"+
		"\u00d8\7>\2\2\u00d8\u00d9\7\n\2\2\u00d9\u00da\5\24\13\2\u00da\u00db\7"+
		"\r\2\2\u00db\u00f5\3\2\2\2\u00dc\u00dd\7\t\2\2\u00dd\u00de\7=\2\2\u00de"+
		"\u00df\5,\27\2\u00df\u00e0\7>\2\2\u00e0\u00e1\7\n\2\2\u00e1\u00e2\5\24"+
		"\13\2\u00e2\u00e3\7\13\2\2\u00e3\u00f5\3\2\2\2\u00e4\u00e5\7\n\2\2\u00e5"+
		"\u00e6\5\24\13\2\u00e6\u00e7\7\t\2\2\u00e7\u00e8\7=\2\2\u00e8\u00e9\5"+
		",\27\2\u00e9\u00ea\7>\2\2\u00ea\u00eb\7:\2\2\u00eb\u00f5\3\2\2\2\u00ec"+
		"\u00ed\7\16\2\2\u00ed\u00ee\7=\2\2\u00ee\u00ef\7?\2\2\u00ef\u00f0\7>\2"+
		"\2\u00f0\u00f1\7\17\2\2\u00f1\u00f2\5 \21\2\u00f2\u00f3\7\23\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u0084\3\2\2\2\u00f4\u008a\3\2\2\2\u00f4\u0092\3\2"+
		"\2\2\u00f4\u0098\3\2\2\2\u00f4\u009d\3\2\2\2\u00f4\u00a3\3\2\2\2\u00f4"+
		"\u00aa\3\2\2\2\u00f4\u00ae\3\2\2\2\u00f4\u00b6\3\2\2\2\u00f4\u00be\3\2"+
		"\2\2\u00f4\u00c3\3\2\2\2\u00f4\u00cb\3\2\2\2\u00f4\u00d1\3\2\2\2\u00f4"+
		"\u00dc\3\2\2\2\u00f4\u00e4\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f5\31\3\2\2"+
		"\2\u00f6\u00f7\7?\2\2\u00f7\u00f8\7-\2\2\u00f8\u00f9\5,\27\2\u00f9\u00fa"+
		"\7:\2\2\u00fa\u0109\3\2\2\2\u00fb\u00fc\5\b\5\2\u00fc\u00fd\7?\2\2\u00fd"+
		"\u00fe\7-\2\2\u00fe\u00ff\5,\27\2\u00ff\u0100\7:\2\2\u0100\u0109\3\2\2"+
		"\2\u0101\u0102\7?\2\2\u0102\u0103\7<\2\2\u0103\u0104\5*\26\2\u0104\u0105"+
		"\7-\2\2\u0105\u0106\5,\27\2\u0106\u0107\7:\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u00f6\3\2\2\2\u0108\u00fb\3\2\2\2\u0108\u0101\3\2\2\2\u0109\33\3\2\2"+
		"\2\u010a\u010b\7\5\2\2\u010b\u010c\5\22\n\2\u010c\u010d\7\b\2\2\u010d"+
		"\35\3\2\2\2\u010e\u010f\7\5\2\2\u010f\u0110\5\24\13\2\u0110\u0111\7\b"+
		"\2\2\u0111\37\3\2\2\2\u0112\u0113\7\20\2\2\u0113\u0114\5,\27\2\u0114\u0115"+
		"\7\67\2\2\u0115\u0116\5\24\13\2\u0116\u0117\5\"\22\2\u0117\u011a\3\2\2"+
		"\2\u0118\u011a\5$\23\2\u0119\u0112\3\2\2\2\u0119\u0118\3\2\2\2\u011a!"+
		"\3\2\2\2\u011b\u011c\7\20\2\2\u011c\u011d\5,\27\2\u011d\u011e\7\67\2\2"+
		"\u011e\u011f\5\24\13\2\u011f\u0120\5\"\22\2\u0120\u0124\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0124\5$\23\2\u0123\u011b\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0123\u0122\3\2\2\2\u0124#\3\2\2\2\u0125\u0126\7\22\2\2\u0126\u0127"+
		"\7\67\2\2\u0127\u0128\5\24\13\2\u0128%\3\2\2\2\u0129\u012a\5,\27\2\u012a"+
		"\u012b\7;\2\2\u012b\u012c\5&\24\2\u012c\u012f\3\2\2\2\u012d\u012f\5,\27"+
		"\2\u012e\u0129\3\2\2\2\u012e\u012d\3\2\2\2\u012f\'\3\2\2\2\u0130\u0131"+
		"\7?\2\2\u0131\u0132\7;\2\2\u0132\u013e\5(\25\2\u0133\u0134\7?\2\2\u0134"+
		"\u0135\7-\2\2\u0135\u0136\5,\27\2\u0136\u0137\7;\2\2\u0137\u0138\5(\25"+
		"\2\u0138\u013e\3\2\2\2\u0139\u013e\7?\2\2\u013a\u013b\7?\2\2\u013b\u013c"+
		"\7-\2\2\u013c\u013e\5,\27\2\u013d\u0130\3\2\2\2\u013d\u0133\3\2\2\2\u013d"+
		"\u0139\3\2\2\2\u013d\u013a\3\2\2\2\u013e)\3\2\2\2\u013f\u0140\7?\2\2\u0140"+
		"\u0141\7<\2\2\u0141\u0144\5*\26\2\u0142\u0144\7?\2\2\u0143\u013f\3\2\2"+
		"\2\u0143\u0142\3\2\2\2\u0144+\3\2\2\2\u0145\u0146\b\27\1\2\u0146\u0147"+
		"\7\66\2\2\u0147\u017a\5,\27\22\u0148\u017a\7\36\2\2\u0149\u017a\7?\2\2"+
		"\u014a\u014b\7?\2\2\u014b\u014c\7<\2\2\u014c\u017a\5*\26\2\u014d\u017a"+
		"\7#\2\2\u014e\u017a\7@\2\2\u014f\u017a\7A\2\2\u0150\u017a\7\37\2\2\u0151"+
		"\u017a\7 \2\2\u0152\u0153\7)\2\2\u0153\u017a\7@\2\2\u0154\u0155\7)\2\2"+
		"\u0155\u017a\7#\2\2\u0156\u0157\7)\2\2\u0157\u017a\7?\2\2\u0158\u0159"+
		"\7)\2\2\u0159\u015a\7?\2\2\u015a\u015b\7<\2\2\u015b\u017a\5*\26\2\u015c"+
		"\u015d\7)\2\2\u015d\u015e\7=\2\2\u015e\u015f\5,\27\2\u015f\u0160\7>\2"+
		"\2\u0160\u017a\3\2\2\2\u0161\u0162\7\66\2\2\u0162\u017a\7?\2\2\u0163\u0164"+
		"\7\66\2\2\u0164\u0165\7?\2\2\u0165\u0166\7<\2\2\u0166\u017a\5*\26\2\u0167"+
		"\u0168\7\66\2\2\u0168\u017a\7\37\2\2\u0169\u016a\7\66\2\2\u016a\u017a"+
		"\7 \2\2\u016b\u016c\7\66\2\2\u016c\u016d\7=\2\2\u016d\u016e\5,\27\2\u016e"+
		"\u016f\7>\2\2\u016f\u017a\3\2\2\2\u0170\u0171\7=\2\2\u0171\u0172\5,\27"+
		"\2\u0172\u0173\7>\2\2\u0173\u017a\3\2\2\2\u0174\u0175\7?\2\2\u0175\u0176"+
		"\7=\2\2\u0176\u0177\5\16\b\2\u0177\u0178\7>\2\2\u0178\u017a\3\2\2\2\u0179"+
		"\u0145\3\2\2\2\u0179\u0148\3\2\2\2\u0179\u0149\3\2\2\2\u0179\u014a\3\2"+
		"\2\2\u0179\u014d\3\2\2\2\u0179\u014e\3\2\2\2\u0179\u014f\3\2\2\2\u0179"+
		"\u0150\3\2\2\2\u0179\u0151\3\2\2\2\u0179\u0152\3\2\2\2\u0179\u0154\3\2"+
		"\2\2\u0179\u0156\3\2\2\2\u0179\u0158\3\2\2\2\u0179\u015c\3\2\2\2\u0179"+
		"\u0161\3\2\2\2\u0179\u0163\3\2\2\2\u0179\u0167\3\2\2\2\u0179\u0169\3\2"+
		"\2\2\u0179\u016b\3\2\2\2\u0179\u0170\3\2\2\2\u0179\u0174\3\2\2\2\u017a"+
		"\u01a4\3\2\2\2\u017b\u017c\f\17\2\2\u017c\u017d\7*\2\2\u017d\u01a3\5,"+
		"\27\20\u017e\u017f\f\16\2\2\u017f\u0180\7+\2\2\u0180\u01a3\5,\27\17\u0181"+
		"\u0182\f\r\2\2\u0182\u0183\7,\2\2\u0183\u01a3\5,\27\16\u0184\u0185\f\f"+
		"\2\2\u0185\u0186\7(\2\2\u0186\u01a3\5,\27\r\u0187\u0188\f\13\2\2\u0188"+
		"\u0189\7)\2\2\u0189\u01a3\5,\27\f\u018a\u018b\f\n\2\2\u018b\u018c\7.\2"+
		"\2\u018c\u01a3\5,\27\13\u018d\u018e\f\t\2\2\u018e\u018f\7/\2\2\u018f\u01a3"+
		"\5,\27\n\u0190\u0191\f\b\2\2\u0191\u0192\7\60\2\2\u0192\u01a3\5,\27\t"+
		"\u0193\u0194\f\7\2\2\u0194\u0195\7\61\2\2\u0195\u01a3\5,\27\b\u0196\u0197"+
		"\f\6\2\2\u0197\u0198\7\62\2\2\u0198\u01a3\5,\27\7\u0199\u019a\f\5\2\2"+
		"\u019a\u019b\7\65\2\2\u019b\u01a3\5,\27\6\u019c\u019d\f\4\2\2\u019d\u019e"+
		"\7\63\2\2\u019e\u01a3\5,\27\5\u019f\u01a0\f\3\2\2\u01a0\u01a1\7\64\2\2"+
		"\u01a1\u01a3\5,\27\4\u01a2\u017b\3\2\2\2\u01a2\u017e\3\2\2\2\u01a2\u0181"+
		"\3\2\2\2\u01a2\u0184\3\2\2\2\u01a2\u0187\3\2\2\2\u01a2\u018a\3\2\2\2\u01a2"+
		"\u018d\3\2\2\2\u01a2\u0190\3\2\2\2\u01a2\u0193\3\2\2\2\u01a2\u0196\3\2"+
		"\2\2\u01a2\u0199\3\2\2\2\u01a2\u019c\3\2\2\2\u01a2\u019f\3\2\2\2\u01a3"+
		"\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5-\3\2\2\2"+
		"\u01a6\u01a4\3\2\2\2\u01a7\u01a8\7\21\2\2\u01a8\u021a\7:\2\2\u01a9\u01aa"+
		"\7?\2\2\u01aa\u01ab\7=\2\2\u01ab\u01ac\5\16\b\2\u01ac\u01ad\7>\2\2\u01ad"+
		"\u01ae\7:\2\2\u01ae\u021a\3\2\2\2\u01af\u01b0\5\b\5\2\u01b0\u01b1\7?\2"+
		"\2\u01b1\u01b2\7-\2\2\u01b2\u01b3\5,\27\2\u01b3\u01b4\7;\2\2\u01b4\u01b5"+
		"\5(\25\2\u01b5\u01b6\7:\2\2\u01b6\u021a\3\2\2\2\u01b7\u01b8\5\b\5\2\u01b8"+
		"\u01b9\7?\2\2\u01b9\u01ba\7;\2\2\u01ba\u01bb\5(\25\2\u01bb\u01bc\7:\2"+
		"\2\u01bc\u021a\3\2\2\2\u01bd\u01be\7?\2\2\u01be\u01bf\7-\2\2\u01bf\u01c0"+
		"\5,\27\2\u01c0\u01c1\7:\2\2\u01c1\u021a\3\2\2\2\u01c2\u01c3\5\b\5\2\u01c3"+
		"\u01c4\7?\2\2\u01c4\u01c5\7-\2\2\u01c5\u01c6\5,\27\2\u01c6\u01c7\7:\2"+
		"\2\u01c7\u021a\3\2\2\2\u01c8\u01c9\7?\2\2\u01c9\u01ca\7<\2\2\u01ca\u01cb"+
		"\5*\26\2\u01cb\u01cc\7-\2\2\u01cc\u01cd\5,\27\2\u01cd\u01ce\7:\2\2\u01ce"+
		"\u021a\3\2\2\2\u01cf\u01d0\5\b\5\2\u01d0\u01d1\7?\2\2\u01d1\u01d2\7:\2"+
		"\2\u01d2\u021a\3\2\2\2\u01d3\u01d4\7\6\2\2\u01d4\u01d5\7=\2\2\u01d5\u01d6"+
		"\5,\27\2\u01d6\u01d7\7>\2\2\u01d7\u01d8\7\7\2\2\u01d8\u01d9\5\24\13\2"+
		"\u01d9\u01da\7\b\2\2\u01da\u021a\3\2\2\2\u01db\u01dc\7\6\2\2\u01dc\u01dd"+
		"\7=\2\2\u01dd\u01de\5,\27\2\u01de\u01df\7>\2\2\u01df\u01e0\7\7\2\2\u01e0"+
		"\u01e1\5\24\13\2\u01e1\u01e2\5\36\20\2\u01e2\u021a\3\2\2\2\u01e3\u01e4"+
		"\7\4\2\2\u01e4\u01e5\7=\2\2\u01e5\u01e6\7?\2\2\u01e6\u01e7\7<\2\2\u01e7"+
		"\u01e8\5*\26\2\u01e8\u01e9\7>\2\2\u01e9\u01ea\7:\2\2\u01ea\u021a\3\2\2"+
		"\2\u01eb\u01ec\7\4\2\2\u01ec\u01ed\7=\2\2\u01ed\u01ee\7?\2\2\u01ee\u01ef"+
		"\7>\2\2\u01ef\u021a\7:\2\2\u01f0\u01f1\7\27\2\2\u01f1\u01f2\7=\2\2\u01f2"+
		"\u01f3\5&\24\2\u01f3\u01f4\7>\2\2\u01f4\u01f5\7:\2\2\u01f5\u021a\3\2\2"+
		"\2\u01f6\u01f7\7\f\2\2\u01f7\u01f8\7=\2\2\u01f8\u01f9\5\32\16\2\u01f9"+
		"\u01fa\5,\27\2\u01fa\u01fb\7:\2\2\u01fb\u01fc\5,\27\2\u01fc\u01fd\7>\2"+
		"\2\u01fd\u01fe\7\n\2\2\u01fe\u01ff\5\24\13\2\u01ff\u0200\7\r\2\2\u0200"+
		"\u021a\3\2\2\2\u0201\u0202\7\t\2\2\u0202\u0203\7=\2\2\u0203\u0204\5,\27"+
		"\2\u0204\u0205\7>\2\2\u0205\u0206\7\n\2\2\u0206\u0207\5\24\13\2\u0207"+
		"\u0208\7\13\2\2\u0208\u021a\3\2\2\2\u0209\u020a\7\n\2\2\u020a\u020b\5"+
		"\24\13\2\u020b\u020c\7\t\2\2\u020c\u020d\7=\2\2\u020d\u020e\5,\27\2\u020e"+
		"\u020f\7>\2\2\u020f\u0210\7:\2\2\u0210\u021a\3\2\2\2\u0211\u0212\7\16"+
		"\2\2\u0212\u0213\7=\2\2\u0213\u0214\7?\2\2\u0214\u0215\7>\2\2\u0215\u0216"+
		"\7\17\2\2\u0216\u0217\5 \21\2\u0217\u0218\7\23\2\2\u0218\u021a\3\2\2\2"+
		"\u0219\u01a7\3\2\2\2\u0219\u01a9\3\2\2\2\u0219\u01af\3\2\2\2\u0219\u01b7"+
		"\3\2\2\2\u0219\u01bd\3\2\2\2\u0219\u01c2\3\2\2\2\u0219\u01c8\3\2\2\2\u0219"+
		"\u01cf\3\2\2\2\u0219\u01d3\3\2\2\2\u0219\u01db\3\2\2\2\u0219\u01e3\3\2"+
		"\2\2\u0219\u01eb\3\2\2\2\u0219\u01f0\3\2\2\2\u0219\u01f6\3\2\2\2\u0219"+
		"\u0201\3\2\2\2\u0219\u0209\3\2\2\2\u0219\u0211\3\2\2\2\u021a/\3\2\2\2"+
		"\u021b\u021c\7?\2\2\u021c\u021d\7=\2\2\u021d\u021e\5\16\b\2\u021e\u021f"+
		"\7>\2\2\u021f\u0220\7:\2\2\u0220\u0246\3\2\2\2\u0221\u0222\5\b\5\2\u0222"+
		"\u0223\7?\2\2\u0223\u0224\7-\2\2\u0224\u0225\5,\27\2\u0225\u0226\7;\2"+
		"\2\u0226\u0227\5(\25\2\u0227\u0228\7:\2\2\u0228\u0246\3\2\2\2\u0229\u022a"+
		"\5\b\5\2\u022a\u022b\7?\2\2\u022b\u022c\7;\2\2\u022c\u022d\5(\25\2\u022d"+
		"\u022e\7:\2\2\u022e\u0246\3\2\2\2\u022f\u0230\7?\2\2\u0230\u0231\7-\2"+
		"\2\u0231\u0232\5,\27\2\u0232\u0233\7:\2\2\u0233\u0246\3\2\2\2\u0234\u0235"+
		"\5\b\5\2\u0235\u0236\7?\2\2\u0236\u0237\7-\2\2\u0237\u0238\5,\27\2\u0238"+
		"\u0239\7:\2\2\u0239\u0246\3\2\2\2\u023a\u023b\7?\2\2\u023b\u023c\7<\2"+
		"\2\u023c\u023d\5*\26\2\u023d\u023e\7-\2\2\u023e\u023f\5,\27\2\u023f\u0240"+
		"\7:\2\2\u0240\u0246\3\2\2\2\u0241\u0242\5\b\5\2\u0242\u0243\7?\2\2\u0243"+
		"\u0244\7:\2\2\u0244\u0246\3\2\2\2\u0245\u021b\3\2\2\2\u0245\u0221\3\2"+
		"\2\2\u0245\u0229\3\2\2\2\u0245\u022f\3\2\2\2\u0245\u0234\3\2\2\2\u0245"+
		"\u023a\3\2\2\2\u0245\u0241\3\2\2\2\u0246\61\3\2\2\2\30\67OW[eipv|\u0082"+
		"\u00f4\u0108\u0119\u0123\u012e\u013d\u0143\u0179\u01a2\u01a4\u0219\u0245";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}