package GUI;


/**
 * Write a description of class ViewEmployees here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class EmployApplicant extends JFrame
{
    JButton btnBack,btnAddEmployee,btnRemove,btnRemove2,btnRemove3;
    JPanel panelList,panelContent;
    JLabel lblViewEmployee;
    Container pane;
    
    int y = 10;
    
    public EmployApplicant()
    {
        Font heading = new Font("Play",Font.PLAIN,35);
        Font lable = new Font("Play",Font.BOLD,15);
        Font table = new Font("Play",Font.BOLD,10);
        
        //Table Format
        String tableString = String.format("%-30s %-30s %-15s %-20s %-10s %-10s ","Unique ID","Job Position","Highest Qual.","Drivers Licence","Gender","Age");
        JLabel tableHeading = new JLabel(tableString);
        tableHeading.setFont(table);
        tableHeading.setSize(700,30);
        tableHeading.setLocation(110,105);
        
        lblViewEmployee = new JLabel("Employ Applicant");
        lblViewEmployee.setFont(heading);
        lblViewEmployee.setSize(300,40);
        lblViewEmployee.setLocation(520,50);
        
        
        btnBack = new JButton("Back");
        btnBack.setSize(80,30);
        btnBack.setLocation(700,10);
        
              
        panelList = new JPanel(new GridLayout(10,1,50,20));
        panelList.setSize(700,700);
        panelList.setOpaque(true);
        panelList.setBackground(Color.DARK_GRAY);
        panelList.setLocation(100,130);
               
        
        //PanelContent
        //Will be generated with for loop... This is just for demo right now
        panelContent = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
        panelContent.setBackground(Color.LIGHT_GRAY);
        btnRemove = new JButton("Hire");
        String staffString = String.format("%-20s %-20s %-10s %-10s %-7s %-5s","2017225558","Gardener","Matric","Code 10","Male","21");
        JLabel staff = new JLabel(staffString);
        staff.setFont(lable);
        panelContent.add(staff);
        panelContent.add(btnRemove);
        
        JPanel panelContent2 = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
        panelContent2.setBackground(Color.LIGHT_GRAY);
        btnRemove2 = new JButton("Hire");
        String staffString2 = String.format("%-20s %-20s %-10s %-10s %-10s %-5s","2017552011","Janitor","Matric","Code 10","Male","20");
        JLabel staff2 = new JLabel(staffString2);
        staff2.setFont(lable);
        panelContent2.add(staff2);
        panelContent2.add(btnRemove2);
      
        
        panelList.add(panelContent);
        panelList.add(panelContent2);
        
        ////
        
        pane = getContentPane();
        pane.setLayout(null);
        pane.add(lblViewEmployee);
        pane.add(btnBack);
        pane.add(panelList);
        pane.add(tableHeading);
        
    }
    
    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == btnBack)
            {
                
            }

        }
    }
    
 
}
