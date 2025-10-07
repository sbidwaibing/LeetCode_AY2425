class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
       
        int ans=numBottles;
        int remainingBottle=0;
        
        while(numBottles>=numExchange){
            numBottles -= numExchange;
            numBottles+=1;
            ans+=1;
            numExchange+=1;
        }
        return ans;
    }
}