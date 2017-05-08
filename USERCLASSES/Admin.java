package USERCLASSES;


/**
 * Write a description of class Admin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Admin extends User
{
	BufferedWriter bw = null;
	
    public Admin()
    {
    	super("James","Ross","7004010672085","admin");
    }
    
    public void createVacancy(String title,String desc,String salary,String expiryDate)
    {
    	try
    	{
    		
    		bw = new BufferedWriter(new FileWriter("vacancies.txt",true));
    		
    		bw.write(title + "," + desc + "," + "R" + salary + "," + expiryDate);
    		bw.newLine();
    		bw.close();
    		
    		JOptionPane.showMessageDialog(null,"Vacancy Succesfully Entered To Database");
    	}
    	catch(Exception err)
    	{
    		JOptionPane.showMessageDialog(null,"Error occured, contact administrator");
    	}
    	
    }
}
