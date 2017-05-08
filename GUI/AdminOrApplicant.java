package GUI;


/**
 * Write a description of class adminOrApplicant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import javax.swing.JLabel;

import USERCLASSES.CommonMethods;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Font;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminOrApplicant extends JFrame
{
    private JButton btnAdmin,btnUser;
    private JLabel JloginText, JorText;
    private Container pane;
    
    public AdminOrApplicant()
    {
        super("Login As");
        
        Font heading = new Font("Play",Font.BOLD,25);
        Font text = new Font("Play",Font.PLAIN,16);
        
        //Conversion of Logo into button
        ImageIcon imageLogo = new ImageIcon("Resources//logo1.png");
        JLabel labelImage = new JLabel("",imageLogo,JLabel.CENTER);
        labelImage.setSize(500,400);
        labelImage.setLocation(200,80);
        
        //Creation of the "Login As" Heading
        JloginText = new JLabel("Login As : ");
        JloginText.setFont(heading);
        JloginText.setSize(130,40);
        JloginText.setLocation(400,470);
        
        //Creation of the Admin button
        btnAdmin = new JButton("Administrator");
        btnAdmin.setSize(50,30);
        btnAdmin.addActionListener(new ButtonHandler());
        btnAdmin.setSize(130,30); 
        btnAdmin.setLocation(260,540);
        
        //Creation of the label in between the two buttons
        JorText = new JLabel("-- OR --");
        JorText.setSize(70,30);
        JorText.setFont(text);
        JorText.setLocation(430,540);
                
        //Creation of the User button
        btnUser = new JButton("Registered Applicant");
        btnUser.setSize(30,30); 
        btnUser.addActionListener(new ButtonHandler());
        btnUser.setSize(155,30);
        btnUser.setLocation(515,540);
        
        //pane
        pane = getContentPane();
        pane.setLayout(null);
        pane.add(labelImage);
        pane.add(JloginText);
        pane.add(btnAdmin);
        pane.add(JorText);
        pane.add(btnUser);
       
    }
    
     public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnAdmin)
            {
               dispose();
               AdminLogin admin = new AdminLogin();
               CommonMethods.changePosition(admin);
              
            		   
            }
            else if(e.getSource() == btnUser)
            {
            	dispose();
            	Applicant app = new Applicant();
            	CommonMethods.changePosition(app);
            }
        }
    }
}
