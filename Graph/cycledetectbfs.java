import java.util.*;

public class cycledetectbfs {

    static class Pair {
        int node;
        int parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    public static boolean isCycle(int v, List<List<Integer>> adj) {
        boolean[] visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (bfs(i, adj, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean bfs(int src, List<List<Integer>> adj, boolean[] visited) {
        Queue<Pair> q = new LinkedList<>();
        visited[src] = true;
        q.add(new Pair(src, -1));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int node = p.node;
            int parent = p.parent;

            for (int it : adj.get(node)) {
                if (!visited[it]) {
                    visited[it] = true;
                    q.add(new Pair(it, node));
                } else if (it != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 5;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(4).add(3);
        adj.get(4).add(1);
        adj.get(1).add(4);

        System.out.println(isCycle(v, adj));
    }
}

