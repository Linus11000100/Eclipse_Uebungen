package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class JToggleButtonBeispiel {

	public static void main(String[] args) {
		
		JFrame meinJFrame = new JFrame();
		meinJFrame.setTitle("JToggleButton Beispiel");
		
		JPanel panel = new JPanel();
		
		JToggleButton toggleButton = new JToggleButton("Dr�ck mich ", true);
		
		panel.add(toggleButton);
		
		
		meinJFrame.add(panel);
		meinJFrame.pack();
		meinJFrame.setVisible(true);
		
		
		
	}

}
