class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max = 0;
        // TC - O(n); 
        // SC - O(n)
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c=='(') st.push(i);
            else{
                st.pop();

                if(st.isEmpty()) st.push(i);
                else{
                    int len = i - st.peek();
                    max = Math.max(max, len);
                }
            }
        }
        return max;
    }
}