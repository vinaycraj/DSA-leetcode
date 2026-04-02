class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        
        int[] freq = new int[101]; // range [-50,50]
        
        int left = 0;
        
        for(int right = 0; right < n; right++) {
            
            // Add element
            freq[nums[right] + 50]++;
            
            // Window size reached
            if(right - left + 1 == k) {
                
                int count = 0;
                int beauty = 0;
                
                // Find x-th smallest
                for(int i = 0; i < 101; i++) {
                    count += freq[i];
                    
                    if(count >= x) {
                        int val = i - 50;
                        beauty = val < 0 ? val : 0;
                        break;
                    }
                }
                
                result[left] = beauty;
                
                // Remove left element
                freq[nums[left] + 50]--;
                left++;
            }
        }
        
        return result;
    }
}