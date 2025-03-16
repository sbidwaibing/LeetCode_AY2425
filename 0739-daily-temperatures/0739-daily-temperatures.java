class Solution {
    public int[] dailyTemperatures(int[] temp) {
        
        int size = temp.length;
        Stack<Integer> s1 = new Stack<>();
        int[] answer = new int[size];

        for(int i=0; i<size; i++){
            while(!s1.isEmpty() && temp[s1.peek()] < temp[i]){
                answer[s1.peek()] = i - s1.pop();
            }
            s1.push(i);
        }

        return answer;
    }
}