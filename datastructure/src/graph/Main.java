package graph;

public class Main {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();

        // Adicionando vértices
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        // Adicionando arestas
        graph.addEdge("A", "B", 2, false); // Não-direcionado
        graph.addEdge("A", "C", 3, false); // Não-direcionado
        graph.addEdge("B", "C", 1, false); // Não-direcionado

        // Exibindo o grafo
        System.out.println("Lista de adjacência do grafo:");
        graph.displayGraph();

        // Obter vizinhos do vértice A
        System.out.println("\nVizinhos do vértice A:");
        System.out.println(graph.getNeighbors("A"));
    }
}
