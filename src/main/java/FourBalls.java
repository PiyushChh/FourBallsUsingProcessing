import processing.core.PApplet;

public class FourBalls extends PApplet {
    protected int WIDTH;
    protected int HEIGHT;
    BallManager ballManager;

    FourBalls(){
        this.WIDTH=640;
        this.HEIGHT=480;
    }


    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ballManager = new BallManager(this, HEIGHT);
    }

    @Override
    public void draw() {
        ballManager.drawAll();
    }
}
