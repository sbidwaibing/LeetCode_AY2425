class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2) return 0;
        Arrays.sort(nums);

        int maxDifference = 0;
        int currentDiff = 0;

        for(int i=0; i<nums.length-1; i++){
            currentDiff = nums[i + 1] - nums[i];
            maxDifference = Math.max(maxDifference, currentDiff);
        }

        return maxDifference;
    }
}