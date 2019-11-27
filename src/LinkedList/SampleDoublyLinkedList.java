package LinkedList;

public class SampleDoublyLinkedList {
    public static void main(String[] args) {
        SampleDoublyLinkedList sampleDoublyLinkedList = new SampleDoublyLinkedList();

        sampleDoublyLinkedList.addNode(10);
        sampleDoublyLinkedList.addNode(20);
        sampleDoublyLinkedList.addNode(30);
        sampleDoublyLinkedList.addNodeAtBegining(40);
        sampleDoublyLinkedList.displayNode();

        System.out.println("--------delete Node-------");
        sampleDoublyLinkedList.deleteNodeFromPosition(20);
        sampleDoublyLinkedList.displayNode();

        System.out.println("--------delete Node from End-------");
        sampleDoublyLinkedList.deleteNodeFromEnd();
        sampleDoublyLinkedList.displayNode();
    }




    class Node {
        int data;
        Node prev;
        Node next;
    }
    Node headNode = null, tailNode = null;

    private void addNode(int data) {
        Node node;
        if (headNode == null) {
            node = createNode(data);
            node.prev = tailNode;
            node.next = null;
            headNode = tailNode = node;
        } else {
            node = createNode(data);
            node.prev = tailNode;
            node.next = null;
            tailNode.next = node;
            tailNode = node;
        }
    }

    private void addNodeAtBegining(int data) {
        Node node;
        if (headNode == null) {
            node = createNode(data);
            node.prev = tailNode;
            node.next = null;
            headNode = tailNode = node;
        } else {
            node = createNode(data);
            node.prev = null;
            node.next = headNode;
            headNode = node;
        }
    }

    private void deleteNodeFromPosition(int data) {
        Node currentNode = headNode;
        Node previousNode = null;
        while (currentNode != null && currentNode.data != data) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = currentNode.next;
        currentNode.next.prev = previousNode;
    }

    private void deleteNodeFromEnd() {
        Node previousNode = null;
        Node currentNode = headNode;
        while (currentNode != tailNode) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = null;
        tailNode.prev = null;
        tailNode = previousNode;
    }

    private void displayNode() {
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    private Node createNode(int data) {
        Node node = new Node();
        node.data = data;
        node.prev = null;
        node.next = null;
        return node;
    }
}
