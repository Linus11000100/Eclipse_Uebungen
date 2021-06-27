package bmi_gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Bmi_DialogGrid_GUI extends  JFrame implements ActionListener {
	JTextField txtGroesse, txtGewicht; 
	  JLabel labMeldung, labBmi; 
	  JRadioButton radioMaennlich, radioWeiblich;
	  JComboBox wahlAlter;
	  Boolean mw = false; 
	  int groesse,gewicht,alter;
	  
  public Bmi_DialogGrid_GUI(){   
	  JLabel labGroesse, labGewicht;
	    JButton btnStart; 
	    JPanel innen = new JPanel();
	  setDefaultCloseOperation(EXIT_ON_CLOSE); 
	  this.setSize(200,500);
	  innen.setLayout(new GridLayout(6,4));
	    radioMaennlich = new JRadioButton("maennlich");
	    radioWeiblich = new JRadioButton("weiblich");
	    ButtonGroup grpGeschlecht = new ButtonGroup();
	    grpGeschlecht.add(radioMaennlich);
	    grpGeschlecht.add(radioWeiblich);
	    radioMaennlich.setSelected(true);
	    
	    labGroesse = new JLabel("Groesse (cm):"); 
	    labGewicht = new JLabel("Gewicht (kg):"); 
	    JLabel labAlter = new JLabel("Alter:"); 
	    labMeldung = new JLabel(" "); 
	    labBmi = new JLabel(" "); 
	    
	    txtGroesse = new JTextField(); 
	    txtGroesse.setColumns(10);
	    txtGewicht = new JTextField(); 
	    txtGewicht.setColumns(10);
	  
	    String[] strAlterWahl = { "unter 25", "bis 34", "bis 44",
	                              "bis 54", "bis 64", "ueber 65" };
	    wahlAlter = new JComboBox(strAlterWahl);
	    btnStart = new JButton("OK"); 
	    btnStart.addActionListener(this); 
	    
	    innen.add(radioMaennlich); 
	    innen.add(radioWeiblich); 
	    innen.add(labGroesse); 
	    innen.add(txtGroesse); 
	    innen.add(labGewicht); 
	    innen.add(txtGewicht); 
	    innen.add(labAlter);
	    innen.add(wahlAlter);
	    innen.add(labBmi); 
	    innen.add(btnStart); 
	    innen.add(labMeldung);
	   getContentPane().add(innen);
	  pack();
	   setVisible(true);

	  
	   } 

	@Override
	public void actionPerformed(ActionEvent event) {
		if (txtGroesse.getText().length() > 0 && txtGewicht.getText().length() > 0) {
			try {
				 groesse = Integer.parseInt(txtGroesse.getText());
				 gewicht = Integer.parseInt(txtGewicht.getText());
			
				if (radioWeiblich.isSelected()) {
					mw = true;
				}
				// ComboBox Alter Auswahl
				 alter = wahlAlter.getSelectedIndex();  

			} catch (NumberFormatException ex) {
				labMeldung.setText("Fehlerhafte Eingabe");
			}
		} else {
			labMeldung.setText("Fehlende Eingaben");
		}
		    setVisible(false);    
		   Bmi_calc_GUI bcg = new Bmi_calc_GUI(groesse,gewicht,mw,alter);
		   System.out.println(groesse+ " "+gewicht+ " mw "+mw + " alter "+alter);
		   
	}

}
