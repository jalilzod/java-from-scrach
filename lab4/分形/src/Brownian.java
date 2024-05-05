import java.util.Random;

public class Brownian extends Turtle{
    private  double T;
    private double S;


    public Brownian(double T,double S){
        this.S = S;
        this.T = T;
        drawShape();
    }

    private void drawShape() {
        double angle = 0;
        double x1 = 100;
        double y1 = 100;
        double o = 0;
        double ran = (Math.random()*(360-0+1)-0);
        Turtle y = new Turtle(x1, y1, ran);
        int j = 0;
        int cnt = 0;
        for (int i = 0; i < 1000; i++) {
                y.goForwardStep(i);
                cnt++;
             if(cnt==20){
//                 double ang = Math.toRadians(ran);
//                 double x2 =  x1+cnt*Math.cos(ang);
//                 double y2 =  x2+cnt*Math.sin(ang);
                  ran = (Math.random()*(360-0+1)-0);
                 y.setX(o+=cnt);
                 y.setY(o+=cnt);
                 y.setAngle(ran);
                 cnt = 0;
            }
        }
    }
}

