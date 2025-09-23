import java.math.BigInteger;
class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {

        List<Integer> st = new ArrayList<>();

        for(int num : nums){

            int curr = num;

            while(st.size() > 0){
                // gcd = findGCD(st.get(st.size() - 1), curr);
                int gcd = BigInteger.valueOf(st.get(st.size() - 1)).gcd(BigInteger.valueOf(curr)).intValue();
                
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

    // private int findGCD(int a, int b){
    //     if(a == 0) return b;
    //     return findGCD(b%a, a);
    // }
}