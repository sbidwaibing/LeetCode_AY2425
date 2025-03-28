class Solution {
    public int largestAltitude(int[] gain) {
        int size = gain.length;
        int max = 0;
        int total = 0;
        for(int i=0; i<size; i++){
           
            total = total + gain[i];
           
            max = Math.max(total, max);
        }

        return max;
    }
}