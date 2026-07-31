class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
         int v = adj.size();
        boolean[] vis = new boolean[v];
        ArrayList<Integer> res = new ArrayList<>();
        
        dfs(0, adj, vis, res);
        
        return res;
    }
    private void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> res) {

        vis[node] = true;
        res.add(node);
        
        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                dfs(neighbor, adj, vis, res);
            }
        }
    }
}