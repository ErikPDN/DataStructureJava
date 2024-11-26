package dynamicprogramming;

public class KnapsackProblem {
    public static void main(String[] args) {
        // Teste para o problema da mochila
        int[] weights = {4, 2, 1, 3}; // Pesos dos itens
        int[] values = {50, 40, 30, 45};  // Valores dos itens
        int capacity = 5;            // Capacidade máxima da mochila
        int n = weights.length;      // Número de itens

        double maxProfit = knapsack(weights, values, n, capacity);
        System.out.println("Valor máximo que pode ser obtido: " + maxProfit);
    }

    // Função knapSack corrigida
    private static double knapsack(int[] weights, int[] values, int n, int capacity) {
        // Caso base: não há itens ou capacidade
        if (n == 0 || capacity == 0) {
            return 0;
        }

        // Se o peso do último item excede a capacidade, não o incluímos
        if (weights[n - 1] > capacity) {
            return knapsack(weights, values, n - 1, capacity);
        }

        // Caso contrário, consideramos a solução incluindo e excluindo o item atual
        double exclude = knapsack(weights, values, n - 1, capacity);
        double include = knapsack(weights, values, n - 1, capacity - weights[n - 1]) + values[n - 1];

        // Retorna o máximo entre incluir ou excluir o item
        return Math.max(exclude, include);
    }
}
