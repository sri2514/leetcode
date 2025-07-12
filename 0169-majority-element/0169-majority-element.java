class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        Map<Integer,Integer> hm = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(hm.getOrDefault(nums[i] , 0) > 0)
            q.add(nums[i]);
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
        int max = 0;
        int value = 0;
        while(!q.isEmpty()){
            int temp = q.poll();
            if(hm.get(temp) > max){
            max = hm.get(temp);
            value = temp;
            }   
        }
        return value;
    }
}