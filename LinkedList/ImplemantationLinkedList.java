package LinkedList;

public class ImplemantationLinkedList {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert at End of LinkedList Method
    // Insert at End of LinkedList Method

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
            }

            else {
                tail.next = temp;
            }
            tail = temp;

        }

        // Insert at First of LinkedList Method
        // Insert at First of LinkedList Method

        void insertAtHead(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
                tail = temp;
            }

            else {
                temp.next = head;
                head = temp;

            }
        }

        // Insert at n(index) position in LinkedList Method
        // Insert at n(index) position in LinkedList Method

        void insertAt(int idx, int val) {

            if (idx == size()) {
                insertAtEnd(val);
                return;
            }

            else if (idx == 0) {
                insertAtHead(val);
                return;
            }

            else if (idx < 0 || idx > size()) {
                System.out.println("Wrong Index!!!");
                return;
            }
            Node t = new Node(val);
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

        }

        // Get Element in LinkedList Method
        // Get Element in LinkedList Method

        int getElement(int idx) {

            if (idx < 0 || idx > size()) {
                System.out.println("Wrong Index!!!");
                return -1;
            }

            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }

            return temp.data;

        }

        // Delete at (index) Element in LinkedList Method
        // Delete at (index) Element in LinkedList Method

        void deleteAt(int idx) {
            Node temp = head;

            if (idx < 0 || idx > size()) {
                System.out.println("Wrong Index!!!");
                return;
            }

            else if (idx == 0) {
                head = temp.next;
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }

        // Size of LinkedList Method
        // Size of LinkedList Method

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count = count + 1;
                temp = temp.next;
            }
            return count;
        }

        // Display of LinkedList Method
        // Display of LinkedList Method

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        linkedlist ll = new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtHead(1);
        ll.insertAt(0, 10);
        ll.display();
        ll.deleteAt(4);
        ll.display();

        System.out.println(ll.head.data);
        // int a = ll.getElement(2);
        // System.out.println(a);

        // System.out.println(ll.size());

    }
}
