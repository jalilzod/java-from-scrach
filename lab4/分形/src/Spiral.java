import javax.swing.*;

public class Spiral extends Turtle{
    private int N;
    private int T;
    private double D;
    private double pixels;
    public Spiral(int N, int T, double D){
        this.N = N;
        this.T = T;
        this.D = D;
        drawShape();
    }
    public Spiral(){
    }

    private void drawShape(){
        for(int i = 0;i<T;i++){

            Turtle s = new Turtle(100,200,0);
            for(int j = 1;j<450;j++){
                s.goForwardStep(j);
                if(j==150){
                    s.setAngle(-120);
                    s.setX(250);
                    while(j<=300){
                        j++;
                        s.goForwardStep(j);
                    }
                }
                if(j>300){
                    s.setX(175);
                    s.setAngle(120);
                    s.setY(73);
                    while(j<450){
                        j++;
                        s.goForwardStep(j);
                    }
                }

            }
            break;
        }

    }

}
