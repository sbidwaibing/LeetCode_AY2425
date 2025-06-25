class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int currIdx = 0;

        for(int i=1; i<=n; i++){
            if(currIdx >= target.length) break;
            if(target[currIdx] == i){
                ans.add("Push");
                currIdx++;
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
}