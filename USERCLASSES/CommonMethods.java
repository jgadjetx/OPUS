package USERCLASSES;

import java.awt.Color;
import java.awt.Frame;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class CommonMethods 
{
	BufferedReader br;
	
	public boolean usernameExists(String username)
    {
    	boolean exists = false ;
    	
    	try
		{
			br = new BufferedReader(new FileReader("applicants.txt"));
			
			String lines = null;
			
			while((lines = br.readLine())!= null)
			{
				String [] data = lines.split(",");
				String fileUsername = data[8];
				
				if(username.equalsIgnoreCase(fileUsername))
				{
					exists = true;						
				}
											
			}
		}
		catch(Exception err)
		{
			JOptionPane.showMessageDialog(null,"applicants.txt file not found : " + err);
		}
    	
    	      	
    	return exists;
    }
	
	public static void changePosition(JFrame obj) 
	{
		obj.setSize(900,900);
		obj.setUndecorated(true);
		obj.setAlwaysOnTop(true); 
		obj.getContentPane().setBackground(Color.lightGray);
        obj.setVisible(true);
        obj.setShape(new RoundRectangle2D.Double(0, 0, 900, 900, 80, 80));
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setLocationRelativeTo(null);
        
	}
	
	public static void strokeIt(JFrame obj)
	{
		obj.setSize(350,200);
		obj.setAlwaysOnTop(true); 
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setLocationRelativeTo(null);
	}
	
	public static void ooh(JFrame obj)
	{
		obj.setSize(500,200);
		obj.setAlwaysOnTop(true); 
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setLocationRelativeTo(null);
	}

}
