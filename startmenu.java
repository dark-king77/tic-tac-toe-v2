import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//import java.awt.event;

public class startmenu 
{
    private Button startButton;
    //private Button musicButton;
    private Frame frame;

    public startmenu() {
        frame=new Frame("home");
        frame.setTitle("Game Launcher");
        frame.setSize(900, 900);
        frame.setLayout(null);
        frame.setBackground(Color.BLUE);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startButton = new Button("Start Game");
        startButton.setBounds(400,450,150,50);
        //startButton.addActionListener(this);

       // musicButton = new JButton("Toggle Music");
        //musicButton.addActionListener(this);

        
        frame.add(startButton);
        //frame.add(musicButton);
        startButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                startgame();
            }
        });
        frame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                frame.dispose();
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }

    public void startgame(){
        Gui playerA = new Gui(0);
        Gui playerB = new Gui(1);
        playerA.get_opponent(playerB);
        playerB.get_opponent(playerA);
        playerA.current_player = true;
    }
   
}
