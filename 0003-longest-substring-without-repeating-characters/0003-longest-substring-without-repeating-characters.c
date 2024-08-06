int lengthOfLongestSubstring(char* s) {
    int freq[256] = {0}; // Frequency array for all ASCII characters
    int start = 0; // Start index of the current substring
    int max = 0; // Maximum length of substring found
    int current_length; // Current length of the substring

    for (int i = 0; s[i] != '\0'; i++) {
        if (freq[(int)s[i]] > start) {
            start = freq[(int)s[i]]; // Update start to the position after the last occurrence of s[i]
        }
        current_length = i - start + 1; // Calculate the length of the current substring
        if (max < current_length) {
            max = current_length; // Update max if a longer substring is found
        }
        freq[(int)s[i]] = i + 1; // Store the position of the current character
    }
    
    return max; // Return the maximum length found
}