import javax.swing.*;
import java.awt.*;

public class StartPanel extends JPanel {
    JButton startButton = new JButton("        Start Game        ");
    JButton exitButton = new JButton("     Exit Game     ");
    Container startContainer=this.getRootPane();
    BoxLayout bLayout=new BoxLayout(this, BoxLayout.Y_AXIS);

    StartPanel(){
        //create start panel
        setLayout(bLayout);  //format card panel

        //create and format title label
        JPanel titlePanel = new JPanel();
        BoxLayout titleLayout =new BoxLayout(titlePanel, BoxLayout.Y_AXIS);
        titlePanel.setLayout(titleLayout);

        JLabel titleLabel1 = new JLabel("Welcome to ");
        JLabel titleLabel2 = new JLabel("Building Buddies!");
        titleLabel2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 36));
        titleLabel1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 36));
        titleLabel1.setForeground(Color.BLUE);
        titleLabel2.setForeground(Color.BLUE);
        titlePanel.add(titleLabel1);
        titlePanel.add(titleLabel2);
        titlePanel.setPreferredSize(new Dimension(500,150));
        titlePanel.setMaximumSize(new Dimension(500,150));
        titlePanel.setBackground(Color.CYAN);

        //format buttons
        Font buttonFont = new Font(Font.SANS_SERIF, Font.ITALIC, 26);
        startButton.setFont(buttonFont);
        startButton.setBackground(Color.GREEN);
        startButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton.setMinimumSize(new Dimension(300,75));

        exitButton.setFont(buttonFont);
        exitButton.setBackground(Color.red);
        exitButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.setMinimumSize(new Dimension(300,75));


        //adding components to startPanel
        add(createBlankPanel(300, 75));
        add(titlePanel);
        add(createBlankPanel(300, 100));
        add(startButton);
        add(createBlankPanel(300, 50));
        add(exitButton);
        add(createBlankPanel(300, 150));
        

    }

    JPanel createBlankPanel(int x, int y){
        JPanel blankPanel = new JPanel();
        //blankPanel.setSize(x,y);
        blankPanel.setMaximumSize(new Dimension(x, y));
        blankPanel.setPreferredSize(new Dimension(x, y));
        //blankPanel.setBackground(Color.BLACK);
        return blankPanel;
    }
}
