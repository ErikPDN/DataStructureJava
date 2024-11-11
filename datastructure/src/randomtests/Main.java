package randomtests;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 3, 6, 5, 9, 8};
        int arrLen = A.length;
        int key = 8;

        int pos = findHeap(A, arrLen, key, 0);
        if(pos != -1) {
            System.out.println("Position: " + pos);
        } else {
            System.out.println("The value is not in A");
        }
    }

    private static int findHeap(int[] A, int len, int key, int init) {
        if (init >= len) {
            return -1;
        }

        if (A[init] == key) {
            return init;
        }

        // Se o valor no índice atual é maior que a chave, pare a busca neste ramo
        if (A[init] > key) {
            return -1;
        }

        int posLeft = findHeap(A, len, key, 2*init + 1);
        if (posLeft != -1) {
            return posLeft;
        }

        return findHeap(A, len, key, 2*init + 2);

    }
}
