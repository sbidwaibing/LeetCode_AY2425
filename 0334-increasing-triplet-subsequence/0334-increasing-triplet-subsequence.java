class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length < 3) return false;

        int i, j;
        i = j = Integer.MAX_VALUE;

        for(int num : nums){
            if(num <= i) i = num;
            else if(num <= j) j = num;
            else return true;
        }

        return false;
    }
}