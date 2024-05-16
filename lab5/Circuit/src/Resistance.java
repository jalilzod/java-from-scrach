
public class Resistance extends Circuit{
    private int []signs;
    private double []numbers;
    private static int signsTop = -1;
    private static int numbersTop = -1;
    private String expression;

    public Resistance(String expression){
        this.expression = expression.replaceAll(",","");
        initialize();

    }
    private void initialize(){
        int sizeSign = countSigns(this.expression);
        int sizeNumbers = countNumbers(this.expression);
        this.signs = new int[sizeSign*2];
        this.numbers = new double[sizeNumbers * 2];
    }
    @Override
    public double resistance() {
        double num1=  0,num2 = 0,sum = 0,r = 0;
        double tmp = 0;
        for(int i = 0;i<expression.length();i++){
            int n = expression.charAt(i);
            if(isOpenBracket(n))
                pushSign(expression.charAt(i+1));
            if(isNumber(n)){
                if(i!=expression.length()-1&&expression.charAt(i+1)=='.'){
                    tmp = expression.charAt(i+2);
                    tmp*=0.1;
                }
                n-='0';
                tmp+=n;
                pushNumber(tmp);
                tmp = 0;
            }
            if(isCloseBracket(n)){
                if(signsTop!=-1&&numbersTop>=1) {
                    int sig = popSign();
                    if (sig == '-'){
                        num1 = popNumber();
                        num2 = popNumber();
                        sum = num1 + num2;
                        pushNumber(sum);
                    }
                    else{
                        num1 = popNumber();
                        num2 = popNumber();
                        r = (1.0/num1) + (1.0/num2);
                        sum = 1.0/r;
                        pushNumber(sum);
                    }
                }
            }
        }

        return popNumber();
    }


    private void pushSign(int n){
        signs[++signsTop] = n;
    }

    private void pushNumber(double n){
        numbers[++numbersTop] = n;
    }

    private int popSign(){
        if(!isSignEmpty())
            return signs[signsTop--];
        return -1;
    }
    private double popNumber(){
        if(!isNumberEmpty())
            return numbers[numbersTop--];
        return -1;
    }


    private boolean isSignEmpty(){
        return signsTop==-1;
    }
    private boolean isNumberEmpty(){
        return numbersTop==-1;
    }

    private int countSigns(String s){
        int cnt = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='-'||s.charAt(i)=='/')
                cnt++;
        }
        return cnt;
    }
    private int countNumbers(String s){
        int cnt = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>=48&&s.charAt(i)<=57)
                cnt++;
        }
        return cnt;
    }

    private boolean isOpenBracket(int n){
        return n=='(';
    }
    private boolean isCloseBracket(int n){
        return n==')';
    }

    private boolean isNumber(int n){
        return n>=48&&n<=57;
    }

}
