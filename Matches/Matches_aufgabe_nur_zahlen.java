package matches;

import javax.swing.JOptionPane;

public class Matches_aufgabe_nur_zahlen {

	public static void main(String[] args) {
		
		
		
		String onlyNumbers = "1233432";
		String onlyRegey="[0-9]*";
		if (onlyNumbers.matches(onlyRegey)) {
			System.out.println("Nur Zahlen");
		}
		
		else {
			System.out.println("Nicht nur Zahlen");
		}
		
	}

}
