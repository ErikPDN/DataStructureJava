package dynamicprogramming;

public class DpKnapsackProblem {
    public static void main(String[] args) {
        int[] weights = {4, 2, 1, 3};
        int[] values = {50, 40, 30, 45};
        int capacity = 5;

        int maxProfit = dpKnapsack(weights, values, capacity);
        System.out.println("Valor máximo que pode ser obtido: " + maxProfit);
    }

    private static int dpKnapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;

        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(
                            dp[i - 1][w],                                // Não incluir o item
                            dp[i - 1][w - weights[i - 1]] + values[i - 1] // Incluir o item
                    );
                } else {
                    dp[i][w] = dp[i - 1][w];  // Não inclui o item
                }
            }
        }

        // O valor máximo está na última célula dp[n][capacity]
        return dp[n][capacity];
    }
}
