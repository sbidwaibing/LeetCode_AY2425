class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> ans = new ArrayList<>();

        if(n == 0){
            return ans;
        }

        if(n == 1){
            ans.add(Integer.toString(nums[0]));
            return ans;
        }

        for(int i=0; i<n; i++){
            
            int start = nums[i];
            
            while(i+1 < n && nums[i+1] - nums[i] == 1) i++;

            if(start != nums[i]) ans.add(String.valueOf(start)+"->"+String.valueOf(nums[i]));
            else ans.add(String.valueOf(start));
        }

        return ans;
    }
}