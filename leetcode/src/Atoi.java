/**
 * Created by zhangjingzhuan on 2016/9/19.
 */
public class Atoi {
    public int myAtoi(String str) {
        str = str.trim();
        if (str == null|| str.equals("")) {
            return 0;
        }

        int result = 0;
        boolean negative = false;
        int i = 0, max = str.length();
        int limit;
        int multmin;
        int digit;

        if (max > 0) {
            if (str.charAt(0) == '-') {
                negative = true;
                limit = Integer.MIN_VALUE;
                i++;
            }else if(str.charAt(0) == '+'){
                i++;
                limit = -Integer.MAX_VALUE;
            }
            else {
                limit = -Integer.MAX_VALUE;
            }
            multmin = limit / 10;
            if (i < max) {
                digit = Character.digit(str.charAt(i++),10);
                if (digit < 0) {
                    return 0;
                } else {
                    result = -digit;
                }
            }
            while (i < max) {
                // Accumulating negatively avoids surprises near MAX_VALUE
                digit = Character.digit(str.charAt(i++),10);
                if (digit < 0) {
                    break;
                }
                if (result < multmin) {
                    return 0;
                }
                result *= 10;
                if (result < limit + digit) {
                    return 0;
                }
                result -= digit;
            }
        } else {
            return 0;
        }
        if (negative) {
            if (i > 1) {
                return result;
            } else {
                return 0;
            }
        } else {
            return -result;
        }
    }

    public static void main(String[] args){
        Atoi transfer = new Atoi();
        String str1 = "123";
        String str2 = " ";
        System.out.println(transfer.myAtoi(str1));
        System.out.println(transfer.myAtoi(str2));
    }
}
