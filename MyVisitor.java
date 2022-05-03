import java.util.Arrays;

import javax.swing.JOptionPane;

public class MyVisitor extends SentenceGrammarBaseVisitor<Object>{
    boolean hasNoun=false;
    boolean hasVerb=false;
    boolean hasObject=false;
    
    @Override
    public Object visitSentences(SentenceGrammarParser.SentencesContext ctx) {
        // Auto-generated method stub
        JOptionPane.showMessageDialog(null, "Visited Senteces");
        return super.visitSentences(ctx);
    }

    @Override
    public Object visitSimpleSentence(SentenceGrammarParser.SimpleSentenceContext ctx) {
        //  Auto-generated method stub
        //JOptionPane.showMessageDialog(null, "Visited simpleSentence");

        String temp= LevelsPanel.userInputTextArea.getText();
        JOptionPane.showMessageDialog(null, "temp is "+temp);

        for(int i = 0; i < LevelsPanel.nounVariables.length; i++){
                if(LevelsPanel.nounVariables[i].equals(temp)){
                    hasNoun=true;
                    JOptionPane.showMessageDialog(null, "noun is "+hasNoun);
                    break;
                }
        }
        //if (Arrays.asList(LevelsPanel.nounVariables).contains(temp)){
        //    hasNoun=true;
        //    JOptionPane.showMessageDialog(null, "noun is "+hasNoun);
        //}
        if (Arrays.asList(LevelsPanel.objectVariables).contains(temp)){
            hasObject=true;
            JOptionPane.showMessageDialog(null, "object is "+hasObject);
        }
        if (Arrays.asList(LevelsPanel.verbVariables).contains(temp)){
            hasVerb=true;
            JOptionPane.showMessageDialog(null, "verb is "+hasVerb);
        }
        if(hasNoun && hasVerb && hasObject){
            BuildBuddiesMainWindow.simpleSentece=true;
            JOptionPane.showMessageDialog(null, "SimpleSentence "+BuildBuddiesMainWindow.simpleSentece);

        }else{
            JOptionPane.showMessageDialog(null, "SimpleSentence "+BuildBuddiesMainWindow.simpleSentece);
        }
        
        
        return super.visitSimpleSentence(ctx);
    }
}
