import com.sun.jdi.PrimitiveValue;

public class Turtle {
    private StdDraw draw;
    private double x;
    private double y;
    private double angle;

    public Turtle(double x,double y,double angle){
        this.x = x;
        this.y = y;
        this.angle = angle;
        draw = new StdDraw();
        setUp();
    }

    public Turtle(){

    }

    public double angleRad(){
        return Math.toRadians(this.angle);
    }

    public void goForwardStep(double step){
        double x1 = this.x+(step*Math.cos(angleRad()));
        double y1 = this.y+(step*Math.sin(angleRad()));

        StdDraw.line(this.x,this.y,x1,y1);
    }
    public void goForwardStep(double step,double x1,double y1){
        x1 = this.x+(step*Math.cos(angleRad()));
        y1 = this.y+(step*Math.sin(angleRad()));

        StdDraw.line(this.x,this.y,x1,y1);
    }
    public void setAngle(double n){
        this.angle = n;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setColor(int r,int g,int b){
        StdDraw.setPenColor(r,g,b);
    }
    private void setUp(){
        StdDraw.setCanvasSize(740,400);
        StdDraw.setXscale(0,740);
        StdDraw.setYscale(0,400);
       // StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.005);

    }



}

