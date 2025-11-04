class Solution {
    ArrayList<Integer> ans;
    public int[] findOrder(int numCourses, int[][] pre) {
        
        // if(numCourses >=1 && pre.length == 0) return new int[]{0};

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge : pre){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }

        int[] visited = new int[numCourses];
        ans = new ArrayList<>();


        for(int i=0; i<numCourses; i++){
            if(visited[i] == 0){
                if(dfs(i, adj, visited, ans)){
                    return new int[0];
                }
            }
        }
        int[] resultArray = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            resultArray[i] = ans.get(i);
        }
        return resultArray;
    }

    private boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited, ArrayList<Integer> ans){
        visited[node] = 1;

        for(int check : adj.get(node)){
            if(visited[check] == 0){
                if(dfs(check, adj, visited, ans)){
                    return true;
                }
            }
            else if(visited[check] == 1){
                return true;
            }
        }

        visited[node] = 2;
        ans.add(node);
        return false;
    }
}