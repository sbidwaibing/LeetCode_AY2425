class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0])); //using for overflow check
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int i = 0;
        int day = 0;
        int n = events.length;
        int count = 0;

        while(i < n || !minHeap.isEmpty()){
            if(minHeap.isEmpty()) day = events[i][0];

            while (i < n && events[i][0] == day){
                minHeap.offer(events[i][1]);
                i++;
            }

            while (!minHeap.isEmpty() && minHeap.peek() < day) minHeap.poll();

            if (!minHeap.isEmpty()) {
                minHeap.poll(); 
                count++;     
                day++;           
            }
        }
        return count;
    }
}

//     0 1
// 0 - 1 2
// 1 - 2 3
// 2 - 3 4
