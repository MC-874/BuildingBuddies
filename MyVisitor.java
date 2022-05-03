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
        //JOptionPane.showMessageDialog(null, "Visited simpleSentence");

        String temp= LevelsPanel.userInputTextArea.getText();
        //JOptionPane.showMessageDialog(null, "temp is "+temp);

        //JOptionPane.showMessageDialog(null, "noun variable are "+LevelsPanel.nounVariables);
        
        for(int i = 0; i < LevelsPanel.nounVariables.length; i++){
            //JOptionPane.showMessageDialog(null, "noun variable are "+LevelsPanel.nounVariables[i]);
                if(temp.contains(LevelsPanel.nounVariables[i])){
                    //JOptionPane.showMessageDialog(null, "noun variable are "+LevelsPanel.nounVariables[i]);
                    hasNoun=true;
                    //JOptionPane.showMessageDialog(null, "noun is "+hasNoun);
                    break;
                }
        }

        for(int i = 0; i < LevelsPanel.objectVariables.length; i++){
            //JOptionPane.showMessageDialog(null, "noun variable are "+LevelsPanel.nounVariables[i]);
                if(temp.contains(LevelsPanel.objectVariables[i])){
                    //JOptionPane.showMessageDialog(null, "noun variable are "+LevelsPanel.nounVariables[i]);
                    hasObject=true;
                    //JOptionPane.showMessageDialog(null, "object is "+hasObject);
                    break;
                }
        }

        for(int i = 0; i < LevelsPanel.verbVariables.length; i++){
            //JOptionPane.showMessageDialog(null, "noun variable are "+LevelsPanel.nounVariables[i]);
                if(temp.contains(LevelsPanel.verbVariables[i])){
                    //JOptionPane.showMessageDialog(null, "noun variable are "+LevelsPanel.nounVariables[i]);
                    hasVerb=true;
                    //JOptionPane.showMessageDialog(null, "verb is "+hasVerb);
                    break;
                }
        }

        /*if (Arrays.asList(LevelsPanel.objectVariables).contains(temp)==true){
            hasObject=true;
            JOptionPane.showMessageDialog(null, "object is "+hasObject);
        }else{
            JOptionPane.showMessageDialog(null, "object is "+hasObject);
        }
        if (Arrays.asList(LevelsPanel.verbVariables).contains(temp)==true){
            hasVerb=true;
            JOptionPane.showMessageDialog(null, "verb is "+hasVerb);
        }*/
        if(hasNoun && hasVerb && hasObject){
            BuildBuddiesMainWindow.simpleSentece=true;
            //JOptionPane.showMessageDialog(null, "SimpleSentence "+BuildBuddiesMainWindow.simpleSentece);

        }else{
            //JOptionPane.showMessageDialog(null, "SimpleSentence "+BuildBuddiesMainWindow.simpleSentece);
        }
        
        
        return super.visitSimpleSentence(ctx);
    }

    public static void resetValues() {
    hasNoun=false;
    hasVerb=false;
    hasObject=false;
    BuildBuddiesMainWindow.simpleSentece=false;
    }
}
