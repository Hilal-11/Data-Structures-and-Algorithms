package Stack.StackImplementationUsingLinkedList;
public class StackImplementationUsingLinkedList {
    
    public static class Node {
        int val;
        Node next;
        
        Node(int val) {
            this.val = val;
        }
    }
    public static class Stack {
        Node head = null;
        private int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void Display(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        int pop(){
            int headVal = head.val;
            head = head.next;
            return headVal;
        }

        int peek(){
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }
        

        boolean isEmpty() {
            if (head == null) {
                return true;
            }else return false;
            
        }

        boolean isFull() {
            if (head != null) {
                return true;
            }
            else return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.Display();
        System.out.println(st.size());
        System.out.println(st.pop());
        st.Display();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());

    }
}
