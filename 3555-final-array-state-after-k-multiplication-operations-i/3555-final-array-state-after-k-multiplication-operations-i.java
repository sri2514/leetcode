class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] arr = new int[2];
        for(int  i = 0 ; i < k ; i++){
            arr = min(nums);
            nums[arr[1]] = arr[0] * multiplier;
        }
        return nums;
    }
        int[] min(int[] array){
            int minimum_value = Integer.MAX_VALUE;
            int index = 0;
            for(int i = 0 ; i < array.length ; i++){
                if(array[i] < minimum_value) {
                minimum_value = array[i];
                index = i;
                }
            }
            return new int[] {minimum_value , index};
        }
        
    
}