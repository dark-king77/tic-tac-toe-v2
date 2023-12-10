import java.awt.event.*;
import java.awt.*;
class Simple 
{
    Frame f;
    Simple()
    {
        Frame f=new Frame();
        Label l=new Label("tic tac toe");
        Button b1=new Button();
        b1.setBounds(400,200,150,150);
        Button b2=new Button();
        b2.setBounds(600,200,150,150);
        Button b3=new Button();
        b3.setBounds(800,200,150,150);
        Button b4=new Button();
        b4.setBounds(400,400,150,150);
        Button b5=new Button();
        b5.setBounds(600,400,150,150);
        Button b6=new Button();
        b6.setBounds(800,400,150,150);
        Button b7=new Button();
        b7.setBounds(400,600,150,150);
        Button b8=new Button();
        b8.setBounds(600,600,150,150);
        Button b9=new Button();
        b9.setBounds(800,600,150,150);
        l.setBounds(600,50,150,50);
        Font lf=new Font("Verdana",Font.BOLD,32);
        l.setFont(lf);
        f.add(l);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.setLayout(null);
        f.setVisible(true);
    }
}
public class trial
{
    public static void main(String[]args)
    {
        new Simple();
    }
}