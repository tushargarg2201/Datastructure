package BinaryTree;

public class InvertTree {
    public static void main(String[] args) {
        //construct first tree.

        Node tree1 = new Node(1);
        tree1.left = new Node(2);
        tree1.right = new Node(3);
        tree1.left.left = new Node(4);
        tree1.left.right = new Node(5);
        tree1.right.left = new Node(6);
        tree1.right.right = new Node(8);

        System.out.println("Before Inversion tree is");
        preOrderTraversal(tree1);

        Node invertNode = invertTreeImpl(tree1);
        System.out.println("After Inversion tree is--->" + invertNode);
        preOrderTraversal(invertNode);
    }

    private static void preOrderTraversal(Node tree) {
        if (tree == null) {
            return;
        }
        System.out.print( tree.data + " ");
        preOrderTraversal(tree.left);
        preOrderTraversal(tree.right);
    }

    private static Node invertTreeImpl(Node tree) {
        if (tree == null) {
            return null;
        }

        invertTreeImpl(tree.left);
        invertTreeImpl(tree.right);

        //swap nodes
        Node tempNode = tree.left;
        tree.left = tree.right;
        tree. right = tempNode;

        return tree;
    }
}
