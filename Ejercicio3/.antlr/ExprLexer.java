// Generated from c:/Users/azare/OneDrive/Documents/GitHub/DuplicarExamen2PorOrdenDeHeisenberg/Ejercicio3/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CADENA=1, NUMBER=2, TRUE=3, FALSE=4, NULL=5, IDT=6, PAR_1=7, PAR_2=8, 
		COR_1=9, COR_2=10, LLA_1=11, LLA_2=12, DOS_PUNTOS=13, COMA=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CADENA", "NUMBER", "TRUE", "FALSE", "NULL", "IDT", "PAR_1", "PAR_2", 
			"COR_1", "COR_2", "LLA_1", "LLA_2", "DOS_PUNTOS", "COMA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'true'", "'false'", "'null'", null, "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CADENA", "NUMBER", "TRUE", "FALSE", "NULL", "IDT", "PAR_1", "PAR_2", 
			"COR_1", "COR_2", "LLA_1", "LLA_2", "DOS_PUNTOS", "COMA", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000f_\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u0001*\b\u0001\u000b\u0001\f\u0001"+
		"+\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005"+
		"?\b\u0005\u000b\u0005\f\u0005@\u0001\u0005\u0005\u0005D\b\u0005\n\u0005"+
		"\f\u0005G\t\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0004\u000eZ\b\u000e\u000b\u000e"+
		"\f\u000e[\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000"+
		"\u0005\u0003\u0000\n\n\r\r\"\"\u0001\u000009\u0002\u0000AZaz\u0003\u0000"+
		"09AZaz\u0003\u0000\t\n\r\r  c\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001"+
		"\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000"+
		"\u0000\u00072\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000\u000b"+
		">\u0001\u0000\u0000\u0000\rH\u0001\u0000\u0000\u0000\u000fJ\u0001\u0000"+
		"\u0000\u0000\u0011L\u0001\u0000\u0000\u0000\u0013N\u0001\u0000\u0000\u0000"+
		"\u0015P\u0001\u0000\u0000\u0000\u0017R\u0001\u0000\u0000\u0000\u0019T"+
		"\u0001\u0000\u0000\u0000\u001bV\u0001\u0000\u0000\u0000\u001dY\u0001\u0000"+
		"\u0000\u0000\u001f#\u0005\"\u0000\u0000 \"\b\u0000\u0000\u0000! \u0001"+
		"\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000&\'\u0005\"\u0000\u0000\'\u0002\u0001\u0000\u0000\u0000(*\u0007"+
		"\u0001\u0000\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0004\u0001\u0000"+
		"\u0000\u0000-.\u0005t\u0000\u0000./\u0005r\u0000\u0000/0\u0005u\u0000"+
		"\u000001\u0005e\u0000\u00001\u0006\u0001\u0000\u0000\u000023\u0005f\u0000"+
		"\u000034\u0005a\u0000\u000045\u0005l\u0000\u000056\u0005s\u0000\u0000"+
		"67\u0005e\u0000\u00007\b\u0001\u0000\u0000\u000089\u0005n\u0000\u0000"+
		"9:\u0005u\u0000\u0000:;\u0005l\u0000\u0000;<\u0005l\u0000\u0000<\n\u0001"+
		"\u0000\u0000\u0000=?\u0007\u0002\u0000\u0000>=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AE\u0001\u0000\u0000\u0000BD\u0007\u0003\u0000\u0000CB\u0001\u0000"+
		"\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000F\f\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"HI\u0005(\u0000\u0000I\u000e\u0001\u0000\u0000\u0000JK\u0005)\u0000\u0000"+
		"K\u0010\u0001\u0000\u0000\u0000LM\u0005[\u0000\u0000M\u0012\u0001\u0000"+
		"\u0000\u0000NO\u0005]\u0000\u0000O\u0014\u0001\u0000\u0000\u0000PQ\u0005"+
		"{\u0000\u0000Q\u0016\u0001\u0000\u0000\u0000RS\u0005}\u0000\u0000S\u0018"+
		"\u0001\u0000\u0000\u0000TU\u0005:\u0000\u0000U\u001a\u0001\u0000\u0000"+
		"\u0000VW\u0005,\u0000\u0000W\u001c\u0001\u0000\u0000\u0000XZ\u0007\u0004"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]^\u0006\u000e\u0000\u0000^\u001e\u0001\u0000\u0000\u0000\u0006\u0000"+
		"#+@E[\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}