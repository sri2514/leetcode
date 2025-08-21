class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[0] > target) return 0;
        if(nums[nums.length - 1] < target) return nums.length;
        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] == target) return i;
            if(nums[i + 1] == target) return i + 1;
            if(nums[i] < target && nums[i + 1] > target )
            return i + 1;
        }
        return 0;
    }
}