class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int result = 0;

        for(int num : nums){
            result ^= num;
        }
        return result;
    }
}