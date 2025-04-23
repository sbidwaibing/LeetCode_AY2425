class Solution {
    public String addSpaces(String s, int[] spaces) {
   
    StringBuilder sb = new StringBuilder();
    int n = spaces.length;
    int index = 0;

    for(int i=0; i<s.length(); i++){
        if(index < n && i == spaces[index]) {
            sb.append(" ");
            index++;
        }
        sb.append(s.charAt(i));
    }

    return sb.toString();

    }
}