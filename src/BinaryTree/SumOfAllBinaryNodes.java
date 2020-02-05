package BinaryTree;

public class SumOfAllBinaryNodes {
    static int sum = 0;
    static int result = 0;
    public static void main(String [] args) {

        Node tree1 = new Node(1);
        tree1.left = new Node(0);
        tree1.right = new Node(1);
        tree1.left.left = new Node(0);
        tree1.left.right = new Node(1);
        tree1.right.left = new Node(0);
        tree1.right.right = new Node(1);

        SumOfAllBinaryNodesSolution(tree1, 0);
        System.out.println("result is--->" + result);
    }

    private static void SumOfAllBinaryNodesSolution(Node node, int sum) {
        if (node == null) {
            return ;
        }

        sum = sum * 2 + node.data;
        System.out.println("Sum after every iterartion --->" + sum);
        if (node.left == null && node.right == null) {
            result = result + sum;
            System.out.println("Result when we reached to leaf node --->" + result);
            return ;
        }
        SumOfAllBinaryNodesSolution(node.left, sum);
        SumOfAllBinaryNodesSolution(node.right, sum);
    }


}
