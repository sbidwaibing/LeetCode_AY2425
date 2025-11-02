class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        // int len = heights.length;
        int[] resultArray = new int[heights.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] <= heights[i]){
                resultArray[st.peek()]++;
                st.pop();
            }
            if(!st.isEmpty()){
                resultArray[st.peek()]++;
            }
            st.push(i);
        }

        return resultArray;

    }
}