class Solution {
    public int divide(int dd, int di) {
        
        if(dd == Integer.MIN_VALUE && di == -1) return Integer.MAX_VALUE;
        
        long a = Math.abs((long) dd);
        long b = Math.abs((long) di);
        int result = 0;

        while(a>=b){
            long temp = b;
            int mul = 1;

            while(a >= (temp << 1)){
                temp <<= 1;
                mul <<= 1;
            }

            a -= temp;
            result += mul;
        }
        return (dd > 0) == (di > 0) ? result : -result;
    }
}