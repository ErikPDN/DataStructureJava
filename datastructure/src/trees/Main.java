package trees;

public class Main {
    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        tree.insert(50);
//        tree.insert(30);
//        tree.insert(20);
//        tree.insert(40);
//        tree.insert(70);
//        tree.insert(60);
//        tree.insert(80);
//
//        System.out.println("Tree sort: ");
//        tree.inorder();

        MinHeap minHeap = new MinHeap();
        minHeap.insert(50);
        minHeap.insert(30);
        minHeap.insert(20);
        minHeap.insert(40);
        minHeap.insert(70);
        minHeap.insert(60);
        minHeap.insert(80);

        System.out.println("Heap min: " + minHeap.extractMin());
        System.out.println("Heap peak: " + minHeap.peek());
        System.out.println("Heap min: " + minHeap.extractMin());


    }
}
