PImage face;
void setup() {
  size(700,600);
  face = loadImage("Big-eyes-cat.png");
  face.resize(700,600);
  image(face, 0, 0);
}
void draw() {
  fill(mouseX,mouseY,0);
ellipse(320, 360, 70 ,100);
ellipse(460, 350, 70, 100);
fill(0,0,0);
ellipse(320, 360, 20, 20);
ellipse(460, 350, 20, 20);

}
