import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.*;
import java.io.*;

//import java.awt.event;

public class startmenu 
{
    private Button startButton;
    //private Button musicButton;
    private Frame frame;

    public startmenu() 
    {
        frame=new Frame("home");
        frame.setTitle("Game Launcher");
        frame.setSize(900, 900);
        frame.setLayout(null);
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
        Color lavender = new Color(230, 200, 250);
        frame.setBackground(lavender);
        frame.setVisible(true);

        playBackgroundMusic("bg music.wav");
    }

    public void startgame(){
        Gui playerA = new Gui(0);
        Gui playerB = new Gui(1);
        playerA.get_opponent(playerB);
        playerB.get_opponent(playerA);
        playerA.current_player = true;

    }
   private void playBackgroundMusic(String filePath) {
    try {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Error: Audio file not found at path: " + filePath);
            return;
        }
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        System.out.println("Background music started.");
    } catch (UnsupportedAudioFileException e) {
        System.out.println("Error: Unsupported audio file format.");
        e.printStackTrace();
    } catch (IOException e) {
        System.out.println("Error: I/O error while playing audio.");
        e.printStackTrace();
    } catch (LineUnavailableException e) {
        System.out.println("Error: Line unavailable for audio playback.");
        e.printStackTrace();
    } catch (Exception e) {
        System.out.println("Error: Unexpected exception while playing audio.");
        e.printStackTrace();
    }
    }
}
