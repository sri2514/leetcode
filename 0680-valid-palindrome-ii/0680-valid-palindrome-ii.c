int palindrome(char *a,int low,int high){
    while(low<high){
        if(a[low]!=a[high])
            return 0;
        low++;
        high--;
    }
    return 1;
}
int validPalindrome(char* a) {
    int low=0;
    int high=strlen(a)-1;
    while(low<high){
        if(a[low]!=a[high])
        return palindrome(a,low+1,high)||palindrome(a,low,high-1);
        low++;
        high--;
    }
    return 1; 
}