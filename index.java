








//Click left on mouse and Press "b"









void setup() {
	size(400, 400);
}

void draw(){

//Middle Square
if(mouseY>200)
fill(255,255,0)
rect(100,100,200,200);

if(mouseY<200)
fill(0,0,255)
rect(100,100,200,200);

//Top left Square
if(mouseX>200)
fill(255,0,255)
rect(0,0,100,100);

if(mouseX<200)
fill(100, 50, 255)
rect(0,0,100,100);

//middle top left Square
if(mouseY>200)
fill(139,25,0)
rect(0,100,100,100);

if(mouseY<200)
fill(255, 50, 10)
rect(0,100,100,100);

//middle bottom left Square
if(mouseX>200)
fill(78, 255,121)
rect(0,200,100,100);

if(mouseX<200)
fill(0, 200, 200)
rect(0,200,100,100);

//Bottom left Square
if(mouseY>200)
fill(34,0,55)
rect(0,300,100,100);

if(mouseY<200)
fill(130, 100, 255)
rect(0,300,100,100);

//middle bottom bottom l Square ----
if(mouseX>200)
fill(139,75,75)
rect(100,300,100,100);

if(mouseX<200)
fill(255, 136, 0)
rect(100,300,100,100);

//middle bottom bottom r Square
if(mouseY>200)
fill(240,5,40)
rect(200,300,100,100);

if(mouseY<200)
fill(9, 240, 5)
rect(200,300,100,100);

//middle bottom bottom r Square
if(mouseX>200)
fill(255,247,0)
rect(300,300,100,100);

if(mouseX<200)
fill(255, 0, 136)
rect(300,300,100,100);

//middle bottom bottom r Square
if(mouseY>200)
fill(0,255,110)
rect(300,200,100,100);

if(mouseY<200)
fill(166,0,255)
rect(300,100,100,100);

//Top far right Square ------
if(mouseX>200)
fill(239,243,27)
rect(300,0,100,100);

if(mouseX<200)
fill(27, 239, 243)
rect(300,0,100,100);

//Top middle right Square
if(mouseY>200)
fill(255, 136, 0)
rect(200,0,100,100);

if(mouseY<200)
fill(4,255,0)
rect(200,0,100,100);

//Top left middle Square
if(mouseY>200)
fill(255,0,247)
rect(100,0,100,100);

if(mouseY<200)
fill(88, 221, 254)
rect(100,0,100,100);


line(mouseX + 420, mouseY, mouseX - 420, mouseY );
  line(mouseX , mouseY + 420, mouseX, mouseY - 420);
  fill(255,0,0);
  ellipse(mouseX, mouseY, 10, 10)

}
void mousePressed(){
    println("Dance Party!!!");
  }
  void keyPressed(b){
    println("Don't Drink Beer!");
  }
//dont forget to add mouse and keypressed interaction functions