package hung.troc.graph;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author hung.nguyenquang
 */
public class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public LinkedList<Integer>[] getAdj() {
        return adj;
    }

    public void topo() {
        boolean[] visited = new boolean[8];
        Deque<Integer> nodeStacks = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topoVisit(i, visited, nodeStacks);
            }
        }
        while (!nodeStacks.isEmpty()) {
            System.out.println(nodeStacks.pop());
        }
    }

    private void topoVisit(int node, boolean[] visited, Deque<Integer> nodeStacks) {
        final LinkedList<Integer> adjCurr = getAdj()[node];
        for (int i: adjCurr) {
            if (!visited[i]) {
                topoVisit(i, visited, nodeStacks);
            }
        }
        visited[node] = true;
        nodeStacks.push(node);
    }

}
