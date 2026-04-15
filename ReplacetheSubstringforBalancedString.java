class Solution {
    public int balancedString(String s) {
        
        int n = s.length();
        int target = n / 4;
        
        int[] count = new int[128];
        
        // Count all characters
        for(char c : s.toCharArray()) {
            count[c]++;
        }
        
        int left = 0;
        int minLen = n;
        
        for(int right = 0; right < n; right++) {
            
            // Include in window → reduce outside count
            count[s.charAt(right)]--;
            
            // Check if valid
            while(left < n &&
                  count['Q'] <= target &&
                  count['W'] <= target &&
                  count['E'] <= target &&
                  count['R'] <= target) {
                
                minLen = Math.min(minLen, right - left + 1);
                
                // Shrink window
                count[s.charAt(left)]++;
                left++;
            }
        }
        
        return minLen;
    }
}