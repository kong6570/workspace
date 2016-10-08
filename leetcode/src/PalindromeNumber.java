/**
 * Created by zhangjingzhuan on 2016/9/20.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x){
        if(x == 0){
            return true;
        }else if(x == Integer.MAX_VALUE || x == Integer.MIN_VALUE){
            return false;
        }
        if(x < 0){
            return false;
        }
        //reverse int
        StringBuilder reverseNumString = new StringBuilder();
        int tempNum = x;

        while(tempNum/10 > 0){
            reverseNumString.append(tempNum%10);
            tempNum = tempNum/10;
        }
        reverseNumString.append(tempNum);
        long reverseNumLong = Long.valueOf(reverseNumString.toString()).longValue();
        if(reverseNumLong > Integer.MAX_VALUE){
            return  false;
        }
        if(reverseNumLong == x){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int x = 1;
        PalindromeNumber test = new PalindromeNumber();
        System.out.println(test.isPalindrome(x));
    }
}
