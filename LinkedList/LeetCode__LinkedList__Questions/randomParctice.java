package LinkedList.LeetCode__LinkedList__Questions;

public class randomParctice {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void DeleteNode(Node n) {
        Node temp = n;
        if (n.next == null) {
            temp.next = null;
            return;
        }
        temp.data = temp.next.data;
        temp.next = temp.next.next;
    }

    // delete nth Node in linkedList
    // delete nth Node in linkedList
    static void DeleteNth(Node head, int index) {
        Node temp = head;
        if (index == 0) {
            head = temp.next;
        }

        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;

        }
        temp.next = temp.next.next;
    }

    // delete nth from end 1st Approach LEETCODE PROBLEM
    // delete nth from end 1st Approach LEETCODE PROBLEM

    static Node DeleteNthNodeFromEndX(Node head, int n) {

        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        temp = head;
        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // delete nth from end 1st Approach
    // delete nth from end 1st Approach

    static void DeleteNthFromEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
    }

    // delete nth from end 2nd Approach LEETCODE PROBLEM
    // delete nth from end 2nd Approach LEETCODE PROBLEM
    static Node DeleteNthFromEnd2(Node head, int n) {
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            head = head.next;
            return head;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    // Find the Intersections of two linkedLists [VvImP] LEETCODE PROBLEM
    // Find the Intersections of two linkedLists [VvImP] LEETCODE PROBLEM

    static Node FindInersection(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        int size1 = 0;
        int size2 = 0;
        while (temp1 != null) {
            size1++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            size2++;
            temp2 = temp2.next;
        }

        temp1 = head1;
        temp2 = head2;

        if (size1 > size2) {
            int m = size1 - size2;
            for (int i = 1; i <= m; i++) {
                temp1 = temp1.next;
            }
        } else {
            int m = size2 - size1;
            for (int i = 1; i <= m; i++) {
                temp2 = temp2.next;
            }
        }

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;

        }
        return temp1;
    }

    static Node FindMidNodeY(Node head) {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;

        }
        temp = head;
        int mid = (length / 2);
        for (int i = 1; i <= mid; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Find the mid Node in a linkedList LEETCODE PROBLEM
    // Find the mid Node in a linkedList LEETCODE PROBLEM

    static Node FindMidNode(Node head) {
        Node temp = head;
        Node slow = head;
        Node fast = head;

        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (size % 2 != 0) {
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        if (size % 2 == 0) {
            while (fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return slow;

    }
    // Find the mid Node in a linkedList Secound Approach [Vv_Imp] LEETCODE PROBLEM
    // Find the mid Node in a linkedList Secound Approach [Vv_Imp] LEETCODE PROBLEM

    static Node FindMidNodeX(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    // Delete the mid Node in a linkedList (LEETCODE PROBLEM)...
    // Delete the mid Node in a linkedList (LEETCODE PROBLEM)...

    static Node DeleteMidNode(Node head) {
        Node slow = head;
        Node fast = head;
        if (head.next == null) {
            return null;

        }
        while (fast.next.next != null && fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;

    }

    // check the cycle of linkedList
    // check the cycle of linkedList
    public static boolean isCycle(Node head) {
        Node slow = head;
        Node fast = head;

        if (head.next == null) {
            return false;
        } else if (head == null) {
            return false;
        }
        while (fast != null) {
            if (slow == null) {
                return false;
            }
            slow = slow.next;
            if (fast.next == null) {
                return false;
            }
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // Find the cycle node where cycle begins in linkedList ..... {imp}
    // Find the cycle node where cycle begins in linkedList ..... {imp}

    public static Node FindCycleNode(Node head) {
        Node temp = head;
        Node slow = head;
        Node fast = head;

        if (head == null) {
            return head;
        } else if (head.next == null) {
            return head;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }

        return slow;
    }
    // Display linked list
    // Display linked list

    static void Display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = e;

        System.out.println(isCycle(a));
        a = FindCycleNode(a);
        System.out.println(a.data);
        // Display(a);
        // Display(a);
        // System.out.println();
        // a = DeleteMidNode(a);
        // Display(a);
        // System.out.println();

        // a = FindMidNodeX(a);
        // System.out.println(a.data);

        // Node x = new Node(5);
        // Node y = new Node(6);
        // Node z = new Node(7);
        // Node t = new Node(8);
        // Node l = new Node(9);
        // Node q = new Node(10);
        // Node p = new Node(11);

        // x.next = y;
        // y.next = z;
        // z.next = t;
        // t.next = l;
        // l.next = q;
        // q.next = p;
        // p.next = e;

        // a = DeleteNthFromEnd2(a, 4);s2
        // DeleteNode(d);
        // Display(a);
        // System.out.println();
        // Display(x);

        // a = FindInersection(a, x);

        // System.out.println("\n" + a.data);

        // a = DeleteNthNodeFromEndX(a, 1);
        // System.out.println();
        // System.out.println(a.data);

    }
}
