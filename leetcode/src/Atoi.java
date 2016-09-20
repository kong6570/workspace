/**
 * Created by zhangjingzhuan on 2016/9/19.
 */
public class Atoi {
    public int myAtoi(String str) {
        str = str.trim();
        if (str == null|| str.equals("")) {
            return 0;
        }

        double result = 0;
        boolean negative = false;
        int i = 0;
        int length = str.length();
        if(str.charAt(i) == '-'){
            negative = true;
            i++;
        }else if(str.charAt(i) == '+'){
            i++;
        }

        while(i < length && str.charAt(i) >= '0' && str.charAt(i) <='9'){
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }

        if(negative){
            result = -result;
        }

        if(result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(result < Integer.MIN_VALUE){
            return  Integer.MIN_VALUE;
        }
        return (int)result;
    }

    public static void main(String[] args){
        Atoi transfer = new Atoi();
        String str1 = "123";
        String str2 = " ";
        System.out.println(transfer.myAtoi(str1));
        System.out.println(transfer.myAtoi(str2));
    }
}
