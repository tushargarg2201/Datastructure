package LinkedList;

import java.util.HashSet;

public class RemoveDuplicateElementFromSortedLinkedList {
    public static void main(String[] args) {
        RemoveDuplicateElementFromSortedLinkedList obj = new RemoveDuplicateElementFromSortedLinkedList();
        obj.createLinkedList(10);
        obj.createLinkedList(10);
        obj.createLinkedList(10);
        obj.createLinkedList(20);
        obj.createLinkedList(20);
        obj.createLinkedList(30);
        obj.createLinkedList(20);
//        obj.createLinkedList(40);
//        obj.createLinkedList(40);
//        obj.createLinkedList(40);
//        obj.createLinkedList(40);
//        obj.createLinkedList(50);
//        obj.createLinkedList(10);
//        obj.createLinkedList(10);
//        obj.createLinkedList(20);


        obj.displayLinkedList();

        //obj.removeDuplicateNode();
        obj.removeDuplicateNodeWithHashMapImpl();
        obj.displayLinkedList();



    }


    class LinkedList {
        int data;
        LinkedList link;
    }
    LinkedList headNode;
    private void createLinkedList(int data) {
        if (headNode == null) {
            LinkedList node = new LinkedList();
            node.data = data;
            node.link = null;
            headNode = node;
        } else {
            LinkedList currentNode = headNode;
            while (currentNode.link != null) {
                currentNode = currentNode.link;
            }
            LinkedList node = new LinkedList();
            node.data = data;
            node.link = null;
            if (currentNode != null) {
                currentNode.link = node;
            }
        }
    }

    private void displayLinkedList() {
        LinkedList currentNode = headNode;
        System.out.println("displayLinkedList");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ---> ");
            currentNode = currentNode.link;
        }
    }

    private void removeDuplicateNode() {
        LinkedList currentNode = headNode;
        LinkedList tempNode;

        while (currentNode != null && currentNode.link != null) {
            if (currentNode.data == currentNode.link.data) {
                tempNode = currentNode.link.link;
                currentNode.link = tempNode;
            } else {
                currentNode = currentNode.link;
            }

        }

    }

    private void removeDuplicateNodeWithHashMapImpl() {
        LinkedList currentNode = headNode;
        LinkedList prevNode = null;
        System.out.println("");
        System.out.println("removeDuplicateNodeWithHashMapImpl called");

        HashSet hashSet = new HashSet();
        while (currentNode != null) {
            int currentValue = currentNode.data;
            if (hashSet.contains(currentValue)) {
                prevNode.link = currentNode.link;
            } else {
                hashSet.add(currentValue);
                prevNode = currentNode;
            }
            currentNode = currentNode.link;
        }
        LinkedList tempNode = headNode;
        while (tempNode != currentNode) {
            System.out.print(tempNode.data + " --->");
            tempNode = tempNode.link;
        }

    }


}
