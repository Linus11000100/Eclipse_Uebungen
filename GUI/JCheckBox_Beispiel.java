package gui;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JCheckBox_Beispiel  {

	public static void main(String[] args) {
		
		JFrame meinFrame = new JFrame();
		
		
		meinFrame.setSize(450,300);
		meinFrame.setTitle("JCheckBox Beispiel");
		meinFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel =new JPanel();
		panel.setBackground(Color.lightGray);
		JLabel label = new JLabel("Ich möchte meinen Tee mit...");
		
		panel.add(label);
		
		
		
		JCheckBox checkBoxMilch = new JCheckBox("Milch");
		JCheckBox checkBoxZucker = new JCheckBox("Zucker");
		
		
		 ActionListener listener = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg) {
					System.out.println("Checkbox "+ checkBoxMilch.isSelected());
					if (checkBoxMilch.isSelected()) {
						System.out.println ("Milch ist ausgewählt");
					}
					System.out.println("Checkbox "+ checkBoxZucker.isSelected());
					if (checkBoxZucker.isSelected()) {
						System.out.println ("Zucker ist ausgewählt");
					}
					
					
				}
	        	
	        };
		
		checkBoxMilch.addActionListener(listener);
		checkBoxZucker.addActionListener(listener);

		panel.add(checkBoxMilch);
		panel.add(checkBoxZucker);
		
		meinFrame.add(panel);
		
		meinFrame.setVisible(true);
	}

	
	
}
