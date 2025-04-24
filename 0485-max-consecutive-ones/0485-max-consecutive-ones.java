class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for(int num : nums){
          
            if(num == 1) count++;
            if(num == 0) count=0;
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}