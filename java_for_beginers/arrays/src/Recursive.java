public class Recursive {

    int factor(int n){
        int res;
        if(n==1)
            return 1;
        System.out.println(n);
       res = factor(n-1)*n;
       return res;
    }
}
