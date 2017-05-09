package GUI;


/**
 * Write a description of class CreateJob here. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import USERCLASSES.Admin;
import USERCLASSES.CommonMethods;

import java.util.Properties;
import org.jdatepicker.impl.*;

import javax.swing.JTextArea;

import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
//import java.awt.MouseEvent;

public class CreateJob extends JFrame
{
    private JLabel lblTitle,lblName,lblSalary,lblAdmin,lblDescription,lblExpire;
    private JTextField txtTitle,txtSalary;
    private JTextArea txtDescription;
    private JButton btnSubmit,btnBack;
    private Container pane; 
    JDatePickerImpl datePicker;
    
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
        
        lblAdmin = new JLabel("Admin:");
        lblAdmin.setFont(heading);
        lblAdmin.setSize(200,40);
        lblAdmin.setLocation(650,50);
        
        lblName = new JLabel("Keagile Konyana");
        lblName.setFont(name);
        lblName.setSize(170,40);
        lblName.setLocation(635,80);
               
        lblTitle = new JLabel("Title :");
        lblTitle.setFont(label);
        lblTitle.setSize(70,30);
        lblTitle.setLocation(40,100);
        
        lblExpire = new JLabel("Expires:");
        lblExpire.setFont(label);
        lblExpire.setSize(80,30);
        lblExpire.setLocation(40,550);
        
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today","Today");
        p.put("text.month","Month");
        p.put("text.year","Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
        datePicker = new JDatePickerImpl(datePanel,new DateLabelFormatter());
        datePicker.setLocation(40,580);
        datePicker.setSize(150,30);
        datePicker.setFont(heading);
        
        
        
        txtTitle = new JTextField(25);
        txtTitle.setSize(200,30);
        txtTitle.setLocation(40,125);
        
        lblDescription = new JLabel("Description :");
        lblDescription.setFont(label);
        lblDescription.setSize(200,30);
        lblDescription.setLocation(40,180);
        
        txtDescription = new JTextArea(250,250);
        txtDescription.setSize(400,200);
        txtDescription.setLocation(40,215);
          
        lblSalary = new JLabel("Monthly salary(R) :");
        lblSalary.setFont(label);
        lblSalary.setSize(200,30);
        lblSalary.setLocation(40,440);
        
        txtSalary = new JTextField(25);
        txtSalary.setSize(150,30);
        txtSalary.setLocation(40,470);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setSize(120,30);
        btnSubmit.setLocation(400,700);
        btnSubmit.addActionListener(new ButtonHandler());
        
        btnBack = new JButton("Back");
        btnBack.setSize(250,30);
        btnBack.setLocation(330,750);
        btnBack.addActionListener(new ButtonHandler());

        //pane
        pane = getContentPane();
        pane.setLayout(null);
        pane.add(lblAdmin);
        pane.add(btnBack);
        pane.add(lblName);
        pane.add(lblTitle);
        pane.add(txtTitle);
        pane.add(lblDescription);
        pane.add(txtDescription);
        pane.add(lblSalary);
        pane.add(txtSalary);
        pane.add(btnSubmit);
        pane.add(lblExpire);
        pane.add(datePicker);
        
    }
     
    
     public class ButtonHandler implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
          if(e.getSource() == btnSubmit)
          {
        	  Admin admin = new Admin();
        	  
        	  if(txtTitle.getText().length() < 1 || txtDescription.getText().length() < 1 || txtSalary.getText().length() < 1 || datePicker.getJFormattedTextField().getText().length() < 1 )
        	  {
        		  JOptionPane.showMessageDialog(null,"Can't append null values...Try again");
        	  }
        	  else
        	  {
        		  JOptionPane.showMessageDialog(null,"Vacancy Added!!");
        		  admin.createVacancy(txtTitle.getText(),txtDescription.getText(),txtSalary.getText(),datePicker.getJFormattedTextField().getText());    
        		  txtTitle.setText(null);
            	  txtDescription.setText(null);
            	  txtSalary.setText(null);
            	  datePicker.getJFormattedTextField().setText(null);      	  
        	  }
 	  
          }
          else if (e.getSource() == btnBack)
          {
              dispose();
              AdminLogin admin = new AdminLogin();
              CommonMethods.changePosition(admin);
          }
      }
    }
}
