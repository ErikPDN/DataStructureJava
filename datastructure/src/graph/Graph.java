package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {
    private final Map<T, List<Edge<T>>> graph;

    public static class Edge<T> {
        T destination;
        int weight;

        public Edge(T destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "(" + destination + ", " + weight + ")";
        }
    }

    public Graph() {
        graph = new HashMap<>();
    }

    public void addVertex(T vertex) {
        graph.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(T from, T to, int weight, boolean directed) {
        graph.get(from).add(new Edge<>(to, weight));
        if(!directed) {
            graph.get(to).add(new Edge<>(from, weight));
        }
    }

    public void displayGraph() {
        for (T vertex : graph.keySet()) {
            System.out.print(vertex + " -> ");
            System.out.println(graph.get(vertex));
        }
    }

    public List<Edge<T>> getNeighbors(T vertex) {
        return graph.getOrDefault(vertex, new ArrayList<>());
    }

}
