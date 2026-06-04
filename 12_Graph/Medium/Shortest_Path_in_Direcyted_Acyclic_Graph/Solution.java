import java.util.*;

class Solution {
    private static final int INF = (int)1e9;

    private void toposort(ArrayList<ArrayList<int[]>> graph, int node, boolean[] vis, Stack<Integer> st) {
        for(int[] ngbr : graph.get(node)) {
            int u = ngbr[0];
            if(!vis[u]) {
                vis[u] = true;
                toposort(graph, u, vis, st);
            }
        }
        st.add(node);
    }

    public int[] shortestPath(int V, int E, int[][] edges) {
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            graph.get(u).add(new int[]{v, wt});
        }

        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[V];
        for(int i = 0; i < V; i++) {
            if(!vis[i]) {
                vis[i] = true;
                toposort(graph, i, vis, st);
            }
        }

        int[] dis = new int[V];
        Arrays.fill(dis, INF);
        dis[0] = 0;

        while(!st.isEmpty()) {
            int curr = st.pop();
            if(dis[curr] != INF) {
                for(int[] ngbr : graph.get(curr)) {
                    int u = ngbr[0];
                    int wt = ngbr[1];
                    if(dis[curr] + wt < dis[u]) {
                        dis[u] = dis[curr] + wt;
                    }
                }
            }
        }

        for(int i = 0; i < V; i++) {
            if(dis[i] == INF) {
                dis[i] = -1;
            }
        }

        return dis;
    }
}
