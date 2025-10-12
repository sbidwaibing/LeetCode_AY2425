class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int n = 0;
        for(int num : nums){
            if(num % 2 == 0) n|= num;
        }
        return n;
    }
}