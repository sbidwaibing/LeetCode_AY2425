class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int x = 0;
        for(int num : nums){
            if(!hs.add(num)) x = num;
        }

        return x;
    }
}