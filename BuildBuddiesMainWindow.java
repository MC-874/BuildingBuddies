import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;



public class BuildBuddiesMainWindow extends JFrame {
    static CardLayout cLayout;
    Container panelContainer =getContentPane();
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
        String test = "Cat ate food.";

        //determine if user supplied a file for input, or if we should instead read command line input

        //String inputFile = test;

        /****writes a string into the file */
        try{
            FileOutputStream fOut = new FileOutputStream("test.txt");
            byte b[] = test.getBytes();
            fOut.write(b);
            fOut.close();
        }catch(Exception e){
            System.out.println("System.out.println(e)");
        }

        /******gets input from file */
        try{
            FileInputStream fIN = new FileInputStream("test.txt");
            ANTLRInputStream input = new ANTLRInputStream(fIn);

            fIN.close();
            
        }catch(Exception e){
            System.out.println("System.out.println(e)");
        }

        //InputStream is =inputFile;
        
        //if(args.length > 0) inputFile = args[0];
        
        //InputStream is = System.in;     //create the input stream?

        //if(inputFile != null) is = new FileInputStream(inputFile);
        

        
        //creates the input stream and inserts a text file
        //FileInputStream is = new FileInputStream("D:/Libraries/Documents/Spring 2022/CSEN 4366 Programing Languages/BuildingBuddies/test.txt")
        //FileInputStream is = new FileInputStream(test);
        //is.close(); //closes the input stream
        //create lexer, 
        SentenceGrammarLexer lexer = new SentenceGrammarLexer(input);

        //create token buffer, 
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //create parser
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.program(); // parse; start at program rule
        System.out.println(tree.toStringTree(parser)); // print tree in text form

    }

    public static void main(String[] args) {
        new BuildBuddiesMainWindow();
    }
}
