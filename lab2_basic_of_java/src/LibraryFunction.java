public class LibraryFunction {
    public static double max(double a[]){
        double max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
                max = a[i];
        }
        return max;
    }
    public static double min(double a[]){
        double min = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min)
                min = a[i];
        }
        return min;
    }

    public static double mean(double a[]){
        double sum = 0;
        for(int i=0;i<a.length;i++){
             sum+=a[i];
        }
        return sum / a.length;
    }

    public static double variance(double a[]){
        double sum = 0;
        for(int i=0;i<a.length;i++){
            sum=sum+Math.pow(a[i]-mean(a),2);
        }
        return (sum / (a.length-1));
    }

    public static double findKMax(double[] a,int k) {
        int max_index = 0,cnt = 0;
        for(int i= 0;i<a.length;i++){
            max_index = max(i,a);
            cnt++;
            if(cnt==k)
                return a[max_index];

            double tmp = a[i];
            a[i] = a[max_index];
            a[max_index] = tmp;

        }
        return -1;
    }
    public static int max(int index, double[] arr) {
        int maxOf = index;
        for(int i = index;i<arr.length;i++){
            if(arr[i]>arr[maxOf])
                maxOf = i;
        }
        return maxOf;
    }



    public static void main(String[]args){

    }
}
