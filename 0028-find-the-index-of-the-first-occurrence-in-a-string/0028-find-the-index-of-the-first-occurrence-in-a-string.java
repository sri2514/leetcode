class Solution {
    public int strStr(String haystack, String needle) {
        int flag = 1;
        int h = haystack.length();
        int n = needle.length();
        if( h < n) return -1;
        for(int i = 0 ; i < h ; i++){
            if(n > h - i) return -1;
            if(haystack.charAt(i) == needle.charAt(0) ){
                flag = 1;
                for(int j = 0,k = i ; j < needle.length(); j++,k++){
                    if(haystack.charAt(k) != needle.charAt(j)){
                        flag = 0;
                        break;
                    }
                }
                if(flag == 1) return i;
            }
        }
        return -1;
    }
}