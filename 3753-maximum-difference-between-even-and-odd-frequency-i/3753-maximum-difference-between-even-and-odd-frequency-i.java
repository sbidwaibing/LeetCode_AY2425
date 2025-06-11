class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        int n = s.length();
        int emax = 0, emin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

         for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 0 && freq[i] > 0) {
                if (freq[i] < emin) emin = freq[i];
            } else if (freq[i] % 2 == 1 && freq[i] > 0) {
                if (freq[i] > emax) emax = freq[i];
            }
        }

        return emax - emin;
    }
}