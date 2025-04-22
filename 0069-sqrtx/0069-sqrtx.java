class Solution {
    public int mySqrt(int x) {
    if(x == 1 || x == 2 || x == 3) return 1;
        for(int i = 2 ; i <= x/2 ; i++){
            if((long)i * i == x) return i;
            if((long)i * i < x && (long)(i + 1) * (i + 1) > x)return i;
        }
        return 0;
    }
}