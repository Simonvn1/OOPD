class Dambord {
 Damsteen[] stenen = new Damsteen[24];
 
 Dambord(int x, int y, int breedte){
   int xExtra=25;
  int yExtra=25;
  int counter = 0;
  int colour = #3f3726;
  for (int a=0; a<2; a++) {
    for (int i=0; i<3; i++) {
      for (int j=0; j<4; j++) {
        stenen[counter] = new Damsteen(xExtra+(100*j)+x, yExtra+(50*i)+y,breedte/8-breedte/80 , colour);
        counter++;
      }
      if (xExtra > 25) {
        xExtra = 25;
      } else {
        xExtra =75;
      }
    }
    colour = #f8dfa1;
    yExtra = 275;
  }
 }
 
 void tekenDamstenen(){
   for (int i = 0; i<stenen.length; i++) {
    stenen[i].hoverDamsteen();
    stenen[i].tekenDamsteen();
  }
 }
}