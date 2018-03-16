import processing.core.PApplet;

public class Rechthoek extends Figuur{

	public Rechthoek(float x, float y, float vx, float vy, float ax, float ay, float breedte, float hoogte,
			boolean isZichtbaar, int vulKleur) {
		super(x, y, vx, vy, ax, ay, breedte, hoogte, isZichtbaar, vulKleur);
	}
	
	@Override
	public void geefWeer(PApplet app, float startX, float startY) {
		app.fill(vulKleur);
		app.rect(x+startX, y+startY, breedte, hoogte);
	}

	@Override
	protected boolean isMuisBinnen(int muisX, int muisY) {
		if(x<muisX && muisX<x+breedte && y<muisY && muisY<y+hoogte) {
			return true;
		}
		return false;
	}

}
