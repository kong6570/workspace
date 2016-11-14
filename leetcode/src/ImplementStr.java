/**
 * Created by zhangjingzhuan on 2016/10/12.
 */
public class ImplementStr {
    public int strStr(String haystack, String needle) {
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        int result = -1;
        if(needleArray.length == 0)
            return 0;
        if(needleArray.length > haystackArray.length)
            return result;
        for(int i = 0; i<haystackArray.length; i++){
            int curIndex = i;
            boolean isFind = true;
            for(int j = 0; j<needleArray.length; j++){
                if(needleArray[j] != haystackArray[curIndex]){
                    isFind = false;
                    break;
                }
                curIndex++;
            }
            if(!isFind){
                int remainLength = haystackArray.length-(i+1);
                if(needleArray.length > remainLength){
                    break;
                }
            }else{
                result = i;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ImplementStr test = new ImplementStr();
        int index = test.strStr("abcdeiueo","dei");
        System.out.println(index);
    }
}
