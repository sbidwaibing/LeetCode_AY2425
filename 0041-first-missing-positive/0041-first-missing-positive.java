class Solution {
    public int firstMissingPositive(int[] nums) {
        // int n = nums.length;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }
        int i=1;
        
        while(i<Integer.MAX_VALUE)
        {
            if(!set.contains(i)) return i;
            i++;
        }

        return i;
    }
}