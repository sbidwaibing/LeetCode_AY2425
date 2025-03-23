class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int finalScore = 0;

        for (String operation : operations) {
            if (operation.equals("+")) {
                int n1 = stack.pop();
                int n2 = stack.peek();
                int sum = n1 + n2;
                stack.push(n1);
                stack.push(sum);
            } else if (operation.equals("C")) {
                stack.pop();
            } else if (operation.equals("D")) {
                int prev = stack.peek();
                stack.push(prev * 2);
            } else {
                stack.push(Integer.parseInt(operation));
            }
        }

        while (!stack.isEmpty()) {
            finalScore += stack.pop();
        }

        return finalScore;

    }
}