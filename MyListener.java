import javax.swing.JOptionPane;
import org.antlr.v4.runtime.ParserRuleContext;

public class MyListener extends SentenceGrammarBaseListener {
    
    @Override
    public void enterSentences(SentenceGrammarParser.SentencesContext ctx) {
        //  Auto-generated method stub
        //super.enterSentences(ctx);
        JOptionPane.showMessageDialog(null, "Enter Sentence Achieved");

    }


    @Override
    public void enterSimpleSentence(SentenceGrammarParser.SimpleSentenceContext ctx) {
        //  Auto-generated method stub
        //super.enterSimpleSentence(ctx);
        JOptionPane.showMessageDialog(null, "Enter Simple Sentence Achieved");

    }

    @Override
    public void exitSimpleSentence(SentenceGrammarParser.SimpleSentenceContext ctx) {
        //  Auto-generated method stub
        super.exitSimpleSentence(ctx);
        JOptionPane.showMessageDialog(null, "Exit Simple Sentence Achieved");

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        //  Auto-generated method stub
        super.enterEveryRule(ctx);
        JOptionPane.showMessageDialog(null, "Enter every rule Achieved");
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        //  Auto-generated method stub
        //super.exitEveryRule(ctx);
        JOptionPane.showMessageDialog(null, "Exit every rule Achieved");
    }


}
