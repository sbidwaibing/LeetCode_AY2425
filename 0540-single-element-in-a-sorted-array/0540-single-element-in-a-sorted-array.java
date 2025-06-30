class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        // This solution utilizes a bruteforce technique with a TC - O(n);
        // int n = nums.length;
        // int result = 0;

        // for(int num : nums){
        //     result ^= num;
        // }
        // return result;

        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int mid = (low + high) / 2;
            if(mid % 2 == 1) mid--;
            if(nums[mid] == nums[mid + 1]) low = mid + 2;
            else high = mid;
        }
        return nums[high];
    }
}