class Solution {
    public boolean equalFrequency(String word) {
        
        HashMap<Character, Integer> track = new HashMap<>();

        // Count character frequencies
        for (char c : word.toCharArray()) {
            track.put(c, track.getOrDefault(c, 0) + 1);
        }

        // Iterate over the keys (characters) and simulate removal
        for (char key : track.keySet().toArray(new Character[0])) {
            track.put(key, track.get(key) - 1);

            // If frequency becomes 0, remove the character
            if (track.get(key) == 0) {
                track.remove(key);
            }

            // Check if all remaining frequencies are the same
            if (new HashSet<>(track.values()).size() == 1) {
                return true;
            }

            // Restore the original frequency
            track.put(key, track.getOrDefault(key, 0) + 1);
        }

        return false;
    }
}