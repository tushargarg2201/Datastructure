package BinaryTree;

public class SumOfAllNodes {
    static boolean isLeftVisit = false;
    static int finalSum = 0;
    public static void main(String [] args) {

        Node tree1 = new Node(1);
        tree1.left = new Node(2);
        tree1.right = new Node(3);
        tree1.left.left = new Node(4);
        tree1.left.right = new Node(5);
        tree1.right.left = new Node(6);
        tree1.right.right = new Node(7);

        int result = sumOfAllNodesSolution(tree1);
        System.out.println("result is--->" + result);
    }

    private static int sumOfAllNodesSolution(Node node) {
        if (node == null) {
            return 0;
        }

        finalSum = finalSum + node.data;
        sumOfAllNodesSolution(node.left);
        sumOfAllNodesSolution(node.right);

        return finalSum;
    }

}
