package USERCLASSES;


/**
 * Write a description of class Applicant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
import java.util.Calendar;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Applicant extends User
{
    private String jobApplied;
    private String highQual;
    private String driverLic;
    
    BufferedWriter bw = null;
    
    public Applicant(String name,String surname,String govID,String race,String username,String highQual,String driverLic,String jobApplied)
    {
        super(name,surname,govID,race,username);
        
        this.jobApplied = jobApplied;
        this.highQual = highQual;
        this.driverLic = driverLic;
    }
    
    public String getUniqueCode()
    {
        Random rand = new Random();
        int random = rand.nextInt(99999) + 10;
        String code = Calendar.getInstance().get(Calendar.YEAR)+ "-" + random;
        
        return code;
    }
    
    public void writeToFile()
    {
        try
        {
            bw = new BufferedWriter(new FileWriter("applicants.txt",true));
            
            bw.write(getUniqueCode() +","+ this.jobApplied +","+ this.highQual +","+ this.driverLic +","+ super.getGender() +","+ super.getAge() +","+ super.getName() +","+ super.getSurname() +","+ super.getGovID() +","+ super.getRace() +","+ super.getUsername());
            bw.newLine();
            bw.close();
        }
        catch(Exception err)
        {
            JOptionPane.showMessageDialog(null,"File Error, Contact administrator ");
        }
    }
    
}
