class Solution {
    public void moveZeroes(int[] nums) {
        int right=nums.length-1;
        for(int i=0;i<right;i++){
            if(nums[i]==0){
                for(int j=i+1;j<=right;j++){
                    nums[j-1]=nums[j];
                }
                nums[right]=0;
                right--;
                i--;
            }
        }
    }
}