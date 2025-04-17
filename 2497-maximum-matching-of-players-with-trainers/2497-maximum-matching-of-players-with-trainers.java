class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int match = 0, i=0, j=0;

        while(i<players.length && j<trainers.length){
            if(players[i] <= trainers[j]){
                ++i;
                ++j;
                match++;
            }
            else j++; 
        }


        return match;
    }
}