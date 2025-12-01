class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> mp = new HashMap<>();
        
        int x = 0;
        
        for(char ch : s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<s.length(); i++){
            if(mp.get(s.charAt(i)) == 1){
                return x = i;
            }
        }

        return -1;
    }
}