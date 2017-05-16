package GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ConfirmDialog extends JFrame
{
	Container pane;
	JButton btnYes,btnNo;
	JLabel lbl;
	String text;
	
	String confirm = null;

	public ConfirmDialog(String text)
	{
		super("Confirm Actioin");
		this.text = text;
		
		
		btnYes = new JButton("Yes");
		btnYes.setSize(100,30);
		btnYes.setLocation(120,120);
		btnYes.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e) 
					{
						
						confirm = "yes";
					}
			
				});
		
		btnNo = new JButton("No");
		btnNo.setSize(100,30);
		btnNo.setLocation(290,120);
		btnNo.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) 
					{
						
						confirm = "no";
					}
			
				}
				);
		
		lbl = new JLabel(text);
		lbl.setSize(500,30);
		lbl.setLocation(50,20);
		
		pane = getContentPane();
		pane.setLayout(null);
		pane.add(btnYes);
		pane.add(btnNo);
		pane.add(lbl);
		
		
	}
	
	public String getConfirm()
	{
		return confirm;
	}

}
