//importing the required libraries
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
//creating a JFrame class to create a gui
class Simple extends JFrame implements ActionListener{ 
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
    boolean current_player = false;
    int playerA[][] = {{0,0,0},{0,0,0},{0,0,0}};
    int playerB[][] = {{0,0,0},{0,0,0},{0,0,0}};
    private boolean bstate[][] = {{false,false,false},{false,false,false},{false,false,false}};
    private ImageIcon ximage,oimage;
    JLabel label1,lab1,lab2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,A,B;
    int move;

    Simple(){
    //setting the JFrame properties
    setLayout(null);
    setSize(2000,2000);

    //defining the constructor for the class to create and display the Jframe and initialize the buttons
    //setting up the title
    JLabel l=new JLabel("TIC TAC TOE");
    l.setBounds(600,50,190,50);
    Font lf=new Font("Verdana",Font.PLAIN,28);
    l.setFont(lf);
    add(l);

    //initializing the buttons and adding actio listener
    b1=new JButton();
    b1.setBounds(450,200,150,150);
    b1.addActionListener(this);
    b2=new JButton();
    b2.setBounds(600,200,150,150);
    b2.addActionListener(this);
    b3=new JButton();
    b3.setBounds(750,200,150,150);
    b3.addActionListener(this);
    b4=new JButton();
    b4.setBounds(450,350,150,150);
    b4.addActionListener(this);
    b5=new JButton();
    b5.setBounds(600,350,150,150);
    b5.addActionListener(this);
    b6=new JButton();
    b6.setBounds(750,350,150,150);
    b6.addActionListener(this);
    b7=new JButton();
    b7.setBounds(450,500,150,150);
    b7.addActionListener(this);
    b8=new JButton();
    b8.setBounds(600,500,150,150);
    b8.addActionListener(this);
    b9=new JButton();
    b9.setBounds(750,500,150,150);
    b9.addActionListener(this);

    //setting game roles
    A=new JButton();
    A.setBounds(200,200,100,100);
    A.setIcon(new ImageIcon("ticx1.png"));
    add(A);
    B=new JButton();
    B.setBounds(200,400,100,100);
    B.setIcon(new ImageIcon("tico1.png"));
    add(B);
    lab1=new JLabel("A");
    lab2=new JLabel("B");
    lab1.setBounds(240,150,50,50);
    lab2.setBounds(240,350,50,50);
    add(lab1);
    add(lab2);

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

    //setting frame visibility
    setVisible(true);
    }
    //adding actionPerformed function to implement game logic
    public void actionPerformed(ActionEvent info){System.out.println("hello");}

}


class tic_tac_toe
{
public static void main(String[]args)
{
 new Simple();
}
}