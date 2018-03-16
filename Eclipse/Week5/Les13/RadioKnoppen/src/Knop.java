import processing.core.PApplet;

public class Knop {
	protected PApplet app;
	protected float x;
	protected float y;
	protected float breedte;
	protected float hoogte;
	
	public Knop(PApplet app, float x, float y, float breedte, float hoogte) {
		this.app = app;
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = hoogte;
		
	}
	
	public void voegDoelwitToe(IDoelwit doelwit) {
		
	}
	
	public void tekenKnop() {
		
	}
	
	public boolean isMuisOverKnop() {
		
	return (Boolean) null;
	}
	
	public void handelInteractieAf() {
		doeKnopactie();
	}
	
	protected void doeKnopactie() {
		
	}
	
}
