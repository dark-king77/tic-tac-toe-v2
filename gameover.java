//the gameover class that is invoked when game is over

class gameover extends JFrame
{
  
  JButton b=new JButton();
  
  JLabel l1=new JLabel("PLAYER A WON!");
  
  JLabel l2=new JLabel("PLAYER B WON!");
  
  int x;
  gameover(int x)
  {

    //adding program termination snippet on JFrame windowclosing
    addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
    System.exit(0);
    }
    }
    );
    
    this.x=x;
    if(x==1)
    {
      l1.setBounds(150,300,400,50);
      Font lf=new Font("verdana",Font.PLAIN,25);
      l1.setFont(lf);
      b.setBounds(200,100,100,100);
      b.setIcon(new ImageIcon("ticx1.png"));
      add(b);
      add(l1);
    }
    else if(x==2)
    {
      l2.setBounds(150,300,400,50);
      Font lf=new Font("verdana",Font.PLAIN,25);
      l2.setFont(lf);
      b.setBounds(200,100,100,100);
      b.setIcon(new ImageIcon("tico1.png"));
      add(b);
      add(l2);
    }
    else
    {
      JLabel l=new JLabel("MATCH DRAW");
      JLabel l1=new JLabel("AND");
      JLabel l2=new JLabel("RESTART THE GAME");
      l.setBounds(100,150,450,50);
      l1.setBounds(150,200,450,50);
      l2.setBounds(40,250,450,50);
      Font lf=new Font("verdana",Font.BOLD,25);
      l.setFont(lf);
      l1.setFont(lf);
      l2.setFont(lf);
      add(l);
      add(l1);
      add(l2);
    }
    setSize(500,500);
    setLayout(null);
    setVisible(true);
  }
}