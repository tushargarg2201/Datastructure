package BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        reverseLevelOrderTraversalImpl(root);
    }

    private static void reverseLevelOrderTraversalImpl(Node rootNode) {
        if (rootNode == null) { return; }

        Stack<Integer> stack = new Stack<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(rootNode);

        while (!queue.isEmpty()) {
            Node currNode = ((ArrayDeque<Node>) queue).pop();
            stack.push(currNode.data);

            if (currNode.right != null) {
                queue.add(currNode.right);
            }

            if (currNode.left != null) {
                queue.add(currNode.left);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
