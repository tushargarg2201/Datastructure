package BinaryTree;

import java.awt.*;

public class FindCousins {
    static boolean isLeftVisit = false;
    static int finalSum = 0;
    public static void main(String [] args) {

        Node tree1 = new Node(1);
        tree1.left = new Node(2);
        tree1.left.left = new Node(3);
        tree1.left.right = new Node(4);
        tree1.left.left.left = new Node(5);
        //tree1.right.right = new Node(5);
//        tree1.right.left = new Node(15);
//        tree1.right.left.left= new Node(2);
//        tree1.right.right = new Node(7);

        int x = 2;
        int y = 4;
        boolean result = findCousinsImpl(tree1, x, y);
        System.out.println("result is--->" + result);
    }

    private static boolean findCousinsImpl(Node node, int x, int y) {
        Node p1 = getParent(node, x, null);
        Node p2 = getParent(node, y, null);

        int l1 = getLevel(node, x, 0);
        int l2 = getLevel(node, y, 0);

        if ((p1 != p2) && (l1 == l2)) {
            return true;
        }
        return false;
    }

    private static Node getParent(Node node, int number, Node parent) {
        if (node == null) {
            return null;
        }

        if (node.data == number) {
            return parent;
        }

       Node tempParent = getParent(node.left, number, node);
        if (tempParent != null) {
            return tempParent;
        }

        return getParent(node.right, number, node);
    }

    private static int getLevel(Node node, int number, int level) {
        if (node == null) {
            return 0;
        }

        if (node.data == number) {
            System.out.println(" Level found--->" + level);
            return level;
        }
        level = level + 1;
        level = getLevel(node.left, number, level);
        if (level != 0) {
            return level;
        }
        return getLevel(node.right, number, level);
//
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
