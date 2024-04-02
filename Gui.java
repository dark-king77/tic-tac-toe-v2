//creating a JFrame class to create a gui

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.sound.sampled.*;
import java.io.File;

public class Gui extends JFrame implements ActionListener{
    //declaring class members to keep track of the game status
    //current_player -> keep tracks the current player takig the turn (false = palyerA)(true = playerB)
    //playerA matrix of dimension 3X3 represents the boxes filled by X where (0 = x is not there)(1 = x is places in the position)
    //playerB matrix of dimension 3X3 represents the boxes filled by O where (0 = O is not there)(1 = O is places in the position)
    //bstate matrix of dimension 3X3 represents the state of each boxes(false = empty contains neither x or O)(true = filled with either x or O)
    //ximage and oimage will contain the x and O images respectively wich will be inserted in the buttons on click over them
    //label1 is used to add title "tic-tac-toe" lab1 is used text "playerA" near the x icon to clarify the role and do so lab2 is uses to display "playerB" near O
    //for the Nine cells in the game nine buttons(b1,b2,b3,b4,b5,b6,b7,b8,b9) are used and are declared as class members as they can be used out side the constructor which defines the frame properties and initializes buttons also
    //and two buttons A and B are declared to set the player role with the help of lable1 and lable2
    //move is uses to track number of moves made by both players together
    //at_nineth_move -> keeps tract that whether the player won at 9th move(at_nineth_move==false->playerA or B won)
    public boolean current_player = false;
    public int player_number;
    int player[][] = {{0,0,0},{0,0,0},{0,0,0}};
    public boolean bstate[][] = {{false,false,false},{false,false,false},{false,false,false}};
    public ImageIcon image;
    public ImageIcon ximage,oimage;
    JLabel label1,lab1,lab2;
    public JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,A,B;
    public int move;
    public boolean at_nineth_move=false;

    //opponent class object
    private Gui opponent;

    public Gui(int player){
        player_number=player;
        if(player == 0){
            image = new ImageIcon("ticx.png");
            setBounds(0,0,0,0);
        }
        else{
            image = new ImageIcon("tico.png");
            setBounds(780,0,800,2000);
        }
    //setting the JFrame properties
    setLayout(null);
    setSize(750,820);

    //defining the constructor for the class to create and display the Jframe and initialize the buttons
    //setting up the title
    JLabel l=new JLabel("Tic Tac Toe");
    l.setBounds(350,50,190,50);
    Font lf=new Font("Forte",Font.PLAIN,42);
    l.setFont(lf);
    add(l);

    //initializing the buttons and adding actio listener
    b1=new JButton();
    b1.setBounds(230,200,150,150);
    b1.addActionListener(this);
    b2=new JButton();
    b2.setBounds(380,200,150,150);
    b2.addActionListener(this);
    b3=new JButton();
    b3.setBounds(530,200,150,150);
    b3.addActionListener(this);
    b4=new JButton();
    b4.setBounds(230,350,150,150);
    b4.addActionListener(this);
    b5=new JButton();
    b5.setBounds(380,350,150,150);
    b5.addActionListener(this);
    b6=new JButton();
    b6.setBounds(530,350,150,150);
    b6.addActionListener(this);
    b7=new JButton();
    b7.setBounds(230,500,150,150);
    b7.addActionListener(this);
    b8=new JButton();
    b8.setBounds(380,500,150,150);
    b8.addActionListener(this);
    b9=new JButton();
    b9.setBounds(530,500,150,150);
    b9.addActionListener(this);

    //setting game roles
    if(player==0){
    lab1=new JLabel("A");    
    A=new JButton();
    A.setBounds(60,200,100,100);
    A.setIcon(new ImageIcon("ticx1.png"));
    lab1.setBounds(140,150,50,50);
    add(lab1);
    add(A);
    }
    else{
    lab2=new JLabel("B");    
    B=new JButton();
    B.setBounds(60,200,100,100);
    B.setIcon(new ImageIcon("tico1.png"));
    add(B);
    lab2.setBounds(140,150,50,50);
    add(lab2);
    }
    
    //initializing image objects
    ximage=new ImageIcon("ticx.png");
    oimage=new ImageIcon("tico.png");

    //adding items
    add(l);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(b7);
    add(b8);
    add(b9);

    //adding program termination snippet on JFrame windowclosing
    addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
    System.exit(0);
    }
    }
    );
    //Color lightBlue = new Color(173, 216, 230);
    setBackground(Color.PINK);
    //setVisible(true);

    //setting frame visibility
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent info){
        playClickSound();
        if(info.getSource()==b1 && bstate[0][0]==false && current_player==true){
            current_player=false;
            opponent.current_player=true;
            bstate[0][0]=true;
            opponent.bstate[0][0]=true;
            b1.setIcon(image);
            opponent.b1.setIcon(image);
            move++;
            opponent.move++;
            player[0][0] = 1;
        }
        else if(info.getSource()==b2 && bstate[0][1]==false && current_player==true){
            current_player=false;
            opponent.current_player=true;
            bstate[0][1]=true;
            opponent.bstate[0][1]=true;
            b2.setIcon(image);
            opponent.b2.setIcon(image);
            move++;
            opponent.move++;
            player[0][1] = 1;
        }
        else if(info.getSource()==b3 && bstate[0][2]==false && current_player==true){
            current_player=false;
            opponent.current_player=true;
            bstate[0][2]=true;
            opponent.bstate[0][2]=true;
            b3.setIcon(image);
            opponent.b3.setIcon(image);
            move++;
            opponent.move++;
            player[0][2] = 1;
        }
        else if(info.getSource()==b4 && bstate[1][0]==false && current_player==true){
            current_player=false;
            opponent.current_player=true;
            bstate[1][0]=true;
            opponent.bstate[1][0]=true;
            b4.setIcon(image);
            opponent.b4.setIcon(image);
            move++;
            opponent.move++;
            player[1][0] = 1;
        }
        else if(info.getSource()==b5 && bstate[1][1]==false && current_player==true){
            current_player=false;
            opponent.current_player=true;
            bstate[1][1]=true;
            opponent.bstate[1][1]=true;
            b5.setIcon(image);
            opponent.b5.setIcon(image);
            move++;
            opponent.move++;
            player[1][1] = 1;
        }
        else if(info.getSource()==b6 && bstate[1][2]==false && current_player==true){
            current_player=false;
            opponent.current_player=true;
            bstate[1][2]=true;
            opponent.bstate[1][2]=true;
            b6.setIcon(image);
            opponent.b6.setIcon(image);
            move++;
            opponent.move++;
            player[1][2] = 1;
        }
        else if(info.getSource()==b7 && bstate[2][0]==false && current_player==true){
            current_player=false;
            opponent.current_player=true;
            bstate[2][0]=true;
            opponent.bstate[2][0]=true;
            b7.setIcon(image);
            opponent.b7.setIcon(image);
            move++;
            opponent.move++;
            player[2][0] = 1;
        }
        else if(info.getSource()==b8 && bstate[2][1]==false && current_player==true){
            current_player=false;
            opponent.current_player=true;
            bstate[2][1]=true;
            opponent.bstate[2][1]=true;
            b8.setIcon(image);
            opponent.b8.setIcon(image);
            move++;
            opponent.move++;
            player[2][1] = 1;
        }
        else if(info.getSource()==b9 && bstate[2][2]==false && current_player==true){
            current_player=false;
            opponent.current_player=true;
            bstate[2][2]=true;
            opponent.bstate[2][2]=true;
            b9.setIcon(image);
            opponent.b9.setIcon(image);
            move++;
            opponent.move++;
            player[2][2] = 1;
        }
        

game_status();
}
 private void playClickSound() {
    try {
        // Load the sound file
        File soundFile = new File("button click.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);

        // Get a Clip instance
        Clip clip = AudioSystem.getClip();

        // Open the audio input stream
        clip.open(audioInputStream);

        // Start playing the clip
        clip.start();
    } catch (Exception ex) {
        System.out.println("Error playing sound: " + ex.getMessage());
    }
 }
//check game status
void game_status() {
    if(checksum(player)==true)
    {
        new gameover(player_number);
    }
    if(move == 9 && at_nineth_move==false){
      new gameover(3);
    }
}


//checksum function
public static boolean checksum(int a[][]){
    if (a[0][0]+a[1][1]+a[2][2] == 3)return true;
    else if(a[2][0]+a[1][1]+a[0][2] == 3)return true;
    for(int i = 0;i<3;i++){int sum = 0;int sum1 = 0;
        for(int j = 0;j<3;j++){
            if(a[i][j] == 1)sum++;
            if(a[j][i] == 1)sum1++;
        }if(sum == 3)return true;
        if(sum1 == 3)return true;
    }
    return false;
}

public void get_opponent(Gui opponent){
    this.opponent = opponent;
}
}
