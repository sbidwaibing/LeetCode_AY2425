class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;

        for(int num : nums){
            if(!set.add(num)) return num;
        }

        // If no duplicate is found (which shouldn't happen in valid input)
        throw new IllegalArgumentException("No duplicate found in the array.");
    }
}