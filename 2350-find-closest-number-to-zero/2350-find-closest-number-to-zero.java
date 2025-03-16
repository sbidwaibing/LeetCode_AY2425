import java.util.Arrays;

class Solution {
    public int findClosestNumber(int[] nums) {
        int size = nums.length;
        int closestNumber = 0, minDistance = Integer.MAX_VALUE;
        
        if(size < 2) return nums[0];

        Arrays.sort(nums);

        for (int i = 0; i < size; i++) {
            if (Math.abs(nums[i]) < minDistance) {
                minDistance = Math.abs(nums[i]);
                closestNumber = nums[i];
            } else if (Math.abs(nums[i]) == minDistance && nums[i] > closestNumber) {
                closestNumber = nums[i];
            }
        }

        return closestNumber;
    }
}
