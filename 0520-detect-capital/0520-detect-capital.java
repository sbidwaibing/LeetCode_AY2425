class Solution {
    public boolean detectCapitalUse(String word) {
        if(w.length() <= 1) return true;

        if(w.equals(w.toUpperCase())) return true;
        if(w.equals(w.toLowerCase())) return true;

        if(Character.isUpperCase(w.charAt(0)) 
            && w.substring(1).equals(w.substring(1).toLowerCase())) return true;
    
        return false;
    }
}