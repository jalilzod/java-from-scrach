public class Rectangle {
    private double step = 200;

    public Rectangle(double x1, double y1, double angle){
        drawTriangle(x1,y1,angle);
    }
    private void drawTriangle(double x1, double y1, double angle) {
        Turtle lineLeft = new Turtle(x1,y1,angle);
        Turtle lineRight = new Turtle(x1,y1,angle+90);
        Turtle lineUpright = new Turtle((x1/2)+57,y1+(step/2)+43,angle);
        Turtle lineUpLeft = new Turtle(x1+140,y1+(step/2)+43,angle+90);

        lineLeft.goForwardStep(step);
        lineRight.goForwardStep(step);
        lineUpright.goForwardStep(step);
        lineUpLeft.goForwardStep(step);
    }
}
