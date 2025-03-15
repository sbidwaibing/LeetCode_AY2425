class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        if (n == 0) return true;

        for (int i = 0; i < size; i++) {
            // Check if current position can accommodate a flower
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == size - 1 || flowerbed[i + 1] == 0)) {
                // Place the flower
                flowerbed[i] = 1;
                n--;
            }
            
            // If all flowers have been placed, return true
            if (n == 0) return true;
        }

        return false;
    }
}