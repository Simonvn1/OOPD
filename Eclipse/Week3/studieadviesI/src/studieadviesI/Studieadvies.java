package studieadviesI;

public class Studieadvies {
	
	public static boolean krijgtPositiefStudieadvies(Student s) {

		int[] cijfers = s.getCijfers();
		int counter = 0;
		for(int cijfer : cijfers) {
			if(cijfer > 5) {
				counter++;
			}
		}
		if(counter>3) {
			return true;
		}
		
		return false;
	}

}
