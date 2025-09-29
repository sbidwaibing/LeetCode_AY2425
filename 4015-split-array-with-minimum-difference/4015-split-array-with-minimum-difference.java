class Solution {
    public long splitArray(int[] nums) {
        long prefixSum=0;
        int n=nums.length;
        boolean[] check=new boolean[n];
        boolean isIncreasing=true;
        int prev=-1;
        
        for(int i=nums.length-1;i>=0;i--){
            if(!isIncreasing || prev>=nums[i])isIncreasing=false;
            check[i]=isIncreasing;
            prefixSum+=nums[i];
            prev=nums[i];
        }

        long sum=0;
        prev=-1;
        long ans=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            prefixSum-=nums[i];
            if(nums[i]<=prev)break;
            if(i<n-1 && check[i+1])ans=Math.min(ans,(Math.abs(sum-prefixSum)));
            prev=nums[i];
        }

        return ans==Long.MAX_VALUE?-1:ans;
    }
}