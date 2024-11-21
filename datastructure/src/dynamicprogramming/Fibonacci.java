package dynamicprogramming;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 5; // Valor de exemplo
//        System.out.println("Fibonacci de " + n + " é: " + DynamicFibonacci(n));
        System.out.println("Fibonacci de " + n + " é: " + efficientFibonacci(n));
    }

    private static int DynamicFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        // Inicializa os dois primeiros valores da sequência
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    private static int efficientFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 0;
        int cur = 1;

        for (int i = 2; i <= n; i++) {
            int aux = cur;
            cur = prev + cur;
            prev = aux;
        }

        return cur;
    }
}
