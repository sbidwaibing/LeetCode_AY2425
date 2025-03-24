class Solution {
    public String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder(s);
        int start = 0, end = ans.length() - 1;
        String vowels = "aeiouAEIOU";

        while (start < end) {
            char ch1 = Character.toLowerCase(ans.charAt(start));
            char ch2 = Character.toLowerCase(ans.charAt(end));

            if (vowels.indexOf(ch1) != -1 && vowels.indexOf(ch2) != -1) {
                // Both characters are vowels, swap them
                ans.setCharAt(start, s.charAt(end));
                ans.setCharAt(end, s.charAt(start));
                start++;
                end--;
            } else if (vowels.indexOf(ch1) == -1) {
                // ch1 is not a vowel, move to the next character from the start
                start++;
            } else if (vowels.indexOf(ch2) == -1) {
                // ch2 is not a vowel, move to the next character from the end
                end--;
            } else {
                // None of the conditions matched, move both pointers
                start++;
                end--;
            }
        }
        return ans.toString();
    }
}