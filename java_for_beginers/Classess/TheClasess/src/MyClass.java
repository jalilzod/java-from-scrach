public class MyClass {

    private int[]nums;
    //public MyClass(int []nums){
      //  this.nums = nums;
    //}

    void analyse(){
        MyInnerClass inner = new MyInnerClass();
        System.out.println("Max: "+inner.max());
        System.out.println("Min: "+inner.min());
        System.out.println("Average: "+inner.avr());

    }



    class MyInnerClass{

        public int min(){
            int m = nums[0];
            for(int i = 0;i<nums.length;i++){
                if(nums[i]<m)
                    m = nums[i];
            }
            return m;
        }
       public int max(){
           int m = nums[0];
           for(int i = 0;i<nums.length;i++){
               if(nums[i]>m)
                   m = nums[i];
           }
           return m;
       }
       public double avr(){
           int sum  = 0;
           for(int i = 0;i<nums.length;i++){
               sum+=nums[i];
           }
           return (double)sum/nums.length;
       }

    }

    public void VarTest(int ...v){
        System.out.println("Number of args: "+v.length);
        System.out.println("Contents: ");

        for(int i = 0;i<v.length;i++){
            System.out.println(" arg "+i+": "+v[i]);
        }
        System.out.println();
    }

    public void backward(String txt,int index){

        if(index<0)
            return;

        char last = txt.charAt(index--);
        System.out.print(last);
        String sub = txt.substring(0,index+1);

        backward(sub,index);

    }


    int sumOfVara(int ...n){

        System.out.println("Arguments: "+n.length);
        int sum = 0;
        if(n.length==0)
            System.out.println("No arguments passed!"+sum);
        else
            for(int i = 0;i<n.length;i++)
                sum+=n[i];

            return sum;
    }



}
