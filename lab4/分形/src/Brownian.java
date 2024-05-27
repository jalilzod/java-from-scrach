import java.util.Random;

public class Brownian {
    private  double T;
    private double S;
    private double steps = 15;

    public Brownian(double T,double S){
        this.S = S;
        this.T = T;
        drawShape();
    }

    private void drawShape() {
        double  x1= 200,y1 = 300;
        double angle = 45;
        double radians = Math.toRadians(angle);
       Turtle turtle = new Turtle(x1,y1,angle);

       int  cnt = 0;
       double randomAngle = Math.random()*360;
       for(double i = 0;i<1000;i++){
               randomAngle = Math.random()*360;
               turtle.setAngle(randomAngle);
               turtle.goForwardStep(steps);

       }

        //turtle.goForwardStep(steps,0, turtle.getX1(), turtle.getY1());

    }
}

