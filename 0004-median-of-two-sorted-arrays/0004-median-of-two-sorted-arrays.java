class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2 ; 
        int[] arr = new int[n];
        int index = 0,i = 0 , j = 0;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
            arr[index] = nums1[i];
            i++;
            }
            else{
                arr[index] = nums2[j];
                j++;
            }
            index++;
        }
        while( i < n1) {
            arr[index++] = nums1[i++];
        }
        while(j < n2){
            arr[index++] = nums2[j++];
        }
        double result = 0;
        if(n % 2 == 0){
        result = arr[n / 2] + arr[ (n / 2) - 1];
        result /= 2.0;
        }
        else
        result = arr[n / 2];
        return result;
    }
}