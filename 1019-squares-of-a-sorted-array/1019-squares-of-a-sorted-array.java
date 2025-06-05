class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        
        // Square each element in-place
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }
        
        // Sort the array in-place
        Arrays.sort(nums);
        
        return nums;
    }
}