package package_hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class ProgInit {

	public static void main(String[] args) {
		
		HashMap<String, String> account = new HashMap<String, String>();
		
		account.put("JackisTh", "ThJackis123");
		account.put("StoyaAz", "AzStoya123");
		account.put("KasmerIb", "IbKasmer123");
		account.put("MoussaYa", "YaMoussa123");
	
		
		System.out.println(account.get("JackisTh"));
		
		String eingabe_username = JOptionPane.showInputDialog("Geben sie" + "Ihren Benutzernamen ein!");
		
		for(Entry<String,String> entry : account.entrySet()) {
			
			if (entry.getKey().contentEquals(eingabe_username)) {
				
				System.out.println("Benutzername gefunden" + account );
				String eingabe_password = JOptionPane.showInputDialog("Geben sie ihr Passwort ein");
				
				if (entry.getValue().contentEquals(eingabe_password)) {
					
					System.out.println("Sie haben sich eingeloggt");
				} 
				else {
					System.out.println("Passort falsch");
				}
			} 
			else {
				
				System.out.println("Benutzername Nicht gefunden");
				
			}
			
		}
		
	}

}
