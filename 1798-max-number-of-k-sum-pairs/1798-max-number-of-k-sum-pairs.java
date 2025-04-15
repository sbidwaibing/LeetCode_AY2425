class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int operations = 0;

        for(int i=0; i<nums.length; i++){
            int rem = k - nums[i];
            if(map.getOrDefault(rem, 0) > 0){
                operations++;
                map.put(rem, map.get(rem) - 1);
            }
            else
            {
                map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            }
        }

        return operations;
    }
}