package LinkedList;

public class LoopInLinkedList {
    public static void main(String[] args) {
        LoopInLinkedList loopInLinkedList = new LoopInLinkedList();
        loopInLinkedList.createLinkedList(10);
        loopInLinkedList.createLinkedList(20);
        loopInLinkedList.createLinkedList(30);
        loopInLinkedList.createLinkedList(40);
        loopInLinkedList.createLinkedList(50);
        loopInLinkedList.createLinkedList(60);
        loopInLinkedList.createLinkedList(70);

        loopInLinkedList.setLoopInLinkedList();

        loopInLinkedList.findLoopInLinkedList();

    }

    private void setLoopInLinkedList() {
        LinkedList currentNode = headNode;
        LinkedList previousNode = headNode;

        while (currentNode != null) {
            previousNode = currentNode;
            currentNode = currentNode.link;
        }

        previousNode.link = headNode.link;
    }

    private void findLoopInLinkedList() {
        LinkedList fastPointer, slowPointer;
        fastPointer = slowPointer = headNode;
        LinkedList storedPointer = headNode;
        LinkedList tempPointer = headNode;
        int countInLoop = 0;

        while (slowPointer != null && fastPointer != null) {
            slowPointer = slowPointer.link;
            fastPointer = fastPointer.link.link;

            if (slowPointer == fastPointer) {
                System.out.println("Find loop in linked list --->" + slowPointer.data);
                storedPointer = slowPointer;
                tempPointer = slowPointer.link;
                countInLoop++;
                break;
                //return;
            }


        }
        while (tempPointer != storedPointer) {
            countInLoop++;
            tempPointer = tempPointer.link;
        }

        System.out.println("Count in loop in linked list is --->" + countInLoop);
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
}
