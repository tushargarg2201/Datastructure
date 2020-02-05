package BinaryTree;

public class SumOfLeftLeaves {
    static boolean isLeftVisit = false;
    static int finalSum = 0;
    public static void main(String [] args) {

        Node tree1 = new Node(3);
        tree1.left = new Node(9);
        tree1.left.left = new Node(5);
        tree1.right = new Node(20);
        tree1.right.left = new Node(15);
        tree1.right.left.left= new Node(2);
        tree1.right.right = new Node(7);

        int result = sumOfLeftLeavesSolution(tree1);
        System.out.println("result is--->" + result);
    }

    private static int sumOfLeftLeavesSolution(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }
        if (rootNode.left == null && rootNode.right == null && isLeftVisit) {
            finalSum = finalSum + rootNode.data;
            isLeftVisit = false;
        }

        if (rootNode.left != null) {
            isLeftVisit = true;
            sumOfLeftLeavesSolution(rootNode.left);
        }

        if (rootNode.right != null) {
            isLeftVisit = false;
            sumOfLeftLeavesSolution(rootNode.right);
        }
        return finalSum;
    }

}
