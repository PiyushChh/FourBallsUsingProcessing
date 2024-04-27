import processing.core.PApplet;

public class Ball extends FourBalls {
    protected float DIAMETER;
    float xPos;
    float yPos;
    int speed;
    PApplet sketch;

    Ball(PApplet sketch, float yPos, int speed) {
        this.sketch = sketch;
        this.yPos = yPos;
        this.xPos = 0;
        this.speed = speed;
        this.DIAMETER=30;
    }

    public void draw() {
        sketch.ellipse(xPos, yPos, DIAMETER, DIAMETER);
        xPos += speed;
    }
}
