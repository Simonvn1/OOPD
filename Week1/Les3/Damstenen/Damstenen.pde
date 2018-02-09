Damsteen[] stenen = new Damsteen[100];


void setup() {
  size(400, 400);
  int xextra=0;
  int yextra=0;
  int counter = 0;
  int colour = #3f3726;
  for (int a=0; a<2; a++) {
    for (int i=0; i<3; i++) {
      for (int j=0; j<4; j++) {
        stenen[counter] = new Damsteen(25+xextra+(100*j), 25+yextra+(50*i), 40, colour);
        counter++;
      }
      if (xextra > 0) {
        xextra = 0;
      } else {
        xextra =50;
      }
    }
    colour = #f8dfa1;
    yextra = 250;
  }
}

void draw() {
  checkerBoard();
  for (int i = 0; i<24; i++) {
    stenen[i].tekenDamsteen();
  }
}


void checkerBoard() {
  int colour=255;
  for (int i = 0; i<8; i++) {
    for (int j=0; j<8; j++) {
      if (colour == #ffe19a) {
        colour = #3f3726;
      } else {
        colour =#ffe19a;
      }
      fill(colour);
      rect(j*50, i*50, 50, 50);
    }
    if (colour == #ffe19a) {
      colour = #3f3726;
    } else {
      colour =#ffe19a;
    }
  }
}