class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if (tokens == null || tokens.length == 0) return 0;

        Arrays.sort(tokens);

        int n = tokens.length;
        int low = 0;
        int high = n - 1;
        int score = 0;
        int maxScore = 0;

        while(low<=high){
            if (power >= tokens[low]){
                power -= tokens[low];
                low++;
                score++;
                maxScore = Math.max(maxScore, score);
            }
            else if(score >= 1){
                power += tokens[high];
                high--; 
                score--;
            }
            else break;   
        }
        return maxScore;
    }
}