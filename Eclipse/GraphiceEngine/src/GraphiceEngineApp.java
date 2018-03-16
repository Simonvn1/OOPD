import java.util.ArrayList;

import processing.core.PApplet;

public class GraphiceEngineApp extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(new String[] {"GraphiceEngeineApp"});
	}
	ArrayList<WeergaveObject> weergaveLijst = new ArrayList<>();
	WeergaveObject wO1 = new Rechthoek(10,10,0,0,0,0,50,50,false,0xFFFFFFFF);
	
	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		weergaveLijst.add(wO1);
	}
	
	public void mousePressed() {
		for(WeergaveObject wO: weergaveLijst) {
			wO.geefWeer(this, 0, 0);
		}
	}

}
