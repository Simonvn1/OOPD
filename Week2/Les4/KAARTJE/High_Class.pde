class Money {
 float waarde;
 int xpos,ypos;
 
 Money(float newWaarde,int newXpos, int newYpos){
   waarde = newWaarde;
   xpos = newXpos;
   ypos = newYpos;
 }
 
 void tekenVakje(){
  fill(255);
  rect(xpos,ypos,40,20);
  fill(0);
  textAlign(CENTER,CENTER);
  text(xpos+20,ypos+10,waarde);
 }
 
}