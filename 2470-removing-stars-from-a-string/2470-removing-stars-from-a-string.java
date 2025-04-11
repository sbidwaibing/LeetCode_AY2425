class Solution {
    public String removeStars(String s) {

        int n = s.length();
        StringBuilder result = new StringBuilder();
        Stack<Character> str1 = new Stack<>();

        for(int i=0; i<n; i++){
            char currentChar = s.charAt(i);

            if(currentChar == '*')  str1.pop();
            else str1.push(currentChar);
        }

        while (!str1.isEmpty()) {
            result.append(str1.pop());
        }

        return result.reverse().toString();
    }
}