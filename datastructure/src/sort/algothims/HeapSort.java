package sort.algothims;

public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Passo 1: Construa uma max-heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Passo 2: Extraia elementos da heap um a um
        for (int i = n - 1; i > 0; i--) {
            // Mova a raiz atual (maior elemento) para o final
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Re-heapifique a heap reduzida
            heapify(arr, i, 0);
        }
    }

    // Função auxiliar para criar uma max-heap
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;        // Inicialize o maior como a raiz
        int left = 2 * i + 1;   // Filho à esquerda
        int right = 2 * i + 2;  // Filho à direita

        // Se o filho à esquerda é maior que a raiz
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Se o filho à direita é maior que o maior atual
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Se o maior não é a raiz
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursivamente faça o heapify na sub-árvore
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 10, 9};
        heapSort(arr);

        System.out.println("Array ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
