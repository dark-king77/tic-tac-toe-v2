/*  *this code is written by whiteking24 and dark-king77
    *worked for 15 hours roughly
*/

//importing the required libraries
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;

//the main class that invoks the game arena.
public class tic_tac_toe
{
public static void main(String[]args)
{
 Gui playerA = new Gui(0);
 Gui playerB = new Gui(1);
 playerA.get_opponent(playerB);
 playerB.get_opponent(playerA);
}
}

