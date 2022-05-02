import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.InputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;



public class BuildBuddiesMainWindow extends JFrame {
    static CardLayout cLayout;
    Container panelContainer =getContentPane();
    String test2;
    //class variables
    

    BuildBuddiesMainWindow(){
        setTitle("Building Buddies");
        cLayout= new CardLayout();
        setLayout(cLayout);
        setSize(600,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

        //build frame and adds components

        StartPanel startPanel = new StartPanel();
        //startPanel's button actionLister
        startPanel.startButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //method for startbutton, goes to next 
                cLayout.next(panelContainer);
            }
        });

        startPanel.exitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //method for exitButton
                dispose();
                System.exit(0);
            }
        });

        LevelsPanel levelsPanel = new LevelsPanel();
        //levelsPanels's button actionLister
        levelsPanel.checkButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //method for checkbutton
                JOptionPane.showMessageDialog(null, "Computer comparing grammar file to user input.");
                //method to check grammar
                test2 = levelsPanel.userInputTextArea.getText();
                try {
                    runGrammarCheck();
                } catch (Exception e1) {
                    // Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });

        levelsPanel.exitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //method for exitButton
                dispose();
                System.exit(0);
            }
        });
        


        //add to the frame
        panelContainer.add(startPanel, "1"); //need -?? 'panelContainer'??
        panelContainer.add(levelsPanel, "2");
        //panelContainer.add(cardPanel3, "3");

        //set card1 to visable &fram to visable
        cLayout.show(panelContainer, "1"); //show card1 when new instance is created
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void runGrammarCheck() throws Exception{
        //get input
        //String test = "Cat ate food";


        /****writes a string into the file */
        try{
            FileOutputStream fOut = new FileOutputStream("test.txt");
            byte b[] = test2.getBytes();
            fOut.write(b);
            fOut.close();
        }catch(Exception e){
            System.out.println("System.out.println(e)");
        }

        /******gets input from file */
            FileInputStream fIN = new FileInputStream("test.txt");
            //ANTLRInputStream input = new ANTLRInputStream(fIN);
            CharStream input = CharStreams.fromStream(fIN);

        
        //if(inputFile != null) is = new FileInputStream(inputFile);

        
        //create lexer, 
        SentenceGrammarLexer lexer = new SentenceGrammarLexer(input);

        //create token buffer, 
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //create parser
        SentenceGrammarParser parser = new SentenceGrammarParser(tokens);
        
        ParseTree tree = parser.sentences(); // parse; start reading at sentence rule
        
        //alternative1
        SentenceGrammarBaseListener listener= new SentenceGrammarBaseListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,tree);

        //alternative2
        //SentenceGrammarVisitor eval = new SentenceGrammarVisitor();
        //eval.visit(tree);

        //System.out.println(tree.toStringTree(parser)); // print tree in text form
        fIN.close();        //closese the input stream

    }

    public static void main(String[] args) {
        new BuildBuddiesMainWindow();
    }
}
