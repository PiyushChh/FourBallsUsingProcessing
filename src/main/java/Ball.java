import processing.core.PApplet;

public class Ball extends FourBalls{
    float DIAMETER = 30;
    float xPos;
    float yPos;
    int speed;
    PApplet sketch;

    Ball(PApplet sketch,float yPos, int speed){
        this.sketch=sketch;
        this.yPos=yPos;
        this.xPos=0;
        this.speed=speed;
    }




    public void draw() {
        sketch.ellipse(xPos,yPos,DIAMETER,DIAMETER);
        xPos+=speed;
    }
}
