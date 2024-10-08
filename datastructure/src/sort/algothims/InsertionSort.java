package sort.algothims;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1};

        System.out.println("Array original: " + Arrays.toString(array));

        insertionSort(array);

        System.out.println("Array ordenado: " + Arrays.toString(array));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
