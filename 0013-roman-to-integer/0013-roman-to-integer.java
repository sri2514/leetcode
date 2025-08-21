class Solution {
    public int romanToInt(String s) {
        //String[]  symbols = {"I","V","X","L","C","D","M"}
        //int[] val = {1,5,10,50,100,500,1000}
        Map<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int results = 0;
        for(int i = 0 ; i < s.length() - 1 ; i++){
            if(mp.get(s.charAt(i)) < mp.get(s.charAt(i + 1)))
            results -= mp.get(s.charAt(i));
            else
            results += mp.get(s.charAt(i));
        }
        return results + mp.get(s.charAt(s.length() - 1));
    }
}