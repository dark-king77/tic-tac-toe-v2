import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
class Simple extends JFrame
{
private ImageIcon image;
private JLabel label1;
Simple()
{
Label l=new Label("TIC TAC TOE");
JButton b1=new JButton();
b1.setBounds(450,200,150,150);
JButton b2=new JButton();
b2.setBounds(600,200,150,150);
JButton b3=new JButton();
b3.setBounds(750,200,150,150);
JButton b4=new JButton();
b4.setBounds(450,350,150,150);
JButton b5=new JButton();
b5.setBounds(600,350,150,150);
JButton b6=new JButton();
b6.setBounds(750,350,150,150);
JButton b7=new JButton();
b7.setBounds(450,500,150,150);
JButton b8=new JButton();
b8.setBounds(600,500,150,150);
JButton b9=new JButton();
b9.setBounds(750,500,150,150);
image=new ImageIcon("E:\\iniya\\images\\ticx.png");
//label1=new JLabel(image);
//label1.setBounds(750,500,150,150);
//add(label1);
b1.setIcon(image);
l.setBounds(600,50,150,50);
Font lf=new Font("Verdana",Font.BOLD,32);
l.setFont(lf);
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
}
class Test2
{


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

public static void main(String[]args)
{
 new Simple();
}
}

