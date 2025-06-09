class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while(n!=1){
            if(seen.contains(n)) return false;
            seen.add(n);
            n = getSumSquared(n);
        }
        return true;
    }

    private static int getSumSquared(int n){
        int sum = 0;
        
        while(n>0){
            int dig = n % 10;
            sum += dig * dig;
            n /= 10;
        }

        return sum;
    }
}