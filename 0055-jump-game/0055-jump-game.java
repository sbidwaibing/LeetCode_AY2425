class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reach = n-1;
        int i = n-2;
        
        while(i>=0){
            if(i + nums[i] >= reach) reach = i;
            i--;
        }

        return reach == 0;
    }
}