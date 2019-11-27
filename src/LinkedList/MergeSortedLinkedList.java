package LinkedList;

public class MergeSortedLinkedList {
    public static void main(String[] args) {
        MergeSortedLinkedList mergeSortedLinkedList1 = new MergeSortedLinkedList();
        mergeSortedLinkedList1.createLinkedList(30);
        mergeSortedLinkedList1.createLinkedList(40);
        mergeSortedLinkedList1.createLinkedList(50);
        LinkedList list1=mergeSortedLinkedList1.createLinkedList(70);


        MergeSortedLinkedList mergeSortedLinkedList2 = new MergeSortedLinkedList();
        mergeSortedLinkedList2.createLinkedList(20);
        mergeSortedLinkedList2.createLinkedList(60);
        mergeSortedLinkedList2.createLinkedList(65);
        mergeSortedLinkedList2.createLinkedList(80);
        LinkedList list2 =mergeSortedLinkedList2.createLinkedList(100);

        mergeSortedLinkedList1.displayLinkedList();
        System.out.println("-------------------------");
        mergeSortedLinkedList2.displayLinkedList();
        mergeSortedLinkedList1.mergeSortedList(list1,list2);



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

    private void displayLinkedList() {
        LinkedList currentNode = headNode;
        System.out.println("displayLinkedList");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ---> ");
            currentNode = currentNode.link;
        }
    }

    private void displayLinkedList(LinkedList headNode) {
        LinkedList currentNode = headNode;
        System.out.println("displayLinkedList");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ---> ");
            currentNode = currentNode.link;
        }
    }

    private void mergeSortedList(LinkedList list1,LinkedList list2){
        LinkedList s=list1;
        LinkedList p=list1;
        LinkedList q=list2;
        LinkedList headNode;

        if(list1.data<list2.data){
            s=list1;
            p=s.link;
            headNode=list1;
        }
        else {
         s=list2;
         q=s.link;
         headNode=list2;
        }
        while (p!=null && q!=null){
            if(p.data>q.data){
                s.link=q;
                s=q;
                q=q.link;
            }
            else {
                s.link=p;
                s=p;
                p=p.link;
            }
        }
        if(p!=null){
            s.link=p;
        }
        else if(q!=null){
            s.link=q;
        }
        displayLinkedList(headNode);
    }
}
