package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI_Button {

	public static void main(String[] args) {
		
		JFrame MJFrame = new JFrame();
		MJFrame.setTitle("TestTitle");
		MJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		JButton button = new JButton("Bitte drücken");
		
		panel.add(button);
		
		MJFrame.add(panel);
		
		MJFrame.pack();
		MJFrame.setVisible(true);
		
		
		
	
	}

}
