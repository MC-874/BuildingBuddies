import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class LevelsPanel extends JPanel{
    	JButton checkButton = new JButton("   Check your Sentence   ");
    	JButton exitButton = new JButton("        Exit Game        ");
        BoxLayout bLayout= new BoxLayout(this, BoxLayout.Y_AXIS);
        static JTextArea userInputTextArea = new JTextArea(2,30);
        static String[] nounVariables = {"Cat", "Dog", "Toy", "Bear", "I", "You", "They", "We", "Bird", "Mouse"};
    	static String[] verbVariables = {"ran", "ate", "went", "choose", "eats", "play"};
    	static String[] objectVariables = {"far", "food", "home", "guitar", "outside", "school"};
        JLabel scoreLabel;
        JLabel scoreTotalLabel;
        int score;
        int level;

        
    LevelsPanel(){
    	score=0;
        level=1;
        
	    //set panel format (BoxLayout)
        setLayout(bLayout);

        //Create & format score JPanel
        JPanel scorePanel = new JPanel();
        scorePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        //Create & format score JLabel in scorePanel        
        scoreLabel = new JLabel("Score: "+score);
        scoreLabel.setFont(new Font("subtitleFont", Font.BOLD, 20));
        
        
        //create format scoreTotal Label 
        scoreTotalLabel = new JLabel("Level: "+level);
        scoreTotalLabel.setFont(new Font("subtitleFont", Font.BOLD, 20));
        
        //create titleLabel JLabel w/set Horizontal alignment 
        JLabel titleLabel = new JLabel("Build A Simple Sentence ");
        titleLabel.setFont(new Font("titleFont", Font.BOLD, 32));
        titleLabel.setAlignmentX(CENTER_ALIGNMENT);

        //add scoreJLabel to scoreJPanel        
        scorePanel.add(scoreLabel);       
        scorePanel.add(createBlankPanel(20, 20));

      
        //create middlepanel, type JPanel
        JPanel middlePanel = new JPanel(new BorderLayout());
        JPanel innerMiddlePanel = new JPanel();
        BoxLayout bLayout2= new BoxLayout(innerMiddlePanel, BoxLayout.Y_AXIS);
        innerMiddlePanel.setLayout(bLayout2);
       
        
        
        //create & format nounPanel
        JPanel nounPanel = new JPanel(new BorderLayout());
        //format inside noun panel
        nounPanel.setPreferredSize(new Dimension(400,50));
        nounPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        nounPanel.setAlignmentY(CENTER_ALIGNMENT);
            
        
        //create &format nounLabel
        JLabel nounLabel = new JLabel("Nouns: ");
        nounLabel.setLayout(new BorderLayout());
        nounLabel.setFont(new Font("middleFont", Font.BOLD, 20));        //**** */
        nounLabel.setVerticalAlignment(JLabel.CENTER);
               
        //create & format nounTextArea
        JTextArea nounTextArea= new JTextArea(2,5);
        //add noun string array into text field
        nounTextArea.setText(Arrays.toString(nounVariables)); 
        nounTextArea.setFont(new Font("subtMiddleFont", Font.PLAIN +Font.ITALIC, 20));    //*** */
        nounTextArea.setPreferredSize(new Dimension(350,60));
        nounTextArea.setLineWrap(true);
        nounTextArea.setWrapStyleWord(true);
        nounTextArea.setEditable(false);
       
        //add nounLabel and nounTextArea to nounPanel
        nounPanel.add(nounLabel, BorderLayout.EAST);
        nounPanel.add(nounTextArea, BorderLayout.WEST);
              
        innerMiddlePanel.add(createBlankPanel(30,20));
        innerMiddlePanel.add(nounPanel);
        
        
        // Create Verb Panel
        JPanel verbPanel = new JPanel(new  BorderLayout());
        verbPanel.setPreferredSize(new Dimension(400,50));
        verbPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        verbPanel.setAlignmentY(CENTER_ALIGNMENT);
        
        
        //create &format verbLabel
        JLabel verbLabel = new JLabel("Verbs: ");
        verbLabel.setLayout(new BorderLayout());
        verbLabel.setFont(new Font("middleFont", Font.BOLD, 20));        //**** */
        verbLabel.setVerticalAlignment(JLabel.CENTER);
               
        //create & format verbTextfield
        //JTextField verbTextField = new JTextField();
        JTextArea verbTextField= new JTextArea();
        verbTextField.setText(Arrays.toString(verbVariables));
        verbTextField.setFont(new Font("subtMiddleFont", Font.PLAIN +Font.ITALIC, 20));    //*** */ 
        verbTextField.setPreferredSize(new Dimension(350,60));
        verbTextField.setLineWrap(true);
        verbTextField.setWrapStyleWord(true);
        verbTextField.setEditable(false);
       
        //add verbLabel and verbTextfield to verbPanel
        verbPanel.add(verbLabel, BorderLayout.EAST);
        verbPanel.add(verbTextField, BorderLayout.WEST);
        
        innerMiddlePanel.add(verbPanel);
       
        //create object panel
        JPanel objectPanel = new JPanel(new BorderLayout());
        //for inside subject panel
        objectPanel.setPreferredSize(new Dimension(400,50));
        objectPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        objectPanel.setAlignmentY(CENTER_ALIGNMENT);             
        
        //create &format subjectLabel
        JLabel objectLabel = new JLabel("Objects: ");
        objectLabel.setLayout(new BorderLayout());
        objectLabel.setFont(new Font("middleFont", Font.BOLD, 20));        //**** */
        objectLabel.setVerticalAlignment(JLabel.CENTER);
               
        //create & format objectTextfield
    
        JTextArea objectTextField= new JTextArea();
        objectTextField.setText(Arrays.toString(objectVariables));
        objectTextField.setFont(new Font("subtMiddleFont", Font.PLAIN +Font.ITALIC, 20));    //*** */
        objectTextField.setPreferredSize(new Dimension(350,60));
        objectTextField.setLineWrap(true);
        objectTextField.setWrapStyleWord(true);
        objectTextField.setEditable(false); 
       
        //add objectLabel and objectTextfield to objectPanel
        objectPanel.add(objectLabel, BorderLayout.EAST);
        objectPanel.add(objectTextField, BorderLayout.WEST);

        innerMiddlePanel.add(objectPanel);                  //add objectPanel to innerMiddlePanel
        innerMiddlePanel.add(createBlankPanel(30,20));
        
        middlePanel.add(innerMiddlePanel);                  //add innerMiddlePanel and space to middlePanel
        middlePanel.add(createBlankPanel(40, 100),BorderLayout.EAST);
        middlePanel.add(createBlankPanel(40, 100),BorderLayout.WEST);

        
        
        //create userInputPanel************************
        JPanel outerUserPanel = new JPanel(new BorderLayout());
        JPanel userInputPanel= new JPanel(new FlowLayout(FlowLayout.LEFT));

        //inside userInputPanel:
        //create instructionLabel
        JLabel instructionLabel = new JLabel("Insert your Sentence:");
        instructionLabel.setFont(new Font("titleFont", Font.BOLD, 24));
        instructionLabel.setHorizontalAlignment(JLabel.LEFT);

        //create userInputTextField
        userInputTextArea.setEditable(true);
        userInputTextArea.setText("Type your sentences here (using the above word banks)");
        userInputTextArea.setFont(new Font(Font.SANS_SERIF, Font.ROMAN_BASELINE+Font.ITALIC, 18));
        userInputTextArea.addFocusListener(new FocusListener(){
            public void focusGained(FocusEvent e) {
                //method for when focus is gained; 
                userInputTextArea.setText("");
             } 
            public void focusLost(FocusEvent e) { 
                //method for when focus is lost; 
            } 
        });

 
        userInputPanel.add(instructionLabel);               //add instructionLabel to userInputPanel JPanel
        userInputPanel.add(userInputTextArea);              //add userInputTextArea to userInputPanel Jpanel
        outerUserPanel.add(userInputPanel);
        outerUserPanel.add(createBlankPanel(40, 100),BorderLayout.EAST);
        outerUserPanel.add(createBlankPanel(40, 100),BorderLayout.WEST);
        //*********************** */


        //format buttons
        Font buttonFont = new Font(Font.SANS_SERIF, Font.ITALIC, 26);

        checkButton.setFont(buttonFont);               //format check your sentence button
        checkButton.setForeground(Color.BLUE);
        checkButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        checkButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        checkButton.setMinimumSize(new Dimension(300,50));
        
        exitButton.setFont(buttonFont);                 //format check your sentence button
        exitButton.setForeground(Color.RED);
        exitButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.setMinimumSize(new Dimension(300,50));

        //add everything to main panel      
        //add Top panels to main LevelPanel
        add(scorePanel);
        add(titleLabel);
        add(scoreTotalLabel);

        //add middle and bottom panels to main LevelPanel
        add(middlePanel);
        add(outerUserPanel); //contains instructions and inputTextField
        add(checkButton);
        add(createBlankPanel(300, 20));
        add(exitButton);
        add(createBlankPanel(300, 20));
    }   //end of constructor for Levels Panel
    
    //create blank panels method
    JPanel createBlankPanel(int x, int y){
        JPanel blankPanel = new JPanel();
        //blankPanel.setSize(x,y);
        blankPanel.setMaximumSize(new Dimension(x, y));
        blankPanel.setPreferredSize(new Dimension(x, y));
        //blankPanel.setBackground(Color.BLACK);
        return blankPanel;
    }

    void increaseLevels(){      //method to increase score, and level(levels upgrade every 5 pts)
        score+=1;
        scoreLabel.setText("Score: "+score);
        if (score % 5==0){
            level=level+1;
            scoreTotalLabel.setText("Level: "+level);
            JOptionPane.showMessageDialog(null, "Great Job!  You have successfully made it to Level "+level+"!");
        }
    }
}
