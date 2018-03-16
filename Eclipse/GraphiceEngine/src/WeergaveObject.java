import java.util.ArrayList;

import processing.core.PApplet;

public abstract class WeergaveObject {
	protected float x,y,vx,vy,ax,ay;
	protected float breedte, hoogte;
	protected boolean isZichtbaar;
	protected ArrayList<IReageerder> reageerderLijst;
	
	public WeergaveObject(float x, float y, float vx, float vy, float ax, float ay, float breedte, float hoogte,
			boolean isZichtbaar) {
		super();
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.ax = ax;
		this.ay = ay;
		this.breedte = breedte;
		this.hoogte = hoogte;
		this.isZichtbaar = isZichtbaar;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getVx() {
		return vx;
	}

	public void setVx(float vx) {
		this.vx = vx;
	}

	public float getVy() {
		return vy;
	}

	public void setVy(float vy) {
		this.vy = vy;
	}

	public float getAx() {
		return ax;
	}

	public void setAx(float ax) {
		this.ax = ax;
	}

	public float getAy() {
		return ay;
	}

	public void setAy(float ay) {
		this.ay = ay;
	}

	public float getBreedte() {
		return breedte;
	}

	public void setBreedte(float breedte) {
		this.breedte = breedte;
	}

	public float getHoogte() {
		return hoogte;
	}

	public void setHoogte(float hoogte) {
		this.hoogte = hoogte;
	}

	public boolean isZichtbaar() {
		return isZichtbaar;
	}

	public void setZichtbaar(boolean isZichtbaar) {
		this.isZichtbaar = isZichtbaar;
	}
	
	public void doeStap() {
		x += vx;
		y += vy;
		vx += ax;
		vy += ay;
	}
	
	public abstract void geefWeer(PApplet app, float startX, float startY);
	
	public void geefMousePressedGebeurtenis(int mouseX, int mouseY) {
		for(IReageerder r:reageerderLijst) {
			r.doeActie();
		}
	}
	
	protected abstract boolean isMuisBinnen(int muisX,int muisY);
	
	protected void behandelMousePressedGebeurtenis() {
		
	}
	
	public void voegReageerderToe(IReageerder reageerder) {
		reageerderLijst.add(reageerder);
	}
	
	public void verwijderReageerder(IReageerder reageerder) {
		reageerderLijst.remove(reageerder);
	}
	
}
