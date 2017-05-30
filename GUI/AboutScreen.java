package GUI;


/**
 * Write a description of class AboutScreen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.Font;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Desktop;
import java.net.URI;
import java.awt.Cursor;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AboutScreen extends JFrame
{
    private JLabel txtAbout,txtDescription,txtMeet,pjImage,keaImage,pjName,keaName,txtPjRoles,txtKeaRoles;
    private JLabel pjLinkedIn,pjGit,pjEmail,keaLinkedIn,keaGit,keaEmail;
    private JLabel linkPjLinked,linkKeaLinked,linkPjGit,linkKeaGit,linkPjEmail,linkKeaEmail,website;
    private JButton btnClose;
    private ImageIcon imagePj,imageKea,ImagepjLinkedIn,ImagepjGit,ImagepjEmail,ImagekeaLinkedIn,ImagekeaGit,ImagekeaEmail;
    private Container pane;
    
    public AboutScreen()
    {
        super("About");
        
        //initialize variable
        //JLabel
        Font font = new Font("Play",Font.BOLD,30);
        
        txtAbout = new JLabel("ABOUT");
        txtAbout.setFont(font);
        txtAbout.setSize(200,30);
        txtAbout.setLocation(30,15);
        
        //Button
        btnClose = new JButton("Close");
        btnClose.setSize(100,30);
        btnClose.setLocation(750,15);
        btnClose.addActionListener(new ButtonHandler());
        
        
        
        Font font2 = new Font("Play",Font.PLAIN,15);
        txtDescription = new JLabel("OPUS is a system that allows the employment of workers at a school in a corruption free manner");
        txtDescription.setFont(font2);
        txtDescription.setSize(800,70);
        txtDescription.setLocation(90,65);
        
        ImageIcon image = new ImageIcon("Resources//rename.png");
        JLabel label = new JLabel("",image,JLabel.CENTER);
        label.setSize(250,150);
        label.setLocation(280,130);

        txtMeet = new JLabel("meet the team");
        txtMeet.setFont(font);
        txtMeet.setSize(300,30);
        txtMeet.setLocation(300,300);
        
        //Selfies
        
        ImageIcon pj = new ImageIcon("Resources//pj.jpg");
        JLabel picPj = new JLabel("");
        picPj.setIcon(pj);
        picPj.setSize(300,300);
        picPj.setLocation(20,350);
        
        ImageIcon kea = new ImageIcon("Resources//kea.jpg");
        JLabel picKea = new JLabel("");
        picKea.setIcon(kea);
        picKea.setSize(300,300);
        picKea.setLocation(562,350);
        
        ////
        //Icons
        
        ImageIcon pjIcon = new ImageIcon("Resources//logosComb2.png");
        JLabel pjLogo = new JLabel("");
        pjLogo.setIcon(pjIcon);
        pjLogo.setSize(40,150);
        pjLogo.setLocation(10,740);
        
        ImageIcon keaIcon = new ImageIcon("Resources//logosComb.png");
        JLabel keaLogo = new JLabel("");
        keaLogo.setIcon(keaIcon);
        keaLogo.setSize(40,150);
        keaLogo.setLocation(560,740);
        

        
        //
        pjName = new JLabel("Phumudzo Muvhango [26011204]");
        pjName.setFont(font2);
        pjName.setSize(400,30);
        pjName.setLocation(10,675);
        
        txtPjRoles = new JLabel("Lead Developer . UX Designer");
        txtPjRoles.setFont(font2);
        txtPjRoles .setSize(400,30);
        txtPjRoles.setLocation(10,700);
        
        keaName = new JLabel("Keagile Konyana [27267253]");
        keaName.setFont(font2);
        keaName.setSize(400,30);
        keaName.setLocation(562,675);
        
        txtKeaRoles = new JLabel("Developer . System Analyst");
        txtKeaRoles.setFont(font2);
        txtKeaRoles.setSize(400,30);
        txtKeaRoles.setLocation(562,700);
        
        
        // //Images
        // ImagepjLinkedIn = new ImageIcon("Resources//linkedin.png");
        
        // ImagepjGit = new ImageIcon("Resources//github.png");
        
        // ImagepjEmail = new ImageIcon("Resources//email.png");
        
        
        //Links
        linkPjLinked = new JLabel("<html> <a href=\"\">linkedin</a> </html>");
        linkPjLinked.setCursor(new Cursor(Cursor.HAND_CURSOR));
        linkPjLinked.addMouseListener(new  MouseHandler());
        linkPjLinked.setSize(60,30);
        linkPjLinked.setLocation(50,745);
        
        
        linkKeaLinked = new JLabel("<html> <a href=\"\">linkedin</a> </html>");
        linkKeaLinked.setCursor(new Cursor(Cursor.HAND_CURSOR));
        linkKeaLinked.addMouseListener(new  MouseHandler());
        linkKeaLinked.setSize(60,30);
        linkKeaLinked.setLocation(600,745);
        
        linkPjGit = new JLabel("<html> <a href=\"\">github</a> </html>");
        linkPjGit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        linkPjGit.addMouseListener(new  MouseHandler());
        linkPjGit.setSize(60,30);
        linkPjGit.setLocation(50,778);
        
        linkKeaGit = new JLabel("<html> <a href=\"\">github</a> </html>");
        linkKeaGit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        linkKeaGit.addMouseListener(new  MouseHandler());
        linkKeaGit.setSize(60,30);
        linkKeaGit.setLocation(600,772);
        
        linkPjEmail = new JLabel("getintouch@phumudzo.co.za");
        linkPjEmail.setSize(200,30);
        linkPjEmail.setLocation(50,810);
        
        linkKeaEmail = new JLabel("ekkonyana@gmail.com");
        linkKeaEmail.setSize(150,30);
        linkKeaEmail.setLocation(600,805);
        
        website = new JLabel("<html> <a href=\"\">phumudzo.co.za</a> </html>");
        website.setCursor(new Cursor(Cursor.HAND_CURSOR));
        website.addMouseListener(new  MouseHandler());
        website.setSize(150,30);
        website.setLocation(50,850);
        
        
        
        //Panel
        pane = getContentPane();
        pane.setLayout(null);
        pane.add(txtAbout);
        pane.add(txtDescription);
        pane.add(label);
        pane.add(txtMeet);
        pane.add(keaLogo);
        pane.add(picPj);
        pane.add(picKea);
        pane.add(pjLogo);
        pane.add(pjName);
        pane.add(txtPjRoles);
        pane.add(keaName);
        pane.add(txtKeaRoles);
        pane.add(btnClose);
        pane.add(linkPjLinked);
        pane.add(linkKeaLinked);
        pane.add(linkPjGit);
        pane.add(linkKeaGit);
        pane.add(linkPjEmail);
        pane.add(linkKeaEmail);
        pane.add(linkKeaEmail);
        pane.add(website);

    }
    
    public class MouseHandler implements MouseListener
   {
       public void mouseClicked(MouseEvent e)
       {  
    	   if(e.getSource() == website)
           {
               try
               {
                   Desktop.getDesktop().browse(new URI("https://www.phumudzo.co.za"));
                   setAlwaysOnTop(false);
               }
               catch(Exception err)
               {
                   System.out.println("Link Error : " + err);
               }
           }
    	   else if(e.getSource() == linkPjLinked)
           {
               try
               {
                   Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/phumudzo-muvhango-1301a8117/"));
                   setAlwaysOnTop(false);
               }
               catch(Exception err)
               {
                   System.out.println("Link Error : " + err);
               }
           }
           else if (e.getSource() == linkKeaLinked)
           {
               try
               {
                   Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/keagile-konyana-89819813a/"));
                   setAlwaysOnTop(false);
               }
               catch(Exception err)
               {
                   System.out.println("Link Error : " + err);
               }               
           }
           else if (e.getSource() == linkPjGit)
           {
               try
               {
                   Desktop.getDesktop().browse(new URI("https://github.com/jgadjetx"));
                   setAlwaysOnTop(false);
               }
               catch(Exception err)
               {
                  System.out.println("Link Error : " + err);
               }                   
           }
           else if (e.getSource() == linkKeaGit)
           {
               try
               {
                   Desktop.getDesktop().browse(new URI("https://github.com/Kea-gile"));
                   setAlwaysOnTop(false);
               }
               catch(Exception err)
               {
                   System.out.println("Link Error : " + err);
               }                   
           }
       }
       
       public void mouseExited(MouseEvent e)
       {
       }
       
       public void mouseEntered(MouseEvent e)
       {
       }
       
       public void mouseReleased(MouseEvent e)
       {
       }
       
       public void mousePressed(MouseEvent e)
       {
       }
   }
   
   public class ButtonHandler implements ActionListener
   {
	  
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource() == btnClose)
		{
			dispose();
			System.exit(0);
			
		}
		
	}
   }
}


