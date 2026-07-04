// Generated from c:/Users/azare/OneDrive/Documents/GitHub/DuplicarExamen2PorOrdenDeHeisenberg/Ejercicio1/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, STATIC=2, VOID=3, CLASS=4, SYSTEM=5, OUT=6, PRINTLN=7, BREAK=8, 
		DEFAULT=9, THIS=10, RETURN=11, FOR=12, WHILE=13, DO=14, SWITCH=15, STRING=16, 
		INT=17, DOUBLE=18, CHAR=19, IF=20, ELSE=21, ELSE_IF=22, TEXTO=23, IDT=24, 
		NUM=25, MAS=26, MENOS=27, POR=28, ENTRE=29, COMPLEMENTO=30, AND=31, OR=32, 
		NOT=33, MAYOR=34, MAYOR_IGUAL=35, MENOR=36, MENOR_IGUAL=37, ASIGNACION=38, 
		PAR_1=39, PAR_2=40, COR_1=41, COR_2=42, LLA_1=43, LLA_2=44, PUNTO_COMA=45, 
		PUNTO=46, WS=47;
	public static final int
		RULE_root = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'static'", "'void'", "'class'", "'System'", "'out'", 
			"'println'", "'break'", "'default'", "'this'", "'return'", "'for'", "'while'", 
			"'do'", "'switch'", "'String'", "'int'", "'double'", "'char'", "'if'", 
			"'else'", "'else if'", null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'&&'", "'||'", "'!'", "'>'", "'>='", "'<'", "'<='", "'='", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "';'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "STATIC", "VOID", "CLASS", "SYSTEM", "OUT", "PRINTLN", 
			"BREAK", "DEFAULT", "THIS", "RETURN", "FOR", "WHILE", "DO", "SWITCH", 
			"STRING", "INT", "DOUBLE", "CHAR", "IF", "ELSE", "ELSE_IF", "TEXTO", 
			"IDT", "NUM", "MAS", "MENOS", "POR", "ENTRE", "COMPLEMENTO", "AND", "OR", 
			"NOT", "MAYOR", "MAYOR_IGUAL", "MENOR", "MENOR_IGUAL", "ASIGNACION", 
			"PAR_1", "PAR_2", "COR_1", "COR_2", "LLA_1", "LLA_2", "PUNTO_COMA", "PUNTO", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public TerminalNode IDT() { return getToken(ExprParser.IDT, 0); }
		public TerminalNode TEXTO() { return getToken(ExprParser.TEXTO, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static final String _serializedATN =
		"\u0004\u0001/\t\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0002"+
		"\u0000\u0002\u0000\u0001\u0001\u0000\u0017\u0019\u0006\u0000\u0004\u0001"+
		"\u0000\u0000\u0000\u0002\u0006\u0001\u0000\u0000\u0000\u0004\u0005\u0005"+
		"\u0000\u0000\u0001\u0005\u0001\u0001\u0000\u0000\u0000\u0006\u0007\u0007"+
		"\u0000\u0000\u0000\u0007\u0003\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}