class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        int total = 0;

        // initially all childrens get 1 candy, lets satisfy this contraint first
        Arrays.fill(candies, 1); 

        // traversing from left to right 
        for(int i=1; i<n; i++){
            if(ratings[i] > ratings[i-1]) candies[i] = candies[i-1] + 1;
        }

        // traversing from right to left 
        for(int i=n-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]) candies[i] = Math.max(candies[i],candies[i+1]+1);
        }

        for (int candy : candies) total += candy;

        return total;
    }
}