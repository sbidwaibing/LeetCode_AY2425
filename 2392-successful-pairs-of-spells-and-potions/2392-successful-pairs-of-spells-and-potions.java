class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int s = potions.length;

        int[] pairs = new int[n];
        Arrays.sort(potions);

        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            int low = 0;
            int high = s - 1;
            int def = s;

            while (low <= high) {
                int mid = (low + high) / 2;
                long prod = (long) spell * potions[mid];

                if (prod >= success) {
                    def = mid;
                    high = mid - 1; 
                } else {
                    low = mid + 1;
                }
            }

            pairs[i] = s - def;
        }

        return pairs;
    }
}