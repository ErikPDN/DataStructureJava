package linkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertAtBeginning(1);
        ll.insertAtBeginning(2);
        ll.insertAtBeginning(3);
        ll.printList();
        ll.insertAtEnd(0);
        ll.printList();
        ll.removeAtEnding();
        ll.printList();
    }
}
