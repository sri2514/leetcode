#include<string.h>
int isvowel(char a) {
    a = tolower(a);
    return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u');
}
char* reverseVowels(char* a) {
    int low = 0;
    int high = strlen(a) - 1;
    
    while (low < high) {
        // Find the next vowel from the left
        while (low < high && !isvowel(a[low])) {
            low++;
        }
        // Find the next vowel from the right
        while (low < high && !isvowel(a[high])) {
            high--;
        }
        // Swap the vowels
        if (low < high) {
            char temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
    }
    return a;
}