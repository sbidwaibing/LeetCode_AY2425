class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;

        int rows = matrix.length; 
        int cols = matrix[0].length;
        int[] heights = new int[cols + 1];
        int maxArea = 0;

        for(char[] row : matrix){
            for(int i=0; i<cols; i++){
                heights[i] = (row[i] == '1') ? heights[i] + 1 : 0;
            }

            Stack<Integer> st = new Stack<>();
            for(int i=0; i<heights.length; i++){
                while(!st.isEmpty() && heights[i] < heights[st.peek()]){
                    int h = heights[st.pop()];
                    int w = st.isEmpty() ? i : i - st.peek() - 1;
                    maxArea = Math.max(maxArea, h * w);
                }
                st.push(i);
            }
        }
        return maxArea; 
    }
}