package GUI;


/**
 * Write a description of class TheGui here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JFrame;
import javax.swing.JPanel;

import USERCLASSES.CommonMethods;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.AlphaComposite;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;



public class OpeningScreen extends JFrame
{
    private JPanel mainPanel,buttonPanel;
    private JButton btnBegin,btnAbout,btnExit;

    public OpeningScreen()
    {        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        setUndecorated(true);
        setBackground(new Color(0, 255, 0, 0));
       
        setContentPane(new ContentPane());
        getContentPane().setBackground(Color.BLACK);
        setLayout(new BorderLayout());
        
        ImageIcon image = new ImageIcon("Resources//logo1.png");
        JLabel label = new JLabel("",image,JLabel.CENTER);       
        
        //Buttons        
        btnAbout = new JButton("About");
        btnAbout.addActionListener(new ButtonHandler());
        
        btnBegin = new JButton("Begin");
        btnBegin.addActionListener(new ButtonHandler());

        btnExit = new JButton("Exit ");
        btnExit.addActionListener(new ButtonHandler());

        
        buttonPanel = new JPanel(new GridLayout(1,3,5,5));
        buttonPanel.setOpaque(false);
        buttonPanel.add(btnAbout);
        buttonPanel.add(btnBegin);
        buttonPanel.add(btnExit);
        
        add(buttonPanel, BorderLayout.SOUTH);
        add(label);
     
    }

    public class ContentPane extends JPanel
    {

        public ContentPane()
        {

            setOpaque(false);
            
        }

        @Override
        protected  void paintComponent(Graphics g) 
        {

            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g.create();

            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.7f));

            g2d.setColor(getBackground());
            g2d.fill(getBounds());

            g2d.dispose();
            
            
        }

    }
    
    public class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnBegin)
            {
            	getContentPane().removeAll(); 
                getContentPane().repaint();
                
                LoginAs login = new LoginAs();
                CommonMethods.changePosition(login);
                
            }
            else if(e.getSource() == btnAbout)
            {
                 getContentPane().removeAll(); 
                 getContentPane().repaint();
                
                 AboutScreen about = new AboutScreen();    
                 CommonMethods.changePosition(about);
                 
            }
            else if(e.getSource() == btnExit)
            {
                System.exit(0);
            }
        }
    }
   
}
