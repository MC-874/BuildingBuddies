//import java.util.Arrays;

import javax.swing.JOptionPane;

public class MyVisitor extends SentenceGrammarBaseVisitor<Object>{
    static boolean hasNoun=false;
    static boolean hasVerb=false;
    static boolean hasObject=false;
    
    @Override
    public Object visitSentences(SentenceGrammarParser.SentencesContext ctx) {
        // Auto-generated method stub
        JOptionPane.showMessageDialog(null, "Visited Senteces");
        return super.visitSentences(ctx);
    }

    @Override
    public Object visitSimpleSentence(SentenceGrammarParser.SimpleSentenceContext ctx) {
        //  Auto-generated method stub

        String temp= LevelsPanel.userInputTextArea.getText();
        
        for(int i = 0; i < LevelsPanel.nounVariables.length; i++){
                if(temp.contains(LevelsPanel.nounVariables[i])){
                    hasNoun=true;
                    break;
                }
        }

        for(int i = 0; i < LevelsPanel.objectVariables.length; i++){
                if(temp.contains(LevelsPanel.objectVariables[i])){
                    hasObject=true;
                    break;
                }
        }

        for(int i = 0; i < LevelsPanel.verbVariables.length; i++){
                if(temp.contains(LevelsPanel.verbVariables[i])){
                    hasVerb=true;
                    break;
                }
        }
        if(hasNoun && hasVerb && hasObject){
            BuildBuddiesMainWindow.simpleSentece=true;

        
        
        return super.visitSimpleSentence(ctx);
    }

    public static void resetValues() {
    hasNoun=false;
    hasVerb=false;
    hasObject=false;
    BuildBuddiesMainWindow.simpleSentece=false;
    }
}
