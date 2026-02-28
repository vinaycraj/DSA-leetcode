class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;        // last element of nums1 valid part
        int j = n - 1;        // last element of nums2
        int k = m + n - 1;    // last index of nums1

        while (i >= 0 && j >= 0) { // checks condtions from last element
            if (nums1[i] > nums2[j]) { //if last element of nums1> nums 2 
                nums1[k] = nums1[i]; // it will be added to last index of combined size
                i--; // decrement nums1 index
            } else {
                nums1[k] = nums2[j]; // if nums1 element is smaller kth index will be added nums2 element
                j--;
            }
            k--; // decrement kth index
        }

        // copy remaining nums2 elements if any
        while (j >= 0) {
            nums1[k] = nums2[j]; // add nums2 th element to expanded array
            j--;
            k--;
        }
    }
}