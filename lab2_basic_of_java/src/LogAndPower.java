public class LogAndPower {

    public static void main(String[] args){


        for(int x = 1;x<2049;x++){
            double logOfX = Math.log(x);

            System.out.println("X: "+x);
            System.out.println("Logx: "+logOfX);
            System.out.println("xLogx: "+x*logOfX);
            System.out.println("x^2: "+Math.pow(x,2));
            System.out.println("x^3: "+Math.pow(x,3));


        }


    }
}
