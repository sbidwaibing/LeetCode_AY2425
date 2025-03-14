class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] prefix = new int[size];
        int[] suffix = new int[size];
        int[] ans = new int[size];

        prefix[0] = 1;
        suffix[size-1] = 1;

        for(int i=1; i<size; i++){
            prefix[i] = prefix[i-1] * nums[i - 1];
            // System.out.print(prefix[i]+" ");
        }
        // System.out.println();

        for(int i=size-2; i>=0; i--){
            suffix[i] = suffix[i+1] * nums[i + 1];
            // System.out.print(suffix[i]+" ");
        }
        // System.out.println();


        for (int i = 0; i < size; i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }
}