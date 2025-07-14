class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int m1 = nums2.length;
        
        int i = 0;
        int j = 0;

        final int MOD = 1_000_000_007;

        long sum1 = 0;
        long sum2 = 0;

        while(i<n1 && j<m1){
            if (nums1[i] < nums2[j]) {
                sum1 += nums1[i];
                i++;
            }
            else if (nums2[j] < nums1[i]) {
                sum2 += nums2[j];
                j++;
            }
            else{
                sum1 = sum2 = Math.max(sum1, sum2) + nums1[i];
                i++;
                j++;
            }
        }
        while (i < n1) sum1 += nums1[i++];
        while (j < m1) sum2 += nums2[j++];

        return (int)(Math.max(sum1, sum2) % MOD);
    }
}