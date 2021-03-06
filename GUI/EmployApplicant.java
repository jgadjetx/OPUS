package GUI;


/**
 * Write a description of class ViewEmployees here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

import USERCLASSES.CommonMethods;
import USERCLASSES.Employee;
import USERCLASSES.User;

public class EmployApplicant extends JFrame
{
    JButton btnBack,btnAddEmployee,btnRemove,btnRemove2,btnRemove3;
    JPanel panelList,panelContent;
    JLabel lblViewEmployee;
    Container pane;
    
    BufferedReader br,applicantBuffered;
    BufferedWriter bw;
    
   
    
    int y = 150;
    
    public EmployApplicant()
    {
        Font heading = new Font("Play",Font.PLAIN,35);
        Font lable = new Font("Play",Font.BOLD,15);
        Font table = new Font("Play",Font.BOLD,12);
        
        
        appendDataToForm();
        
        //Table Format
        
        String tableString = String.format("%-20s %-20s %-20s %-20s %-20s %-20s","Unique ID","Job Position","Highest Qual.","Drivers Lic","Gender","Age");
        JLabel tableHeading = new JLabel();
        tableHeading.setText(tableString);
        tableHeading.setFont(table);
        tableHeading.setSize(700,30);
        tableHeading.setLocation(110,105);
        
        lblViewEmployee = new JLabel("Employ Applicant");
        lblViewEmployee.setFont(heading);
        lblViewEmployee.setSize(300,40);
        lblViewEmployee.setLocation(520,50);
        
        
        btnBack = new JButton("Back");
        btnBack.addActionListener(new ButtonHandler());
        btnBack.setSize(250,30);
        btnBack.setLocation(330,800);
        
              
        panelList = new JPanel(new GridLayout(10,1,50,20));
        panelList.setSize(700,700);
        panelList.setOpaque(true);
        panelList.setBackground(Color.DARK_GRAY);
        panelList.setLocation(100,130);
               
       
        pane = getContentPane();
        pane.setLayout(null);
        pane.add(lblViewEmployee);
        pane.add(btnBack);
        pane.add(tableHeading);
        
    }
    
    public void appendDataToForm()
    {
    	try
    	{
    		br = new BufferedReader(new FileReader("applicants.txt"));
    		
    		String line;
    		
    		while((line = br.readLine())!= null)
    		{
    			String [] info = line.split(",");
        		
    			String uniqueID = info[0];
    			String jobApplied = info[1];
    			String highQual = info[2];
    			String driverLic = info[3];
    			String gender = info[4];
        		String name = info[5];
        		String surname = info[6];
        		String govID = info[7];
        		String username = info[8];
        		String status = info[9];
        		
        		
        		
        		//
        		
        		if (status.equals("Being Evaluated")) 
        		{
        			
        			Employee user = new Employee(name,surname,govID,username); 
        			String row = String.format("%-20s %-20s %-20s %-20s %-20s %-20s", uniqueID, jobApplied, highQual,
							driverLic, gender, user.getAge());
					JLabel text = new JLabel();
					text.setText(row);
					Font app = new Font("Play", Font.BOLD, 12);
					text.setFont(app);
					text.setLocation(110, y);
					pane = getContentPane();
					text.setSize(800, 30);
					pane.add(text);
					JButton button = new JButton("Hire");
					button.setSize(100, 20);
					button.setLocation(650, y);
					pane.add(button);
					button.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent e) {
							
							button.setEnabled(false);
							Dialog die = new Dialog("Applicant " + uniqueID + "Has been employed");
							CommonMethods.strokeIt(die);
							
							try {
								bw = new BufferedWriter(new FileWriter("employees.txt", true));

								bw.write(uniqueID + "," + govID + "," + surname + "," + name + ","+ jobApplied + "," + gender + ","
										+ user.getAge() + "," + driverLic);
								bw.newLine();
								bw.close();

								//Change Status							
								File original = new File("applicants.txt");
								File temp = new File("tempApplicants.txt");

								BufferedReader reader = new BufferedReader(new FileReader(original));
								BufferedWriter writer = new BufferedWriter(new FileWriter(temp));

								String line = null;

								while ((line = reader.readLine()) != null) {
									String[] data = line.split(",");

									String readCode = data[0];

									if (readCode.equals(uniqueID)) {
										String newLine = "Employed";

										String uniqueID = info[0];
										String jobApplied = info[1];
										String highQual = info[2];
										String driverLic = info[3];
										String gender = info[4];
										String name = info[5];
										String surname = info[6];
										String govID = info[7];
										String username = info[8];

										writer.write(uniqueID + "," + jobApplied + "," + highQual + "," + driverLic
												+ "," + gender + "," + name + "," + surname + "," + govID + ","
												+ username + "," + newLine);
										writer.newLine();
									} else {
										writer.write(line);
										writer.newLine();
										continue;
									}

								}

								br.close();
								reader.close();
								writer.close();

								original.delete();
								temp.renameTo(original);
							} catch (Exception err) {
								Dialog errr = new Dialog("Error Occured...Contact Admin" + err);
								CommonMethods.strokeIt(errr);
							}
							
							

							
						}
						
						
						
				 	});
					
					y += 30;
				}
				
        		  		
        		
    		}
    		
    		
    		
    		
    	}
    	catch(Exception err)
    	{
    		JOptionPane.showMessageDialog(null,"Error Bitch");
    	}
    }
    
    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == btnBack)
            {
                AdminLogin admin = new AdminLogin();
                CommonMethods.changePosition(admin);
            }
            
        }
    }
    
 
}
