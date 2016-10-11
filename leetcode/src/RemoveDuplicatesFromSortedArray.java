/**
 * Created by zhangjingzhuan on 2016/10/11.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        int des = 1;
        int curVal = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i] != curVal){
                //非重复值
                curVal = nums[i];
                nums[des] = curVal;
                des++;
            }
        }
        return des;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,4,5,5};
        RemoveDuplicatesFromSortedArray test = new RemoveDuplicatesFromSortedArray();
        int result = test.removeDuplicates(nums);
        System.out.println(result);
    }
}
