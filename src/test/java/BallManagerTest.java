import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import processing.core.PApplet;

import static org.junit.jupiter.api.Assertions.*;

class BallManagerTest {

    private BallManager ballManager;

    @BeforeEach
    public void setup() {
        PApplet sketch = new PApplet();
        ballManager = new BallManager(sketch, 480);
    }

    @Test
    public void testBall1() {
        int expected = 480 / 5;

        int actual = (int) ballManager.balls.get(0).yPos;

        assertEquals(expected, actual);
    }

    @Test
    public void testBall2() {
        int expected = (480 * 2) / 5;

        int actual = (int) ballManager.balls.get(1).yPos;

        assertEquals(expected, actual);
    }

    @Test
    public void testBall3() {
        int expected = (480 * 3) / 5;

        int actual = (int) ballManager.balls.get(2).yPos;

        assertEquals(expected, actual);
    }

    @Test
    public void testBall4() {
        int expected = (480 * 4) / 5;

        int actual = (int) ballManager.balls.get(3).yPos;

        assertEquals(expected, actual);
    }

}