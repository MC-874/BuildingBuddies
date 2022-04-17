import javax.swing.*;
import java.awt.*;

public class LevelsPanel extends JPanel{
        JButton checkButton = new JButton("   Check your Sentence   ");
        JButton exitButton = new JButton("        Exit Game        ");

    LevelsPanel(){
        int score;
        String[] nounVariables = {"Cat", "Dog", "Toy", "Bear", "I", "You", "They", "We", "Bird", "Mouse"};
        String[] verbVariables = {"ran", "ate", "went", "choose", "eats", "play"};
        String[] objectVariables = {"far", "food", "home", "guitar", "outside", "school"};
        
        //set panel format (BoxLayout)
        //set panel format( boxLayout)

        
        //line 1
        //create & format score jpanel

        //Create & format score jlabel

        //create format scoretotal Label
        
        //add scoreJLabel & scoretotalLabel to scoreJPanel



        //add scoreJLabel & scoretotalLabel to scoreJPanel
        
        

        //line 2
        //create titleLabel JLabel w/set Horizontal alignement = jlabel.center


        //line 3-5
        //create middlepanel, type JPanel

        //create & format nounPanel

        //for inside noun panel
        //create &format nounLabel

        //create & format nounTextfield

        //add nounLabel and nounTextfield to nounPanel


        //create userInputPanel

        //inside userInputPanel:
        //create instructionLabel

        //create userInputTextfield

        //add instructionLabel to JPanel

        //add userInputTextField to Jpanel


        //format buttons
        Font buttonFont = new Font(Font.SANS_SERIF, Font.ITALIC, 26);
        //format check your sentence buttton
        checkButton.setFont(buttonFont);
        checkButton.setForeground(Color.GREEN);
        checkButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        checkButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        checkButton.setMinimumSize(new Dimension(300,50));

        //format exitGame button
        exitButton.setFont(buttonFont);
        exitButton.setForeground(Color.red);
        exitButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.setMinimumSize(new Dimension(300,50));

        //add everything to main panel
        //add(component);

        add(checkButton);
        add(createBlankPanel(300, 20));
        add(exitButton);



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
