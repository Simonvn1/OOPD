import java.util.ArrayList;

import processing.core.PApplet;

public class GraphiceEngineApp extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(new String[] {"GraphiceEngineApp"});
	}
	ArrayList<WeergaveObject> weergaveLijst = new ArrayList<>();
	WeergaveObject wO1 = new Rechthoek(10,10,0,1,0,0,50,50,true,0xFFFF00FF);
	WeergaveObject wO2 = new Rechthoek(70,70,0,0,0,0,50,50,true,0xFF00FF00);
	WeergaveObjectContainer wO3 = new WeergaveObjectContainer(0,0,1,0,0,0);
	
	IReageerder i = new HalloReageerder();
	
	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		wO1.voegReageerderToe(i);
		wO2.voegReageerderToe(i);
		wO3.voegToe(wO1);
		wO3.voegToe(wO2);
		weergaveLijst.add(wO3);
	}
	
	public void draw() {
		background(0);
		for(WeergaveObject wO: weergaveLijst) {
			wO.geefWeer(this, 0, 0);
			wO.doeStap();
		}
	}
	
	public void mousePressed() {
		for(WeergaveObject wO: weergaveLijst) {
			if(wO.isMuisBinnen(mouseX, mouseY)) {
				wO.behandelMousePressedGebeurtenis();
			}
		}
	}

}
