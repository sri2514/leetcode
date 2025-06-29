class Solution {
    public int myAtoi(String str) {
       final int len = str.length();
       int index = 0;
       boolean isNegative = false;

       if(len == 0) return 0;
       while(index < len && str.charAt(index) == ' ')
       index++;

        if(index < len){
            if(str.charAt(index) == '-'){
                isNegative = true;
                index++;
            }
            else if(str.charAt(index) == '+')
            index++;
        }

        int result = 0;
        while(index < len && Character.isDigit(str.charAt(index))){
            int digit = str.charAt(index) - '0';

            if((result > Integer.MAX_VALUE / 10)||((result == Integer.MAX_VALUE / 10) && digit > 7)){
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = (result*10) + digit;
            ++index;
        }

       return isNegative? -result : result;
        }
}