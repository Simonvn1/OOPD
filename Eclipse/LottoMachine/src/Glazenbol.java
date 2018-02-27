
import java.util.ArrayList;
import java.util.Random;

public class Glazenbol {
	
	private ArrayList<Lottobal> ballenLijst = new ArrayList<>();
	
	public Glazenbol(){
	}
	
	public void verzamelAlleBallen() {
		
		for(Lottobal bal : ballenLijst) {
			ballenLijst.remove(bal);
		}
		
		for(int i = 0; i<45; i++) {
			Lottobal b = new Lottobal(i+1);
			ballenLijst.add(b);
		}
	}
	
	public Lottobal schepBal() {
		Random rand = new Random();
		int n = rand.nextInt(ballenLijst.size());
		Lottobal bal = ballenLijst.get(n);
		ballenLijst.remove(n);
		return bal;
	}
	
}