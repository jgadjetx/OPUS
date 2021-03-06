package GUI;

/**
 * Write a description of class LoginAs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import USERCLASSES.CommonMethods;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Container;

public class LoginAs extends JFrame
{
    private JPanel mainPanel,imagePanel,buttonPanel;
    private JButton btnLogin,btnRegister,btnViewVac,btnExit;
    private Container pane;
    
    
    
    public LoginAs()
    {
        super("Home Screen");
                      
        //adding the logo image
        ImageIcon imageLogo = new ImageIcon("Resources//logo1.png");
        JLabel labelImage = new JLabel("",imageLogo,JLabel.CENTER);
        labelImage.setSize(500,400);
        labelImage.setLocation(200,80);
        
        //Adding the buttons
        btnLogin = new JButton("Login");
        btnLogin.setSize(250,30);
        btnLogin.addActionListener(new ButtonHandler());
        btnLogin.setLocation(320,500);
        
        btnRegister = new JButton("Register");
        btnRegister.setSize(250,30);
        btnRegister.addActionListener(new ButtonHandler());
        btnRegister.setLocation(320,550);
        
        btnViewVac = new JButton("View Vacancies");
        btnViewVac.setSize(250,30);
        btnViewVac.addActionListener(new ButtonHandler());
        btnViewVac.setLocation(320,600);
        
        btnExit = new JButton("Exit");
        btnExit.setSize(250,30);
        btnExit.setLocation(320,670);
        btnExit.addActionListener(new ButtonHandler());
        
        //Creation of panels
        pane = getContentPane();
        pane.setLayout(null);
        pane.add(labelImage);
        pane.add(btnLogin);
        pane.add(btnRegister);
        pane.add(btnViewVac);      
        pane.add(btnExit);
    }
    
     public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnLogin)
            {
            	dispose();
            	AdminOrApplicant as = new AdminOrApplicant();
            	CommonMethods.changePosition(as);
            }
            else if(e.getSource() == btnRegister)
            {
            	//Check if jobs are there
            	
            	try
            	{
            		BufferedReader  br1 = new BufferedReader(new FileReader("vacancies.txt"));
            		
            		String line = null;
            		
            		if((line = br1.readLine())!= null)
            		{
            			dispose();
            			RegistrationScreen reg = new RegistrationScreen();
                		CommonMethods.changePosition(reg);
            			
            		}
            		else
            		{
            			Dialog die = new Dialog("There are no jobs at the moment");
               	   		CommonMethods.strokeIt(die);
            		}
            		
            		br1.close();
            		
            	}
            	catch(Exception err)
            	{
            		Dialog die = new Dialog("Error occured, please contact admin");
           	   		CommonMethods.strokeIt(die);
            	}
            	
            	
            	
            	
            	
            }
            else if(e.getSource() == btnViewVac)
            {
            	
            	
            	try
            	{
            		BufferedReader br = new BufferedReader(new FileReader("vacancies.txt"));
            		
            		String line = null;
            		
            		if((line = br.readLine())!= null)
            		{
            			dispose();
                    	ViewVacancies vac = new ViewVacancies();
                    	CommonMethods.changePosition(vac);
            			
            		}
            		else
            		{
            			Dialog die = new Dialog("There are no jobs at the moment");
               	   		CommonMethods.strokeIt(die);
            		}
            		
            		br.close();
            	}
            	catch(Exception err)
            	{
            		Dialog die = new Dialog("Error occured, please contact admin " + err);
            		System.out.println(err);
           	   		CommonMethods.strokeIt(die);
            	}
            	
            }
            else if(e.getSource() == btnExit)
            {
            	System.exit(0);
            }
        }
    }
}
