package sort.algothims;

public class QuickSort {
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to pivot
            if(arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // coloca o pivot na pos correta
        int temp = arr[i+1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // retorna a pos do pivot
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            // Partition the array and get the pivot 
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the elements before and after partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 34, 7, 23, 32, 5, 62 };
        
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
