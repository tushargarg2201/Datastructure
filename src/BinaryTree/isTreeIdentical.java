package BinaryTree;

class Node {
    int data;
    Node left = null, right = null;
    Node(int d) {
        data = d;
    }
}

public class isTreeIdentical {
    public static void main(String[] args) {
        //construct first tree.

        Node tree1 = new Node(15);
        tree1.left = new Node(10);
        tree1.right = new Node(20);
        tree1.left.left = new Node(8);
        tree1.left.right = new Node(12);
        tree1.right.left = new Node(16);
        tree1.right.right = new Node(25);

        //construct second tree

        Node tree2 = new Node(15);
        tree2.left = new Node(10);
        tree2.right = new Node(20);
        tree2.left.left = new Node(8);
        tree2.left.right = new Node(12);
        tree2.right.left = new Node(16);
        tree2.right.right = new Node(25);

        if (isIdentical(tree1, tree2)) {
            System.out.println("Tree is identical");
        } else {
            System.out.println("Tree is not identical");
        }
    }

    private static boolean isIdentical(Node tree1, Node tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }

        if ((tree1 != null && tree2 != null)
                && (tree1.data == tree2.data)
                && (isIdentical(tree1.left, tree2.left))
                && (isIdentical(tree1.right, tree2.right))) {

            return true;
        }

        return false;

    }
}