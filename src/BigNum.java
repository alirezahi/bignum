/**
 * Created by Alireza on 5/2/17.
 */
public class BigNum {
    public String sum(String num_one,String num_two){
        char[] num1 = num_one.toCharArray();
        char[] num2 = num_two.toCharArray();

        if (num1.length>num2.length){
            char[] tmp_num = num2;
            num2 = num1;
            num1 = tmp_num;
        }
        int number_min = Math.min(num1.length,num2.length);
        int number_max = Math.max(num1.length,num2.length);
        int [] num3 = new int[number_max+1];
        int[] result_num = new int[number_max+1];
        for(int i=0;i<num3.length;i++)
            num3[i] = 0;
        for(int i=number_max;i>=0;i--){
            int a,b;
            if(number_max-i<number_min)
                a = (int)num1[number_min-(number_max-i)-1]-48;
            else
                a = 0;
            if(i>0)
                b = (int)num2[i-1]-48;
            else
                b = 0;
            int tmp_res = a+b+num3[i];
            result_num[i] = tmp_res%10;
            if(i!=0)
                num3[i-1] = (tmp_res/10)%10;
        }
        for(int i=0;i<result_num.length;i++)
            System.out.print(result_num[i]);
        return num_one;
    }
}
