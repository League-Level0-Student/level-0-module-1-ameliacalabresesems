PImage cat;
void setup() {
  cat = loadImage("z.c cat.jpg");
  size(400,400);
}
void draw() {
    image(cat, 0,70,425,250);
 fill(128, mouseX, 0);
    ellipse(200,150,50,45);
 fill(0, 0, 0);
    ellipse(200,150,3,45);
 fill(128, 0, mouseY);
    ellipse(100,150,40,40);
     fill(0, 0, 0);
    ellipse(100,150,3,40);
}
