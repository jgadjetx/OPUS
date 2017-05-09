package GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dialog extends JFrame
{
	Container pane;
	JButton btn;
	JLabel lbl;
	String text;
	
	public Dialog(String text)
	{
		super("Notification");
		this.text = text;
		
		btn = new JButton("Dismiss");
		btn.setSize(100,30);
		btn.setLocation(150,120);
		btn.addActionListener(new Button());
		
		lbl = new JLabel(text);
		lbl.setSize(250,30);
		lbl.setLocation(10,20);
		
		pane = getContentPane();
		pane.setLayout(null);
		pane.add(btn);
		pane.add(lbl);
	}
	
	public class Button implements ActionListener
	{

		public void actionPerformed(ActionEvent arg0) 
		{
			dispose();
		}
		
	}

}
