void setup() {
  int getal = 2;
  int array[] = {1,2,4,8};
  println(komtGetalVoorIn(getal,array));
}

boolean komtGetalVoorIn(int getal, int[] lijst){
  boolean boo = false;
  int i=0;
  while(i<lijst.length){
    if(lijst[i]==getal){
      boo = true;
      i = 1000000;
    } else {
      i++;
    }
  }
  return boo;
}