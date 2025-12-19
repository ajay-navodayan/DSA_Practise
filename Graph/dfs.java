import java.util.*;

public class dfs {

    public static void dfsTraversal(int node, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int it : adj.get(node)) {
            if (!visited[it]) {
                dfsTraversal(it, visited, adj);
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(4);

        boolean[] visited = new boolean[v];
        dfsTraversal(0, visited, adj);
    }
}
