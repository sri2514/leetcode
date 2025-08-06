class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character,Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i = 0 ; i < s.length();i++){
            char c = s.charAt(i);
            char d = t.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c) != d )return false;
            }
            else{
                if(set.contains(d)) return false;
                set.add(d);
                map.put(c,d);
            }

        }
        return true;
    }
}