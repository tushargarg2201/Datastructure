package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchTraversal {
    List<List<Integer>> graph;
    boolean[] visited;

    DepthFirstSearchTraversal(int numberOfVertex) {
        graph = new ArrayList<>();
        visited = new boolean[numberOfVertex];
        for (int i = 0; i < numberOfVertex; i++) {
            graph.add(i, new ArrayList<>());
        }
    }

    private void addEdgeInUndirectedGraph(int source, int destination) {
        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    public static void main(String[] args) {
        DepthFirstSearchTraversal dfs = new DepthFirstSearchTraversal(4);
//        dfs.addEdgeInUndirectedGraph(0, 1);
//        dfs.addEdgeInUndirectedGraph(0, 2);
//        dfs.addEdgeInUndirectedGraph(1, 3);
//        dfs.addEdgeInUndirectedGraph(2, 3);

        dfs.addEdgeInDirectedGraph(0, 1);
        dfs.addEdgeInDirectedGraph(0, 2);
        dfs.addEdgeInDirectedGraph(1, 3);
        dfs.addEdgeInDirectedGraph(2, 3);

        dfs.applyDfs(0);
    }

    private void addEdgeInDirectedGraph(int source, int destination) {
        graph.get(source).add(destination);
    }

    private void applyDfs(int vertex) {
        Stack<Integer> stack = new Stack<>();
        stack.push(vertex);
        visited[vertex] = true;

        while (!stack.isEmpty()) {
            Integer node = stack.pop();
            System.out.print(node + " ");
            List<Integer> neighbourList = graph.get(node);
            for(Integer neighbour : neighbourList) {
                if (!visited[neighbour]) {
                    stack.push(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }


}
