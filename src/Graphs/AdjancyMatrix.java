package Graphs;

/*
This is the graph program with Adjancy Matrix. Adjancy Matrix is a 2 dimension array which has a size(v*v) where where V are the number of vertices in the graph.
1. adjMaxtrix[i][j] = 1 when there is edge between Vertex i and Vertex j, else 0.
2. It’s easy to implement because removing and adding an edge takes only O(1) time.
3. But the drawback is that it takes O(V2) space even though there are very less edges in the graph.

 */
public class AdjancyMatrix {
    private static int adjMatrix[][];

    public static void main(String args[]) {
        AdjancyMatrix obj = new AdjancyMatrix();
        obj.createVertex(5);
        obj.printAdjancyMatrix(5);

        obj.createEdges(0, 1);
        obj.createEdges(0, 4);
        obj.createEdges(1, 0);
        obj.createEdges(1, 2);
        obj.createEdges(1, 3);
        obj.createEdges(2, 1);
        obj.createEdges(2, 3);
        obj.createEdges(3, 1);
        obj.createEdges(3, 2);
        obj.createEdges(3, 4);
        obj.createEdges(4, 0);
        obj.createEdges(4, 3);
        obj.printAdjancyMatrix(5);
    }

    private void createEdges(int source, int destination) {
        adjMatrix[source][destination] = 1;
        adjMatrix[destination][source] = 1;
    }

    private void printAdjancyMatrix(int numberOfVertex) {
        System.out.println("");
        for (int row = 0; row < numberOfVertex; row++) {
            System.out.println("");
            for (int col = 0; col < numberOfVertex; col++) {
                System.out.print(adjMatrix[row][col]);
            }
        }
    }

    private void createVertex(int numberOfVertex) {
        adjMatrix = new int[numberOfVertex][numberOfVertex];
    }


}
