// Generated from SentenceGrammar.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SentenceGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COORDINATOR=1, CONJUNCTION=2, SUBJECT=3, VERB=4, OBJECT=5, ARTICLE=6, 
		PUNCTUATION=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COORDINATOR", "CONJUNCTION", "SUBJECT", "VERB", "OBJECT", "ARTICLE", 
			"PUNCTUATION", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COORDINATOR", "CONJUNCTION", "SUBJECT", "VERB", "OBJECT", "ARTICLE", 
			"PUNCTUATION", "WS"
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


	public SentenceGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SentenceGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u009c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2#\n\2\3\3\3\3\3\3"+
		"\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0084\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u008f\n\7\3\b\3\b\3\b\3\b\3\b\3\t\6\t\u0097\n\t\r\t\16\t\u0098"+
		"\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\3\4\2\13\13\"\""+
		"\2\u00b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\"\3\2\2\2\5\'\3\2\2\2\7I\3\2"+
		"\2\2\tc\3\2\2\2\13\u0083\3\2\2\2\r\u008e\3\2\2\2\17\u0090\3\2\2\2\21\u0096"+
		"\3\2\2\2\23\24\7c\2\2\24\25\7p\2\2\25#\7f\2\2\26\27\7d\2\2\27\30\7w\2"+
		"\2\30#\7v\2\2\31\32\7v\2\2\32\33\7j\2\2\33\34\7q\2\2\34\35\7w\2\2\35\36"+
		"\7i\2\2\36#\7j\2\2\37 \7q\2\2 #\7t\2\2!#\7.\2\2\"\23\3\2\2\2\"\26\3\2"+
		"\2\2\"\31\3\2\2\2\"\37\3\2\2\2\"!\3\2\2\2#\4\3\2\2\2$(\5\3\2\2%&\7.\2"+
		"\2&(\5\3\2\2\'$\3\2\2\2\'%\3\2\2\2(\6\3\2\2\2)*\7E\2\2*+\7c\2\2+J\7v\2"+
		"\2,-\7F\2\2-.\7q\2\2.J\7i\2\2/\60\7V\2\2\60\61\7q\2\2\61J\7{\2\2\62\63"+
		"\7D\2\2\63\64\7g\2\2\64\65\7c\2\2\65J\7t\2\2\66J\7K\2\2\678\7[\2\289\7"+
		"q\2\29J\7w\2\2:;\7V\2\2;<\7j\2\2<=\7g\2\2=J\7{\2\2>?\7Y\2\2?J\7g\2\2@"+
		"A\7D\2\2AB\7k\2\2BC\7t\2\2CJ\7f\2\2DE\7O\2\2EF\7q\2\2FG\7w\2\2GH\7u\2"+
		"\2HJ\7g\2\2I)\3\2\2\2I,\3\2\2\2I/\3\2\2\2I\62\3\2\2\2I\66\3\2\2\2I\67"+
		"\3\2\2\2I:\3\2\2\2I>\3\2\2\2I@\3\2\2\2ID\3\2\2\2J\b\3\2\2\2KL\7t\2\2L"+
		"M\7c\2\2Md\7p\2\2NO\7c\2\2OP\7v\2\2Pd\7g\2\2QR\7y\2\2RS\7g\2\2ST\7p\2"+
		"\2Td\7v\2\2UV\7e\2\2VW\7j\2\2WX\7q\2\2XY\7q\2\2YZ\7u\2\2Zd\7g\2\2[\\\7"+
		"g\2\2\\]\7c\2\2]^\7v\2\2^d\7u\2\2_`\7r\2\2`a\7n\2\2ab\7c\2\2bd\7{\2\2"+
		"cK\3\2\2\2cN\3\2\2\2cQ\3\2\2\2cU\3\2\2\2c[\3\2\2\2c_\3\2\2\2d\n\3\2\2"+
		"\2ef\7h\2\2fg\7c\2\2g\u0084\7t\2\2hi\7h\2\2ij\7q\2\2jk\7q\2\2k\u0084\7"+
		"f\2\2lm\7j\2\2mn\7q\2\2no\7o\2\2o\u0084\7g\2\2pq\7i\2\2qr\7w\2\2rs\7k"+
		"\2\2st\7v\2\2tu\7c\2\2u\u0084\7t\2\2vw\7q\2\2wx\7w\2\2xy\7v\2\2yz\7u\2"+
		"\2z{\7k\2\2{|\7f\2\2|\u0084\7g\2\2}~\7u\2\2~\177\7e\2\2\177\u0080\7j\2"+
		"\2\u0080\u0081\7q\2\2\u0081\u0082\7q\2\2\u0082\u0084\7n\2\2\u0083e\3\2"+
		"\2\2\u0083h\3\2\2\2\u0083l\3\2\2\2\u0083p\3\2\2\2\u0083v\3\2\2\2\u0083"+
		"}\3\2\2\2\u0084\f\3\2\2\2\u0085\u0086\7V\2\2\u0086\u0087\7j\2\2\u0087"+
		"\u008f\7g\2\2\u0088\u008f\7c\2\2\u0089\u008a\7c\2\2\u008a\u008f\7p\2\2"+
		"\u008b\u008c\7v\2\2\u008c\u008d\7j\2\2\u008d\u008f\7g\2\2\u008e\u0085"+
		"\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008b\3\2\2\2\u008f"+
		"\16\3\2\2\2\u0090\u0091\7\60\2\2\u0091\u0092\7A\2\2\u0092\u0093\7.\2\2"+
		"\u0093\u0094\7#\2\2\u0094\20\3\2\2\2\u0095\u0097\t\2\2\2\u0096\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\b\t\2\2\u009b\22\3\2\2\2\n\2\"\'Ic\u0083\u008e"+
		"\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}