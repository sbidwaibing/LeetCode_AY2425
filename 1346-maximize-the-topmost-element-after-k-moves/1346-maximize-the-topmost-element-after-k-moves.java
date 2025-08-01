class Solution {
    public int maximumTop(int[] nums, int k) {
        
        int n = nums.length;
        int max = -1;

        if(n == 1){
            if(k % 2 == 1) return -1;
            else return nums[0];
        }

        if(k < n) max = nums[k];
        else if(k > n) k = n + 1;

        for(int i=0; i<k-1; i++){
            max = Math.max(max, nums[i]);
        }

        return max;
    }
}