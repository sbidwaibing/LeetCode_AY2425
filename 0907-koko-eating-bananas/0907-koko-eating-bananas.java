class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);

        while(low <= high){
            int mid = (low + high) / 2;
            int totH = calH(piles, mid);

            if(totH <= h) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }

    public int findMax(int[] piles){
        int maxi = Integer.MIN_VALUE;
        int n = piles.length;

        for(int i=0; i<n; i++){
            maxi = Math.max(maxi, piles[i]);
        }

        return maxi;
    }

    public int calH(int[] piles, int h){
        int tot = 0;
        int n = piles.length;

        for(int i=0; i<n; i++){
            tot += Math.ceil((double) piles[i] / h);
        }
        return tot;
    }
}