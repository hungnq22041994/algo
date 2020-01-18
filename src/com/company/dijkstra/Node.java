package com.company.dijkstra;

import java.util.Comparator;

/**
 * @author hung.nguyenquang
 */
public class Node implements Comparator<Node> {

    int node;
    int cost;
    Node parentNode;

    public Node() {
    }

    public Node(int node, int cost) {
        this.node = node;
        this.cost = cost;
    }

    public int getNode() {
        return node;
    }

    public void setNode(int node) {
        this.node = node;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    @Override
    public int compare(Node n1, Node n2) {
        return Integer.compare(n1.getCost(), n2.getCost());
    }
}
