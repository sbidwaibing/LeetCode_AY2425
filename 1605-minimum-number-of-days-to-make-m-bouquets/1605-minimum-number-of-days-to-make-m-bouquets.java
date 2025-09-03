class Solution {
    public int minDays(int[] arr, int m, int k) {
        
        int n = arr.length;
        if((long) m * k > n) return -1;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for (int x : arr) {
            mini = Math.min(mini, x);
            maxi = Math.max(maxi, x);
        }

        int low = mini;
        int high = maxi;

        while(low <= high){
            int mid = (low + high) / 2;
            if(isPossible(arr, mid, m, k)) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }

    private boolean isPossible(int[] arr, int day, int m, int k){
        int count = 0;
        int noOfB = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] <= day) count++;
            else{
                noOfB += (count / k);
                count = 0;
            }
        }

        noOfB += (count / k);
        return noOfB >= m;
    }
}