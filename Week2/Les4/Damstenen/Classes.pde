class Damsteen {
  int x, y, diameter, kleur, hoofdKleur, geselecteerdKleur;
  boolean geselecteerd;

  Damsteen(int x, int y, int diameter, int kleur) {
    this.x = x;
    this.y = y;
    this.diameter = diameter;
    this.kleur = kleur;
    hoofdKleur = kleur;
    geselecteerdKleur = #ff0000;
    geselecteerd = false;
  }

  void tekenDamsteen() {
    fill(kleur);
    if(geselecteerd){
      stroke(geselecteerdKleur);
      strokeWeight(5);
    }
    ellipse(x, y, diameter, diameter);
  }
  
  void hoverDamsteen() {
    reset();
    if(dist(x,y,mouseX,mouseY)<diameter/2){
      stroke(255);
      strokeWeight(5);
    }
  }
  
  void klikDamsteen() {
    geselecteerd = false;
    if(dist(x,y,mouseX,mouseY)<diameter/2){
      geselecteerd = true;
    }
  }
}