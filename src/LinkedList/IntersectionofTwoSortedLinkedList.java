package LinkedList;

public class IntersectionofTwoSortedLinkedList {
    public static void main(String [] args) {
        IntersectionofTwoSortedLinkedList intersectionofTwoLinkedList1 = new IntersectionofTwoSortedLinkedList();

        intersectionofTwoLinkedList1.createLinkedList(10);
        intersectionofTwoLinkedList1.createLinkedList(20);
        intersectionofTwoLinkedList1.createLinkedList(30);
        intersectionofTwoLinkedList1.createLinkedList(40);
        LinkedList list1 = intersectionofTwoLinkedList1.createLinkedList(50);


        IntersectionofTwoSortedLinkedList intersectionofTwoLinkedList2 = new IntersectionofTwoSortedLinkedList();
        intersectionofTwoLinkedList2.createLinkedList(5);
        intersectionofTwoLinkedList2.createLinkedList(20);
        intersectionofTwoLinkedList2.createLinkedList(40);
        LinkedList list2 = intersectionofTwoLinkedList2.createLinkedList(50);

        intersectionofTwoLinkedList1.displayLinkedList(list1);
        System.out.println("-------------------------");
        intersectionofTwoLinkedList2.displayLinkedList(list2);

        IntersectionofTwoSortedLinkedList obj = new IntersectionofTwoSortedLinkedList();
        obj.getIntersectionOfLinkedList(list1, list2);
    }

    private void getIntersectionOfLinkedList(LinkedList list1, LinkedList list2) {
        LinkedList headNode = null;
        LinkedList prevNode = null;
        LinkedList currentNode;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                list1 = list1.link;
            } else if (list2.data < list1.data) {
                list2 = list2.link;
            } else if (list1.data == list2.data) {
                if (headNode == null) {
                    LinkedList node = new LinkedList();
                    node.data = list1.data;
                    node.link = null;
                    headNode = node;
                } else {
                    currentNode = headNode;
                    while (currentNode != null) {
                        prevNode = currentNode;
                        currentNode = currentNode.link;
                    }
                    LinkedList node = new LinkedList();
                    node.data = list1.data;
                    node.link = null;
                    prevNode.link = node;
                }
                list1 = list1.link;
            }

        }

        LinkedList tempNode = headNode;
        System.out.print("-----Intersection of two linked list-----");
        while (tempNode != null) {
            System.out.print(tempNode.data + " ---->");
            tempNode = tempNode.link;
        }
    }


    class LinkedList {
        int data;
        LinkedList link;
    }
    LinkedList headNode;

    private LinkedList createLinkedList(int data) {
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
        return headNode;
    }

    private void displayLinkedList(LinkedList list) {
        LinkedList currentNode = list;
        System.out.println("displayLinkedList");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ---> ");
            currentNode = currentNode.link;
        }
    }



}
