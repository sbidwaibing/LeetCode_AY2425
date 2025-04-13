class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> rowSet = new HashSet<>();
            for (int j = 0; j < n; j++) rowSet.add(matrix[i][j]);
            if (rowSet.size() != n) return false;
            for (int num : rowSet) if (num < 1 || num > n) return false;
        }

        for (int j = 0; j < n; j++) {
            Set<Integer> colSet = new HashSet<>();
            for (int i = 0; i < n; i++) colSet.add(matrix[i][j]);
            if (colSet.size() != n) return false;
            for (int num : colSet) if (num < 1 || num > n) return false;
        }

        return true;
    }
}