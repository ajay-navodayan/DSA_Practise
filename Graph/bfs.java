import java.util.*;

public class bfs {

    public static void bfsTraversal(int v, List<List<Integer>> adj) {
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        visited[0] = true;
        q.add(0);

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int it : adj.get(node)) {
                if (!visited[it]) {
                    visited[it] = true;
                    q.add(it);
                }
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

        bfsTraversal(v, adj);
    }
}
