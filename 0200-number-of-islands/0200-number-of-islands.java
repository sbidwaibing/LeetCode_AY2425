class Solution {
    
    private static final int[][] DIRECTIONS = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];
        int cntIslands = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(grid, visited, i, j);
                    cntIslands++;
                    // cntIslands = Math.max(cntIslands, dfsCount);
                }
            }
        }
        return cntIslands;
    }

    public void dfs(char[][] grid, boolean[][] visited, int row, int col){
        int rows = grid.length;
        int cols = grid[0].length;

        if(row < 0 || row >= rows || col < 0 || col >= cols || 
            visited[row][col] || grid[row][col] == '0'){
            return;
        }

        visited[row][col] = true;
        // int count = 0;

        for(int[] dir : DIRECTIONS){
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            dfs(grid, visited, newRow, newCol);
            // count++;
        }

        // return count;
    }
}