class Solution {
    public boolean isSubsequence(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();

        if(s.isEmpty()) return true;
        if(s1 > t1) return false;

        int i = 0;
        for (int j = 0; j < t1; j++) {
            if (t.charAt(j) == s.charAt(i)) {
                i++;
                if (i == s1) return true; // Check if all characters of s have been found
            }
        }
        return false;
    }
}