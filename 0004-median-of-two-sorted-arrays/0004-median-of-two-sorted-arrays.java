class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] k = new int[nums1.length + nums2.length];

        int i = 0, j = 0, index = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                k[index] = nums1[i];
                i++;
            } else {
                k[index] = nums2[j];
                j++;
            }
            index++;
        }

        while (i < nums1.length) {
            k[index] = nums1[i];
            i++;
            index++;
        }

        while (j < nums2.length) {
            k[index] = nums2[j];
            j++;
            index++;
        }

       int s = k.length;

if (s % 2 == 0) {
    // Even number of elements
    return (k[s / 2] + k[(s / 2) - 1]) / 2.0;
} else {
    // Odd number of elements
    return k[s / 2];
}


    
    }
}