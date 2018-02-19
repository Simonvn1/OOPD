Damsteen[] stenen = new Damsteen[24];


void setup() {
  size(400, 400);
  int xExtra=25;
  int yExtra=25;
  int counter = 0;
  int colour = #3f3726;
  for (int a=0; a<2; a++) {
    for (int i=0; i<3; i++) {
      for (int j=0; j<4; j++) {
        stenen[counter] = new Damsteen(xExtra+(100*j), yExtra+(50*i), 40, colour);
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

void draw() {
  checkerBoard();
  for (int i = 0; i<stenen.length; i++) {
    stenen[i].hoverDamsteen();
    stenen[i].tekenDamsteen();
  }
  reset();
}

void mousePressed() {
  for (int i = 0; i<stenen.length; i++) {
    stenen[i].klikDamsteen(); 
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

void reset() {
  stroke(0);
  strokeWeight(1);
}