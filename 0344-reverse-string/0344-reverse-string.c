void reverseString(char* s, int sSize) {
    int low=0,high=sSize-1;
    char temp;
   for(low=0;low<=high;low++){
    
temp=s[low];
s[low]=s[high];
s[high]=temp;
high--;
   }
}