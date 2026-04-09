class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int n = cardPoints.length;
        
        // Total sum
        int totalSum = 0;
        for(int num : cardPoints) {
            totalSum += num;
        }
        
        // If taking all cards
        if(k == n) return totalSum;
        
        int windowSize = n - k;
        int currSum = 0;
        
        // First window
        for(int i = 0; i < windowSize; i++) {
            currSum += cardPoints[i];
        }
        
        int minSum = currSum;
        
        // Sliding window
        for(int i = windowSize; i < n; i++) {
            currSum += cardPoints[i];
            currSum -= cardPoints[i - windowSize];
            minSum = Math.min(minSum, currSum);
        }
        
        return totalSum - minSum;
    }
}