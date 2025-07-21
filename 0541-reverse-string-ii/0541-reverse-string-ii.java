class Solution {
    public String reverseStr(String s, int k) {
        char[] rev = s.toCharArray();
        int n = s.length();

        for(int i=0; i<n; i += 2 * k){
            if(n - i < k) reverse(rev, i, n - 1);
            else reverse(rev, i, i + k - 1);
        }
        return new String(rev);
    }

    private void reverse(char[] rev, int left, int right){
        while(left<right){
            char temp = rev[left];
            rev[left] = rev[right];
            rev[right] = temp;
            left++;
            right--;
        }
    }
}