PImage pepperoni;
PImage mushroom;

void setup() {
  pepperoni = loadImage("peppre.png");
  size(400, 400);
  mushroom = loadImage("mushy mess.png");
  size(400, 400);
}
void draw() {
  fill(255, 204, 102);
  ellipse(200, 200, 300, 300);
  fill(128, 0, 0);
  ellipse(200, 200, 250, 250);
 /* for(int i=0; i<10;i++){
     image(pepperoni,100+10*i,100,100,100);
  }
*/
    image(pepperoni,72,75,250,250);
    image(mushroom,172,172,60,60);
    image(mushroom,225,225,60,60);
    image(mushroom,110,110,60,60);
    image(mushroom,110,225,60,60);
    image(mushroom,225,110,60,60);
}
