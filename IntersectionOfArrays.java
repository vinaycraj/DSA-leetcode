class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>(); // hash set only stores unique element 
        Set<Integer> result=new HashSet<>();
        for(int num: nums1){
            set1.add(num);
        }
        for(int num:nums2){
            if(set1.contains(num)){ //
                result.add(num);  // it adds element if element already exist in set 1 this is intersection
            }
        }
        int[] ans=new int[result.size()];// converting hashset to array
        int i=0;
        for(int num:result){
            ans[i]=num;
            i++;
        }
        return ans;
    }
}