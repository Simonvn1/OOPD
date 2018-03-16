import java.util.ArrayList;

import processing.core.PApplet;

public class RadioKnoppenMain extends PApplet{

	public static void main(String[] args) {
		PApplet.main(new String[] {"RadioKnoppenMain"});
	}
	
	Radioknop rK1 = new Radioknop(this, 50, 50, 50, 50);
	Radioknop rK2 = new Radioknop(this, 150, 50, 50, 50);
	Radioknop rK3 = new Radioknop(this, 250, 50, 50, 50);
	ArrayList<Radioknop> knoppen = new ArrayList<>();
	
	public void settings() {
		size(300,300);
	}
	
	public void setup() {
		background(200,0,255);
		knoppen.add(rK1);
		knoppen.add(rK2);
		knoppen.add(rK3);
		
	}
	
	public void draw() {
		for(Radioknop rK: knoppen) {
			rK.tekenKnop();
		}
		
	}
	
	public void mousePressed() {
		for(Radioknop rK: knoppen) {
			if(rK.isMuisOverKnop()) {
				for(Radioknop uRK: knoppen) {
					uRK.zetUit();
				}
				rK.zetAan();
				
			}
		}
		
	}

}
