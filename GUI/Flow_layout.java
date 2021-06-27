package gui;

import java.awt.*;
import java.awt.event.*;



	import javax.swing.JFrame;
		 
		 public class Flow_layout extends JFrame
		 {
		   public Flow_layout () 
		   {
		     setTitle("FlowLayout-Beispiel");                              
		     addWindowListener(new TestWindowListener());
		     
		     setLayout(new FlowLayout());                 
		     
		     for(int i=1; i<=10; i++)
		     {
		       add(new Label("Beschriftung" + i));
		     }
		     
		     setSize(300,150);										    
		     setVisible(true);                           
		   }
		 
		   class TestWindowListener extends WindowAdapter
		   {
		     public void windowClosing(WindowEvent e)
		     {
		       e.getWindow().dispose();                  
		       System.exit(0);                            
		     }    	 
		   }
		   
		   
		  
		   public static void main (String args[]) 
		   {
			   new Flow_layout ();
			   
		   }
		 }


