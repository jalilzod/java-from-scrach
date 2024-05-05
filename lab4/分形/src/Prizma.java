import javax.swing.plaf.basic.BasicSplitPaneUI;

public class Prizma {
    private double step = 100;
    public Prizma(double x,double y,double angle) {
        draw(x,y,angle);
    }

    public void draw(double x,double y,double angle){
        Turtle horizontal = new Turtle(x,y,angle);
        Turtle right = new Turtle(x,y,angle+60+180);
        Turtle left = new Turtle(x+step,y,angle+60+180+60);
        Turtle bottomLeft = new Turtle(x+(step/2),y-144,angle+30);
        Turtle bottomRight = new Turtle(x+(step/2),y-144,angle+90+30+30);

        horizontal.goForwardStep(step);
        right.goForwardStep(step);
        left.goForwardStep(step);
        bottomLeft.goForwardStep(step+13);
        bottomRight.goForwardStep(step+13);

    }


}
