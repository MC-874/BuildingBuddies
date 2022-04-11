// Generated from SentenceGrammar.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SentenceGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COORDINATOR=1, CONJUNCTION=2, SUBJECT=3, VERB=4, OBJECT=5, ARTICLE=6, 
		PUNCTUATION=7, WS=8;
	public static final int
		RULE_sentences = 0, RULE_simpleSentence = 1, RULE_compoundSentence = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentences", "simpleSentence", "compoundSentence"
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

	@Override
	public String getGrammarFileName() { return "SentenceGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SentenceGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SentencesContext extends ParserRuleContext {
		public SimpleSentenceContext simpleSentence() {
			return getRuleContext(SimpleSentenceContext.class,0);
		}
		public TerminalNode PUNCTUATION() { return getToken(SentenceGrammarParser.PUNCTUATION, 0); }
		public CompoundSentenceContext compoundSentence() {
			return getRuleContext(CompoundSentenceContext.class,0);
		}
		public SentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentenceGrammarListener ) ((SentenceGrammarListener)listener).enterSentences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentenceGrammarListener ) ((SentenceGrammarListener)listener).exitSentences(this);
		}
	}

	public final SentencesContext sentences() throws RecognitionException {
		SentencesContext _localctx = new SentencesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentences);
		try {
			setState(12);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				simpleSentence();
				setState(7);
				match(PUNCTUATION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				compoundSentence();
				setState(10);
				match(PUNCTUATION);
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

	public static class SimpleSentenceContext extends ParserRuleContext {
		public TerminalNode SUBJECT() { return getToken(SentenceGrammarParser.SUBJECT, 0); }
		public TerminalNode VERB() { return getToken(SentenceGrammarParser.VERB, 0); }
		public TerminalNode OBJECT() { return getToken(SentenceGrammarParser.OBJECT, 0); }
		public List<TerminalNode> ARTICLE() { return getTokens(SentenceGrammarParser.ARTICLE); }
		public TerminalNode ARTICLE(int i) {
			return getToken(SentenceGrammarParser.ARTICLE, i);
		}
		public SimpleSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentenceGrammarListener ) ((SentenceGrammarListener)listener).enterSimpleSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentenceGrammarListener ) ((SentenceGrammarListener)listener).exitSimpleSentence(this);
		}
	}

	public final SimpleSentenceContext simpleSentence() throws RecognitionException {
		SimpleSentenceContext _localctx = new SimpleSentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simpleSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARTICLE) {
				{
				setState(14);
				match(ARTICLE);
				}
			}

			setState(17);
			match(SUBJECT);
			setState(18);
			match(VERB);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARTICLE) {
				{
				setState(19);
				match(ARTICLE);
				}
			}

			setState(22);
			match(OBJECT);
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

	public static class CompoundSentenceContext extends ParserRuleContext {
		public List<SimpleSentenceContext> simpleSentence() {
			return getRuleContexts(SimpleSentenceContext.class);
		}
		public SimpleSentenceContext simpleSentence(int i) {
			return getRuleContext(SimpleSentenceContext.class,i);
		}
		public TerminalNode CONJUNCTION() { return getToken(SentenceGrammarParser.CONJUNCTION, 0); }
		public CompoundSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentenceGrammarListener ) ((SentenceGrammarListener)listener).enterCompoundSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentenceGrammarListener ) ((SentenceGrammarListener)listener).exitCompoundSentence(this);
		}
	}

	public final CompoundSentenceContext compoundSentence() throws RecognitionException {
		CompoundSentenceContext _localctx = new CompoundSentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compoundSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			simpleSentence();
			setState(25);
			match(CONJUNCTION);
			setState(26);
			simpleSentence();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\37\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\5\2\17\n\2\3\3\5\3\22\n\3\3\3\3\3"+
		"\3\3\5\3\27\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2\36\2\16"+
		"\3\2\2\2\4\21\3\2\2\2\6\32\3\2\2\2\b\t\5\4\3\2\t\n\7\t\2\2\n\17\3\2\2"+
		"\2\13\f\5\6\4\2\f\r\7\t\2\2\r\17\3\2\2\2\16\b\3\2\2\2\16\13\3\2\2\2\17"+
		"\3\3\2\2\2\20\22\7\b\2\2\21\20\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23"+
		"\24\7\5\2\2\24\26\7\6\2\2\25\27\7\b\2\2\26\25\3\2\2\2\26\27\3\2\2\2\27"+
		"\30\3\2\2\2\30\31\7\7\2\2\31\5\3\2\2\2\32\33\5\4\3\2\33\34\7\4\2\2\34"+
		"\35\5\4\3\2\35\7\3\2\2\2\5\16\21\26";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}