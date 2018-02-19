Sliders slide;

void setup() {
  size(300, 200);
  background(0);
  slide = new Sliders(50,200,50,5);
}



class Sliders {
 float x, y, breedte, hoogte;
 int nPosities;
 
 Sliders(float newY, float newBreedte, float newHoogte, int newNPosities) {
   y = newY;
   breedte = newBreedte;
   hoogte = newHoogte;
   nPosities = newNPosities;
   x = (width-breedte)/2;
 }
}