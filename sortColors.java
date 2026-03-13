class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;// used to move mid from left onwards
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){ // reperesents red, where mid swaps with low value
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++; // increment low and mid bcz zero is already swapped
                mid++;
            }else if(nums[mid]==1){ //represents white, where mid moves ahead
                mid++;// increments mid value bcz current mid is in its correct position
            }else{ //represents blue, where mid swaps with high value
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;// decrement high bcz current high is in its correct position
            }
        }
    }
}
