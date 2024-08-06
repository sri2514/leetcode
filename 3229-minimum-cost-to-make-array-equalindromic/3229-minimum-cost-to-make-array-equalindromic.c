#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

// Function to check if a number is palindromic
int isPalindromic(int num) {
    if (num < 0) return 0;
    int reversed = 0, original = num;
    while (num > 0) {
        int digit = num % 10;
        if (reversed > (INT_MAX - digit) / 10) return 0; // Check for overflow
        reversed = reversed * 10 + digit;
        num /= 10;
    }
    return reversed == original;
}

// Function to calculate the cost to convert the array to a single palindromic number
long long calculateCost(int* nums, int numsSize, int target) {
    long long cost = 0;
    for (int i = 0; i < numsSize; i++) {
        cost += abs(nums[i] - target);
    }
    return cost;
}

// Comparison function for qsort
int cmp(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}

long long minimumCost(int* nums, int numsSize) {
    // Sort the input array
    qsort(nums, numsSize, sizeof(int), cmp);

    // Choose the median as the candidate for minimization
    int median = nums[numsSize / 2];

    // Set a reasonable range for palindromic number search around the median
    int lowerBound = median - 100000; // 100,000 below median
    int upperBound = median + 100000; // 100,000 above median
    if (lowerBound < 1) lowerBound = 1; // Ensure bounds are within valid range
    if (upperBound > 1000000000) upperBound = 1000000000; // Ensure bounds are within valid range

    // Calculate the minimum cost
    long long minCost = LLONG_MAX;
    for (int i = lowerBound; i <= upperBound; i++) {
        if (isPalindromic(i)) {
            long long cost = calculateCost(nums, numsSize, i);
            if (cost < minCost) {
                minCost = cost;
            }
        }
    }

    return minCost;
}