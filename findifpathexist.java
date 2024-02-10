//https://leetcode.com/problems/find-if-path-exists-in-graph

class Solution {

    private boolean dfs( Map<Integer,List<Integer>> graph , int source, int destination, boolean[] visited, int n){
       if(source == destination) return true;
       visited[source]=true;
       for(int neighbor : graph.get(source)){
           if(!visited[neighbor]){
               if(dfs(graph,neighbor, destination,visited,n)){
                   return true;
               }
           }
       }

        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> graph = new HashMap<>();
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u,value-> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v,value-> new ArrayList<>()).add(u);
        }
        boolean[] visited = new boolean[n];

        return dfs(graph,source,destination,visited,n);
    }
}