package GUI;


/**
 * Write a description of class AdminLogin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import USERCLASSES.CommonMethods;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Font;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame
{
    private JButton btnCreate,btnApplicant,btnEmployees,btnBack;
    private Container pane;
    
    public AdminLogin()
    {
        super("Logged In As Admin");
                
        //Adding logo to the window
        ImageIcon imageLogo = new ImageIcon("Resources//logo1.png");
        JLabel labelImage = new JLabel("",imageLogo,JLabel.CENTER);
        labelImage.setSize(500,400); 
        labelImage.setLocation(200,80);
                
        btnCreate = new JButton("Create Job");
        btnCreate.setSize(200,30);
        btnCreate.addActionListener(new ButtonHandler());
        btnCreate.setLocation(359,500); 
                
        btnApplicant = new JButton("View and Employ Applicants"); 
        btnApplicant.setSize(200,30);
        btnApplicant.addActionListener(new ButtonHandler());
        btnApplicant.setLocation(359,550);
        
        btnEmployees = new JButton("View Employees");
        btnEmployees.setSize(200,30);
        btnEmployees.addActionListener(new ButtonHandler());
        btnEmployees.setLocation(359,600);
        
        btnBack = new JButton("Logout");
        btnBack.setSize(200,30);
        btnBack.setLocation(359,670);
        btnBack.addActionListener(new ButtonHandler());
        
        pane = getContentPane();
        pane.setLayout(null);
        pane.add(btnBack);
        pane.add(labelImage);
        pane.add(btnCreate);
        pane.add(btnApplicant);
        pane.add(btnEmployees);
    }
    
      public class ButtonHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
           if(e.getSource() == btnCreate)
           {
               	dispose();
               	CreateJob job = new CreateJob();
               	CommonMethods.changePosition(job);
           }
           else if(e.getSource() == btnApplicant)
           {
        	   try 
        	   {
        		   BufferedReader br = new BufferedReader(new FileReader("applicants.txt"));
        		   
        		   String line = null;
        		   int count = 0;
        		   
        		   while( (line = br.readLine()) != null)
        		   {
        			   String info [] = line.split(",");
        			   
        			   String emp = info[9];
        			   
        			   if(emp.equals("Being Evaluated"))
        			   {
        				   count++;
        			   }      			   
        		   }
        		   
        		   br.close();
        		   
        		   if(count > 0)
        		   {
        			   EmployApplicant gui = new EmployApplicant();
        			   CommonMethods.changePosition(gui);
        		   }
        		   else
        		   {
        			   Dialog die = new Dialog("There No Applicants At This Time");
                	   CommonMethods.strokeIt(die);

        		   }
        		   
        	   } 
        	   catch (Exception err) 
        	   {
        		   Dialog die = new Dialog("File Error");
            	   CommonMethods.strokeIt(die);
        	   }
           }
           else if(e.getSource() == btnEmployees)
           {
        	   Dialog die = new Dialog("This option will be functional soon... Hold on tight");
        	   CommonMethods.strokeIt(die);
           }
           else if(e.getSource() == btnBack)
           {
        	   dispose();
        	   AdminOrApplicant admin = new AdminOrApplicant();
        	   CommonMethods.changePosition(admin);
           }
       }
   }
}
