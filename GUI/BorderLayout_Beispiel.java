package gui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import gui.Flow_layout.TestWindowListener;

	
	   public class BorderLayout_Beispiel extends Frame {
			
			   
			   public  BorderLayout_Beispiel() {
				
				   setTitle("BorderLayout-Beispiel");
				   addWindowListener(new TestWindowListener());
				   
				   setLayout(new BorderLayout());
				   
				   add(new Label("Center",Label.CENTER), BorderLayout.CENTER);
				   add(new Label("WEST",Label.CENTER), BorderLayout.WEST);
				   add(new Label("EAST",Label.CENTER), BorderLayout.EAST);
				   add(new Label("NORTH",Label.CENTER), BorderLayout.NORTH);
				   add(new Label("SOUTH",Label.CENTER), BorderLayout.SOUTH);
				   
				   setSize(400,400);
				   setVisible(true);
			   }
			   
			   
			   class TestWindowListener extends WindowAdapter{
				
				   public void windowClosing(WindowEvent e) {
					
					e.getWindow().dispose();
					System.exit(0);
				   }
			   }
			   
			   
			   public static void main (String args[]) {
				   new BorderLayout_Beispiel();
			   }
			   
			   
	}


