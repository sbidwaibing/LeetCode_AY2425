class Solution {
    public boolean judgeSquareSum(int c) {
         for (long a = 0; a * a <= c; a++) {
            long bSquared = c - a * a;
            long b = (long) Math.sqrt(bSquared);
            if (b * b == bSquared) {
                return true;
            }
        }
        return false;
    }
}