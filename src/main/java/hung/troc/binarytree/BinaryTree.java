package hung.troc.binarytree;

import java.util.LinkedList;

/**
 * @author hung.nguyenquang
 */
public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    public void inOrderTraversal(Node node) {
        if (node == null)
            return;
        inOrderTraversal(node.left);
        System.out.print(node.key + " ");
        inOrderTraversal(node.right);
    }

    public void preOrderTraversal(Node node) {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void postOrderTraversal(Node node) {
        if (node == null)
            return;
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
        System.out.print(node.key + " ");
    }

    public void printInOrder() {
        inOrderTraversal(root);
    }

    public void printPreOrder() {
        preOrderTraversal(root);
    }

    public void printPostOrder() {
        postOrderTraversal(root);
    }

    public void levelOrderTraversal() {
        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            System.out.println(currentNode);
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreOrder();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInOrder();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostOrder();

        System.out.println("\nLevel Order traversal of binary tree is ");
        tree.levelOrderTraversal();
    }
}
