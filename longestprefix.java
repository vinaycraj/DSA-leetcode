class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prestr="";
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || ch!=strs[j].charAt(i)){
                    return prestr;
                }  
            }
            prestr+=ch; // after loop ends ch will be added if return doesn't trigger 
        }
        return prestr;
    }
}
