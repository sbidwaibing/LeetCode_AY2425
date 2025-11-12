class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];
        int maxIsland = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    int area = dfs(grid, visited, i, j);
                    maxIsland = Math.max(maxIsland, area);
                }
            }
        }

        return maxIsland;
    }

    private static final int[][] DIRECTIONS = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public int dfs(int[][] grid, boolean[][] visited, int i, int j){
        int rows = grid.length;
        int cols = grid[0].length;

        if(i < 0 || i >= rows || j < 0 || j >= cols || visited[i][j] || grid[i][j] == 0){
            return 0;
        }

        visited[i][j] = true;

        int area = 1;

        for(int[] direction : DIRECTIONS){
            int newRow = direction[0] + i;
            int newCol = direction[1] + j;

            area += dfs(grid, visited, newRow, newCol);
        }
        return area;
    }
}