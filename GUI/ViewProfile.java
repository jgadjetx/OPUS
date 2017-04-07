package GUI;



/**
 * Write a description of class ViewProfile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import java.awt.Font;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;

public class ViewProfile extends JFrame
{
    private JLabel lblUser,lblDetail,lblApplicantProfile,lblID,lblFirstName,lblSurname,lblEthnicGroup,lblGender,lblDOB,lblDrivers,lblQualification,lblJob,lblUserName,lblStatus;
    private JTextField txtID,txtFirstName,txtSurname,txtEthnicGroup,txtGender,txtDOB,txtDrivers,txtQualification,txtJob,txtUserName,txtStatus;
    private JButton btnLogout;
    private Container pane;
    
    public ViewProfile()
    {
        super("View Profile");
        
        Font heading = new Font("Play",Font.BOLD,21);
        Font sub = new Font("Play",Font.BOLD,15);
        Font font = new Font("Play",Font.PLAIN,15);
        Font logged = new Font("Play",Font.BOLD,17);
        
        
        //Labels
        lblUser = new JLabel("Logged in User :");
        lblUser.setFont(font);
        lblUser.setSize(200,40);
        lblUser.setLocation(650,75);
        
        lblDetail = new JLabel("Number 1 - Peasent :D");
        lblDetail.setFont(logged); 
        lblDetail.setSize(170,40);
        lblDetail.setLocation(635,125);
        
        lblApplicantProfile = new JLabel("Applicant Profile :");
        lblApplicantProfile.setFont(heading);
        lblApplicantProfile.setSize(200,50);
        lblApplicantProfile.setLocation(100,75);
         
        lblID = new JLabel("ID Number :");
        lblID.setFont(sub);
        lblID.setSize(155,30);
        lblID.setLocation(70,175);
        
        lblFirstName = new JLabel("First Name :");
        lblFirstName.setFont(sub);
        lblFirstName.setSize(155,30);
        lblFirstName.setLocation(70,225);
        
        lblSurname = new JLabel("Surname :");
        lblSurname.setFont(sub);
        lblSurname.setSize(155,30);
        lblSurname.setLocation(70,275);
                
        lblEthnicGroup = new JLabel("Ethnic Group :");
        lblEthnicGroup.setFont(sub);
        lblEthnicGroup.setSize(155,30);
        lblEthnicGroup.setLocation(70,325);
        
        lblGender = new JLabel("Gender :");
        lblGender.setFont(sub);
        lblGender.setSize(155,30);
        lblGender.setLocation(70,375);
        
        lblDOB = new JLabel("Date of Birth :");
        lblDOB.setFont(sub);
        lblDOB.setSize(155,30);
        lblDOB.setLocation(70,425);
        
        lblDrivers = new JLabel("Drivers Licence :");
        lblDrivers.setFont(sub);
        lblDrivers.setSize(155,30);
        lblDrivers.setLocation(70,475);
        
        lblQualification = new JLabel("Top Qualification :");
        lblQualification.setFont(sub);
        lblQualification.setSize(155,30);
        lblQualification.setLocation(70,525);
        
        lblJob = new JLabel("Job Applied For :");
        lblJob .setFont(sub);
        lblJob .setSize(155,30);
        lblJob .setLocation(70,575);
        
        lblUserName = new JLabel("Username :");
        lblUserName.setFont(sub);
        lblUserName.setSize(155,30);
        lblUserName.setLocation(70,625);
        
        lblStatus = new JLabel("Status :");
        lblStatus.setFont(heading);
        lblStatus.setSize(170,40);
        lblStatus.setLocation(110,680);
        
        
        //TextFields
        txtID = new JTextField(25);
        txtID.addActionListener(new TextFieldHandler());
        txtID.setSize(200,30);
        txtID.setLocation(210,175);
        
        txtFirstName = new JTextField(25);
        txtFirstName.addActionListener(new TextFieldHandler());
        txtFirstName.setSize(200,30);
        txtFirstName.setLocation(210,225);
        
        txtSurname = new JTextField(25);
        txtSurname.addActionListener(new TextFieldHandler());
        txtSurname.setSize(200,30);
        txtSurname.setLocation(210,275);
        
        txtEthnicGroup = new JTextField(25);
        txtEthnicGroup.addActionListener(new TextFieldHandler());
        txtEthnicGroup.setSize(200,30);
        txtEthnicGroup.setLocation(210,325);
        
        txtGender = new JTextField(25);
        txtGender.addActionListener(new TextFieldHandler());
        txtGender.setSize(200,30);
        txtGender.setLocation(210,375);
        
        txtDOB = new JTextField(25);
        txtDOB.addActionListener(new TextFieldHandler());
        txtDOB.setSize(200,30);
        txtDOB.setLocation(210,425);
        
        txtDrivers = new JTextField(25);
        txtDrivers.addActionListener(new TextFieldHandler());
        txtDrivers.setSize(200,30);
        txtDrivers.setLocation(210,475);
        
        txtQualification = new JTextField(25);
        txtQualification.addActionListener(new TextFieldHandler());
        txtQualification.setSize(200,30);
        txtQualification.setLocation(210,525);
        
        txtJob = new JTextField(25);
        txtJob.addActionListener(new TextFieldHandler());
        txtJob.setSize(200,30);
        txtJob.setLocation(210,575);
        
        txtUserName = new JTextField(25);
        txtUserName.addActionListener(new TextFieldHandler());
        txtUserName.setSize(200,30);
        txtUserName.setLocation(210,625);
        
        txtStatus = new JTextField(25);
        txtStatus.addActionListener(new TextFieldHandler());
        txtStatus.setSize(200,30);
        txtStatus.setLocation(200,686);
        
        
        //Button 
        btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ButtonHandler());
        btnLogout.setSize(100,30);
        btnLogout.setLocation(650,680);
        
        
        //Pane
        pane = getContentPane();
        pane.setLayout(null);
        pane.add(lblUser);
        pane.add(lblDetail);
        pane.add(lblApplicantProfile);
        pane.add(lblID);
        pane.add(txtID);
        pane.add(lblFirstName);
        pane.add(txtFirstName);
        pane.add(lblSurname);
        pane.add(txtSurname);
        pane.add(lblEthnicGroup);
        pane.add(txtEthnicGroup);
        pane.add(lblGender);
        pane.add(txtGender);
        pane.add(lblDOB);
        pane.add(txtDOB);
        pane.add(lblDrivers);
        pane.add(txtDrivers);
        pane.add(lblQualification);
        pane.add(txtQualification);
        pane.add(lblJob);
        pane.add(txtJob);
        pane.add(lblUserName);
        pane.add(txtUserName);
        pane.add(txtQualification);
        pane.add(lblStatus);
        pane.add(txtStatus); 
        pane.add(btnLogout);
        
    }
    
    private class TextFieldHandler implements ActionListener 
    {
     
         public void actionPerformed( ActionEvent event )
         {          
             if ( event.getSource() == txtID )
             {
                
             }
             // else if(event.getSource() == txtDescription)
             // { 
                 
             // }
             // else if(event.getSource() == txtSalary)
             // {
                 
             // }
         }
      
    }
    
      public class ButtonHandler implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
          if(e.getSource() == btnLogout)
          {
            
          }
      }
    }
}
