import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourBallsTest {
    private FourBalls fourBalls;

    @BeforeEach
    public void setup() {
        fourBalls = new FourBalls();
    }

    @Test
    public void testSizeWidth() {
        int expected = 640;

        int actual = fourBalls.WIDTH;

        assertEquals(expected, actual, "Width should be set to 640");
    }

    @Test
    public void testSizeHeight() {
        int expected = 480;

        int actual = fourBalls.HEIGHT;

        assertEquals(expected, actual, "Height should be set to 480");
    }

    @Test
    public void testSetup() {
        fourBalls.setup();

        assertNotNull(fourBalls.ballManager);
    }
}

