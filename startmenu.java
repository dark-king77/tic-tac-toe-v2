import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//import java.awt.event;

public class startmenu extends JFrame implements ActionListener
{
    private JButton startButton;
    private JButton musicButton;

    public startmenu() {
        setTitle("Game Launcher");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startButton = new JButton("Start Game");
        startButton.setBounds(800,850,250,150);
        startButton.addActionListener(this);

        musicButton = new JButton("Toggle Music");
        //musicButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(startButton);
        panel.add(musicButton);

        add(panel);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            startgame();
        }
    }

    public void startgame(){
        Gui playerA = new Gui(0);
        Gui playerB = new Gui(1);
        playerA.get_opponent(playerB);
        playerB.get_opponent(playerA);
        playerA.current_player = true;
    }
   
}
