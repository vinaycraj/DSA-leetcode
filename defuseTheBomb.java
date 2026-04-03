class Solution {
    public int[] decrypt(int[] code, int k) {
        
        int n = code.length;
        int[] result = new int[n];
        
        if(k == 0) return result;
        
        int start = 1, end = k;
        
        // Handle negative k
        if(k < 0) {
            k = -k;
            start = n - k;
            end = n - 1;
        }
        
        int sum = 0;
        
        // Initial window sum
        for(int i = start; i <= end; i++) {
            sum += code[i % n];
        }
        
        // Sliding window
        for(int i = 0; i < n; i++) {
            result[i] = sum;
            
            // Remove left
            sum -= code[start % n];
            
            // Move window
            start++;
            end++;
            
            // Add right
            sum += code[end % n];
        }
        
        return result;
    }
}