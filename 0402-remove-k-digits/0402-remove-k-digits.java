class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        
        if(k == n) return "0";
        Stack<Character> st  = new Stack<>();

        for(int i=0; i<n; i++){
            char s = num.charAt(i);
            while(!st.isEmpty() && k > 0 && st.peek() > s) {
                st.pop();
                k--;
            }
            st.push(s);
        } 
        
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }

     
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, st.pop());
        }
        
        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();

    }
}