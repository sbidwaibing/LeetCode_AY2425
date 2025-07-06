class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i >= k - 1) { 
                if (sum / k >= threshold) count++;
                sum -= arr[i - k + 1];
            }
        }
        return count;
    }
}