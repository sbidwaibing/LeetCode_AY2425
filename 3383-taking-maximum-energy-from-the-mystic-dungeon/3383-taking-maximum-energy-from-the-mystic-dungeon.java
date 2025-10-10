class Solution {
    public int maximumEnergy(int[] energy, int k) {
        
        int n = energy.length;
        int[] newEnergy = new int[n];
        int ans = Integer.MIN_VALUE; 
        
        for (int i = n - 1; i >= 0; i--) {
            newEnergy[i] = energy[i];
            
            if (i + k < n) {
                newEnergy[i] += newEnergy[i + k];
            }
            
            ans = Math.max(newEnergy[i],ans);
        }

        return ans;
    }
}