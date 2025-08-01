class Solution {
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        
        int arrCount = 1;
        int last_arrow_position = points[0][1];

        for(int i=1; i<points.length; i++){
            if (points[i][0] > last_arrow_position){
                arrCount++;
                last_arrow_position = points[i][1];
            }
        }

        return arrCount;
    }
}