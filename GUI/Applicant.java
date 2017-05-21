package GUI;


/**
 * Write a description of class Applicant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import java.awt.Font;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import USERCLASSES.CommonMethods;

public class Applicant extends JFrame
{
    private JLabel applicantLabel, usernameLabel;
    private JTextField txtUsername;
    private JButton btnLogin,btnBack,btnForgot;
    private Container pane;
    
    public Applicant()
    {
        super("Appplicant Login");
        
        Font font = new Font("Play",Font.BOLD,15);
        
        //Adding logo to the window
        ImageIcon imageLogo = new ImageIcon("Resources//logo1.png");
        JLabel labelImage = new JLabel("",imageLogo,JLabel.CENTER);
        labelImage.setSize(500,400);
        labelImage.setLocation(200,80);
                
        //adding label for user name
        usernameLabel = new JLabel("Username : ");  
        usernameLabel.setSize(100,30);
        usernameLabel.setFont(font);
        usernameLabel.setLocation(330,480);
        
        txtUsername = new JTextField(15);
        txtUsername.setSize(160,30);
        txtUsername.setLocation(430,480);
                
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ButtonHandler());
        btnLogin.setSize(250,30);
        btnLogin.setLocation(335,540);
        
        btnForgot = new JButton("Forgot Username");
        btnForgot.setSize(250,30);
        btnForgot.setLocation(335,580);
        btnForgot.addActionListener(new ButtonHandler());
        
        
        btnBack = new JButton("Back");
        btnBack.setSize(250,30);
        btnBack.setLocation(335,620);
        btnBack.addActionListener(new ButtonHandler());
        
        this.getRootPane().setDefaultButton(btnLogin);
        
        //pane
        pane = getContentPane();
        pane.setLayout(null);
        pane.add(labelImage);
        pane.add(btnBack);
        pane.add(btnForgot);
        pane.add(usernameLabel);
        pane.add(txtUsername);
        pane.add(btnLogin);
    }
    
    
    public class ButtonHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
           if(e.getSource() == btnLogin)
           {
               CommonMethods common = new CommonMethods();
               
               if(common.usernameExists(txtUsername.getText()))
               {
            	   //Do Something
            	   dispose();
            	   ViewProfile view = new ViewProfile(txtUsername.getText().toLowerCase());
            	   CommonMethods.changePosition(view);
                   
               }
               else
               {
            	   Dialog die = new Dialog("User Not Found...Please Register");
            	   CommonMethods.strokeIt(die);
            	   txtUsername.setText(null);
            	   
               }          		   
           }
           else if(e.getSource() == btnForgot)
           {
        	   dispose();
        	   ForgotUsername admin = new ForgotUsername();
        	   CommonMethods.changePosition(admin);
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
