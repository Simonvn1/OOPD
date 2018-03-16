import processing.core.PApplet;

public class Switch extends Knop {
	
	protected boolean isAan;
	
	public Switch(PApplet app, float x, float y, float breedte, float hoogte) {
		super(app ,x, y, breedte, hoogte);
		isAan = false;
	}

	public void zetAan() {
		isAan = true;
	}
	
	public void zetUit() {
		isAan = false;
	}
	
	public void handelInteractieAf() {
		
	}
	
	public void tekenKnop() {
		
	}
	
	private void tekenBasis() {
		
	}
	
	private void tekenSchuif() {
		
	}
}
