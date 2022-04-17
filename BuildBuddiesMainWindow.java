import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


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
        //startPanel's button actionLister
        


        //add to the frame
        panelContainer.add(startPanel, "1"); //need -?? 'panelContainer'??
        panelContainer.add(levelsPanel, "2");
        //panelContainer.add(cardPanel3, "3");

        //set card1 to visable &fram to visable
        cLayout.show(panelContainer, "1"); //show card1 when new instance is created
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BuildBuddiesMainWindow();
    }
}
