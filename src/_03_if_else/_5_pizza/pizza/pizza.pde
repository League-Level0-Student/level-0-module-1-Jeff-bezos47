PImage crayon;
void setup() {
    size(500,500);
    fill(#E8B562);
    ellipse(250, 250, 450, 450);
    
     crayon = loadImage("bluecrayon(1).jpeg");
     crayon.resize(60, 60);
}
void draw() {
 image(crayon, 150, 200); 
   image(crayon,20, 200);
   image(crayon,200, 100);
   image(crayon,36, 47);
   image(crayon, 395, 400);
   image(crayon, 295, 300);
   image(crayon, 130, 345);
  image(crayon, 290, 100);
}
