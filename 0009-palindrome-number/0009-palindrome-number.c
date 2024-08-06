bool isPalindrome(int x) {
   if(x<0)
   return false;
   int original=x;
   int reversed=0;
   while(x!=0){
    int rem=x%10;
    if (reversed > (INT_MAX - rem) / 10) 
            return false;
    
    reversed=reversed*10+rem;
    x/=10;
   }
   return reversed==original;
}