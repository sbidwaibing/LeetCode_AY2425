class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> resultedPaths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(0, graph, path, resultedPaths);

        return resultedPaths;
    }

    private void dfs(int index, int[][] graph, List<Integer> path, List<List<Integer>> resultedPaths){
        path.add(index);

        if(index == graph.length - 1){
            resultedPaths.add(new ArrayList<>(path));
        }
        else{
            for(int next : graph[index]){
                dfs(next, graph, path, resultedPaths);
            }
        }

        path.remove(path.size() - 1);
    }
}