class Solution {

    private int[] orig;
    private Random rand;

    public Solution(int[] nums) {
        orig = Arrays.copyOf(nums, nums.length);
        rand = new Random();
    }
    
    public int[] reset() {
        return orig.clone();
    }
    
    public int[] shuffle() {
        int[] shuffledArray = Arrays.copyOf(orig, orig.length);
        for(int i=0; i<shuffledArray.length; i++){
            swap(shuffledArray, i, rand.nextInt(shuffledArray.length));
        }
        return shuffledArray;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */