void remove_spcl_char(char* a) {
    int i = 0, j = 0;
    while (a[i]) {
        if (isalnum(a[i])) {
            a[j++] = a[i];
        }
        i++;
    }
    a[j] = '\0'; // Null-terminate the modified string
}
bool isPalindrome(char* a){
    remove_spcl_char(a);
    int len=strlen(a);
    int flag=1;
    for(int i=0;i<len/2;i++){
       
        if(tolower(a[i])!=tolower(a[len-i-1])){
            return 0;
            
        }
    }
   return 1;
    
}