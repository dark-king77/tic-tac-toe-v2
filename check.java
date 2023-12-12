import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
class Simple extends JFrame implements ActionListener
{
private ImageIcon ximage,oimage;
private JLabel label1;
Simple()
{
JLabel l=new JLabel("TIC TAC TOE");
JButton b1=new JButton();
b1.setBounds(450,200,150,150);
b1.addActionListener(this);
JButton b2=new JButton();
b2.setBounds(600,200,150,150);
b2.addActionListener(this);
JButton b3=new JButton();
b3.setBounds(750,200,150,150);
b3.addActionListener(this);
JButton b4=new JButton();
b4.setBounds(450,350,150,150);
b4.addActionListener(this);
JButton b5=new JButton();
b5.setBounds(600,350,150,150);
b5.addActionListener(this);
JButton b6=new JButton();
b6.setBounds(750,350,150,150);
b6.addActionListener(this);
JButton b7=new JButton();
b7.setBounds(450,500,150,150);
b7.addActionListener(this);
JButton b8=new JButton();
b8.setBounds(600,500,150,150);
b8.addActionListener(this);
JButton b9=new JButton();
b9.setBounds(750,500,150,150);
b9.addActionListener(this);

//PLAYERS A AND B
JButton A=new JButton();
A.setBounds(200,200,100,100);
A.setIcon(new ImageIcon("E:\\iniya\\images\\ticx1.png"));
add(A);
JButton B=new JButton();
B.setBounds(200,400,100,100);
B.setIcon(new ImageIcon("E:\\iniya\\images\\tico1.png"));
add(B);
JLabel lab1=new JLabel("A");
JLabel lab2=new JLabel("B");
lab1.setBounds(240,150,50,50);
lab2.setBounds(240,350,50,50);
add(lab1);
add(lab2);
//INSERTING IMAGE
ximage=new ImageIcon("E:\\iniya\\images\\ticx.png");
oimage=new ImageIcon("E:\\iniya\\images\\tico.png");
label1=new JLabel(ximage);
label1.setBounds(480,230,150,150);
add(label1);
l.setBounds(600,50,190,50);
Font lf=new Font("Verdana",Font.PLAIN,28);
l.setFont(lf);
lab1.setFont(lf);
lab2.setFont(lf);
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
setLayout(null);
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
}
});
setSize(2000,2000);
setVisible(true);
}
     //ACTIONLISTENER METHOD
    public void actionPerformed(ActionEvent e)
    {

    }

}
class Test2
{
public static void main(String[]args)
{
 new Simple();
}
}

