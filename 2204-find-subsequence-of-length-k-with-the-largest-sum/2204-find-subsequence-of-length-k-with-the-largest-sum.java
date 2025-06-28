class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        Integer[] indices = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }
        
        // Step 2: Sort indices based on nums values (descending)
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[b], nums[a]));
        
        // Step 3: Take first k indices and sort them to maintain original order
        Integer[] topKIndices = Arrays.copyOfRange(indices, 0, k);
        Arrays.sort(topKIndices);
        
        // Step 4: Create result array using the sorted indices
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[topKIndices[i]];
        }
        
        return result;
    }
}