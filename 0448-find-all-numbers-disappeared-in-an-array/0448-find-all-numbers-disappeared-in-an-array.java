class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new LinkedList<>();
        Set<Integer> s = new HashSet<>();
        Arrays.sort(nums);
        for(int num : nums){
            s.add(num);
        }
       for(int i = 1;i<=nums.length;i++){
        if(!s.contains(i))
        l.add(i);
       }
        return l;
    }
}