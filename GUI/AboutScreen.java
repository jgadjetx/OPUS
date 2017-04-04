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
    private JLabel linkPjLinked,linkKeaLinked,linkPjGit,linkKeaGit,linkPjEmail,linkKeaEmail;
    private JButton btnClose;
    private ImageIcon imagePj,imageKea,ImagepjLinkedIn,ImagepjGit,ImagepjEmail,ImagekeaLinkedIn,ImagekeaGit,ImagekeaEmail;
    private Container pane;
    
    public AboutScreen()
    {
        super("About");
        
        //initialize variable
        //JLabel
        Font font = new Font("Play",Font.PLAIN,30);
        
        txtAbout = new JLabel("ABOUT");
        txtAbout.setFont(font);
        txtAbout.setSize(100,30);
        txtAbout.setLocation(10,10);
        
        //Button
        btnClose = new JButton("Close");
        btnClose.setSize(100,30);
        btnClose.setLocation(750,10);
        
        
        
        Font font2 = new Font("Play",Font.PLAIN,15);
        txtDescription = new JLabel("OPUS is a system that allows the employment of workers at a school in a corruption free manner");
        txtDescription.setFont(font2);
        txtDescription.setSize(800,30);
        txtDescription.setLocation(10,65);
        
       

        txtMeet = new JLabel("meet the team");
        txtMeet.setFont(font);
        txtMeet.setSize(300,30);
        txtMeet.setLocation(337,210);
        
        //Selfies
        
        ImageIcon pj = new ImageIcon("Resources//pj.jpg");
        JLabel picPj = new JLabel("");
        picPj.setIcon(pj);
        picPj.setSize(300,300);
        picPj.setLocation(10,285);
        
        ImageIcon kea = new ImageIcon("Resources//kea.jpg");
        JLabel picKea = new JLabel("");
        picKea.setIcon(kea);
        picKea.setSize(300,300);
        picKea.setLocation(562,285);
        
        ////
        
        pjName = new JLabel("Phumudzo Muvhango");
        pjName.setFont(font2);
        pjName.setSize(400,30);
        pjName.setLocation(10,675);
        
        txtPjRoles = new JLabel("Lead Developer . UX Designer");
        txtPjRoles.setFont(font2);
        txtPjRoles .setSize(400,30);
        txtPjRoles.setLocation(10,700);
        
        keaName = new JLabel("Keagile Konyana");
        keaName.setFont(font2);
        keaName.setSize(400,30);
        keaName.setLocation(562,675);
        
        txtKeaRoles = new JLabel("Developer . Peasant . Has A Girlfriend");
        txtKeaRoles.setFont(font2);
        txtKeaRoles.setSize(400,30);
        txtKeaRoles.setLocation(562,700);
        
        
        //Images
        ImagepjLinkedIn = new ImageIcon("Resources//linkedin.png");
        
        ImagepjGit = new ImageIcon("Resources//github.png");
        
        ImagepjEmail = new ImageIcon("Resources//email.png");
        
        
        //Links
        linkPjLinked = new JLabel("<html> <a href=\"\">linkedin</a> </html>");
        linkPjLinked.setCursor(new Cursor(Cursor.HAND_CURSOR));
        linkPjLinked.addMouseListener(new  MouseHandler());
        linkPjLinked.setSize(200,30);
        linkPjLinked.setLocation(20,757);
        
        
        linkKeaLinked = new JLabel("<html> <a href=\"\">linkedin</a> </html>");
        linkKeaLinked.setCursor(new Cursor(Cursor.HAND_CURSOR));
        linkKeaLinked.addMouseListener(new  MouseHandler());
        linkKeaLinked.setSize(200,30);
        linkKeaLinked.setLocation(582,757);
        
        linkPjGit = new JLabel("<html> <a href=\"\">github</a> </html>");
        linkPjGit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        linkPjGit.addMouseListener(new  MouseHandler());
        linkPjGit.setSize(200,30);
        linkPjGit.setLocation(20,780);
        
        linkKeaGit = new JLabel("<html> <a href=\"\">github</a> </html>");
        linkKeaGit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        linkKeaGit.addMouseListener(new  MouseHandler());
        linkKeaGit.setSize(200,30);
        linkKeaGit.setLocation(582,780);
        
        linkPjEmail = new JLabel("pa.muvhango@gmail.com");
        linkPjEmail.setCursor(new Cursor(Cursor.HAND_CURSOR));
        linkPjEmail.addMouseListener(new  MouseHandler());;
        linkPjEmail.setSize(200,30);
        linkPjEmail.setLocation(20,800);
        
        linkKeaEmail = new JLabel("ekkonyana@gmail.com");
        linkKeaEmail.setCursor(new Cursor(Cursor.HAND_CURSOR));
        linkKeaEmail.addMouseListener(new  MouseHandler());
        linkKeaEmail.setSize(200,50);
        linkKeaEmail.setLocation(582,790);
        
        
        
        //Panel
        pane = getContentPane();
        pane.setLayout(null);
        pane.add(txtAbout);
        pane.add(txtDescription);
        pane.add(txtMeet);
        
        pane.add(picPj);
        pane.add(picKea);
        
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
        
        //Open Window
        setLocationRelativeTo(null);
        setSize(900,900);
        setVisible(true);
        //setUndecorated(true);
    }
    
    public class MouseHandler implements MouseListener
   {
       public void mouseClicked(MouseEvent e)
       {           
           if(e.getSource() == linkPjLinked)
           {
               try
               {
                   Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/phumudzo-muvhango-1301a8117/"));
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
                   Desktop.getDesktop().browse(new URI("https://github.com/PMJAYY"));
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
   
   public Container getPanel()
   {
       return pane;
   }
}


