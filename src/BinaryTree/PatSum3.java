package BinaryTree;
/**
 * https://leetcode.com/problems/path-sum-iii/
 */

public class PatSum3 {
    static int sum = 0;
    static int result = 0;
    static int finalSum = 8;
    public static void main(String [] args) {

        Node tree1 = new Node(10);
        tree1.left = new Node(5);
        tree1.right = new Node(-3);
        tree1.left.left = new Node(3);
        tree1.left.right = new Node(2);
        tree1.right.right = new Node(11);
        tree1.left.left.left = new Node(3);
        tree1.left.left.right = new Node(-2);
        tree1.left.right = new Node(1);


        pathSum3Solution(tree1, 0);
        System.out.println("result is--->" + result);
    }

    private static void pathSum3Solution(Node root, int sum) {
        if (root == null) {
            return;
        }

        sum = sum + root.data;
        System.out.println("sum is on every iteration  -->" + sum);

        if (sum > finalSum) {
            sum = 0;
            sum = sum + root.data;
            System.out.println("sum > finalSum is--->" + sum);
        }

        if (sum == finalSum) {
            result++;
            System.out.println("sum == finalSum is--->" + result);
        }

        pathSum3Solution(root.left, sum);
        pathSum3Solution(root.right, sum);
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
