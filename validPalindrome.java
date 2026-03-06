class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        
        String s1=s.toLowerCase();
        String s2= s1.replaceAll("[^a-zA-Z0-9]", "");
        int right=s2.length()-1;
        while(left<right){
            if(s2.charAt(left)!=s2.charAt(right)){ // for string access we do use str.charAt(index);
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}