class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        
        if(s.length() < p.length()) return list;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // frequency of p
        for(int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        // sliding window
        for(int i = 0; i <= s.length() - p.length(); i++) {
            
            if(matches(pCount, sCount)) {
                list.add(i);
            }
            if(i + p.length() < s.length()) { //sliding window
                sCount[s.charAt(i) - 'a']--; // remove left
                sCount[s.charAt(i + p.length()) - 'a']++; // add right
            }
        }

        return list;
    }

    private boolean matches(int[] a, int[] b) {
        for(int i = 0; i < 26; i++) {
            if(a[i] != b[i]) return false;
        }
        return true;
    }
}