package LinkedList;

import java.util.HashMap;

public class LruCache {

    int capacity;
    int size;
    class Node {
        int key;
        int val;
        Node prev;
        Node next;
        public Node(int k, int v) {
            key = k;
            val = v;
        }
    }
    Node headNode, tailNode;
    HashMap<Integer, Node> hashMap;

    LruCache(int capacity) {
        headNode = new Node(0, 0);
        tailNode = new Node(0, 0);
        headNode.prev = null;
        headNode.next = tailNode;
        tailNode.prev = headNode;
        tailNode.next = null;
        hashMap = new HashMap<Integer, Node>();
        this.capacity = capacity;
        size = 0;
    }

    public static void main(String[] args) {
        LruCache lruCache = new LruCache(2);
        lruCache.put(10, 1);
        lruCache.put(20, 2);

        int value = lruCache.get( 20);
        lruCache.put(30, 3);
        lruCache.put(30, 5);
        //System.out.println("value is" + value);
        lruCache.displayNode();
    }

    private void displayNode() {
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }

    }


    private int get(int key) {
        if (hashMap.containsKey(key)) {
            Node node = hashMap.get(key);
            remove(key);
            addHead(key, node.val);
            return node.val;
        } else {
            return -1;
        }
    }

    private void put(int key, int value) {
           if (hashMap.containsKey(key)) {
               remove(key);
               addHead(key, value);
           } else {
               addHead(key, value);
           }
    }

    private void addHead(int key, int value) {
        Node node = new Node(key, value);
        Node nextNode = headNode.next;
        headNode.next = node;
        nextNode.prev = node;
        node.prev = headNode;
        node.next = nextNode;
        hashMap.put(key, node);
        size++;

        if (size > capacity) {
            Node prevTail = tailNode.prev;
            remove(prevTail.key);
        }
    }


    private void remove(int key) {
        Node currentNode = hashMap.get(key);
        Node prevNode = currentNode.prev;
        Node nextNode = currentNode.next;
        prevNode.next = currentNode.next;
        nextNode.prev = currentNode.next;
        hashMap.remove(key);
        size--;
    }
}
