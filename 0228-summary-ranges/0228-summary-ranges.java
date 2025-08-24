class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l = new LinkedList<>();
        for(int i = 0 ; i < nums.length ; i++){
            int start =  nums[i];
            while(i + 1 < nums.length && nums[i] + 1 ==nums[i + 1]) i++;
            if(start != nums[i])
            l.add(""+start+"->"+nums[i]);
            else l.add(""+start);
        }
        return l;
    }
}