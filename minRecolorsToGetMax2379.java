class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)!='B'){ // first window to find count
                count+=1;
            }
        }
        int min_count=count;// reference count
        for(int j=k;j<blocks.length();j++){
            if(blocks.charAt(j)!='B'){ // adds new element to window 
                count++;
            }
            if(blocks.charAt(j-k)!='B'){ // removes old element from window 
                count--;
            }
            min_count=Math.min(min_count,count); // after every new window updates min_count
        }
        return min_count;
    }
}