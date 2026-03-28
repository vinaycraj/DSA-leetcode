class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int avg=sum/k;
        if(avg>=threshold){
            count++;
        }
        for(int j=k;j<arr.length;j++){
            sum=sum-arr[j-k]+arr[j];
            avg=sum/k;
            if(avg>=threshold){
                count++;
            }
        }
        return count;
    }
}
