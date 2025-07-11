class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        BitSet bs = new BitSet(1001);
        for (int n : nums1) bs.set(n);

        Set<Integer> res = new HashSet<>();
        for(int n : nums2) {
            if (bs.get(n)) res.add(n);
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}