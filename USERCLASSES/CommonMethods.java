package USERCLASSES;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

import javax.swing.JFrame;



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
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        
	}

}
