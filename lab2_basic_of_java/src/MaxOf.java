

public class MaxOf {
    public static void main(String[]args){

        int []arr = new int[5];
        for(int i = 0;i<args.length;i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        int thirdMax = findMax(arr);
        System.out.println(thirdMax);
    }

    private static int findMax(int[] arr) {
            int max_index = 0,cnt = 0;
        for(int i= 0;i<arr.length;i++){
            max_index = max(i,arr);
            cnt++;
            if(cnt==3)
                return arr[max_index];

            int tmp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = tmp;

        }
        return -1;
    }

    private static int max(int index, int[] arr) {
        int maxOf = index;
        for(int i = index;i<arr.length;i++){
                if(arr[i]>arr[maxOf])
                    maxOf = i;
        }
        return maxOf;
    }
}
