
public class Dobbelsteen {
 private int faces;
 private int waarde;
 	
 	public Dobbelsteen(int faces){
 		this.faces = faces;
 		waarde = 1;
 	}
 	
 	public int randomize() {
 		waarde = (int )(Math.random() * faces + 1);
 		return waarde;
 	}
 	
 	public String toString() {
 		return "" + waarde;
 	}
}
