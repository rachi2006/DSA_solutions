class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
    int V = adj.size(); // add this line
    
    ArrayList<Integer> result = new ArrayList<>();
    boolean[] visited = new boolean[V];
    Queue<Integer> q = new LinkedList<>();
    
    q.add(0);
    visited[0] = true;
    
    while (!q.isEmpty()) {
        int node = q.poll();
        result.add(node);
        
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                q.add(neighbor);
            }
        }
    }
    return result;
}
        
}