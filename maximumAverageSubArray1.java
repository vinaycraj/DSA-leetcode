class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        
        // Step 1: first window
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        
        int maxSum = sum;
        
        // Step 2: sliding window
        for(int i = k; i < nums.length; i++){
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        
        return (double) maxSum / k;
    }
}