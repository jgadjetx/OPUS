package GUI;



/**
 * Write a description of class ViewProfile here.
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
import java.awt.Container;

import java.io.BufferedReader;
import java.io.FileReader;

public class ViewProfile extends JFrame
{
    private JLabel lblUser,lblDetail,lblApplicantProfile,lblID,lblFirstName,lblSurname,lblGender,lblDOB,lblDrivers,lblQualification,lblJob,lblUserName,lblStatus;
    private JTextField txtID,txtFirstName,txtSurname,txtGender,txtDOB,txtDrivers,txtQualification,txtJob,txtUserName,txtStatus;
    private JButton btnLogout;
    private Container pane;
    
    BufferedReader br;
    
    //Info
    String jobAppled;
    String higestQ;
    String driversLic;
    String gender;
	String name;
	String surname;
	String id;
	String status;
	String birtdate;
	String year;
	String month;
	String day;
    
    public ViewProfile(String username)
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
        
        lblDetail = new JLabel("Name and Surname");
        lblDetail.setFont(logged); 
        lblDetail.setSize(170,40);
        lblDetail.setLocation(635,110);
        
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
     
        lblUserName = new JLabel("Username :");
        lblUserName.setFont(sub);
        lblUserName.setSize(155,30);
        lblUserName.setLocation(70,575);
        
        lblJob = new JLabel("Job Applied For :");
        lblJob .setFont(sub);
        lblJob .setSize(155,30);
        lblJob .setLocation(70,625);
        
        lblStatus = new JLabel("Status :");
        lblStatus.setFont(heading);
        lblStatus.setSize(170,40);
        lblStatus.setLocation(110,680);
        
        
        //TextFields
        txtID = new JTextField(25);
        txtID.setSize(200,30);
        txtID.setLocation(210,175);
        txtID.setEditable(false);
        
        txtFirstName = new JTextField(25);
        txtFirstName.setSize(200,30);
        txtFirstName.setLocation(210,225);
        txtFirstName.setEditable(false);
        
        txtSurname = new JTextField(25);
        txtSurname.setSize(200,30);
        txtSurname.setLocation(210,275);
        txtSurname.setEditable(false);
        
        txtGender = new JTextField(25);
        txtGender.setSize(200,30);
        txtGender.setLocation(210,375);
        txtGender.setEditable(false);
        
        txtDOB = new JTextField(25);
        txtDOB.setSize(200,30);
        txtDOB.setLocation(210,425);
        txtDOB.setEditable(false);
        
        txtDrivers = new JTextField(25);
        txtDrivers.setSize(200,30);
        txtDrivers.setLocation(210,475);
        txtDrivers.setEditable(false);
        
        txtQualification = new JTextField(25);
        txtQualification.setSize(200,30);
        txtQualification.setLocation(210,525);
        txtQualification.setEditable(false);
        
        txtUserName = new JTextField(25);
        txtUserName.setSize(200,30);
        txtUserName.setLocation(210,575);
        txtUserName.setEditable(false);
        
        txtJob = new JTextField(25);
        txtJob.setSize(200,30);
        txtJob.setLocation(210,625);
        txtJob.setEditable(false);
        
        txtStatus = new JTextField(25);
        txtStatus.setSize(200,30);
        txtStatus.setLocation(210,686);
        txtStatus.setEditable(false);
        
        
        //Button 
        btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ButtonHandler());
        btnLogout.setSize(100,30);
        btnLogout.setLocation(650,680);
        btnLogout.addActionListener(new ButtonHandler());
        
        
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
        
        
        ///Load
        try
        {
        	br = new BufferedReader(new FileReader("applicants.txt"));
        	
        	String line = null;
        	
        	while((line = br.readLine()) != null)
        	{
        		String [] info = line.split(",");
        		
        		if(info[8].equals(username))
        		{
        			jobAppled = info[1];
        			higestQ = info[2];
        			driversLic = info[3];
        			gender = info[4];
        			name = info[5];
        			surname = info[6];
        			id = info[7];
        			status = info[9];              	
                	
                	birtdate = id.substring(0,5);
                	year = "19" + birtdate.substring(0,2)+"-";
                	month = id.substring(2,4)+"-";
                	day = id.substring(4,6);          
                	
                	txtID.setText(id);
                	txtFirstName.setText(name);
                	txtSurname.setText(surname);
                	txtGender.setText(gender);
                	txtDOB.setText(year+month+day);
                	txtDrivers.setText(driversLic);
                	txtQualification.setText(higestQ);
                	txtJob.setText(jobAppled);
                	txtUserName.setText(username);
                	txtStatus.setText(status);                  	
                	lblDetail.setText(name+" "+surname);     
        		}
        				     
        	}
        	   	
        }
        catch(Exception err)
        {
        	JOptionPane.showMessageDialog(null,"Error occured... Please contact admininstrator" + err);
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
