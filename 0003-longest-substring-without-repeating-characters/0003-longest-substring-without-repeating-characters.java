class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j = 0;
        int maxLen = 0;

        HashSet<Character> charSet = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            while(charSet.contains(s.charAt(i))){
                charSet.remove(s.charAt(j));
                j++;
            }
            charSet.add(s.charAt(i));
            maxLen = Math.max(maxLen, i - j + 1);
        }

        return maxLen;
    }
}