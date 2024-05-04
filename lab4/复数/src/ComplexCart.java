public class ComplexCart {
    private double real;
    private double imaginary;
    public ComplexCart(double real,double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }



    public String add(ComplexCart b){

        double x = this.getReal();
        double y = this.getImaginary();

        double u = b.getReal();
        double z = b.getImaginary();

        x+=u;
        y+=z;

        return "a = " + x+"+"+y+"i";
    }

    public String subtract(ComplexCart b){

        double x = this.getReal();
        double y = this.getImaginary();

        double u = b.getReal();
        double z = b.getImaginary();

        x-=u;
        y-=z;
        if(x==0.0&&y==0.0)
            return "0";
        if(y<0)
            return "a = " + x+""+y+"i";
        return "a = " + x+"+"+y+"i";
    }

    public String multiply(ComplexCart b){

        double x = this.getReal();
        double y = this.getImaginary();

        double u = b.getReal();
        double z = b.getImaginary();


        double first = (x*u)-(y*z);
        double second = (x*z)+(y*u);
        if(second<0)
            return "a = " + first+""+second+"i";
        return "a = " + first+"+"+second+"i";
    }

    public String division(ComplexCart b){

        double x = this.getReal();
        double y = this.getImaginary();

        double u = b.getReal();
        double z = b.getImaginary();


        double first = (x*u)+(y*z);
        double second = (x*z)-(u*y);

        double denominator = (x*x)+(u*u);
        if(denominator==0.0)
            throw new IllegalArgumentException("cant divide by 0");
        if(second<0)
            return "a = "+"("+first+""+second+"i)"+"/"+denominator;
        return "a = " + "("+first+"-"+second+"i)"+"/"+denominator;
    }


    public double conjugate(){
         return this.real-this.imaginary;

    }
    public double magnitude(){
        return  Math.sqrt((this.real*this.real)+(this.imaginary*this.imaginary));
    }
    public String reciprocal(){
        double x = this.getReal();
        double y = this.getImaginary();



        if(this.magnitude()==0.0)
            throw new IllegalArgumentException("cant divide by 0");
        double recip = this.conjugate()/(this.magnitude()*this.magnitude());


        if(recip<0)
            return "a = "+0;
        return "reciprocal = "+recip;
    }

    public boolean equals(ComplexCart b){
        return this.real==b.real&&this.imaginary==b.imaginary;
    }




    @Override
    public String toString(){
        return  getReal()+"+"+getImaginary()+"i";
    }
}
