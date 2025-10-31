class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        int  n = nums.length;
		Map<Integer, Integer>  numberCountMap = new HashMap<>();	
		List<Integer> resultArray = new ArrayList<>();
		
        for(int num : nums)
        {
            numberCountMap.put(num, numberCountMap.getOrDefault(num, 0) +1);
        }

        for(Map.Entry<Integer, Integer> mapEntry : numberCountMap.entrySet())
        {
            if(mapEntry.getValue() == 2) {
                resultArray.add(mapEntry.getKey());
            }
        }

        return resultArray.stream().mapToInt(i -> i).toArray();
    }
}