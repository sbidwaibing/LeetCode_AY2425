class Solution {
    public long minimumSteps(String s) {
        int s1 = s.length();
        int count = 0;
        long answer = 0;
        int i=s1-1;
       
        while(i>=0){
            if(s.charAt(i)=='0') count += 1;
            else answer += count;
            i--;
        }

        return answer;
    }
}