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


    public String subtract(MyBigInteger s) {
        String sign = "+";
        int tmp[] = new int[this.SIZE + s.SIZE];
        int actualSize = 0;
        if (this.SIZE != 0 && s.SIZE == 0) {
            return this.toString();
        } else if (this.SIZE == 0 && s.SIZE != 0)
            return s.toString();
        else {
            int carry = 0;
            if (this.SIZE >= s.SIZE) {
                int i;
                for (i = 0; i < this.SIZE && i < s.SIZE; i++) {
                    int a = this.arr[i] - carry;
                    int b = s.arr[i];
                    if (bigSmallEqual(a, b) == 1) {
                        tmp[actualSize++] = a - b;
                        carry = 0;
                    } else if (bigSmallEqual(a, b) == -1) {
                        if (i < s.SIZE - 1) {
                            a += 10;  //需要从下一个数借1
                            carry = 1; //下次运算要减去carry
                            tmp[actualSize++] = a - b;
                        } else {
                            sign = "-";
                            tmp[actualSize++] = b - a;
                        }
                    } else {
                        carry = 0;
                        tmp[actualSize++] = 0;
                    }

                }
            } else if (this.SIZE - 1 < s.SIZE - 1) {
                sign = "-";

                int len = s.SIZE-this.SIZE;

                int []tp = new int[s.SIZE];
                int k;
                for(k = 0;k<len;k++){
                    tp[k] = 0;
                }
                for(int t = this.SIZE-1;t>=0;t--){
                    tp[k++] = this.arr[t];
                }

                reverseArr(tp);

                int i;
                for (i = 0; i < tp.length && i < s.SIZE; i++) {
                    int b  = tp[i];
                    int a = s.arr[i] - carry;
                    if (bigSmallEqual(a, b) == 1) {
                        tmp[actualSize++] = a - b;
                        carry = 0;
                    } else if (bigSmallEqual(a, b) == -1) {
                        if (i < this.SIZE - 1) {
                            a += 10;  //需要从下一个数借1
                            carry = 1; //下次运算要减去carry
                            tmp[actualSize++] = a - b;
                        } else {
                            sign = "-";
                            tmp[actualSize++] = b - a;
                        }
                    } else {
                        tmp[actualSize++] = 0;
                        carry = 0; //当两个都相等那么减法后是0不需要存储到数组
                    }

                }
            }

            String n = "";
            if (sign.charAt(0) == '-') //如果符号是-那么给他负数
                n += '-';

            int flag = 1;
            for (int i = actualSize - 1; i >= 0; i--) { //把开头的0去掉
                if(tmp[i]==0&&flag!=0){
                    while(tmp[i]==0)
                        i--;
                    flag=0;
                }
                n = n + "" + tmp[i];
            }

            return n;
        }
    }

    private void reverseArr(int[] tp) {
        int left = 0;
        int right = tp.length-1;

        while(left<right){
            int tmp = tp[right];
            tp[right] = tp[left];
            tp[left] = tmp;
            right--;
            left++;
        }
    }

    private int bigSmallEqual(int i, int i1) {
           if(i>i1)
               return 1;
           else if(i<i1)
               return -1;
           return 0;
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

