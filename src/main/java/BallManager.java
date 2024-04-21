import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class BallManager extends FourBalls {
    public static final float DIAMETER=30;


    List<Ball> balls = new ArrayList<>();
    PApplet sketch;

    BallManager(){

    }
    BallManager(PApplet sketch,float height){
        this.sketch=sketch;

        balls.add(new Ball(sketch,height * 1 / 5, 1));
        balls.add(new Ball(sketch,height * 2 / 5, 2));
        balls.add(new Ball(sketch,height * 3 / 5, 3));
        balls.add(new Ball(sketch,height * 4 / 5, 4));
    }

    public void drawAll() {
        for (Ball ball : balls) {
            ball.draw();
        }
    }

}
