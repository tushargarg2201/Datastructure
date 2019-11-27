package Graphs;

import java.util.LinkedList;
import java.util.ListIterator;

public class AdjancyList {
    static class DrawGraph {
        int numberOfVertex;
        LinkedList<Integer>[] adjList;

        DrawGraph(int number) {
            numberOfVertex = number;
            adjList = new LinkedList[numberOfVertex];
            printVertex();
        }

        private void createVertex() {
            for (int i = 0; i < numberOfVertex; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        private void printVertex() {
            System.out.println("-----In Adjancy list vertex are ----");
            for(int i = 0; i < numberOfVertex; i++) {
                System.out.println(adjList[i]);
            }
        }

        public void createEdges(DrawGraph drawGraph, int source, int destination) {
            drawGraph.adjList[source].add(destination);
            //drawGraph.adjList[destination].add(source);
        }

        private void printData() {
            for (int i = 0; i < adjList.length; i++) {
                System.out.println(i + " ---> " + adjList[i]);
                //System.out.println("size" + " ---> " + adjList[i].size());

                ListIterator<Integer> iterator = adjList[i].listIterator();
                while (iterator.hasNext()) {
                    int n = iterator.next();
                    System.out.println("n is--->" + n);
                }

            }
        }
    }

    public static void main(String[] args) {
        DrawGraph dG = new DrawGraph(5);
        dG.createVertex();
        //dG.printVertex();

        dG.createEdges(dG, 0, 1);
        dG.createEdges(dG, 0, 4);

        dG.createEdges(dG, 1, 0);
        dG.createEdges(dG, 1, 2);
        dG.createEdges(dG, 1, 3);

        dG.createEdges(dG, 2, 1);
        dG.createEdges(dG, 2, 3);

        dG.createEdges(dG, 3, 1);
        dG.createEdges(dG, 3, 4);
        dG.createEdges(dG, 3, 2);

        dG.createEdges(dG, 4, 0);
        dG.createEdges(dG, 4, 3);


        dG.printData();

    }
}
