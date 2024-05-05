public class Hexagon extends Turtle{
    private double step = 100;
    public Hexagon(double x,double y,double angle){
        drawHexagon(x,y,angle);
    }
    private void drawHexagon(double x, double y, double angle) {
        Turtle leftVertical = new Turtle(x,y,angle);
        Turtle rightVertical = new Turtle(x+step*2-24,y,angle);

        Turtle topLeft = new Turtle(x,y+step,angle-60);
        Turtle topRight = new Turtle(x+step*2-24,y+step,angle+60);

        Turtle bottomLeft = new Turtle(x,y,angle*2+90+60);
        Turtle bottomRight = new Turtle(x+step*2-24,y,angle*2+30);
        leftVertical.goForwardStep(step);
        rightVertical.goForwardStep(step);
        topLeft.goForwardStep(step);
        topRight.goForwardStep(step);
        bottomRight.goForwardStep(step);
        bottomLeft.goForwardStep(step);
    }
}
