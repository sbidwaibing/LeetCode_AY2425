class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, amount + 1);
        minCoins[0] = 0;

        for (int sum = 1; sum <= amount; sum++) {
            for (int coin : coins) {
                if (sum >= coin) {
                    minCoins[sum] = Math.min(minCoins[sum], minCoins[sum - coin] + 1);
                }
            }
        }

        return minCoins[amount] > amount ? -1 : minCoins[amount];
    }
}