class Solution {
    public int minimumOperations(int[] nums) {
        int len = nums.length;
        int count = 0;

        for(int i=0; i<len; i++){
            if(nums[i] % 3 != 0){
                count++;
            }
        }

        return count;
    }
}