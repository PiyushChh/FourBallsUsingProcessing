

import processing.core.PApplet;

public class FourBalls extends PApplet {
    private static final int WIDTH =640;
    private static final int HEIGHT=480;
    private static final int DIAMETER=30;
    BallManager ballManager;

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);

    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup(){
        ballManager=new BallManager(this, HEIGHT);
    }

    @Override
    public void draw(){
       ballManager.drawAll();
    }

}
