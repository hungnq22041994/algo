package com.company.graph;

import org.junit.Test;

/**
 * @author hung.nguyenquang
 */
public class GraphTest {
    @Test
    public void test() {
        Graph g = new Graph(6);

        //A-0, B-1, C-2, D-3, E-4, F-5, G-6, H-7
//        g.addEdge(0, 2);
//        g.addEdge(1, 2);
//        g.addEdge(1, 3);
//        g.addEdge(2, 4);
//        g.addEdge(4, 7);
//        g.addEdge(4, 5);
//        g.addEdge(5, 6);
//        g.addEdge(3, 5);

        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        g.topo();
    }


}
