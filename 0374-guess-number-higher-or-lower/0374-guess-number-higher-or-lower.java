/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long start = 0;
        long end = n;

        while(start<=end){
            int mid = (int)(start+(end-start)/2);
            int guess = guess(mid);
            if(guess == 0) return mid;
            else if(guess == -1) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}