class Solution {
    public int[] canSeePersonsCount(int[] heights) {

        if(heights == null || heights.length == 1) return new int[]{0};
        
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