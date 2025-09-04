class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int maxNum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            maxNum = Math.max(maxNum, nums[i]);
        }

        int low = 1;
        int high = maxNum;

        while(low <= high){
            
            int mid = (low + high) / 2;
            if(sumOfQ(nums, mid) <= threshold) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }

    private int sumOfQ(int[] nums, int n){
        int ans = 0;

        for(int i=0; i<nums.length; i++){
            ans += Math.ceil((double) nums[i] / n);
        }

        return ans;
    }
}