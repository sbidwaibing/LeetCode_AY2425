class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans=numBottles;
        int remainingBottle=0;
        
        while(numBottles>=numExchange){
            // remainingBottle = (numBottles%numExchange);
            // numBottles = (numBottles/numExchange);
            //   System.out.println(numBottles);
            //      System.out.println(numExchange);
            numBottles -= numExchange;
numBottles+=1;
            ans+=1;

            
            numExchange+=1;
          
        }
        // System.out.println(numBottles);
        return ans;
    }
}