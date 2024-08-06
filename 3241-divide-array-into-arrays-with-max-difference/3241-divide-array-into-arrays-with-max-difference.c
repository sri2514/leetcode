int cmpfunc(const void *a, const void *b) {
    return (*(int*)a - *(int*)b);
}

int** divideArray(int* nums, int numsSize, int k, int* returnSize, int** returnColumnSizes) {
    // Sort the array
    qsort(nums, numsSize, sizeof(int), cmpfunc);
    
    // Calculate the number of groups
    int numGroups = numsSize / 3;
    
    // Allocate memory for the result
    int** result = (int**)malloc(numGroups * sizeof(int*));
    *returnColumnSizes = (int*)malloc(numGroups * sizeof(int));
    
    // Initialize return size
    *returnSize = 0;
    
    for (int i = 0; i < numsSize; i += 3) {
        // Check if we have a valid group
        if (nums[i + 2] - nums[i] <= k) {
            result[*returnSize] = (int*)malloc(3 * sizeof(int));
            result[*returnSize][0] = nums[i];
            result[*returnSize][1] = nums[i + 1];
            result[*returnSize][2] = nums[i + 2];
            (*returnColumnSizes)[*returnSize] = 3;
            (*returnSize)++;
        } else {
            // If any group is invalid, free allocated memory and return an empty array
            for (int j = 0; j < *returnSize; j++) {
                free(result[j]);
            }
            free(result);
            free(*returnColumnSizes);
            *returnSize = 0;
            *returnColumnSizes = NULL;
            return NULL;
        }
    }
    
    return result;
}