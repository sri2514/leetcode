class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        int[] ans = new int[m + n];
        for(int i = n - 1 ; i >= 0 ; i--){
            for(int j = m - 1 ; j >= 0 ; j--){
                int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int index1 = i + j ;
                int index2 = i + j + 1;
                int sum = multiply + ans[index2];

                ans[index1] += sum/10;
                ans[index2] = sum % 10;
            }
        }
            StringBuilder sb = new StringBuilder();
            for(int result : ans)
                if(!(sb.length() == 0 && result == 0)) sb.append(result);

            
        
         return sb.length() == 0 ? "0" :sb.toString();
    }
}