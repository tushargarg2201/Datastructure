package BinaryTree;

import java.util.Stack;

public class SpiralOrderPrinting {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        spiralOrderPrintingImpl(root);

    }

    private static void spiralOrderPrintingImpl(Node root) {
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        if (root == null) { return; }

        s1.add(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                Node currNode = s1.pop();
                System.out.println(currNode.data);

                if (currNode.left != null) {
                    s2.add(currNode.left);
                }

                if (currNode.right != null) {
                    s2.add(currNode.right);
                }
            }

            while (!s2.isEmpty()) {
                Node currNode = s2.pop();
                System.out.println(currNode.data);

                if (currNode.right != null) {
                    s1.add(currNode.right);
                }

                if (currNode.left != null) {
                    s1.add(currNode.left);
                }

            }
        }
    }
}
