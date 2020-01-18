package com.company.dijkstra;

import org.junit.Test;

import java.util.*;

/**
 * @author hung.nguyenquang
 */

public class Dijkstra {

    Set<Integer> settled;
    PriorityQueue<Node> pq;
    int[] distant;

    public Dijkstra(int V) {
        settled = new HashSet<>();
        pq = new PriorityQueue<>(V, new Node());
        distant = new int[V];
    }

    public void dijkstra(Graph graph, int source) {
        Arrays.fill(distant, Integer.MAX_VALUE);
//        for (int i = 0; i < graph.getV(); i++) {
//            if (i != source) {
//                pq.offer(new Node(i, 0));
//            }
//        }
        for (Link:graph.getAdj()
             ) {

        }

        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();
            for (Node neighbor : graph.getAdj().get(currentNode.getNode())) {
                if (neighbor.getCost() + currentNode.getCost() < distant[currentNode.getNode()]) {

                }
            }
        }
    }
}
