class Solution {
    public boolean canFinish(int numCourses, int[][] pre){
       
        if(numCourses >=1 && pre.length == 0) return true;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge : pre){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }

        // [
        //  0:[]
        //  1:[4]
        //  2:[4]
        //  3:[1,2]
        //  4:[]
        // ]

        int[] visited = new int[numCourses];
        
        for(int i=0; i<numCourses; i++){
            if(visited[i] == 0){
                if(dfs(i, adj, visited)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited){
        visited[node] = 1;

        for(int check : adj.get(node)){
            if(visited[check] == 0){
                if(dfs(check, adj, visited)){
                    return true;
                }
            }
            else if(visited[check] == 1){
                return true;
            }
        }

        visited[node] = 2;
        return false;
    }
}