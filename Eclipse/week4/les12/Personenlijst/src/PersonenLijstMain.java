import java.util.ArrayList;

public class PersonenLijstMain {

	// TODO Auto-generated method stub
	private ArrayList<Persoon> lijst;
	
	public PersonenLijstMain() {
		lijst = new ArrayList<>(); 
	}
	
	public ArrayList<Persoon> getSLBStudenten(Docent SLBer) {
		ArrayList<Persoon> leerlingen = new ArrayList<>();
		for(Persoon leerling: lijst) {
			if(leerling instanceof Student) {
				if(leerling.getSLBer() == SLBer) {
					leerlingen.add(leerling);
				}
			}
		}
		System.out.println(leerlingen);
		return leerlingen;
	}
	
	public static void main(String[] args) {
		PersonenLijstMain p = new PersonenLijstMain();
		Docent piet=new Docent("Piet","Jansen","jnsnp");
		Student marie=new Student("Marie","Pieters",31415,piet);
         Student jan=new Student("Jan","de Vries",92653,null); // nog geen SLB’er
         p.lijst.add(piet);
         p.lijst.add(marie);
         p.lijst.add(jan);
        // voeg zelf nog enkele docenten en studenten toe
         ArrayList<Persoon> studentenVanPiet=p.getSLBStudenten(piet);

	}
}
