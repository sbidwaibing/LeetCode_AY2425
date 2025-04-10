class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;

        boolean allUnique = true;  // To check if all characters are unique
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                allUnique = false;
                break;  // exit the loop as soon as we find a repeated character
            }
        }

        if (allUnique) return chars.length;  

        int writeIndex = 0;  // Where to write in the list
        int readIndex = 0;   // Where to read from the list
        int n = chars.length; // Total length of the array

        while (readIndex < n) {
            char currentChar = chars[readIndex];  
            int count = 0; 

            // Count how many times the current character repeats consecutively
            while (readIndex < n && chars[readIndex] == currentChar) {
                readIndex++;  // Move to the next character
                count++;  // Increment the count
            }

            // Write the current character
            chars[writeIndex] = currentChar;
            writeIndex++;  // Move to the next position

            // If the character repeats more than once, write the count as well
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[writeIndex] = c;  // Write each digit of the count
                    writeIndex++;  // Move to the next position
                }
            }
        }

        return writeIndex;  // Return the new length of the array after compression
    }
}
