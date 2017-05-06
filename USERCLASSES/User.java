package USERCLASSES;


/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Calendar;

public class User implements Accountable
{
    private String name;
    private String surname;
    private String govID;
    private String username; 
    private String gender;
    
    public User(String name,String surname,String govID,String username)
    {
        this.name = name;
        this.surname = surname;
        this.govID = govID;
        this.username = username;      
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getSurname()
    {
        return this.surname;
    }
    
    public String getGovID()
    {
        return this.govID;
    }
    
    
    public String getUsername()
    {
        return this.username;
    }
    
    public String getAge()
    {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int birthYear = Integer.valueOf(this.govID.substring(0,2)) + 1900;
        int age = currentYear - birthYear;
        
        return String.valueOf(age);
    }
    
    public String getGender()
    {
        int genderNum = Integer.valueOf(this.govID.substring(6,7));
        
        String gender = null;
        
        if (genderNum >= 0 && genderNum <= 4 )
        {
            gender = "Female";
        }
        else if(genderNum >= 5 && genderNum <= 9)
        {
            gender = "Male";
        }
        
        return gender;
    }
    
    
    
    
    
}
