//creating a JFrame class to create a gui
class Gui extends JFrame implements ActionListener{ 
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
    boolean current_player = false;
    int playerA[][] = {{0,0,0},{0,0,0},{0,0,0}};
    int playerB[][] = {{0,0,0},{0,0,0},{0,0,0}};
    private boolean bstate[][] = {{false,false,false},{false,false,false},{false,false,false}};
    private ImageIcon ximage,oimage;
    JLabel label1,lab1,lab2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,A,B;
    int move;
    boolean at_nineth_move=false;

    Gui(){
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
    //checking for button equality and player state to update game interface
    public void actionPerformed(ActionEvent info){
if(info.getSource() == b1 && bstate[0][0] == false){
    bstate[0][0] = true;
    if(current_player == false){
        current_player = true;
        b1.setIcon(ximage);
        playerA[0][0] = 1;
        move++;
    }
    else{
        current_player = false;
        b1.setIcon(oimage);
        playerB[0][0] = 1;
        move++;
    }
}
else if(info.getSource() == b2 && bstate[0][1] == false){
    bstate[0][1] = true;
    if(current_player == false){
        current_player = true;
        b2.setIcon(ximage);
        playerA[0][1] = 1;
        move++;
    }
    else{
        current_player = false;
        b2.setIcon(oimage);
        playerB[0][1] = 1;
        move++;
    }
}
else if(info.getSource() == b3 && bstate[0][2] == false){
    bstate[0][2] = true;
    if(current_player == false){
        current_player = true;
        b3.setIcon(ximage);
        playerA[0][2] = 1;
        move++;
    }
    else{
        current_player = false;
        b3.setIcon(oimage);
        playerB[0][2] = 1;
        move++;
    }
}
else if(info.getSource() == b4 && bstate[1][0] == false){
    bstate[1][0] = true;
    if(current_player == false){
        current_player = true;
        b4.setIcon(ximage);
        playerA[1][0] = 1;
        move++;
    }
    else{
        current_player = false;
        b4.setIcon(oimage);
        playerB[1][0] = 1;
        move++;
    }
}
else if(info.getSource() == b5 && bstate[1][1] == false){
    bstate[1][1] = true;
    if(current_player == false){
        current_player = true;
        b5.setIcon(ximage);
        playerA[1][1] = 1;
        move++;
    }
    else{
        current_player = false;
        b5.setIcon(oimage);
        playerB[1][1] = 1;
        move++;
    }
}
else if(info.getSource() == b6 && bstate[1][2] == false){
    bstate[1][2] = true;
    if(current_player == false){
        current_player = true;
        b6.setIcon(ximage);
        playerA[1][2] = 1;
        move++;
    }
    else{
        current_player = false;
        b6.setIcon(oimage);
        playerB[1][2] = 1;
        move++;
    }
}
else if(info.getSource() == b7 && bstate[2][0] == false){
    bstate[2][0] = true;
    if(current_player == false){
        current_player = true;
        b7.setIcon(ximage);
        playerA[2][0] = 1;
        move++;
    }
    else{
        current_player = false;
        b7.setIcon(oimage);
        playerB[2][0] = 1;
        move++;
    }
}
else if(info.getSource() == b8 && bstate[2][1] == false){
    bstate[2][1] = true;
    if(current_player == false){
        current_player = true;
        b8.setIcon(ximage);
        playerA[2][1] = 1;
        move++;
    }
    else{
        current_player = false;
        b8.setIcon(oimage);
        playerB[2][1] = 1;
        move++;
    }
}
else if(info.getSource() == b9 && bstate[2][2] == false){
    bstate[2][2] = true;
    if(current_player == false){
        current_player = true;
        b9.setIcon(ximage);
        playerA[2][2] = 1;
        move++;
    }
    else{
        current_player = false;
        b9.setIcon(oimage);
        playerB[2][2] = 1;
        move++;
    }
}
game_status();
}

//check game status
void game_status(){
    if(current_player == true){
        if(checksum(playerA) == true){
          at_nineth_move=true;
          new gameover(1);
        }
    }
    else{
        if(checksum(playerB) == true){
        at_nineth_move=true;
        new gameover(2);
        }
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
}