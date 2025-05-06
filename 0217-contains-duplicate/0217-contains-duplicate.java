class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
       HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
             if(hm.get(nums[i]) > 1) return true;
        }
        return false;
    }
}