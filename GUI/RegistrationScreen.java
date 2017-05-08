package GUI;


/**
 * Write a description of class RegistrationScreen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.util.Properties;
import org.jdatepicker.impl.*;


import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


import USERCLASSES.Applicant;
import USERCLASSES.CommonMethods;

import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.BufferedReader;
import java.io.FileReader;

import USERCLASSES.CommonMethods;



public class RegistrationScreen extends JFrame
{
    JButton btnBack,btnRegister;
    JTextField txtName,txtSurname,txtGovID,txtUsername;
    JLabel lblHeading,lblRace,lblFirstName,lblSurname;
    JLabel lblGender,lblID,lblDOB,lblQual,lblDrivers,lblUsername,lblJob;
    JComboBox comboGender,comboQual,comboDrivers,comboJob;
    JDatePickerImpl datePicker;
    Container pane;
    
    String genders [] = {"Male","Female"};
    String topQual [] = {"Primary School","High School","Matric","University","None"};
    String drivers [] = {"Code 01","Code 02","Code 08","Code 10","Code 14","None"};
    
    
    BufferedWriter bw;
    BufferedReader br;
    
    
    
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
        btnBack.addActionListener(new ButtonHandler());
        
        
        btnRegister = new JButton("Register");
        btnRegister.setSize(500,30);
        btnRegister.setLocation(190,800);
        btnRegister.addActionListener(new ButtonHandler());
        
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
        
        
        
        
        comboJob = new JComboBox(new String [] {"Bus Driver"});//Populated by textfile with available Jobs
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
                fetusDeletus();
                LoginAs login = new LoginAs();
                CommonMethods.changePosition(login);
                
            }
            else if (e.getSource() == btnRegister)
            {
                //Validation        	 
            	
					try {
						int genderNum = Integer.valueOf(txtGovID.getText().substring(6,7));
						
						String year = txtGovID.getText().substring(0,2);;
						String month = txtGovID.getText().substring(2,4);
						String day = txtGovID.getText().substring(4,6);
						
						String selectedDOB = datePicker.getJFormattedTextField().getText();
						String [] info = selectedDOB.split("-");
						
						String selectedYear = info[0].substring(2,4);
						String selectedMonth = info[1];
						String selectedDay = info[2];
						
						CommonMethods common = new CommonMethods();
						
						if(common.usernameExists(txtUsername.getText()))
						{
							JOptionPane.showMessageDialog(null,"Username "+ txtUsername.getText() + " already exist, choose another one");
							txtUsername.setText("");
						}
						else if(txtName.getText().length() < 1 ||  txtSurname.getText().length() < 1 ||  comboGender.getSelectedItem() == null || txtGovID.getText().length() < 1 || comboQual.getSelectedItem() == null || comboDrivers.getSelectedItem() == null ||  txtUsername.getText().length() < 1 || comboJob.getSelectedItem() == null)
						{
							JOptionPane.showMessageDialog(null,"Cannot append null field... Try again");
							
							if (genderNum >= 0 && genderNum <= 4 )
							{
								if(!(comboGender.getSelectedItem().toString().equals("Female")))
								{
									JOptionPane.showMessageDialog(null,"Invalid ID number/gender combination... Try again");
									comboGender.setSelectedIndex(-1);
									txtGovID.setText("");							
								}
							}
							else if(genderNum >= 5 && genderNum <= 9)
							{
								if(!(comboGender.getSelectedItem().toString().equals("Male")))
								{
									JOptionPane.showMessageDialog(null,"Invalid ID number/gender combination... Try again");
									comboGender.setSelectedIndex(-1);
									txtGovID.setText("");							
								}
							}  
							else if(txtGovID.getText().length() != 13 )
							{
								JOptionPane.showMessageDialog(null,"Invalid ID number length... Try again");
								txtGovID.setText("");
																
							}	
							else
							{
								if(!(year.equals(selectedYear)))
								{
									JOptionPane.showMessageDialog(null,"ID birth year and selected birth year don't match... Try again");
									txtGovID.setText("");
									datePicker.getJFormattedTextField().setText("");
									
								}
								else if(!(month.equals(selectedMonth)))
								{
									JOptionPane.showMessageDialog(null,"ID birth month and selected birth month don't match... Try again");
									txtGovID.setText("");
									datePicker.getJFormattedTextField().setText("");
								}
								else if(!(day.equals(selectedDay)))
								{
									JOptionPane.showMessageDialog(null,"ID birth day and selected birth day don't match... Try again");
									txtGovID.setText("");
									datePicker.getJFormattedTextField().setText("");
								}
								
								
							}
						}					
						else
						{
							//Write to file
							bw = new BufferedWriter(new FileWriter("applicants.txt",true));
							
							Applicant app = new Applicant(txtName.getText(),txtSurname.getText(),txtGovID.getText(),txtUsername.getText().toLowerCase(),comboQual.getSelectedItem().toString(),comboDrivers.getSelectedItem().toString(),comboJob.getSelectedItem().toString(),"Being Evaluated");
							
							bw.write(app.getUniqueCode() +","+ app.getJobApplied() +","+ app.getHighestQual() +","+ app.getDriverLic() +","+ app.getGender()  +","+ app.getName() +","+ app.getSurname() +","+ app.getGovID() +","+ app.getUsername() +","+ app.getStatus());
							bw.newLine();
							bw.close();
							
							JOptionPane.showMessageDialog(null,"Registration Success");
							txtName.setText("");
							txtSurname.setText("");
							txtGovID.setText("");
							txtUsername.setText("");
							comboQual.setSelectedIndex(-1);
							comboDrivers.setSelectedIndex(-1);
							comboGender.setSelectedIndex(-1);
							comboJob.setSelectedIndex(-1);
							datePicker.getJFormattedTextField().setText("");
						}				
											
					}
					catch (Exception e1) 
					{
						JOptionPane.showMessageDialog(null,"Oops...An error occured ");
					}         	         	
            }
        }
        
        public void fetusDeletus()
        {
        	dispose();
        }
        
    }
}
