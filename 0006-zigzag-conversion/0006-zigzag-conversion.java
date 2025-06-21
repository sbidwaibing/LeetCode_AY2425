class Solution {
    public String convert(String s, int numRows) {
        if (s == null || s.isEmpty() || numRows <= 0) return "";
        if (numRows == 1) return s;

        StringBuilder result = new StringBuilder();
        int step = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += step) {
                
                result.append(s.charAt(j));

                if (i != 0 && i != numRows - 1) {
                    int secondCharIndex = j + step - 2 * i;
                    if (secondCharIndex < s.length()) result.append(s.charAt(secondCharIndex));
                }
            }
        }
        return result.toString();
    }
}
