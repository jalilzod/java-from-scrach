import javax.swing.*;

public class Spiral{
   public double steps = 200;

    public Spiral(){

        drawShape();
    }

    private void drawShape(){
        double angle = 45;
        Turtle turtle = new Turtle(300,50,angle);
//        for(int i = 0;i<450;i++){
//            turtle.goForwardStep(i);
//            if(i==150)
//                turtle.setAngle(0);
//
//        }
        double upDeg = 45;
        double horiz = 180;
        double down = 90+45+180;
        turtle.goForwardStep(steps);

        for(int i = 1;i<10;i++){
        turtle.setAngle(180);
        turtle.goForwardStep(steps);
        turtle.setAngle(down);
        turtle.goForwardStep(steps-i*70);
        turtle.setAngle(upDeg);
        turtle.goForwardStep(steps-1*80);

        //steps-=50;
        }
//        turtle.setAngle(45);
//        turtle.goForwardStep(130);
//        turtle.setAngle(180);
//        turtle.goForwardStep(130);
//        turtle.setAngle(305);
//        turtle.goForwardStep(80);

    }


}