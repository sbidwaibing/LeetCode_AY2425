class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        long totalShift = 0;
        char[] chars = s.toCharArray();
        
        for(int i=n-1; i>=0; i--){
            totalShift += (shifts[i] % 26);
            chars[i] = (char)((chars[i] - 'a' + totalShift) % 26 + 'a');
        }

        return new String(chars);
    }
}