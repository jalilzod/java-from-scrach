public class Main {
    public static void main(String[]args){

        ComplexCart num1 = new ComplexCart(3,2);
        ComplexCart num2 = new ComplexCart(1,5);

//      System.out.println("Add: "+num1.add(num2));
//        System.out.println("Subtract: "+num1.subtract(num2));
//       System.out.println("Multy: "+num1.multiply(num2));
//      System.out.println("Division: "+num1.division(num2));
//       System.out.println("IsEqual: "+num1.equals(num2));
//        System.out.println("ToPolar: "+num1.toPolar());
       // System.out.println(num1.computeQuadratic(-1,2,1));
        System.out.println("Magnitude"+num1.magnitude());
        System.out.println("Conjugate"+num1.conjugate());
        System.out.println("Exponential"+num1.exp());
        System.out.println("Log"+num1.log());
        System.out.println("Reciprocal"+num1.reciprocal());
        System.out.println("Power"+num1.pow(3));



    }
}
