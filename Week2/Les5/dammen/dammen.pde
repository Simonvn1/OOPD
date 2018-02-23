Dambord bord;

void setup() {
  size(400, 400);
  bord = new Dambord(0,0,400);
}

void draw() {
  checkerBoard();
  bord.tekenDamstenen();
  reset();
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