class Solution {
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        int left = 0;
        int right = 0;
        int maxProfit = 0;    
        int profit = 0;

        while(right < n){
            if(prices[left] < prices[right]){
                profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                left = right;   
            }
            right += 1;
        }

        return maxProfit;
    }
}