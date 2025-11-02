class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] matrix = new int[m][n];
        int count = 0;
        int[][] dirs = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        for(int[] g : guards){
            matrix[g[0]][g[1]] = 1;
        }

        for(int[] w : walls){
            matrix[w[0]][w[1]] = -1;
        }

        for(int[] g : guards){
            for(int[] d : dirs){
                int x = g[0] + d[0];
                int y = g[1] + d[1];
                
                while(
                    x >= 0 && x < m 
                    && y >= 0 && y < n 
                    && matrix[x][y] != 1 
                    && matrix[x][y] != -1){
                        matrix[x][y] = 2;
                        x += d[0];
                        y += d[1];
                }
            }
        }

        for(int[] row : matrix){
            for(int cell : row){
                if(cell == 0) count++;
            }
        }

        return count;
    }
}