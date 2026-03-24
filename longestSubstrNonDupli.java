import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>(); // it stores unique value
        int left=0;
        int max=0;// to store max char
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){//if char at right position is already present,
                set.remove(s.charAt(left));//remove left char until duplicate of right char is removed thats y while loop
                left++; // so left is incremented to remove duplicate from left
            }
            set.add(s.charAt(right));// add unique element
            max=Math.max(max,right-left+1);// find length btw left and right to find max length
        }
        return max;
    }
}