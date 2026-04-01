class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int n = customers.length;
        int satisfied = 0;
        
        // Step 1: Already satisfied customers
        for(int i = 0; i < n; i++) {
            if(grumpy[i] == 0) {
                satisfied += customers[i];
            }
        }
        
        // Step 2: Sliding window for extra satisfaction
        int extra = 0;
        
        // First window
        for(int i = 0; i < minutes; i++) {
            if(grumpy[i] == 1) {
                extra += customers[i];
            }
        }
        
        int maxExtra = extra;
        
        // Slide the window
        for(int i = minutes; i < n; i++) {
            if(grumpy[i] == 1) {
                extra += customers[i];
            }
            
            if(grumpy[i - minutes] == 1) {
                extra -= customers[i - minutes];
            }
            
            maxExtra = Math.max(maxExtra, extra);
        }
        
        return satisfied + maxExtra;
    }
}