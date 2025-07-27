class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int start = 0;
        int total = 0;
        int curr = 0;

        for(int i=0; i<gas.length; i++){
            int dif = gas[i] - cost[i];
            total += dif;
            curr += dif;

            if(curr < 0){
                start = i+1;
                curr = 0;
            }
        }

        if(total < 0) return -1;
        
        return start;
    }
}