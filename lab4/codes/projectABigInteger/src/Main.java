import java.math.BigInteger;

public class Main {

    public static void main(String[]args){

     MyBigInteger one = new MyBigInteger("868343434534534545345345348798988");
     MyBigInteger two = new MyBigInteger("265999943534534534534545343543789");
        BigInteger a = new BigInteger("86834343453453454534534534");
        BigInteger b = new BigInteger("265999943534534534534545343543");
//        System.out.println(one.isEquals(two));
//        System.out.println(one.compare(two));
//        System.out.println(two.add(one));

//        BigInteger a = new BigInteger("123123354786676770998989");
//        BigInteger b = new BigInteger("123213789879879789789");
//        System.out.println(b.add(a));
//
        System.out.println(one.subtract(two));
        System.out.println(a.subtract(b));



    }
}
