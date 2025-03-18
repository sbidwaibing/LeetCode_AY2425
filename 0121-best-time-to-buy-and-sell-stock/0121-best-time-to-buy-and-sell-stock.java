class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int mini = prices[0];
        int profit = 0;

        for(int price : prices){
            int cost = price - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, price);
        }

        return profit;
    }
}