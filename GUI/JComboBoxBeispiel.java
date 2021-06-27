package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComboBoxBeispiel {

	public static void main(String[] args) {
		JFrame meinframe = new JFrame();
		meinframe.setTitle("ComboBox Beispiel");
		meinframe.setSize(250,250);
		meinframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		JLabel frage = new JLabel("Aus welchem Bundesland kommen sie?");
		panel.add(frage);
		
		//Array F�r unsere JComboBox
		String comboBoxListe[]=  {"Bundesland ausw�hlen","Baden W�rttemberg", "Bayern",
				"Berlin", "Brandenburg", "Bremen",
				"Hamburg", "Hessen", "Mecklenburg Vorpommern",
				"Niedersachsen", "Nordrhein	Westfalen", "Rheinland Pfalz",
				"Saarland", "Sachsen", "SachsenAnhalt",
				"SchleswigHolstein", "Th�ringen","Wei� ich nicht"};
		
		//JComboBox mit Bundesl�ndeer-Eintr�gen wird erstellt 
		JComboBox bundeslandAuswahl = new JComboBox(comboBoxListe);
		
		//JComboBox wird Panel hinzugef�gt
		panel.add(bundeslandAuswahl);
		meinframe.add(panel);
		meinframe.setVisible(true);
		

		 ActionListener listener = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg) {
					
					System.out.print("Selected: " + bundeslandAuswahl.getSelectedItem());
					
					System.out.println(", Position:" + bundeslandAuswahl.getSelectedIndex());
					
					
				}
	        };
		
		
		bundeslandAuswahl.addActionListener(listener);
		
		
	}

}
