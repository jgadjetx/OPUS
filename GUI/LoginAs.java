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

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;

public class LoginAs extends JFrame
{
    private JPanel mainPanel,imagePanel,buttonPanel;
    private JButton btnLogin,btnRegister,btnViewVac;
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
        btnLogin.setSize(100,30);
        btnLogin.addActionListener(new ButtonHandler());
        btnLogin.setLocation(400,450);
        
        btnRegister = new JButton("Register");
        btnRegister.setSize(100,30);
        btnRegister.addActionListener(new ButtonHandler());
        btnRegister.setLocation(400,490);
        
        btnViewVac = new JButton("View Vacancies");
        btnViewVac.setSize(150,30);
        btnViewVac.addActionListener(new ButtonHandler());
        btnViewVac.setLocation(375,530);
        
        //Creation of panels
        pane = getContentPane();
        pane.setLayout(null);
        pane.add(labelImage);
        pane.add(btnLogin);
        pane.add(btnRegister);
        pane.add(btnViewVac);        
    }
    
     public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnLogin)
            {
               
            }
            else if(e.getSource() == btnRegister)
            {
                                 
            }
            else if(e.getSource() == btnViewVac)
            {
                
            }
        }
    }
}
