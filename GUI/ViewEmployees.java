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
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class ViewEmployees extends JFrame
{
    JButton btnBack,btnAddEmployee,btnRemove,btnRemove2,btnRemove3;
    JPanel panelList,panelContent;
    JLabel lblViewEmployee;
    Container pane;
    
    int y = 10;
    
    public ViewEmployees()
    {
        Font heading = new Font("Play",Font.PLAIN,35);
        Font lable = new Font("Play",Font.BOLD,15);
        Font table = new Font("Play",Font.BOLD,10);
        
        //Table Format
        String tableString = String.format("%-28s %-39s %-12s %-20s %-10s %-8s %-30s ","Name","ID Num","H.Qual","Position","Gender","Age","Drive's Lic.");
        JLabel tableHeading = new JLabel(tableString);
        tableHeading.setFont(table);
        tableHeading.setSize(700,30);
        tableHeading.setLocation(110,105);
        
        lblViewEmployee = new JLabel("View Employees");
        lblViewEmployee.setFont(heading);
        lblViewEmployee.setSize(300,40);
        lblViewEmployee.setLocation(540,50);
        
        
        btnBack = new JButton("Back");
        btnBack.setSize(80,30);
        btnBack.setLocation(700,10);
        
        btnAddEmployee = new JButton("Add Employee");
        btnAddEmployee.setSize(120,30);
        btnAddEmployee.setLocation(680,830);
              
        panelList = new JPanel(new GridLayout(10,1,50,20));
        panelList.setSize(700,700);
        panelList.setOpaque(true);
        panelList.setBackground(Color.DARK_GRAY);
        panelList.setLocation(100,130);
               
        
        //PanelContent
        //Will be generated with for loop... This is just for demo right now
        panelContent = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
        panelContent.setBackground(Color.LIGHT_GRAY);
        btnRemove = new JButton("Remove");
        String staffString = String.format("%-15s %-17s %-10s %-10s %-7s %-5s %-10s ","P.Muvhango","9603054464084","Matric","Gardener","Male","21","Code 10");
        JLabel staff = new JLabel(staffString);
        staff.setFont(lable);
        panelContent.add(staff);
        panelContent.add(btnRemove);
        
        JPanel panelContent2 = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
        panelContent2.setBackground(Color.LIGHT_GRAY);
        btnRemove2 = new JButton("Remove");
        String staffString2 = String.format("%-15s %-17s %-10s %-10s %-7s %-5s %-10s ","K.Konyana","9612314464084","Matric","Janitor","Male","20","Code 8");
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
        pane.add(btnAddEmployee);
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
            else if (e.getSource() == btnAddEmployee)
            {
                
            }
        }
    }
    
    private void addEmployee()
    {
        
    }
}
