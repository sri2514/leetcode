class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> s = new Stack<>();
        Arrays.fill(result , -1);
        for(int i = 0; i < 2 * n ; i++){
                while(!s.isEmpty() && (nums[s.peek()] < nums[i % n])){
                    result[s.pop()] = nums[i % n];
                }
                s.push(i % n);
        }
        return result;
    }
}