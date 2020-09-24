 int a = 0;
   int b = 600;
 int c = 400;
void setup() {
  size(1200, 800);
  noFill();
 
}

void draw() {
    
 
 
  
  // Go to the recipe to run the demonstration before starting this program
 
 
  for (int i = 0; i < 20; i++) {
    
  // if (a % 2 == 0) {
  //   fill (255, 0, 0);
    
  //}
  //else {
  // fill (0);
  //}
  //Use an if statement and modulo to alternate the color of your rings.
   ellipse (400,400,i * 10,i * 10);
  b -= 12;
  a += 1;
 
  }
  
    
    c += 10;
 
}
