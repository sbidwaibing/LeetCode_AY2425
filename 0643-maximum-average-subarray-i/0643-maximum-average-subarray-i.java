class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        double maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k]; // Slide: add next, subtract first
            maxSum = Math.max(maxSum, windowSum);
        }

        // Step 3: Return the average
        return maxSum / k;
        
    }
}