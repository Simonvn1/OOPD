package studententroep;

public class Student {
	private String naam;
	private String geslacht;
	private int nummer;
	
	public static final String MAN = "man";
	public static final String VROUW = "vrouw";
	
	private static int nStudenten = 0;
	
	public Student(String naam) {
		this.naam = naam;
		nStudenten++;
	}
		
	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getGeslacht() {
		return geslacht;
	}

	public void setGeslacht(String geslacht) {
		if(geslacht == MAN || geslacht == VROUW) {
		this.geslacht = geslacht;
		}
	}

	public static int getNStudenten() {
		return nStudenten;
	}

	public String toString() {
		return getNaam();
	}
	
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
}

