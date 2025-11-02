class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        Set<Integer> visited  = new HashSet<>();
        int provinces = 0;

        for(int i=0; i<isConnected.length; i++){
            if(!visited.contains(i)){
                dfs(i, isConnected, visited);
                provinces++;
            }
        }

        return provinces;
    }

    public static void dfs(int city, int[][] isConnected, Set<Integer> visited){
        
        visited.add(city);

        for(int current = 0; current < isConnected[city].length; current++){
            
            int connected = isConnected[city][current];

            if(connected == 1 && !visited.contains(current)){
                dfs(current, isConnected, visited);
            }
        }
    }
}