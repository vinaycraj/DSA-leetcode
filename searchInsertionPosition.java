//35 search insertion position
class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i; // if value matches returns i th index
            }
            else if(nums[i]>target){ // if ith element is greater than target then returns ith index
                return i; 
            }
        }
        return nums.length; // if value position would be out of array index then it executes
    }
}