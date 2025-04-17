class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums2.length ; i++){
            while(!s.isEmpty() && (s.peek() < nums2[i]))
            hm.put(s.pop(),nums2[i]);
            s.push(nums2[i]);
        }
        for(int i = 0 ; i  < nums1.length ; i++ ){
            nums1[i] = hm.getOrDefault(nums1[i] , -1);
        }
    return nums1;
    }
}