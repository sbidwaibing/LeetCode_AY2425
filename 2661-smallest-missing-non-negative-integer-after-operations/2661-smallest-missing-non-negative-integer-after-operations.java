class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        
        int[] remainderCount = new int[value];

        for(int num : nums){
            int r = ((num % value) + value) % value;
            remainderCount[r]++;
        }

        int result = 0; 
        while (remainderCount[result % value] > 0) 
        { 
            remainderCount[result % value]--; 
            result++; 
        } 

        return result;
    }
}