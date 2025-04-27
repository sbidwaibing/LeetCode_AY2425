class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int root = (int)Math.sqrt(rows);
        
        if(rows != cols || root * root != rows) return false;

        for(int i=0; i<rows; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<cols; j++){
                char num = board[i][j];
                if(num != '.'){
                    if(set.contains(num)) return false;
                    set.add(num);
                }
            }
        }

        for(int j=0; j<cols; j++){
            Set<Character> set = new HashSet<>();
            for(int i=0; i<rows; i++){
                char num = board[i][j]; 
                if(num != '.'){
                    if(set.contains(num)) return false;
                    set.add(num);
                }
            }
        }

        for(int i=0; i<rows; i+=root){
            for(int j=0; j<cols; j+=root){
                Set<Character> set = new HashSet<>();
                for(int x=i; x<i+root; x++){
                    for(int y=j; y<j+root; y++){
                        char num = board[x][y];
                        if(num != '.'){
                            if(set.contains(num)) return false;
                            set.add(num);
                        }
                    }
                }
            }
        }

        return true;
    }
}