class Solution {
    public String reverseWords(String s) {
        
        if (s == null || s.trim().isEmpty()) return s;

        String[] words = s.trim().split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }

        int i = 0, j = words.length - 1;
        while (i < j) {
          
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;

            i++;
            j--;
        }

        StringBuilder result = new StringBuilder();
        for(int k=0;k<words.length;k++){
            result.append(words[k]);
            if (k < words.length - 1) result.append(" ");  
        }

        return result.toString();
    }
}