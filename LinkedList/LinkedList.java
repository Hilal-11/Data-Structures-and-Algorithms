package LinkedList;

public class LinkedList {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Display using Function
    // Display using Function

    public static void Display(Node head) {

        while (head != null) {
            System.out.print(head.data + "\t");
            head = head.next;
        }
    }

    // Display using Recursion
    // Display using Recursion

    public static void DisplayRecursively(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + "\t");
        DisplayRecursively(head.next);
    }

    // Get length of LinkedList
    // Get length of LinkedList

    public static int length(Node head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    // Insert at End of LinkedList
    // Insert at End of LinkedList

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);

        // a.data = 10;
        // b.data = 20;
        // c.data = 30;
        // d.data = 40;

        a.next = b; // 10 => 20 30 40
        b.next = c; // 10 => 20 => 30 40
        c.next = d; // 10 => 20 => 30 => 40
        d.next = e; // 10 => 20 => 30 => 40
        e.next = f; // 10 => 20 => 30 => 40
        f.next = g; // 10 => 20 => 30 => 40

        // System.out.println(a.data); // a
        // System.out.println(b.data); // b
        // System.out.println(c.data); // c
        // System.out.println(d.data); // d

        // System.out.println("\n");

        // System.out.println(a.data); // a
        // System.out.println(a.next.data); // a => b
        // System.out.println(a.next.next.data); // a => b => c
        // System.out.println(a.next.next.next.data); // a => b => c => d

        // Node temp1 = a;

        // for (int i = 0; i < 4; i++) {
        // System.out.print(temp1.data + "\t");
        // temp1 = temp1.next;
        // }

        // System.out.println();
        // Node temp2 = a;
        // while (temp2 != null) {
        // System.out.print(temp2.data + "\t");
        // temp2 = temp2.next;
        // }

        Display(a);
        System.out.println();
        DisplayRecursively(a);
        System.out.println();
        System.out.println(length(a));
        // Node temp = a;
        // int length = 0;
        // while (temp != null) {
        // length = length + 1;
        // temp = temp.next;
        // }
        // System.out.println("Length = " + length);

    }
}
