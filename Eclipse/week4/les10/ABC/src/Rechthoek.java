import processing.core.PApplet;

public class Rechthoek {

	private float x, y, vx, vy, ax, ay;
	private float breedte, hoogte;
	private int kleur;
	
	public Rechthoek(float x, float y, float breedte, float hoogte) {
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = hoogte;
		zetStil();	
		kleur = 0xFFFFFFFF;
	}
	
	public void doeStap() {
		if (!staatStil()) {
			pasVersnellingToe();
			pasSnelheidToe();
		}
	}
	
	public void setSnelheid(float vx, float vy) {
		this.vx = vx;
		this.vy = vy;
	}
	
	public void setVersnelling(float ax, float ay) {
		this.ax = ax;
		this.ay = ay;
	}
		
	public void zetStil() {
		vx = vy = ax = ay = 0;
	}
	
	public boolean staatStil() {
		return (vx == 0 && vy == 0 && ax == 0 && ay == 0);
	}
		
	public void tekenRechthoek(PApplet p) {
		p.noStroke();
		p.fill(kleur);
		p.rect(x, y, breedte, hoogte);
	}
	
	public void setKleur(int kleur) {
		this.kleur = kleur;
	}
	
	private void pasVersnellingToe() {
		vx += ax;
		vy += ay;
	}
	
	private void pasSnelheidToe() {
		x += vx;
		y += vy;
	}
}
