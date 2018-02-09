Damsteen steen1;
Damsteen steen2;

void setup(){
  size(500,500);
  steen1 = new Damsteen(50,50,25,0);
  steen2 = new Damsteen(50,100,25,255);
  steen1.tekenDamsteen();
  steen2.tekenDamsteen();
}