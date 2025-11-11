class Solution {
    
    public List<List<Integer>> combinationSum(int[] arr, int target){
        List<List<Integer>> ans = new ArrayList<>();
        combinationCheck(0, arr, target, ans, new ArrayList<>());
        return ans;
    }

    private void combinationCheck(
        int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> currList){
        if(index == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(currList));
            }
            return;
        }

        if(arr[index] <= target){
            currList.add(arr[index]);
            combinationCheck(index, arr, target - arr[index], ans, currList);
            currList.remove(currList.size()-1);
        }
        combinationCheck(index + 1, arr, target, ans, currList);
    }

}