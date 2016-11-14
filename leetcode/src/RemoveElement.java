/**
 * Created by zhangjingzhuan on 2016/10/12.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            if(nums[0] == val){
                nums = new int[0];
                return 0;
            }else{
                return 1;
            }
        }
        int des = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[des] = nums[i];
                des++;
            }
        }
        return des;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        RemoveElement test = new RemoveElement();
        int result = test.removeElement(nums, 3);
        System.out.println(result);
    }
}
