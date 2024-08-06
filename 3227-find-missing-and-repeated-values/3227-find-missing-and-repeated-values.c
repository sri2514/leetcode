/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findMissingAndRepeatedValues(int** grid, int gridSize, int* gridColSize, int* returnSize) {
     int n = gridSize;
    int size = n * n;
    int* count = (int*)calloc(size + 1, sizeof(int));
    int* result = (int*)malloc(2 * sizeof(int));
    *returnSize = 2;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < gridColSize[i]; j++) {
            count[grid[i][j]]++;
        }
    }

    for (int i = 1; i <= size; i++) {
        if (count[i] == 2) {
            result[0] = i;  // Repeating number
        }
        if (count[i] == 0) {
            result[1] = i;  // Missing number
        }
    }

    free(count);
    return result;
}