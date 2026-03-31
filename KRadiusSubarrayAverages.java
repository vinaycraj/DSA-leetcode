class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];

        for(int i = 0; i < n; i++) result[i] = -1;

        int windowSize = 2 * k + 1;
        if(windowSize > n) return result;

        long sum = 0;

        // First window
        for(int i = 0; i < windowSize; i++) {
            sum += nums[i];
        }

        result[k] = (int)(sum / windowSize);

        // Slide window
        for(int i = windowSize; i < n; i++) {
            sum += nums[i];                  // add new
            sum -= nums[i - windowSize];    // remove old

            result[i - k] = (int)(sum / windowSize);
        }

        return result;
    }
}