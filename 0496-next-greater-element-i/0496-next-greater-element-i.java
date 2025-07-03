class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] ans = new int[len1];
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i<len2; i++){
            map.put(nums2[i], i);
        }

        for(int i=0; i<len1; i++){
            ans[i] = findnextGreater(nums2, len2, map.get(nums1[i])+1);
        }
        return ans;
    }

    // Helping method to find next greater element from that index
    static int findnextGreater(int[] a,int len, int j){
        if(j < len){
            for(int i=j; i<len; i++){
                if(a[i] > a[j-1]){
                    return a[i];
                }
            }
        }
        return -1;
    }
}