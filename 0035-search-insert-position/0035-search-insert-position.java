class Solution {
    public int searchInsert(int[] nums, int target) {
       
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target) return i;
            if(nums[0] > target) return 0;
            if((i + 1) < nums.length && nums[i] < target && nums[i + 1] > target)      
            return i + 1;
        }
        return nums.length;
    }
}