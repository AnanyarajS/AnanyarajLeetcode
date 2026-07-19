class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean [] visited = new boolean[isConnected.length];
        int count = 0;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
        }

        }
       for(int i=0;i<isConnected.length;i++){
        if(!visited[i]){
            count++;
            dfs(i, visited, adj);
        }
       }
       return count;

        
    }
    void dfs(int node, boolean [] visited, List<List<Integer>> adj){
        visited[node] = true;
        for(int nbr : adj.get(node)){
            if(!visited[nbr])
            dfs(nbr, visited, adj);
        }
    }
}