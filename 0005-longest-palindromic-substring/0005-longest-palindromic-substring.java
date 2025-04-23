class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len <= 1) return s;

        int maxlen = 1;
        String max = s.substring(0,1);

        for(int i = 0 ; i < len ; i++){
            for(int j = i + maxlen ; j <= len ; j++){
                if(j - i > maxlen && ispalindrome(s.substring(i,j))){
                maxlen = j - i;
                max = s.substring(i , j);
                }
            }
        }
        return max;
    }
    public boolean ispalindrome(String s){
        int left = 0 ; 
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}