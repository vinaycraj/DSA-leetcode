class Solution {
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){ //if last digit is smaller than 9 
                digits[i]++; // increment its element value
                return digits; // return updated array
            }
            digits[i]=0; // if element value greater than 9 make it 0 and start loop again
        }
        int[] result=new int[digits.length+1];
        result[0]=1; // java automatically set remaining elements to 0
        return result;
    }
}