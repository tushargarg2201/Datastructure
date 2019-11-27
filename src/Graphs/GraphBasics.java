package Graphs;

import java.util.Collections;
import java.util.LinkedList;

public class GraphBasics {

    static class Graph {
        int mNumberOfVertex = 0;
        LinkedList<Integer> vertex[];

        Graph (int numberOfVertex) {
            mNumberOfVertex = numberOfVertex;
            vertex = new LinkedList[mNumberOfVertex];
            createVertex();
        }

        private void printVertex() {
            for (int i =1; i < mNumberOfVertex; i++) {
                System.out.println("number of vertex--->" + i);
            }
        }

        private void createVertex() {
            for (int i = 1; i < mNumberOfVertex; i++) {
                vertex[i] = new LinkedList<>();
            }
        }

        public void addEdges(Graph graph, int source, int destination) {
            graph.vertex[source].add(destination);
            graph.vertex[destination].add(source);
        }

    }

    public static void main(String args[]) {
        Graph graph = new Graph(6);
        graph.printVertex();
        graph.addEdges(graph, 1, 2);
        graph.addEdges(graph, 1, 5);
    }
}
