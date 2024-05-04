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


    public double arctangent(){
        return Math.round(Math.atan2(getImaginary(),getReal()));
    }

    public String toPolar(){
        char thetaSign = '\u2220'; //表示theta符号
        return magnitude()+""+thetaSign+""+Math.toDegrees(arctangent())+"deg";
    }


    private double eulerReal(){
        return Math.cos(arctangent());
    }
    private double eulerImaginary(){
        return Math.sin(arctangent());
    }

    private double computeExponential(){
        return Math.pow(Math.E,eulerReal()+eulerImaginary());
    }
    public double exp(){
        return Math.pow(Math.E,(magnitude()*computeExponential()));
    }

    public double log(){
        return Math.log(exp());
    }

    public double pow(double a){
        return Math.pow(exp(),a);
    }

    public String computeQuadratic(double a,double b,double c){
        double disc = (b*b)-(4*a*c);
        double x1,x2;
        if(disc<0)
            return "No Roots";
        else if(disc==0){
            if(a==0.0)
                throw new IllegalArgumentException("Divide by zer");
            else
            {
                x1 = (-b)/(2*a);
                return "One root: x="+x1;
            }

        }else
        {
            if(a==0.0)
                throw new IllegalArgumentException("Divide by zer");
            x1 = (-b-Math.sqrt(disc))/(2*a);
            x2 = (-b+Math.sqrt(disc))/(2*a);
        }

        return "Two Roots\n"+"X1 = "+x1+"\n"+"X2: = "+x2;
    }



    @Override
    public String toString(){
        return  getReal()+"+"+getImaginary()+"i";
    }
}
