package matches;

import javax.swing.JOptionPane;

public class Email {

	
		public static void main(String[] args) {
			String email = JOptionPane.showInputDialog("Bitte Email angeben");
			
			boolean bol = email.matches("^[\\w\\.=-]+@[\\w\\.-]+\\.[\\w]{2,3}$");
			System.out.println("Email Syntax richtig? " +bol);
			
		}

	}
