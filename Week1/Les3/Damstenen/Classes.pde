class Damsteen {
  int x,y,diameter,kleur;
  
  Damsteen(int x, int y , int diameter, int kleur){
   this.x = x;
   this.y = y;
   this.diameter = diameter;
   this.kleur = kleur;
  }

  void tekenDamsteen(){
    fill(kleur);
    ellipse(x,y,diameter,diameter);
  }
}