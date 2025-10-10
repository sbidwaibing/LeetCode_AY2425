class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int[] matrix=new int[n];

        for (int i = n - 1; i >= 0; i--) {
            matrix[i] = energy[i];
            if (i + k < n) {
                matrix[i] += matrix[i + k];
            }
        }

        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            ans=Math.max(matrix[i],ans);
        }

        return ans;
    }
}