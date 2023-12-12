import java.awt.*;
import java.awt.event.*;
import java.swing.*;
import java.swing.ImageIcon;

class Simple extends JFrame
{
    private ImageIcon image;
    private JLabel label1;
  Simple()
  {
    JButton b1=new JButton();
    b1.setBounds(450,200,150,150);
    JLabel l=new JLabel("button");
    l.setBounds(500,50,150,150);
    image=new ImageIcon("E:\\iniya\\images\\ticx.png");
    label1=new JLabel(image);
    add(label1);
    add(b1);
    add(l);
    setLayout(null);
    setVisible(true);
  }
}
public class Test3 
{
    public static void main(String[]args)
    {
        new Simple();
    }
}