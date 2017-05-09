package GUI;


/**
 * Write a description of class ViewVacancies here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JTextArea;

import USERCLASSES.CommonMethods;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import java.awt.Container;

import java.io.BufferedReader;
import java.io.FileReader;


public class ViewVacancies extends JFrame
{
    private JButton btnBack,btnLogin;
    private JTextArea output;
    private Container pane;
    private JLabel text;
    
    //File Handling;
    BufferedReader br = null;
    
    public ViewVacancies()
    {   
        super("View Vac");
        Font font = new Font("Play",Font.PLAIN,30);
        
        text = new JLabel("View Vacancies");
        text.setFont(font);
        text.setSize(300,30);
        text.setLocation(320,56);
        
        btnBack = new JButton("Back");
        btnBack.setSize(250,30);
        btnBack.addActionListener(new ButtonHandler());
        btnBack.setLocation(350,800);
                
        btnLogin = new JButton("Apply For Job");
        btnLogin.setSize(250,30);
        btnLogin.setLocation(350,750);     
        
        output = new JTextArea(200,500);
        output.setSize(500,600);
        output.setLocation(200,120);
        output.setEditable(false);
        
        //Panel
        pane = getContentPane();
        pane.setLayout(null);
        pane.add(text);
        pane.add(btnBack);
        pane.add(btnLogin);
        pane.add(output);
        
        
        
      ///SCREEN LOAD
        
        try
        {
        	br = new BufferedReader(new FileReader("vacancies.txt"));
        	
        	String line;
        	
        	while((line = br.readLine()) != null)
        	{
        		String [] info = line.split(",");
        		
        		String title = info[0];
        		String desc = info[1];
        		String salary = info[2];
        		String expiryDate = info[3];
        		
        		
        		output.append(title);
        		output.append("\n");
        		output.append(desc);
        		output.append("\n");
        		output.append("Monthly Salary : " + salary);   
        		output.append("\n");
        		output.append("Expiration : " + expiryDate);
        		output.append("\n");
        		output.append("\n");
        		output.append("\n");      		
        		
        	}
        	
        }
        catch(Exception err)
        {
        	Dialog die = new Dialog("Oops...An error occured");
        	CommonMethods.strokeIt(die);
        }
        
        
    }  
    
    
    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnBack)
            {
                dispose();
                LoginAs home = new LoginAs();
                CommonMethods.changePosition(home);
            }
            else
            {
                
            }
        }
    }
}
