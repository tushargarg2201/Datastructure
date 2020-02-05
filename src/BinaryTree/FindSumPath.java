package BinaryTree;

public class FindSumPath {
    static int finalSum = 0;
    static int result = 0;
    public static void main(String [] args) {

        Node tree1 = new Node(5);
        tree1.left = new Node(4);
        tree1.right = new Node(8);
        tree1.left.left = new Node(11);
        tree1.left.left.left = new Node(7);
        tree1.left.left.right = new Node(2);
        tree1.right.left = new Node(13);
        tree1.right.right = new Node(4);
        tree1.right.right.right = new Node(1);

        //boolean result = hasSomePath(tree1, 22);
        hasSomePathNewImpl(tree1, 22, 0);

        System.out.println("result is--->" + result);
    }

    private static void hasSomePathNewImpl(Node root, int matchSum, int traverseNodesSum) {
        if (root == null) {
            return ;
        }

        traverseNodesSum = traverseNodesSum + root.data;
        //System.out.println("TravelNodesSum in each Iteration --->" + traverseNodesSum);

        if (root.left == null && root.right == null) {
            if (traverseNodesSum == matchSum) {
                result = traverseNodesSum;
            }
            System.out.println("Result when we reached to leaf node --->" + result);
        }
        hasSomePathNewImpl(root.left, matchSum, traverseNodesSum);
        hasSomePathNewImpl(root.right, matchSum, traverseNodesSum);
    }

    private static boolean hasSomePath(Node rootNode, int sum) {
        if (rootNode == null) {
            return false;
        }
        if (rootNode.left == null && rootNode.right == null && sum - rootNode.data == 0) {
            return false;
        }
        boolean leftPath = hasSomePath(rootNode.left, sum-rootNode.data);
        System.out.println("leftPath is--->" + leftPath);
        boolean rightPath = hasSomePath(rootNode.right, sum-rootNode.data);
        System.out.println("rightPath is--->" + rightPath);
        boolean combineResult = leftPath || rightPath;
        System.out.println("combineResult is--->" + combineResult);
        return combineResult;
    }
}
