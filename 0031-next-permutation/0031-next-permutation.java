class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i >= 0){
        int j = nums.length - 1;
        while(j >= 0 && nums[j] <= nums[i]) j--;
        swap(nums,i,j);
        }
        reverse(nums,i+1);
}
        public void swap(int[] arr,int left,int right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        public void reverse(int[] arr,int start){
            int end = arr.length - 1;
            while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        }
}
    
