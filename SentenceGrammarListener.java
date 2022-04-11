// Generated from SentenceGrammar.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SentenceGrammarParser}.
 */
public interface SentenceGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SentenceGrammarParser#sentences}.
	 * @param ctx the parse tree
	 */
	void enterSentences(SentenceGrammarParser.SentencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SentenceGrammarParser#sentences}.
	 * @param ctx the parse tree
	 */
	void exitSentences(SentenceGrammarParser.SentencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SentenceGrammarParser#simpleSentence}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSentence(SentenceGrammarParser.SimpleSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SentenceGrammarParser#simpleSentence}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSentence(SentenceGrammarParser.SimpleSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SentenceGrammarParser#compoundSentence}.
	 * @param ctx the parse tree
	 */
	void enterCompoundSentence(SentenceGrammarParser.CompoundSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SentenceGrammarParser#compoundSentence}.
	 * @param ctx the parse tree
	 */
	void exitCompoundSentence(SentenceGrammarParser.CompoundSentenceContext ctx);
}