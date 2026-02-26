class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0; // k is set to zero so that we can move to next pointer
        for (int i=0;i<nums.length;i++){ // loops through all array elements
            if(nums[i]!=val){    // checks number not equal to given value
                nums[k]=nums[i]; // replaces element of ith index to kth index (in-array)
                k++; // moving to next pointer and act as couter to newly updated array
            }
        }
        return k; // returns count of elements in newly updated array
    }
}