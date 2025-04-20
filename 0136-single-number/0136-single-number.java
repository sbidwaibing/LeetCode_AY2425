class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums) res ^= num;
        return res;
        // return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b);
    }
}