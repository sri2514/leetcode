class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> l = new LinkedList<>();
        for(int num : nums1){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int num : nums2){
            if(mp.containsKey(num)){
            l.add(num);
            mp.remove(num);
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