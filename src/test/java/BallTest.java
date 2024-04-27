import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import processing.core.PApplet;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    private Ball ball;

    @BeforeEach
    public void setup() {
        PApplet sketch = new PApplet();
        ball = new Ball(sketch, 100, 5);
    }

    @Test
    public void testYPos() {
        int expected = 100;

        int actual = (int) ball.yPos;

        assertEquals(expected, actual);
    }

    @Test
    public void testSpeed() {
        int expected = 5;

        int actual = ball.speed;

        assertEquals(expected, actual);
    }

    @Test
    public void testXPos() {
        int expected = 0;

        int actual = (int) ball.xPos;

        assertEquals(expected, actual);
    }

    @Test
    public void testDiameter() {
        int expected = 30;

        int actual = (int) ball.DIAMETER;

        assertEquals(expected, actual);
    }
}