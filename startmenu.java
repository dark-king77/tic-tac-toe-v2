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
    //private TextField text;
    //private Label name;

    public startmenu() 
    {
        frame=new Frame("home");
        frame.setTitle("Game Launcher");
        frame.setSize(1600, 900);
        frame.setLayout(null);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startButton = new Button("START");
        startButton.setBounds(700,380,200,100);
        /*text = new TextField();
        text.setBounds(310,350,300,40);
        text.setFont(new Font("Arial", Font.PLAIN, 24));
        name=new Label("Enter your name: ");
        name.setBounds(310,300,300,40);
        name.setFont(new Font("Kristen ITC",Font.BOLD,18));*/
        startButton.setFont(new Font("Arial Black",Font.BOLD,28));

       // musicButton = new JButton("Toggle Music");
        //musicButton.addActionListener(this);

        
        frame.add(startButton);
       /* frame.add(text);
        frame.add(name); */
        startButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                startgame();
                frame.dispose();
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
       // Color lavender = new Color(230, 200, 250);
       
        frame.setBackground(Color.CYAN);
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
