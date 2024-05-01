public class Main {
    double  i = 1.0;


    void set(double d){
        i = d;
    }


    public static void main(String[]args){


        Main n = new Main();
        n.set(1.4);
        System.out.println(n.i);
    }
}
