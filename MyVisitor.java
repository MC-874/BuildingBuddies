import javax.swing.JOptionPane;

public class MyVisitor extends SentenceGrammarBaseVisitor<Object>{
    static boolean hasNoun=false;
    static boolean hasVerb=false;
    static boolean hasObject=false;
    
    @Override
    public Object visitSentences(SentenceGrammarParser.SentencesContext ctx) {
        JOptionPane.showMessageDialog(null, "Visited Senteces");
        return super.visitSentences(ctx);
    }

    @Override
    public Object visitSimpleSentence(SentenceGrammarParser.SimpleSentenceContext ctx) {

        String temp= LevelsPanel.userInputTextArea.getText();       //gets string text from user
        
        for(int i = 0; i < LevelsPanel.nounVariables.length; i++){      //compares user input to noun bank array
                if(temp.contains(LevelsPanel.nounVariables[i])){
                    hasNoun=true;
                    break;
                }
        }

        for(int i = 0; i < LevelsPanel.objectVariables.length; i++){      //compares user input to object bank array
                if(temp.contains(LevelsPanel.objectVariables[i])){
                    hasObject=true;
                    break;
                }
        }

        for(int i = 0; i < LevelsPanel.verbVariables.length; i++){      //compares user input to verb bank array
                if(temp.contains(LevelsPanel.verbVariables[i])){
                    hasVerb=true;
                    break;
                }
        }

        if(hasNoun && hasVerb && hasObject){     //if userInput has noun, verb, & an object then changes simple Sentences to true
            BuildBuddiesMainWindow.simpleSentece=true;
        }
        return super.visitSimpleSentence(ctx);
    }

    public static void resetValues() {          //resets values for MyVisitor for next run of grammar pipeline
        hasNoun=false;
        hasVerb=false;
        hasObject=false;
        BuildBuddiesMainWindow.simpleSentece=false;
    }
}
