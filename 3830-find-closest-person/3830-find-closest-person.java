class Solution {
    public int findClosest(int x, int y, int z) {
        
        if(x == y) return 0;

        int x1 = Math.abs(z-x);
        int y1 = Math.abs(z-y);

        if(x1 < y1) return 1;
        else if(y1 < x1) return 2;
        else return 0;
    }
}