import java.util.ArrayList;

import processing.core.PApplet;

public class WeergaveObjectContainer extends WeergaveObject {
	
	public ArrayList<WeergaveObject> weergaveLijst = new ArrayList<>();

	public WeergaveObjectContainer(float x, float y, float vx, float vy, float ax, float ay) {
		super(x, y, vx, vy, ax, ay, 0, 0, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void geefWeer(PApplet app, float startX, float startY) {
		for(WeergaveObject wO: weergaveLijst) {
			wO.geefWeer(app, x+startX, y+startY);
		}

	}

	@Override
	protected boolean isMuisBinnen(int muisX, int muisY) {
		for(WeergaveObject wO : weergaveLijst) {
			if(wO.isMuisBinnen((int) (muisX-x),(int) (muisY+y))) {
				wO.behandelMousePressedGebeurtenis();
			}
		}
		return false;
	}
	
	public void doeStap() {
		x += vx;
		y += vy;
		vx += ax;
		vy += ay;
		for(WeergaveObject wO: weergaveLijst) {
			wO.doeStap();
		}
	}
	
	public void voegToe(WeergaveObject object) {
		weergaveLijst.add(object);
	}
	
	
	public void verwijder(WeergaveObject object) {
		weergaveLijst.remove(object);
	}
}
