

public class Main {

    public static void main(String[]args){

     MyBigInteger one = new MyBigInteger("1234568");
     MyBigInteger two = new MyBigInteger("1234567");
        System.out.println(one.isEquals(two));
        System.out.println(one.compare(two));
        System.out.println(two.add(one));

//        BigInteger a = new BigInteger("123123354786676770998989");
//        BigInteger b = new BigInteger("123213789879879789789");
//        System.out.println(b.add(a));



    }
}
