package GUI;


/**
 * Write a description of class START here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JFrame;

public class START
{

    public static void main(String [] args)
    {
        OpeningScreen gui = new OpeningScreen();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        gui.setVisible(true);
    }
      
}
