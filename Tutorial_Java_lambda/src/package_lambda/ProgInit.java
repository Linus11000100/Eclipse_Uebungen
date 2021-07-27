package package_lambda;

import java.util.ArrayList;

public class ProgInit {

	public static void main(String[] args) {
		
		ArrayList<String> person = new ArrayList<String>();
		person.add("Alex Jung");
		person.add("Mikheil Qambegashvili");
		person.add("Daniel Goletz");
		
		//for(String item : person) {
			
			//System.out.println(item);
		//}
		
		
		person.forEach((item) -> {System.out.println(item);});
		
	}

}
