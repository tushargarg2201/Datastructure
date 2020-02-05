package BinaryTree;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        Node tree1 = new Node(1);
        tree1.left = new Node(2);
        tree1.right = new Node(3);
        tree1.right.left = new Node(4);
        tree1.right.right = new Node(5);
        tree1.right.right.right = new Node(6);
        tree1.right.right.right.right = new Node(7);
        tree1.right.right.right.right.right = new Node(8);


        int maxdiff = 0;

        int leftSubTreeHeight = getLeftHeight(tree1.left);
        int rightSubTreeHeight = getRightHeight(tree1.right);

        if (leftSubTreeHeight >=  rightSubTreeHeight) {
            maxdiff = leftSubTreeHeight - rightSubTreeHeight;
        } else {
            maxdiff = rightSubTreeHeight - leftSubTreeHeight;
        }
       if (maxdiff <= 1) {
           System.out.println("It's a balanced binary tree");
       } else {
           System.out.println("It's not balanced binary tree");
       }
    }

    public static int getLeftHeight(Node node) {
        int h = 0;
        if (node == null) {
            return 0;
        }

        int left = 1 + getLeftHeight(node.left);
        return left;
    }

    public static int getRightHeight(Node node) {
        int h = 0;
        if (node == null) {
            return 0;
        }

        int right = 1 + getRightHeight(node.right);
        return right;
    }

}