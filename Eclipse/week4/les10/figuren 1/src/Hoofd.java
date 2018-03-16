import processing.core.PApplet;

public class Hoofd extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] {"Hoofd"});
		

	}
	
	Vormpjes rond;
	Vormpjes hoek;
	
	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		background(255,0,255);
		rond = new Cirkel(0,0,50);
		hoek = new Rechthoek(0,200,1000,100);
		rond.setSnelheid(3,3);
	}
	
	public void draw() {
		rond.teken(this);
		hoek.teken(this);
		rond.doeStap();
	}

}
