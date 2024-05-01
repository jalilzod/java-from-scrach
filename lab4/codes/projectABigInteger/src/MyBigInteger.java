import java.util.Arrays;

public class MyBigInteger {
    private int []arr;
    private int SIZE;
    public MyBigInteger(){
        arr = new int[SIZE];
        System.out.println(arr[0]);
    }

    public MyBigInteger(String s){
        SIZE = s.length();
        arr = new int[SIZE];
        int j = 0;
        for(int i = SIZE-1;i>=0;i--){
            arr[j++] = s.charAt(i)-'0';
        }
        System.out.println(toString());
    }

     public String add(MyBigInteger second){
        int tmpSize = this.SIZE+second.SIZE,actualSize = 0;
        int []tmp = new int[tmpSize];
        if(this.SIZE==0){
            return Arrays.toString(second.arr);
        }else if(second.SIZE==0)
            return Arrays.toString(this.arr);
        else
        {
            int carry = 0,i;
            for(i = 0;i<this.SIZE&&i< second.SIZE;i++){
                int sum =  this.arr[i]+second.arr[i];
                sum+=carry;
                String tm = "";
                  if(sum>9){
                      tm = ""+sum;
                      carry = tm.charAt(0)-'0';
                      sum = tm.charAt(1)-'0';
                      tmp[i] = sum;
                  }else
                  {
                      tmp[i] = sum;
                      carry=0;
                  }
            }

            if(i==this.SIZE&&i!=second.SIZE){
                for(;i< second.SIZE;i++){
                    tmp[i] = second.arr[i];
                }
            }else if(i==second.SIZE&&i!=this.SIZE){
                for(;i< this.SIZE;i++){
                    tmp[i] = this.arr[i];
                }
            }
          actualSize = i;
        }

         String n = "";
         for(int i = actualSize-1;i>=0;i--){
             n = n+""+tmp[i];
         }
         return n;
    }


    private void reverse(MyBigInteger t){
        int left = 0;
        int rigght = t.SIZE-1;
        while(left<rigght){
            int tmp = t.arr[left];
            t.arr[left] = t.arr[rigght];
            t.arr[rigght] = tmp;

            left++;
            rigght--;
        }
    }

    public int compare(MyBigInteger s){
        reverse(this);
        reverse(s);

        if(isEquals(s))
            return 0;
        else if(s.SIZE==0&&this.SIZE!=0)
            return 1;
        else if(s.SIZE!=0&&this.SIZE==0)
            return -1;
        else
        {
            int i;
            for(i = 0;i<this.SIZE&&i<s.SIZE;i++){
                if(this.arr[i]>s.arr[i])
                    return 1;
                else if(this.arr[i]<s.arr[i])
                    return -1;
            }

            if(i==this.SIZE&&i!=s.SIZE){
                return -1;
            }else if(i==s.SIZE&&i!=this.SIZE)
                return 1;
        }
        return -1;
    }

    public boolean isEquals(MyBigInteger s){
        if(s.SIZE==0&&this.SIZE!=0){
            return false;
        }else if(this.SIZE==0&&s.SIZE!=0){
            return false;
        }else if(this.SIZE==0&&s.SIZE==0){
            return true;
        }else
        {
            int i;
            for(i = 0;i<this.SIZE&&i<s.SIZE;i++){
                if(this.arr[i]>s.arr[i])
                    return false;
                else if(this.arr[i]<s.arr[i])
                    return false;
            }
            if(i == this.SIZE&&i!=s.SIZE)
                return false;
            else if(i==s.SIZE&&i!=this.SIZE)
                return false;
        }
            return true;
    }


    public String subtract(MyBigInteger s){
        if(this.SIZE!=0&&s.SIZE==0){
            return this.toString();
        }else if(this.SIZE==0&&s.SIZE!=0)
            return s.toString();
        else
        {
            int carry = 0;
            if(this.SIZE==s.SIZE||this.SIZE>s.SIZE){
                int i;
                for(i = 0;i<this.SIZE&&i<s.SIZE){

                }



            }
            else if(this.SIZE<s.SIZE){

            }
        }
        return null;
    }
    @Override
    public String toString(){
        String n = "";
        for(int i = 0;i<arr.length;i++){
            n= n+""+arr[i];
        }
        return n;
    }

}

