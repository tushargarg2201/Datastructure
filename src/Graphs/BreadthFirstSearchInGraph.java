package Graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class BreadthFirstSearchInGraph {
    LinkedList<Integer> adjList[];
    int mNumberOfVertex = 0;
    LinkedList<Integer> queue = new LinkedList<>();
    HashSet<Integer> hashSet = new HashSet<>();

    public static void main(String[] args) {
        BreadthFirstSearchInGraph obj = new BreadthFirstSearchInGraph();

        obj.createVertex(6);
        obj.printVertex();

        obj.createEdges(0, 1);
        obj.createEdges(0, 2);

        obj.createEdges(1, 0);
        obj.createEdges(1, 3);
        obj.createEdges(1, 4);

        obj.createEdges(2, 0);
        obj.createEdges(2, 3);
        obj.createEdges(2, 4);

        obj.createEdges(3, 1);
        obj.createEdges(3, 2);
        obj.createEdges(3, 4);
        obj.createEdges(3, 5);

        obj.createEdges(4, 2);
        obj.createEdges(4, 3);
        obj.createEdges(4, 5);
        obj.createEdges(4, 1);

        obj.createEdges(5, 3);
        obj.createEdges(5, 4);

        obj.printEdges();

        obj.checkVisitedVertex(0);

    }

    private void createVertex(int numberOfVertex) {
        mNumberOfVertex = numberOfVertex;
        adjList = new LinkedList[numberOfVertex];
        for (int i = 0; i < numberOfVertex; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    private void printVertex() {
        System.out.println("Vertex created and sizes are---> " + adjList.length);
        for (int i = 0; i < mNumberOfVertex; i++) {
            System.out.println(adjList[i]);
        }
    }

    private void createEdges(int source, int destination) {
        adjList[source].add(destination);
    }

    private void printEdges() {
        for (int i = 0; i < mNumberOfVertex; i++) {
            System.out.println();
            ListIterator<Integer> iterator = adjList[i].listIterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        }
    }

    private void checkVisitedVertex(int visitedVertex) {
        System.out.println("");
        System.out.println("Visited Vertex");
        queue.add(visitedVertex);
        hashSet.add(visitedVertex);
        while (!queue.isEmpty()) {
            int n = queue.poll();
            System.out.println(n);
            ListIterator<Integer> listIterator = adjList[n].listIterator();
            while (listIterator.hasNext()) {
                int nextElement = listIterator.next();
                if (!hashSet.contains(nextElement)) {
                    hashSet.add(nextElement);
                    queue.add(nextElement);
                }
            }
        }
    }


}
