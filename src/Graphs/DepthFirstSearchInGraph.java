package Graphs;

import java.util.*;

public class DepthFirstSearchInGraph {
    LinkedList<Integer> adjList[];
    int mNumberOfVertex = 0;
    LinkedList<Integer> queue = new LinkedList<>();
    HashSet<Integer> hashSet = new HashSet<>();

    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        DepthFirstSearchInGraph obj = new DepthFirstSearchInGraph();

        obj.createVertex(6);
        obj.printVertex();

        obj.createEdges(0, 1);
        obj.createEdges(0, 2);

        obj.createEdges(1, 0);
        obj.createEdges(1, 3);
        obj.createEdges(1, 4);

        obj.createEdges(2, 0);
        obj.createEdges(2, 4);

        obj.createEdges(3, 1);
        obj.createEdges(3, 4);
        obj.createEdges(3, 5);

        obj.createEdges(4, 2);
        obj.createEdges(4, 1);
        obj.createEdges(4, 5);
        obj.createEdges(4, 3);

        obj.createEdges(5, 3);
        obj.createEdges(5, 4);

        obj.printEdges();

        System.out.println("-------");
        System.out.println("---Started visiting vertex with recursion----");
        obj.checkVisitedVertexWithRecursion(0);

        System.out.println("-------");
        System.out.println("---Started visiting vertex without recursion----");
        obj.checkVisitedVertexWithStack(0);

    }

    private void checkVisitedVertexWithStack(int vertex) {
        int finalVertex = vertex;
        stack.add(finalVertex);
        hashSet.add(finalVertex);
        boolean shouldVisitedFlag = false;

        //System.out.println(finalVertex);

        while(!stack.empty()) {
            ListIterator<Integer> iterator = adjList[finalVertex].listIterator();
            shouldVisitedFlag = false;
            while (iterator.hasNext()) {
                int nextVertex = iterator.next();
                if (!hashSet.contains(nextVertex)) {
                    hashSet.add(nextVertex);
                    stack.add(nextVertex);
                    finalVertex = nextVertex;
                    shouldVisitedFlag = true;
                }
            }
            if (!shouldVisitedFlag) {
                finalVertex = stack.peek();
                stack.pop();
            }

        }


        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    private void createVertex (int numberOfVertex) {
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

    private void checkVisitedVertexWithRecursion(int vertex) {
        hashSet.add(vertex);
        System.out.println(vertex);

       ListIterator<Integer> iterator =  adjList[vertex].listIterator();
       while (iterator.hasNext()) {
           int nextVertex = iterator.next();
           if (!hashSet.contains(nextVertex)) {
               hashSet.add(nextVertex);
               checkVisitedVertexWithRecursion(nextVertex);
           }
       }
    }



}
