class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0) return;

        k %= nums.length;  
        if (k == 0) return;  

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    private void reverse(int[] arr, int start, int end) {
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}