class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        Integer[][] dp = new Integer[n][2]; // dp[index][0/1] => max profit
        return solve(0, true, prices, n, dp); // start with buy = true (we can buy first)
    }

    private int solve(int index, boolean buy, int[] prices, int n, Integer[][] dp) {
        if (index == n) return 0; // base case: no more days

        int buyIndex = buy ? 1 : 0; // convert boolean to 0/1 for dp lookup

        if (dp[index][buyIndex] != null) return dp[index][buyIndex];

        int profit;
        if (buy) {
            // Choice 1: Buy today (-prices[index]), then next state must be sell
            // Choice 2: Skip today, still can buy tomorrow
            profit = Math.max(
                -prices[index] + solve(index + 1, false, prices, n, dp),
                solve(index + 1, true, prices, n, dp)
            );
        } else {
            // Choice 1: Sell today (+prices[index]), then next state is buy
            // Choice 2: Skip today, still must sell tomorrow
            profit = Math.max(
                prices[index] + solve(index + 1, true, prices, n, dp),
                solve(index + 1, false, prices, n, dp)
            );
        }

        return dp[index][buyIndex] = profit; // store result and return
    }
}
