package gui;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Card_Layout extends JPanel {
	
	
	public Card_Layout() { 
		
		CardLayout cl = new CardLayout();   
		JPanel cardPanel = new JPanel(cl);	
		      
		    cardPanel.add(new ColorPanel(Color.WHITE), "WEISS");
		    cardPanel.add(new ColorPanel(Color.RED), "ROT");
		    cardPanel.add(new ColorPanel(Color.BLUE), "BLAU");
		    cardPanel.add(new ColorPanel(Color.YELLOW), "GELB");
		    cardPanel.add(new ColorPanel(Color.BLACK), "SCHWARZ");
		    cardPanel.add(new ColorPanel(Color.GREEN), "GRÜN");   
		    
		  
		    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		 
		    JButton forwardButton = new JButton("Weiter");
		    forwardButton.addActionListener(new ActionListener() {
		    	
		      public void actionPerformed(ActionEvent e) {
		         cl.next(cardPanel);
		      }
		
		    }); 
		 
		    JButton rearwardButton = new JButton("Zurück");
		    rearwardButton.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		         cl.previous(cardPanel);
		      }
		    });
		 
		    JButton yellowButton = new JButton("Gelb!");
		    yellowButton.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		         cl.show(cardPanel, "GELB"); 
		    });
		    buttonPanel.add(rearwardButton); 
		    buttonPanel.add(forwardButton);
		    buttonPanel.add(yellowButton);
		  
		    JFrame frame = new JFrame("CardLayout-Demo1");
		    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		    frame.add(cardPanel, BorderLayout.CENTER);
		    frame.add(buttonPanel, BorderLayout.SOUTH);
		    frame.pack();
		    frame.setLocationRelativeTo(null);  
		    frame.setVisible(true);
		    
		    
		 
		
	}
	 public static void main(String[] args) {
		
		    new Card_Layout();
		  }

}
