import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Frame1 {

	private JFrame frame;

	
	
	String ergebnis1;
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}
	String comboBoxListe[]=  {"--Auswahl--","Herr","Frau","Ens"};
	private JTextField projektarbeit_field;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_11;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1061, 710);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel firstname_label = new JLabel("");
		firstname_label.setBounds(359, 320, 101, 20);
		frame.getContentPane().add(firstname_label);
		
		JLabel projektarbeit_label = new JLabel("Projektarbeit");
		projektarbeit_label.setBounds(52, 320, 200, 20);
		frame.getContentPane().add(projektarbeit_label);
		
		JLabel firstname_label_1_1 = new JLabel("Projekt Dokumentation");
		firstname_label_1_1.setBounds(52, 360, 200, 20);
		frame.getContentPane().add(firstname_label_1_1);
		
		JLabel firstname_label_1_2 = new JLabel("Projekt Pr\u00E4sentation");
		firstname_label_1_2.setBounds(52, 400, 200, 20);
		frame.getContentPane().add(firstname_label_1_2);
		
		JLabel firstname_label_1_3 = new JLabel("Projekt Fachgespr\u00E4ch");
		firstname_label_1_3.setBounds(52, 440, 200, 20);
		frame.getContentPane().add(firstname_label_1_3);
		
		projektarbeit_field = new JTextField();
		projektarbeit_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c== KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		projektarbeit_field.setColumns(10);
		projektarbeit_field.setBounds(250, 320, 60, 26);
		frame.getContentPane().add(projektarbeit_field);
		
		projektarbeit_field.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double rechnung;
				String input = projektarbeit_field.getText();
				JLabel firstname_label_1_4 = new JLabel(input);
				firstname_label_1_4.setBounds(347, 211, 69, 20);
				frame.getContentPane().add(firstname_label_1_4);
				
				rechnung = Integer.parseInt(input);
				firstname_label.setText(input);
			}
		});
		
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c== KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(250, 360, 60, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c== KeyEvent.VK_DELETE)) {
					e.consume();
				}
			
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(250, 400, 60, 26);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c== KeyEvent.VK_DELETE)) {
					e.consume();
				}
			
			}
		});
		textField_3.setColumns(10);
		textField_3.setBounds(250, 440, 60, 26);
		frame.getContentPane().add(textField_3);
		
		JButton save_btn = new JButton("Speichern");
		save_btn.setBounds(766, 609, 115, 29);
		frame.getContentPane().add(save_btn);
		
		JButton ready_btn = new JButton("Fertig");
		ready_btn.setBounds(909, 609, 115, 29);
		frame.getContentPane().add(ready_btn);
		
		JLabel lblNewLabel = new JLabel("Teil A Projektarbeit");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(52, 240, 373, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Teil A Projektarbeit");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(587, 240, 373, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton save_btn_1 = new JButton("Neue auswertung");
		save_btn_1.setBounds(587, 609, 157, 29);
		frame.getContentPane().add(save_btn_1);
		
		JLabel lastname_label_1 = new JLabel("/100");
		lastname_label_1.setBounds(315, 320, 69, 20);
		frame.getContentPane().add(lastname_label_1);
		
		JLabel lastname_label_1_1 = new JLabel("/100");
		lastname_label_1_1.setBounds(315, 360, 69, 20);
		frame.getContentPane().add(lastname_label_1_1);
		
		JLabel lastname_label_1_2 = new JLabel("/100");
		lastname_label_1_2.setBounds(315, 400, 69, 20);
		frame.getContentPane().add(lastname_label_1_2);
		
		JLabel lastname_label_1_3 = new JLabel("/100");
		lastname_label_1_3.setBounds(315, 440, 69, 20);
		frame.getContentPane().add(lastname_label_1_3);
		
		JLabel lastname_label_2 = new JLabel("Punkte");
		lastname_label_2.setHorizontalAlignment(SwingConstants.CENTER);
		lastname_label_2.setBounds(250, 288, 93, 20);
		frame.getContentPane().add(lastname_label_2);
		
		JLabel projektarbeit_label_1 = new JLabel("Fachqualifikation");
		projektarbeit_label_1.setBounds(614, 314, 200, 20);
		frame.getContentPane().add(projektarbeit_label_1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c== KeyEvent.VK_DELETE)) {
					e.consume();
				}
			
			}
		});
		textField.setColumns(10);
		textField.setBounds(812, 314, 60, 26);
		frame.getContentPane().add(textField);
		
		JLabel lastname_label_1_4 = new JLabel("/100");
		lastname_label_1_4.setBounds(877, 314, 69, 20);
		frame.getContentPane().add(lastname_label_1_4);
		
		JLabel lastname_label_1_1_1 = new JLabel("/100");
		lastname_label_1_1_1.setBounds(877, 354, 69, 20);
		frame.getContentPane().add(lastname_label_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c== KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		textField_4.setColumns(10);
		textField_4.setBounds(812, 354, 60, 26);
		frame.getContentPane().add(textField_4);
		
		JLabel firstname_label_1_1_1 = new JLabel("Projekt Kernqualifikation");
		firstname_label_1_1_1.setBounds(614, 354, 200, 20);
		frame.getContentPane().add(firstname_label_1_1_1);
		
		JLabel firstname_label_1_2_1 = new JLabel("Wirtschaft/Sozialkunde");
		firstname_label_1_2_1.setBounds(614, 394, 200, 20);
		frame.getContentPane().add(firstname_label_1_2_1);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c== KeyEvent.VK_DELETE)) {
					e.consume();
				}
			
			}
		});
		textField_5.setColumns(10);
		textField_5.setBounds(812, 394, 60, 26);
		frame.getContentPane().add(textField_5);
		
		JLabel lastname_label_1_2_1 = new JLabel("/100");
		lastname_label_1_2_1.setBounds(877, 394, 69, 20);
		frame.getContentPane().add(lastname_label_1_2_1);
		
		JLabel anrede_label_1 = new JLabel("Pr\u00FCfer");
		anrede_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		anrede_label_1.setBounds(757, 30, 230, 20);
		frame.getContentPane().add(anrede_label_1);
		
		JLabel anrede_label_2 = new JLabel("Anrede");
		anrede_label_2.setBounds(757, 69, 69, 20);
		frame.getContentPane().add(anrede_label_2);
		
		JComboBox p_comboBox = new JComboBox(comboBoxListe);
		p_comboBox.setBounds(841, 66, 146, 26);
		frame.getContentPane().add(p_comboBox);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(841, 99, 146, 26);
		frame.getContentPane().add(textField_6);
		
		JLabel p_lastname_jl = new JLabel("Name");
		p_lastname_jl.setBounds(757, 102, 69, 20);
		frame.getContentPane().add(p_lastname_jl);
		
		JLabel p_firstname_jl = new JLabel("Vorname");
		p_firstname_jl.setBounds(757, 132, 69, 20);
		frame.getContentPane().add(p_firstname_jl);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(841, 129, 146, 26);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(841, 159, 146, 26);
		frame.getContentPane().add(textField_10);
		
		JLabel pid_jl = new JLabel("Pr\u00FCfer ID");
		pid_jl.setBounds(757, 162, 69, 20);
		frame.getContentPane().add(pid_jl);
		
		JLabel anrede_label_1_1 = new JLabel("Sch\u00FCler");
		anrede_label_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		anrede_label_1_1.setBounds(52, 30, 230, 20);
		frame.getContentPane().add(anrede_label_1_1);
		
		JLabel anrede_label_2_1 = new JLabel("Anrede");
		anrede_label_2_1.setBounds(52, 66, 69, 20);
		frame.getContentPane().add(anrede_label_2_1);
		
		JComboBox s_comboBox = new JComboBox(comboBoxListe);
		s_comboBox.setBounds(136, 66, 146, 26);
		frame.getContentPane().add(s_comboBox);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(136, 96, 146, 26);
		frame.getContentPane().add(textField_7);
		
		JLabel s_lastname_jl = new JLabel("Name");
		s_lastname_jl.setBounds(52, 99, 69, 20);
		frame.getContentPane().add(s_lastname_jl);
		
		JLabel s_firstname_jl = new JLabel("Vorname");
		s_firstname_jl.setBounds(52, 129, 69, 20);
		frame.getContentPane().add(s_firstname_jl);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(136, 126, 146, 26);
		frame.getContentPane().add(textField_8);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(136, 156, 146, 26);
		frame.getContentPane().add(textField_11);
		
		JLabel s_id_jl = new JLabel("Pr\u00FCfer ID");
		s_id_jl.setBounds(52, 159, 69, 20);
		frame.getContentPane().add(s_id_jl);
		
		JLabel lblNewLabel_2 = new JLabel("100 - 92");
		lblNewLabel_2.setBounds(413, 65, 69, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("91 - 81");
		lblNewLabel_2_1.setBounds(413, 85, 69, 20);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("80 - 67");
		lblNewLabel_2_2.setBounds(413, 105, 69, 20);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("66 - 50");
		lblNewLabel_2_1_1.setBounds(413, 125, 69, 20);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("49 - 30");
		lblNewLabel_2_3.setBounds(413, 145, 69, 20);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("< 30");
		lblNewLabel_2_1_2.setBounds(413, 165, 69, 20);
		frame.getContentPane().add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("sehr gut");
		lblNewLabel_2_4.setBounds(497, 65, 69, 20);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("gut");
		lblNewLabel_2_1_3.setBounds(497, 85, 69, 20);
		frame.getContentPane().add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("befriedigend");
		lblNewLabel_2_2_1.setBounds(497, 105, 115, 20);
		frame.getContentPane().add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("ausreichend");
		lblNewLabel_2_1_1_1.setBounds(497, 125, 115, 20);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("mangelhaft");
		lblNewLabel_2_3_1.setBounds(497, 145, 115, 20);
		frame.getContentPane().add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("ungen\u00FCgend");
		lblNewLabel_2_1_2_1.setBounds(497, 165, 115, 20);
		frame.getContentPane().add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_5 = new JLabel("Punkte / Noten");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setBounds(413, 30, 153, 20);
		frame.getContentPane().add(lblNewLabel_2_5);
		
		
	}
	
	
	
	
}
