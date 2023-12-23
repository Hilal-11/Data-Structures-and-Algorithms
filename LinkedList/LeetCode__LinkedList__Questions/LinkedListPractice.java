package LinkedList;

public class LinkedListPractice {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {

        Node head = null;
        Node tail = null;

        void Add(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        // Insert at end of linkedList
        // Insert at end of linkedList
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            }

            else {
                tail.next = temp;
                tail = temp;

            }
        }
        // Insert at head of linkedList
        // Insert at head of linkedList

        void insertAtHead(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }

        }

        // insert Element at particular index no.
        // insert Element at particular index no.

        void insertAt(int idx, int val) {
            Node temp = new Node(val);
            Node t = head;

            if (idx < 0 && idx > length()) {
                System.out.println("wrong index number");
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            } else if (idx == length()) {
                insertAtEnd(val);
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;

        }

        // Get element in linkedList
        // Get element in linkedList

        int getElement(int idx) {
            Node temp = head;
            if (idx < 0 && idx > length()) {
                System.out.println("wrong index number");
                return -1;
            }
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteNode(int idx) {
            Node temp = head;

            if (idx < 0 && idx > length()) {
                System.out.println("wrong index number");
                return;
            } else if (idx == 0) {
                head = temp.next;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next = tail;
        }

        // Get Length of LinkedList
        // Get Length of LinkedList

        int length() {
            Node temp = head;
            int length = 0;
            while (temp != null) {
                length++;
                temp = temp.next;
            }
            return length;
        }

        // Display a Linked List
        // Display a Linked List

        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        linkedList list = new linkedList();
        list.insertAtHead(5);
        list.Add(10);
        list.Add(20);
        list.Add(30);
        list.Add(40);
        list.insertAtEnd(50);

        list.insertAt(4, 35);
        list.deleteNode(0);
        list.deleteNode(0);

        list.Display();
        System.out.println(list.getElement(4));
    }
}
