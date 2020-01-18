package com.company.dijkstra;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hung.nguyenquang
 */
public class Graph {
    private List<Node> nodes;
    private List<LinkedList<Node>> adj;

    public Graph() {
        nodes = new ArrayList<>();
        adj = new ArrayList<>();
//            for (LinkedList<Node> nodes: adj) {
//                nodes = new LinkedList<>();
//            }
    }

    public Graph(List<Node> nodes, List<LinkedList<Node>> adj) {
        this.nodes = nodes;
        this.adj = adj;
    }

    public List<LinkedList<Node>> getAdj() {
        return adj;
    }

    public void setAdj(List<LinkedList<Node>> adj) {
        this.adj = adj;
    }

    public void addEdge(int nodeName, Node node) {
        adj.get(nodeName).add(node);
    }
}
