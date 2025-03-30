class Solution {
    public boolean containsDuplicate(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);

        Map<Integer, Integer> Map = new HashMap<>();
        int i=0; 

        while(i<size){
            if(Map.containsKey(nums[i])) return true;
            else Map.put(nums[i],1);
            i++;
        }
        return false;
    }
}