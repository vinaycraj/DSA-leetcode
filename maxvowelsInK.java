class Solution {
    public int maxVowels(String s, int k) {
        int sum = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < k; i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))) {
                sum++;
            }
        }
        int max_count = sum;
        for (int j = k; j < s.length(); j++) {
            if (vowels.contains(String.valueOf(s.charAt(j - k)))) {
                sum--;
            }
            if (vowels.contains(String.valueOf(s.charAt(j)))) {
                sum++;
            }

            max_count = Math.max(max_count, sum);
        }

        return max_count;
    }
}