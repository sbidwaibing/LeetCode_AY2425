class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, ans, new ArrayList<>(), nums);
        return ans;
    }

    private void backtrack(int idx, List<List<Integer>> ans, List<Integer> temp, int[] nums){
        
        ans.add(new ArrayList<>(temp));
        
        for(int i=idx; i<nums.length; i++){
            temp.add(nums[i]);
            backtrack(i+1, ans, temp, nums);
            temp.remove(temp.size()-1);
        }
    }
}