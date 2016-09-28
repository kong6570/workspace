import java.util.Arrays;

/**
 * Created by zhangjingzhuan on 2016/9/27.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0){
            return  "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        int i =1;
        int memory = 0;
        String temp = null;
        search:
        for( ; i <= strs[0].length(); i++){
            temp = strs[0].substring(0,i);
            for(int j = 1; j<strs.length; j++){
                if(i > strs[j].length()){
                    break search;
                }
                if(temp.equals(strs[j].substring(0,i))){
                    if(j==(strs.length-1))
                        memory = i;//每个字符串包含子串
                }else {
                    break search;
                }

            }
        }
        if(memory > 0){
            return strs[0].substring(0,memory);
        }
        return  "";
    }

    public static void main(String[] args) {
        String[] strs = {"abcd","abc","abe"};
        LongestCommonPrefix test = new LongestCommonPrefix();
        System.out.println(test.longestCommonPrefix(strs));
    }
}
