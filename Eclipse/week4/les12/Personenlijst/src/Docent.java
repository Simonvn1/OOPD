
public class Docent extends Persoon {
	protected String code;
	
	public Docent(String naam, String voornaam, String code) {
		super(naam, voornaam);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Docent [code=" + code + ", naam=" + naam + ", voornaam=" + voornaam + "]";
	}

}

