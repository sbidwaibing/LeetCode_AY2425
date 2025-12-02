class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length == 0){
            return 0;
        }

        Integer[] start = new Integer[intervals.length];
        Integer[] end = new Integer[intervals.length];

        for(int i=0; i<intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int rooms = 0;
        int endItr = 0;

        for(int i=0; i<intervals.length; i++){
            if(start[i] < end[endItr]){
                rooms++;
            }
            else{
                endItr++;
            }
        }

        return rooms;
    }
}