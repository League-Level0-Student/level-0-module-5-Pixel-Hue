 int a = 1;
  int b = 1;
 int c = 800;
 int d = 400;
void setup() {
  size(1200, 800);
  noFill();
 
}

void draw() {
  System.out.println("Loop1");
  
     
  background(#607D8B);
for (int i = 0; i < 40; i++) {
    //Circle 1
  // if (a % 2 == 0) {
  //   fill (255, 0, 0);
    
  //}
  //else {
  // fill (0);
  //}
  //Use an if statement and modulo to alternate the color of your rings.
   ellipse (d,400,i * 10,i * 10);
  
 
  }
  for (int i = 0; i < 40; i++) {
    //Circle 2
  // if (a % 2 == 0) {
  //   fill (255, 0, 0);
    
  //}
  //else {
  // fill (0);
  //}
  //Use an if statement and modulo to alternate the color of your rings.
   ellipse (c,400,i * 10,i * 10);
  
 
  }
  
  d += a;
  c -= b;
    if(d > width){
      a = -a;
    }
    else if (d < 0) {
      a = -a;
    }
    if(c > width){
      b = -b;
    }
    else if (c < 0) {
      b = -b;
    }
}
