import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;

class Simple extends JFrame
{
  
  JButton b=new JButton();
  
  JLabel l1=new JLabel("PLAYER A WON!");
  
  JLabel l2=new JLabel("PLAYER B WON!");
  
  private ImageIcon img;
  int x;
  Simple(int x)
  {
    this.x=x;
    if(x==1)
    {
      l1.setBounds(150,300,400,50);
      Font lf=new Font("verdana",Font.PLAIN,25);
      l1.setFont(lf);
      b.setBounds(200,100,100,100);
      b.setIcon(new ImageIcon("E:\\iniya\\images\\ticx1.png"));
      add(b);
      add(l1);
    }
    else if(x==2)
    {
      l2.setBounds(150,300,400,50);
      Font lf=new Font("verdana",Font.PLAIN,25);
      l2.setFont(lf);
      b.setBounds(200,100,100,100);
      b.setIcon(new ImageIcon("E:\\iniya\\images\\tico1.png"));
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
class Test3
{
  public static void main(String[]args)
  {
    int x;
   // Simple s1=new Simple(1);
    //Simple s2=new Simple(2);
    Simple s3=new Simple(3);
  }
}