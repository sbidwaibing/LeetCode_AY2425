class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        // if (n == 0 || k == 0) return new int[0];

        // int[] result = new int[n - k + 1];

        // for (int i = 0; i <= n - k; i++) {
        //     int max = nums[i];
        //     for (int j = i + 1; j < i + k; j++) {
        //         max = Math.max(max, nums[j]);
        //     }
        //     result[i] = max;
        // }

        // return result;

        if(n < 1) return new int[0];
        if(n == 1) return nums;

        int[] result = new int[n - k + 1];
        Deque<Integer> deq = new ArrayDeque<>();
        int index = 0;

        for(int i=0; i<n; i++){
            if(!deq.isEmpty() && deq.peekFirst() < i - k+1) deq.pollFirst();
            while(!deq.isEmpty() && nums[deq.peekLast()] < nums[i]) deq.pollLast();

            deq.offerLast(i);
            
            if (i >= k - 1) {
                result[index++] = nums[deq.peekFirst()];
            }
        }

        return result;
    }
}