package trees;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    List<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        this.heapifyUp(heap.size() - 1);
    }

    public int extractMin() {
        if (heap.isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }
        if (heap.size() == 1) {
            return heap.removeFirst();
        }
        int root = heap.getFirst();
        heap.set(0, heap.removeLast());
        this.heapifyDown(0);
        return root;
    }


    public int peek() {
        if (heap.isEmpty()) {
            throw new RuntimeException("Heap is empty");
        } else {
            return heap.getFirst();
        }
    }

    private void heapifyUp(int idx) {
        int parentIdx = (idx - 1) / 2;
        if (idx > 0 && heap.get(parentIdx) > heap.get(idx)) {
            int temp = heap.get(idx);
            heap.set(idx, heap.get(parentIdx));
            heap.set(parentIdx, temp);
            this.heapifyUp(parentIdx);
        }
    }

    private void heapifyDown(int idx) {
        int smallestIdx = idx;
        int leftChild = 2 * idx + 1;
        int rightChild = 2 * idx + 2;

        if (leftChild < heap.size() && heap.get(leftChild) < heap.get(smallestIdx)) {
            smallestIdx = leftChild;
        }

        if (rightChild < heap.size() && heap.get(rightChild) < heap.get(smallestIdx)) {
            smallestIdx = rightChild;
        }

        if (smallestIdx != idx) {
            int temp = heap.get(smallestIdx);
            heap.set(smallestIdx, heap.get(idx));
            heap.set(idx, temp);
            this.heapifyDown(smallestIdx);
        }
    }

}
