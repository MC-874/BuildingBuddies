import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;



public class BuildBuddiesMainWindow extends JFrame {
    //class variables
    static CardLayout cLayout;
    Container panelContainer =getContentPane();
    String test2;
    static Boolean simpleSentece=false;
    
    

    BuildBuddiesMainWindow(){
        //build frame and adds components
        setTitle("Building Buddies");
        cLayout= new CardLayout();
        setLayout(cLayout);
        setSize(600,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create cardPanels and their action listeners and adds to CardLayout
        StartPanel startPanel = new StartPanel();
        startPanel.startButton.addActionListener(new ActionListener(){  //startPanel's button actionLister
            public void actionPerformed(ActionEvent e){
                //method for startButton, goes to next 
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
        levelsPanel.checkButton.addActionListener(new ActionListener(){        //levelsPanels's button actionLister
            public void actionPerformed(ActionEvent e){
                //method for checkButton to check grammar and return outcome to user        
                test2 = LevelsPanel.userInputTextArea.getText();    //gets user input
                try {         
                    runGrammarCheck();                        //runs grammar check
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                if (simpleSentece==true){                   //returns results of grammar to user
                    JOptionPane.showMessageDialog(null, "Great Job!  You have successfully Built a Sentence!");
                    levelsPanel.increaseLevels();
                }else if(simpleSentece==false){
                    JOptionPane.showMessageDialog(null, "Not a Sentence.  Please try again!");
                }
                MyVisitor.resetValues();    //resets values for next input for user
            }
        });

        levelsPanel.exitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //method for exitButton, dispose frame & exits system
                dispose();
                System.exit(0);
            }
        });
        
        //add panels to the frame's panel container
        panelContainer.add(startPanel, "1"); //need -?? 'panelContainer'??
        panelContainer.add(levelsPanel, "2");

        //set card1 to visible & frame to visible
        cLayout.show(panelContainer, "1"); //show card1 when new instance is created
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }//end of constructor

        void runGrammarCheck() throws Exception{

        /**** uses input to write a string into the test.txt file */
        try{
            FileOutputStream fOut = new FileOutputStream("test.txt");
            byte b[] = test2.getBytes();
            fOut.write(b);
            fOut.close();
        }catch(Exception e){
            System.out.println("System.out.println(e)");
        }

        /******gets input from file  and inserts it into antlr pipeline**/
        FileInputStream fIN = new FileInputStream("test.txt");
        CharStream input = CharStreams.fromStream(fIN);

        //create lexer,  from input stream
        SentenceGrammarLexer lexer = new SentenceGrammarLexer(input);

        //create token buffer,  from lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //create parser, from tokenStream
        SentenceGrammarParser parser = new SentenceGrammarParser(tokens);
        
        ParseTree tree = parser.simpleSentence(); // parse; start reading at sentence rule
        
        //alternative1
        //MyListener listener= new MyListener();
        //ParseTreeWalker walker = new ParseTreeWalker();
        //walker.walk(listener,tree);         //show exiting and entering the rule

        //alternative1.2
        //MyListener listener= new MyListener();
        //parser.addParseListener(listener);
        //parser.sentences().exitRule(listener);

        //alternative2
        MyVisitor eval = new MyVisitor();
        eval.visit(tree);

        //alternative3
        //System.out.println(tree.toStringTree(parser)); // print tree in text form
        JOptionPane.showMessageDialog(null, tree.toStringTree(parser),"Parse Tree: ", JOptionPane.INFORMATION_MESSAGE);
        fIN.close();        //closes the input stream

    }

    public static void main(String[] args) {
        new BuildBuddiesMainWindow();
    }
}
