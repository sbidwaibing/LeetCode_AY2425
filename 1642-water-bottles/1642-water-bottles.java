class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        int remainingBottle=0;
        while(numBottles>=numExchange){
            remainingBottle = (numBottles%numExchange);
            numBottles = (numBottles/numExchange);
            ans+=numBottles;
            numBottles+=remainingBottle;
            // System.out.println(numBottles);
        }
        
        return ans;
    }
}