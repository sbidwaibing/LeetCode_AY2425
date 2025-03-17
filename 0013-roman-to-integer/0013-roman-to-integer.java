class Solution {
    public int romanToInt(String s) {
        s = s.replace("IV", "IIII")
             .replace("IX", "VIIII")
             .replace("XL", "XXXX")
             .replace("XC", "LXXXX")
             .replace("CD", "CCCC")
             .replace("CM", "DCCCC");

        int totalSum = 0;

        for (char c : s.toCharArray()) {
            switch (c) {
                case 'I': totalSum += 1; break;
                case 'V': totalSum += 5; break;
                case 'X': totalSum += 10; break;
                case 'L': totalSum += 50; break;
                case 'C': totalSum += 100; break;
                case 'D': totalSum += 500; break;
                case 'M': totalSum += 1000; break;
            }
        }

        return totalSum;
    }
}