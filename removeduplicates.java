class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){ // if nums length is 0 return 0
            return 0;
        }
        int k=1; // used to moved to next pointer in nums
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){ // if number doesnt match with previous its unique
                nums[k]=nums[i];  // unique num is kept at nums at k'th position 
                k++; // moved k to next pointer
            }
        }
        return k; // after loop returning number of unique elements 
    }
}