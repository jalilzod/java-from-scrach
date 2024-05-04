public class Main {
    public static void main(String[]args){
        double x1 = 250,y1 = 250;
        Turtle tr = new Turtle(x1,y1,0);
        Turtle tr2 = new Turtle(450,250,90);
        Turtle tr3 = new Turtle(250,250,90);
        //Turtle tr3 = new Turtle(x1,y1,0);

        //Turtle tr1 = new Turtle(x1+(200.0/2),74,60);

        tr.goForwardStep(200);
        tr2.goForwardStep(200);
        tr3.goForwardStep(200);
        //tr1.goForwardStep(200);
    }
}
