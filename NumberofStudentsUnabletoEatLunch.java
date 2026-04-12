class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int[] count = new int[2];
        
        // Count student preferences
        for(int s : students) {
            count[s]++;
        }
        
        // Process sandwiches
        for(int i = 0; i < sandwiches.length; i++) {
            
            int type = sandwiches[i];
            
            if(count[type] == 0) {
                // No student wants this type → stop
                return sandwiches.length - i;
            }
            
            count[type]--;
        }
        
        return 0;
    }
}