class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;

        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for(int i = 0 ; i < pattern.length();i++){
            char c = pattern.charAt(i);
            String str = words[i];

            if(map.containsKey(c)){
                if(!map.get(c).equals(str)) return false;
            }
            else{
                if(set.contains(str)) return false;
                map.put(c,str);
                set.add(str);
            }
        }
    return true;
    }
}