class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> l = new LinkedList<>();
        for(int num : nums1){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int num: nums2){
            if(mp.containsKey(num) && mp.get(num) > 0 ){
                l.add(num);
                mp.put(num,mp.get(num) - 1);   
            }
        }
        int[] arr = new int[l.size()];
        int i = 0;
        for(int num : l){
            arr[i] = num;
            i++;
        }
        return arr;
    }
}