import java.awt.*;
import javax.swing.*;
import java.util.Arrays;

public class LevelsPanel extends JPanel{
    	JButton checkButton = new JButton("   Check your Sentence   ");
    	JButton exitButton = new JButton("        Exit Game        ");
        BoxLayout bLayout= new BoxLayout(this, BoxLayout.Y_AXIS);
        
    LevelsPanel(){
    	int score=0;
        int level=1;
    	String[] nounVariables = {"Cat", "Dog", "Toy", "Bear", "I", "You", "They", "We", "Bird", "Mouse"};
    	String[] verbVariables = {"ran", "ate", "went", "choose", "eats", "play"};
    	String[] objectVariables = {"far", "food", "home", "guitar", "outside", "school"};
        
	//set panel format (BoxLayout)
        setLayout(bLayout);

        
        //Create & format score JPanel
        JPanel scorePanel = new JPanel();
        //scorePanel.setLayout(new BoxLayout(scorePanel , BoxLayout.Y_AXIS));
        scorePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        //Create & format score JLabel in scorePanel        
        JLabel scoreLabel = new JLabel("Score: "+score);
        scoreLabel.setFont(new Font("titleFont", Font.BOLD, 20));
        
        
        //create format scoreTotal Label 
        JLabel scoreTotalLabel = new JLabel("Level: "+level);
        scoreTotalLabel.setFont(new Font("titleFont", Font.BOLD, 20));
        
        //create titleLabel JLabel w/set Horizontal alignment = jlabel.center
        JLabel titleLabel = new JLabel("Build a simple sentence ");
        titleLabel.setFont(new Font("titleFont", Font.BOLD, 32));
        titleLabel.setAlignmentX(CENTER_ALIGNMENT);

        
        //add scoreJLabel & scoretotalLabel to scoreJPanel        
        scorePanel.add(scoreLabel);       
        //scorePanel.add(scoreTotalLabel);
        //scorePanel.add(titleLabel);
        add(scorePanel);
        add(titleLabel);
        add(scoreTotalLabel);
      
        //create middlepanel, type JPanel
        JPanel middlePanel = new JPanel(new BorderLayout());
        JPanel innerMiddlePanel = new JPanel();
        BoxLayout bLayout2= new BoxLayout(innerMiddlePanel, BoxLayout.Y_AXIS);
        innerMiddlePanel.setLayout(bLayout2);
       
        
        
        //create & format nounPanel
        JPanel nounPanel = new JPanel(new BorderLayout());
        //for inside noun panel
        nounPanel.setPreferredSize(new Dimension(400,50));
        nounPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        //nounPanel.setBackground(Color.GREEN);            
        
        //create &format nounLabel
        JLabel nounLabel = new JLabel("Nouns: ");
        nounLabel.setLayout(new BorderLayout());
        nounLabel.setFont(new Font("titleFont", Font.BOLD, 14));        //**** */
               
        //create & format nounTextfield
        //JTextField nounTextField = new JTextField();
        JTextArea nounTextField= new JTextArea();
        //add noun string array into text field
        nounTextField.setText(Arrays.toString(nounVariables)); 
        nounTextField.setFont(new Font("titleFont", Font.PLAIN +Font.ITALIC, 14));    //*** */
       
        //add nounLabel and nounTextfield to nounPanel
        nounPanel.add(nounLabel, BorderLayout.EAST);
        nounPanel.add(nounTextField, BorderLayout.WEST);
              
        innerMiddlePanel.add(nounPanel);
        
        
        // Create Verb Panel
        JPanel verbPanel = new JPanel(new  BorderLayout());
        verbPanel.setPreferredSize(new Dimension(400,50));
        verbPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        
        //create &format verbLabel
        JLabel verbLabel = new JLabel("Verbs: ");
        verbLabel.setLayout(new BorderLayout());
               
        //create & format verbTextfield
        //JTextField verbTextField = new JTextField();
        JTextArea verbTextField= new JTextArea();
        verbTextField.setText(Arrays.toString(verbVariables)); 
        //verbTextField.setText(nounVariables);
       
        //add verbLabel and verbTextfield to verbPanel
        verbPanel.add(verbLabel, BorderLayout.EAST);
        verbPanel.add(verbTextField, BorderLayout.WEST);
        
        innerMiddlePanel.add(verbPanel);
       
        //create object panel
        JPanel objectPanel = new JPanel(new BorderLayout());
        //for inside subject panel
        objectPanel.setPreferredSize(new Dimension(400,50));
        objectPanel.setLayout(new FlowLayout(FlowLayout.CENTER));             
        
        //create &format subjectLabel
        JLabel objectLabel = new JLabel("Objects: ");
        objectLabel.setLayout(new BorderLayout());
               
        //create & format objectTextfield
        //JTextField objectTextField = new JTextField();
        JTextArea objectTextField= new JTextArea();
        objectTextField.setText(Arrays.toString(objectVariables)); 
        //subjectTextField.setText(objectVariables);
       
        //add objectLabel and objectTextfield to objectPanel
        objectPanel.add(objectLabel, BorderLayout.EAST);
        objectPanel.add(objectTextField, BorderLayout.WEST);

        innerMiddlePanel.add(objectPanel);
            
       
        //middlepanel.add(verbPanel);
        middlePanel.add(innerMiddlePanel);
        middlePanel.add(createBlankPanel(40, 100),BorderLayout.EAST);
        middlePanel.add(createBlankPanel(40, 100),BorderLayout.WEST);

        
        
        //create userInputPanel************************
        JPanel outerUserPanel = new JPanel(new BorderLayout());
        //JPanel userInputPanel= new JPanel();
        JPanel userInputPanel= new JPanel(new FlowLayout(FlowLayout.LEFT));
        //userInputPanel.setLayout(new BoxLayout(userInputPanel , BoxLayout.Y_AXIS));
 
        //inside userInputPanel:
        //create instructionLabel
        JLabel instructionLabel = new JLabel("Insert your Sentence:");
        instructionLabel.setFont(new Font("titleFont", Font.BOLD, 24));
        instructionLabel.setHorizontalAlignment(JLabel.LEFT);

        //create userInputTextField
        //JTextField userInputTextField = new JTextField("Type your sentences here (using the above word bank)",20);
        //userInputTextField.setEditable(true);
        //userInputTextField.setFont(new Font(Font.SANS_SERIF, Font.ROMAN_BASELINE, 18));
        JTextArea userInputTextArea = new JTextArea(2,30);
        userInputTextArea.setEditable(true);
        userInputTextArea.setText("Type your sentences here (using the above word bank)");
        userInputTextArea.setFont(new Font(Font.SANS_SERIF, Font.ROMAN_BASELINE+Font.ITALIC, 18));

        //add instructionLabel to userInputPanel JPanel
        userInputPanel.add(instructionLabel);
        //add userInputTextArea to userInputPanel Jpanel
        userInputPanel.add(userInputTextArea);
        //userInputPanel.setPreferredSize(new Dimension(400,150));
        outerUserPanel.add(userInputPanel);
        outerUserPanel.add(createBlankPanel(40, 100),BorderLayout.EAST);
        outerUserPanel.add(createBlankPanel(40, 100),BorderLayout.WEST);
        //*********************** */


        //format buttons
        Font buttonFont = new Font(Font.SANS_SERIF, Font.ITALIC, 26);
        //format check your sentence button
        checkButton.setFont(buttonFont);
        checkButton.setForeground(Color.BLUE);
        checkButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        checkButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        checkButton.setMinimumSize(new Dimension(300,50));

        //format exitGame button
        exitButton.setFont(buttonFont);
        exitButton.setForeground(Color.RED);
        exitButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.setMinimumSize(new Dimension(300,50));

        //add everything to main panel
        //add(component); 
        add(middlePanel);
        add(outerUserPanel); //contains instructions and inputTextField
        add(checkButton);
        add(createBlankPanel(300, 20));
        add(exitButton);
        add(createBlankPanel(300, 20));



    }
    
    //create blank panels method
    JPanel createBlankPanel(int x, int y){
        JPanel blankPanel = new JPanel();
        //blankPanel.setSize(x,y);
        blankPanel.setMaximumSize(new Dimension(x, y));
        blankPanel.setPreferredSize(new Dimension(x, y));
        //blankPanel.setBackground(Color.BLACK);
        return blankPanel;
    }
}
