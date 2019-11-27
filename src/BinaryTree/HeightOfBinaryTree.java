package BinaryTree;

public class HeightOfBinaryTree {
    public static void main(String[] args) {
        //construct first tree.

        Node tree1 = new Node(15);
        tree1.left = new Node(10);
        tree1.right = new Node(20);
        tree1.left.left = new Node(8);
        tree1.left.right = new Node(12);
        tree1.right.left = new Node(16);
        tree1.right.right = new Node(25);

        int height = getHeight(tree1);
        System.out.println("Height of Binary tree --->" + height);
    }

    public static int getHeight(Node node) {
        int h = 0;
        if (node == null) {
            return 0;
        }

        int left = getHeight(node.left);
        int right = getHeight(node.right);
        if (left > right) {
            h = 1 + left;
        } else {
            h = 1 + right;
        }
        return h;
    }

}
