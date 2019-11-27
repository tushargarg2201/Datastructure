package LinkedList;

public class SampleLinkedList {
    public static void main(String[] args) {
        SampleLinkedList sampleLinkedList = new SampleLinkedList();
        sampleLinkedList.createLinkedList(10);
        sampleLinkedList.createLinkedList(20);
        sampleLinkedList.createLinkedList(30);
        sampleLinkedList.createLinkedList(40);
        sampleLinkedList.createLinkedList(50);
        sampleLinkedList.createLinkedList(60);

        sampleLinkedList.insertAtLocation(45);
        sampleLinkedList.insertAtLocation(55);

        sampleLinkedList.displayLinkedList();

        sampleLinkedList.deleteElement(55);

        sampleLinkedList.displayLinkedList();

        //function to get length of a linked list.
        sampleLinkedList.getLength();

        // function to get nth Node in the linked List
        sampleLinkedList.getNthNode();

        // function to get middle node in the linked list
        sampleLinkedList.printMiddleNode();

        // function to get nth node from the end of a linked list.
        sampleLinkedList.getNthNodeFromEndOfLinkedList(3);

    }

    private int getNthNodeFromEndOfLinkedList(int n) {
        int linkedListLength = getLength();
        int finalDataFromBegining = linkedListLength - n + 1;

        LinkedList currentNode = headNode;
        for (int i = 1; i < finalDataFromBegining; i++) {
            currentNode = currentNode.link;
        }
        System.out.print("Nth Node from end of linked list is --->" + currentNode.data);
        return currentNode.data;

    }

    private void printMiddleNode() {
        LinkedList fastNode = headNode;
        LinkedList slowNode = headNode;
        System.out.println("");
        while (fastNode.link != null) {
            if (fastNode.link.link != null) {
                fastNode = fastNode.link.link;
            }
            slowNode = slowNode.link;
        }

        System.out.print("Middle node is--->" + slowNode.data);
    }

    private void getNthNode() {
        LinkedList currentNode = headNode;
        LinkedList previousNode = headNode;
        System.out.println("");
        System.out.println("---getNthNode in the linked List-----");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ---> ");
            previousNode = currentNode;
            currentNode = currentNode.link;
        }
        System.out.println("Nth Node of linkedList is --->" + previousNode.data);
    }

    private int getLength() {
        int count = 0;
        LinkedList currentNode = headNode;
        System.out.println("");
        System.out.println("Linked List length");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ---> ");
            currentNode = currentNode.link;
            count++;
        }
        System.out.println("LinkedList Length is --->" + count);
        return count;
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

    private void insertAtLocation(int data) {
        LinkedList currentNode = headNode;
        System.out.println("InsertAtLocation");
        LinkedList previousNode = headNode;

        while (currentNode != null) {
            if (data < currentNode.data) {
                LinkedList node = new LinkedList();
                node.data = data;
                previousNode.link = node;
                node.link = currentNode;
                break;
            } else {
                previousNode = currentNode;
            }
            currentNode = currentNode.link;
        }

    }

    private void deleteElement(int data) {
        LinkedList currentNode = headNode;
        System.out.println("deleteElement data --->" + data);
        LinkedList previousNode = headNode;

        while (currentNode != null) {
            if (data == currentNode.data) {
                previousNode.link = currentNode.link;
                break;
            } else {
                previousNode = currentNode;
            }
            currentNode = currentNode.link;
        }

    }
}
