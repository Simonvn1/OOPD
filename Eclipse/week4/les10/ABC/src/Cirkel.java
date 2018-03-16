import processing.core.PApplet;

public class Cirkel {

	private float x, y, vx, vy, ax, ay;
	private float diameter;
	private int kleur;
	
	public Cirkel(float x, float y, float diameter) {
		this.x = x;
		this.y = y;
		this.diameter = diameter;
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
		
	public void tekenCirkel(PApplet p) {
		p.noStroke();
		p.fill(kleur);
		p.ellipse(x, y, diameter, diameter);
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
