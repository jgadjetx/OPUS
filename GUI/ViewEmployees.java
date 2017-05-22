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
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.File; 
import java.io.BufferedWriter;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

import java.awt.Cursor;

import USERCLASSES.CommonMethods;
import USERCLASSES.User;

public class ViewEmployees extends JFrame
{
    JButton btnBack,btnAddEmployee,btnRemove,btnRemove2,btnRemove3;
    JPanel panelList,panelContent;
    JLabel lblViewEmployee, underline;
    Container pane;
     
    BufferedReader br;
    BufferedWriter bw;
    
    int y = 160;
    
    public ViewEmployees()
    {
        Font heading = new Font("Play",Font.PLAIN,42);
        Font table = new Font("Play",Font.BOLD,10);
        Font lable = new Font("Play",Font.BOLD,10);
        
        writeToForm(); 
        
        //Table Format
        String tableString = String.format("%-23s %-31s %-18s %-18s %-21s %-17s %-20s","UniqueID","GovID","Surname","Name","Position","Gender","Drive Lic.");
        JLabel tableHeading = new JLabel(tableString);
        tableHeading.setFont(table);
        tableHeading.setSize(700,30);
        tableHeading.setLocation(90,105);
        
        lblViewEmployee = new JLabel("OPUS Employees");
        lblViewEmployee.setFont(heading);
        lblViewEmployee.setSize(370,40); 
        lblViewEmployee.setLocation(270,40);
        
        
        btnBack = new JButton("Back");
        btnBack.setSize(80,30);
        btnBack.setLocation(680,830);
        btnBack.addActionListener(new ButtonHandler());
 
              
        panelList = new JPanel(new GridLayout(10,1,50,20)); 
        panelList.setSize(700,700);
        panelList.setOpaque(false);
        panelList.setBackground(Color.DARK_GRAY);
        panelList.setLocation(100,130);

        
        pane = getContentPane();
        pane.setLayout(null);
        pane.add(lblViewEmployee);
        pane.add(btnBack);
        pane.add(panelList);
        pane.add(tableHeading);     
        
    }
    
    public void writeToForm()
    {
            try
            {
                br = new BufferedReader(new FileReader("employees.txt"));
                                                
                String line; 
                 
                while((line = br.readLine())!= null)
                {
                    String [] info = line.split(",");
                     
                    String uniqueID = info[0];
                    String name = info[3];
                    String surname = info[2];
                    String govID = info[1];
                    String job = info[4];
                    String gender = info[5];
                    String age = info[6];
                    String license = info[7];
                    

                    Font lable = new Font("Play",Font.BOLD,10); 
                                      
                    String row = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s",uniqueID,govID,surname,name,job,gender,license);  
                    
                    JLabel staff = new JLabel();
                    staff.setText(row);
                    staff.setFont(lable);
                    staff.setLocation(90, y);
                    pane = getContentPane();
                    staff.setSize(800,30);
                    pane.add(staff);
                                        
                            
                    
                    JButton button = new JButton("Remove");
                    button.setSize(100,20);
                    button.setLocation(695, y);
                    pane.add(button);
                    button.addActionListener(new ActionListener()                                   
                    {                        
                        public void actionPerformed(ActionEvent e)
                        {
                           
                            try
                            {                                
                                    //Changing of the status 
                                    button.setEnabled(false);
                                    File original = new File("employees.txt");
                                    File temp = new File("tempEmployees.txt");
                                    
                                    BufferedReader reader = new BufferedReader(new FileReader(original));
                                    BufferedWriter writer = new BufferedWriter(new FileWriter(temp));
                                    
                                    String line = null;
                                    
                                    while((line = reader.readLine()) != null)
                                    {
                                        String [] data = line.split(",");
                                        
                                        String foundID = data[1];
                                        
                                        if( !(foundID.equals(govID)) )
                                        {
                                            writer.write(line);
                                            writer.newLine();
                                        } 
                                        else
                                        {
                                            continue;
                                        }

                                        
                                    }
                                    
                                    Dialog errr = new Dialog("Employee " + name +" has been removed");
                                    CommonMethods.strokeIt(errr);

                                    
                                    
                                     
                                    br.close();
                                    reader.close();
                                    writer.close();     
                                    
                                    original.delete();
                                    temp.renameTo(original);
                      
                            }
                            catch(Exception err)
                            {
                                    Dialog errr = new Dialog("Error Occured...Contact Admin" + err);
                                    CommonMethods.strokeIt(errr);
                            }
                        
                      }
                 
                    });
                    
                    y += 40;
               }
            }
            catch(Exception err)
            {
                JOptionPane.showMessageDialog(null,"Error occured: " + err);
            }
    }
    
    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == btnBack)
            {
                dispose(); 
                AdminLogin login = new AdminLogin();
                CommonMethods.changePosition(login);
            }
        }
    }
    
}
