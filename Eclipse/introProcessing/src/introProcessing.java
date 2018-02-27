

import processing.core.PApplet;

public class introProcessing extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main(new String[] {"introProcessing"});
		
	}
	
	public void settings() {
		size(400,400);
	}
	int hallo;
	public void setup() {
		hallo = 1000;
	}
	
	public void draw() {
		background(random(0,255),random(0,255),random(0,255));
		if(hallo > 0) {
			delay(hallo);
		}
	}
	
	public void mouseReleased() {
		if (hallo == 0 ) {
			hallo = 1000;
		} else {
			hallo = 0;
		}
	}
	
}
