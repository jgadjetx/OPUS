package GUI;


/**
 * Write a description of class RegistrationScreen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.util.Date;
import java.util.Properties;
import org.jdatepicker.*;
import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class RegistrationScreen extends JFrame
{
    JButton btnBack,btnRegister;
    JTextField txtName,txtSurname,txtGovID,txtUsername;
    JLabel lblHeading,lblRace,lblFirstName,lblSurname;
    JLabel lblGender,lblID,lblDOB,lblQual,lblDrivers,lblUsername,lblJob;
    JComboBox comboGender,comboQual,comboDrivers,comboJob;
    JDatePickerImpl datePicker;
    Container pane;
    
    String genders [] = {"Male","Female","Transgender Male","Transgender Female","Transsexual Female","Transsexual Male","Other"};
    String topQual [] = {"Primary School","High School","Matric","University","None"};
    String drivers [] = {"Code 01","Code 02","Code 08","Code 10","Code 14","None"};
    
    public RegistrationScreen()
    {
        super("Registration");
        
        //Font
        Font heading = new Font("Play",Font.PLAIN,35);
        Font label = new Font("Play",Font.PLAIN,20);
        
        //Buttons
        btnBack = new JButton("Back");
        btnBack.setSize(100,30);
        btnBack.setLocation(750,30);
        
        
        btnRegister = new JButton("Register");
        btnRegister.setSize(500,30);
        btnRegister.setLocation(190,800);
        
        // Labels
        lblHeading = new JLabel("Applicant Registration");
        lblHeading.setFont(heading);
        lblHeading.setSize(500,40);        
        lblHeading.setLocation(360,80);
        
        lblRace = new JLabel("'Join The Race'");
        lblRace.setSize(500,40);
        lblRace.setFont(heading);
        lblRace.setLocation(420,120);
        
        
        
        lblFirstName = new JLabel("First Name");
        lblFirstName.setSize(400,30);
        lblFirstName.setFont(label);
        lblFirstName.setLocation(100,225);
        
        
        
        
        lblSurname = new JLabel("Surname");
        lblSurname.setSize(400,30);
        lblSurname.setFont(label);
        lblSurname.setLocation(100,275);
        
        
        
        lblGender = new JLabel("Gender");
        lblGender.setSize(400,30);
        lblGender.setFont(label);
        lblGender.setLocation(100,325);
        
        
        
        lblID = new JLabel("Government ID");
        lblID.setSize(400,30);
        lblID.setFont(label);
        lblID.setLocation(100,375);
        
        
        
        lblDOB = new JLabel("Date Of Birth");
        lblDOB.setSize(400,30);
        lblDOB.setFont(label);
        lblDOB.setLocation(100,425);
        
        
        
        lblQual = new JLabel("Highest Qualification");
        lblQual.setSize(400,30);
        lblQual.setFont(label);
        lblQual.setLocation(100,475);
        
        
        
        lblDrivers = new JLabel("Driver's Licence");
        lblDrivers.setSize(400,30);
        lblDrivers.setFont(label);
        lblDrivers.setLocation(100,525);
        
        
        
        lblUsername = new JLabel("Username");
        lblUsername.setSize(400,30);
        lblUsername.setFont(label);
        lblUsername.setLocation(100,575);
        
        
        
        lblJob = new JLabel("Desired Job");
        lblJob.setSize(400,30);
        lblJob.setFont(label);
        lblJob.setLocation(100,625);
        
        
        
        //Input
        txtName = new JTextField(30);
        txtName.setSize(400,30);
        txtName.setLocation(340,225);
        
        
        txtSurname = new JTextField(30);
        txtSurname.setSize(400,30);
        txtSurname.setLocation(340,275);
        
        
        comboGender = new JComboBox(genders);
        comboGender.setSize(400,30);
        comboGender.setLocation(340,325);
        comboGender.setSelectedIndex(-1);
        
        
        txtGovID = new JTextField(30);
        txtGovID.setSize(400,30);
        txtGovID.setLocation(340,375);
        
        
        
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today","Today");
        p.put("text.month","Month");
        p.put("text.year","Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
        datePicker = new JDatePickerImpl(datePanel,new DateLabelFormatter());
        datePicker.setLocation(340,425);
        datePicker.setSize(400,30);
        datePicker.setFont(heading);
        
        
        comboQual = new JComboBox(topQual);
        comboQual.setSize(400,30);
        comboQual.setLocation(340,475);
        comboQual.setSelectedIndex(-1);
        
        
        
        comboDrivers = new JComboBox(drivers);
        comboDrivers.setSize(400,30);
        comboDrivers.setLocation(340,525);
        comboDrivers.setSelectedIndex(-1);
        
        
        
        txtUsername = new JTextField(30);
        txtUsername.setSize(400,30);
        txtUsername.setLocation(340,575);
        
        
        
        
        comboJob = new JComboBox();//Populated by textfile with available Jobs
        comboJob.setSize(400,30);
        comboJob.setLocation(340,625);
        comboJob.setSelectedIndex(-1);
        
        
        
        //Panel
        pane = getContentPane();
        pane.setLayout(null);
        pane.add(lblHeading);
        pane.add(lblRace);
        pane.add(lblFirstName);
        pane.add(lblSurname);
        pane.add(lblGender);
        pane.add(lblID);
        pane.add(lblDOB);
        pane.add(lblQual);
        pane.add(lblDrivers);   
        pane.add(lblUsername);
        pane.add(lblJob);
        pane.add(btnBack);
        pane.add(btnRegister);
        pane.add(txtName);
        pane.add(txtSurname);
        pane.add(comboGender);
        pane.add(txtGovID);
        pane.add(datePicker);
        pane.add(comboQual);
        pane.add(txtUsername);
        pane.add(comboDrivers);
        pane.add(comboJob);
    }
    
    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnBack)
            {
                //Do Something
            }
            else if (e.getSource() == btnRegister)
            {
                //even here do something
            }
        }
    }
}
