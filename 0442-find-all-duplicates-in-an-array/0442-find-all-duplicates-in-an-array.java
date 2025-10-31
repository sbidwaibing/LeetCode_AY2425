class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> resultArray = new ArrayList<>();
        Map<Integer, Integer> dups = new HashMap<>();
    
        for(int num : nums){
            dups.put(num, dups.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : dups.entrySet()){
            if(entry.getValue() > 1) resultArray.add(entry.getKey());
        }

        return resultArray;
    }
}