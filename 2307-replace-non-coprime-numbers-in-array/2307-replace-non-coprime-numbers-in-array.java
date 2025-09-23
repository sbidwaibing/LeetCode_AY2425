class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {

        List<Integer> st = new ArrayList<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            
            int gcd = 0;
            int curr = nums[i];

            while(st.size() > 0){
                gcd = findGCD(st.get(st.size() - 1), curr);
                
                if(gcd == 1) break;
                else{
                    long lcm = (1L * st.get(st.size() - 1) * curr) / gcd;
                    st.remove(st.size() - 1);
                    curr = (int)lcm;
                }
            }
            st.add(curr);
        }
        return st;
    }

    private int findGCD(int a, int b){
        if(a==0) return b;
        return findGCD(b%a, a);
    }
}