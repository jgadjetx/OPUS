package GUI;

import USERCLASSES.CommonMethods;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ForgotUsername extends JFrame
{
	JButton btnFind,btnLogin,btnBack;
	JLabel lblID,lblSurname;
	JTextField txtID,txtSurname;
	
	Container pane;
	
	String theusername = null;

	public ForgotUsername()
	{
		//Adding logo to the window
        ImageIcon imageLogo = new ImageIcon("Resources//logo1.png");
        JLabel labelImage = new JLabel("",imageLogo,JLabel.CENTER);
        labelImage.setSize(500,400);
        labelImage.setLocation(200,80);
        
		//Buttons
		btnFind = new JButton("Find Username");
		btnFind.setSize(250,30);
		btnFind.setLocation(350,650);
		btnFind.addActionListener(new ButtonHandler());
		this.getRootPane().setDefaultButton(btnFind);
		
		btnLogin = new JButton("Login");
		btnLogin.setEnabled(false);
		btnLogin.setSize(250,30);
		btnLogin.setLocation(350,700);
		btnLogin.addActionListener(new ButtonHandler());
		
		btnBack = new JButton("Back");
		btnBack.setSize(250,30);
		btnBack.setLocation(350,750);
		btnBack.addActionListener(new ButtonHandler());
		
		//Labels
		lblID = new JLabel("ID:");
		lblID.setSize(50,30);
		lblID.setLocation(280,490);
		
		lblSurname = new JLabel("Surname:");
		lblSurname.setSize(250,30);
		lblSurname.setLocation(240,540);
		
		//TextField
		txtID = new JTextField(30);
		txtID.setSize(300,30);
		txtID.setLocation(320,490);
		
		txtSurname = new JTextField(30);
		txtSurname.setSize(300,30);
		txtSurname.setLocation(320,540);
		
		pane = getContentPane();
		pane.setLayout(null);
		pane.add(btnFind);
		pane.add(btnLogin);
		pane.add(lblID);
		pane.add(lblSurname);
		pane.add(btnBack);
		pane.add(txtID);
		pane.add(txtSurname);
		pane.add(labelImage);
		
	}
	
	public class ButtonHandler implements ActionListener
	{

		
		
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource() == btnFind)
			{
				try 
				{
					BufferedReader br = new BufferedReader(new FileReader("applicants.txt"));
					
					String textID = txtID.getText().toString();
					String textSurname = txtSurname.getText().toString();
					
					boolean found = false;
					
					String line = null;
					
					while((line = br.readLine()) != null)
					{
						String info [] = line.split(",");
						
						String foundSurname = info[6];
						String foundID = info[7];
						String foundUsername = info[8];
						
						if(textID.equals(foundID) && textSurname.equals(foundSurname))
						{
							found = true;
							theusername = foundUsername;		
							
							btnLogin.setEnabled(true);
							Dialog die = new Dialog("username found : " + theusername);
							CommonMethods.strokeIt(die);
							txtID.setEditable(false);
							txtSurname.setEditable(false);
							break;
						}					
						
					}
					
					
					if(!found)
					{
						Dialog die = new Dialog("Account details not found on system");
						CommonMethods.strokeIt(die);
						
						txtID.setText("");
						txtSurname.setText("");
					}
					
				} 
				catch (Exception err)
				{
					Dialog die = new Dialog("File Error Occured");
					CommonMethods.strokeIt(die);
				}
			}
			else if(e.getSource() == btnLogin)
			{
				dispose();
				//System.out.println(theusername);
				ViewProfile view = new ViewProfile(theusername);
				CommonMethods.changePosition(view);
			}
			else if(e.getSource() == btnBack)
			{
				dispose();
				Applicant app = new Applicant();
				CommonMethods.changePosition(app);
			}
			
		}
		
	}
	
	
	
}
