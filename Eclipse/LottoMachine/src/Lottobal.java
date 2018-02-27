
public class Lottobal {
private int balNummer;
	
	public Lottobal(int nummer) {
		balNummer = nummer;
	}
	
	public boolean isNummerGroterDan(Lottobal andereBal) {
		return balNummer > andereBal.balNummer;
	}
	
	public String toString() {
		return "" + balNummer;
	}

	public int getNummer() {
		return balNummer;
	}
	
}
