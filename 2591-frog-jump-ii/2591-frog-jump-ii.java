class Solution {
    public int maxJump(int[] stones) {
        // The first jump is always from stone[0] to stone[1]
        int result = stones[1] - stones[0];

        // Think of the path like a pendulum: the frog goes forward using even indices,
        // then comes back using odd indices. This spreads out the jumps more evenly.

        // Forward jump path (even indices)
        for (int i = 2; i < stones.length; i += 2) {
            result = Math.max(result, stones[i] - stones[i - 2]);
        }

        // Return jump path (odd indices)
        for (int i = 3; i < stones.length; i += 2) {
            result = Math.max(result, stones[i] - stones[i - 2]);
        }

        return result;
    }
}