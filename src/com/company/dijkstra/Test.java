package com.company.dijkstra;

/**
 * @author hung.nguyenquang
 */
public class Test {

    @org.junit.Test
    public void test() {
        int V = 5;
        int source = 0;

        Graph graph = new Graph(V);
        graph.addEdge(0, new Node (1,9));
        graph.addEdge(0, new Node (2,6));
        graph.addEdge(0, new Node (3,5));
        graph.addEdge(0, new Node (4,3));
        graph.addEdge(2, new Node (1,2));
        graph.addEdge(2, new Node (3,4));


    }
}
