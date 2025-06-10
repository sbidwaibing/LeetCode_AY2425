class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        
        int lPtr = 0;
        int rPtr = 0;
        int maxLen = 0;

        Map<Integer, Integer> mp = new HashMap<>();

        while(rPtr < n){
            mp.put(fruits[rPtr], mp.getOrDefault(fruits[rPtr], 0) + 1);

            if(mp.size() > 2){
                
                mp.put(fruits[lPtr], mp.get(fruits[lPtr]) - 1);

                if(mp.get(fruits[lPtr]) == 0)  mp.remove(fruits[lPtr]);
                lPtr++; 
            }

            if(mp.size() <= 2){
                maxLen = Math.max(maxLen, rPtr - lPtr + 1);
            }
            rPtr++;
        }

        return maxLen;
    }
}