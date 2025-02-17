class Solution {
    public int maxSubArray(int[] nums) {
       int result = nums[0];
       int current_value = nums[0];
       for(int index = 1 ; index < nums.length ; index++){
            current_value = Math.max(nums[index],current_value + nums[index]);
            result = Math.max(current_value,result);
        }
       
       return result; 
    }
}