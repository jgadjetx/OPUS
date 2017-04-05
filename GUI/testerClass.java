package GUI;


/**
 * Write a description of class testerClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JFrame;

public class testerClass
{
   public static void main (String [] args)
   {
       RegistrationScreen gui = new RegistrationScreen();
       gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       gui.setSize(900,900);
       gui.setVisible(true);
       gui.setLocationRelativeTo(null);
   }
}
