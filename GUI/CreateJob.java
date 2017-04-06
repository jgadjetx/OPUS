package GUI;


/**
 * Write a description of class CreateJob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
//import java.awt.MouseEvent;

public class CreateJob extends JFrame
{
    private JLabel lblTitle,lblName,lblSalary,lblAdmin,lblDescription;
    private JTextField txtTitle,txtSalary;
    private JTextArea txtDescription;
    private JButton btnSubmit;
    private Container pane; 
            
    public CreateJob()
    {
        super("Create Job");
        
        Font heading = new Font("Play",Font.BOLD, 30);
        Font label = new Font("Play",Font.PLAIN, 15);
        Font name = new Font("Play" ,Font.BOLD, 15);
        
        // ImageIcon imageLogo = new ImageIcon("Resources//logo2.png");
        // JLabel labelImage = new JLabel("",imageLogo,JLabel.LEFT);
        // labelImage.setSize(100,100);
        // labelImage.setLocation(300,100);
        // add(labelImage);  
        
        lblAdmin = new JLabel("Admin");
        lblAdmin.setFont(heading);
        lblAdmin.setSize(200,40);
        lblAdmin.setLocation(650,100);
        
        lblName = new JLabel("Keagile Konyana");
        lblName.setFont(name);
        lblName.setSize(170,40);
        lblName.setLocation(635,135);
               
        lblTitle = new JLabel("Title :");
        lblTitle.setFont(label);
        lblTitle.setSize(70,30);
        lblTitle.setLocation(40,100);
        
        txtTitle = new JTextField(25);
        txtTitle.addActionListener(new TextFieldHandler());
        txtTitle.setSize(200,30);
        txtTitle.setLocation(40,125);
        
        lblDescription = new JLabel("Description :");
        lblDescription.setFont(label);
        lblDescription.setSize(200,30);
        lblDescription.setLocation(40,230);
        
        txtDescription = new JTextArea(250,250);
        //txtDescription.addActionListener(new TextFieldHandler());
        txtDescription.setSize(400,200);
        txtDescription.setLocation(40,260);
          
        lblSalary = new JLabel("Monthly salary :");
        lblSalary.setFont(label);
        lblSalary.setSize(200,30);
        lblSalary.setLocation(40,525);
        
        txtSalary = new JTextField(25);
        txtSalary.addActionListener(new TextFieldHandler());
        txtSalary.setSize(150,30);
        txtSalary.setLocation(40,550);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ButtonHandler());
        btnSubmit.setSize(100,30);
        btnSubmit.setLocation(700,750);
        
        //pane
        pane = getContentPane();
        pane.setLayout(null);
        //pane.add(labelImage); 
        pane.add(lblAdmin);
        pane.add(lblName);
        pane.add(lblTitle);
        pane.add(txtTitle);
        pane.add(lblDescription);
        pane.add(txtDescription);
        pane.add(lblSalary);
        pane.add(txtSalary);
        pane.add(btnSubmit);
        
    }
    
    private class TextFieldHandler implements ActionListener 
    {
     
         public void actionPerformed( ActionEvent event )
         {          
             if ( event.getSource() == txtTitle )
             {
                
             }
             else if(event.getSource() == txtDescription)
             {
                 
             }
             else if(event.getSource() == txtSalary)
             {
                 
             }
         }
      
    }
    
     public class ButtonHandler implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
          if(e.getSource() == btnSubmit)
          {
            
          }
      }
    }
}
