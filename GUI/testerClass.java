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
       //System.out.println("\f");
	   EmployApplicant gui = new EmployApplicant();
       gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       gui.setSize(900,900);
       gui.setVisible(true);
       gui.setResizable(false);
       gui.setLocationRelativeTo(null);
   }
}
