/**
 * // This is Sea's API interface.
 * // You should not implement it, or speculate about its implementation
 * class Sea {
 *     public boolean hasShips(int[] topRight, int[] bottomLeft);
 * }
 */

class Solution {
    public int countShips(Sea sea, int[] topRight, int[] bottomLeft) {
        
        if(bottomLeft[0] > topRight[0] || bottomLeft[1] > topRight[1]){
            return 0;
        }

        if(!sea.hasShips(topRight, bottomLeft)){
            return 0;
        }

        if(bottomLeft[0] == topRight[0] && bottomLeft[1] == topRight[1]){
            return 1;
        }

        int midX = (topRight[0] + bottomLeft[0]) / 2;
        int midY = (topRight[1] + bottomLeft[1]) / 2;

        // int[][] botLeft = {
        //     {bottomLeft[0], bottomLeft[1]}, //BottomLeft Side
        //     {midX + 1, midY + 1},           //TopRight Side
        //     {bottomLeft[0], midY + 1},      //TopLeft Side
        //     {midX + 1, bottomLeft[1]}       //BottomRight Side
        // };

        // int[][] toRight = {
        //     {midX, midY},
        //     {topRight[0], topRight[1]},
        //     {midX, topRight[1]},
        //     {topRight[0], midY}   
        // };

        int count = 0;
        
        // for(int i=0; i<4; i++){
        //     count += countShips(sea, toRight[i], botLeft[i]);
        // }

        count += countShips(sea, new int[]{midX, midY}, new int[]{bottomLeft[0], bottomLeft[1]});       // BL
        count += countShips(sea, new int[]{topRight[0], topRight[1]}, new int[]{midX + 1, midY + 1});   // TR
        count += countShips(sea, new int[]{midX, topRight[1]}, new int[]{bottomLeft[0], midY + 1});     // TL
        count += countShips(sea, new int[]{topRight[0], midY}, new int[]{midX + 1, bottomLeft[1]});     // BR

        return count;
    }
}