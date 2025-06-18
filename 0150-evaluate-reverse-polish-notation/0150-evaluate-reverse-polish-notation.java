class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for (String str : tokens) {
            
            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
                
                int val2 = st.pop();  // Right operand
                int val1 = st.pop();  // Left operand

                switch (str) {
                    case "+": st.push(val1 + val2); break;
                    case "-": st.push(val1 - val2); break;
                    case "*": st.push(val1 * val2); break;
                    case "/": st.push(val1 / val2); break; 
                }

            }else st.push(Integer.valueOf(str));
        }
        return st.pop(); 
    }
}
