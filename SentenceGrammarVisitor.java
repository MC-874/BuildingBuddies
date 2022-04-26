// Generated from SentenceGrammar.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SentenceGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SentenceGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SentenceGrammarParser#sentences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentences(SentenceGrammarParser.SentencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SentenceGrammarParser#simpleSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSentence(SentenceGrammarParser.SimpleSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SentenceGrammarParser#compoundSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundSentence(SentenceGrammarParser.CompoundSentenceContext ctx);
}