package Stack;

import java.util.Stack;

public class insertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);


        //  stack 1
        Stack<Integer> temp = new Stack<>();

        while (st.size() > 0) {
            temp.push(st.peek());
            st.pop();

        }

        //  stack 1
        Stack<Integer> temp2 = new Stack<>();

        while (temp.size() > 0) {
            temp2.push(temp.pop());
        }

        //  stack 1
        Stack<Integer> temp3 = new Stack<>();
        while (temp2.size() > 0) {
            temp3.push(temp2.pop());

        }
        temp3.push(6);

        while (temp3.size() > 0) {
            st.push(temp3.pop());
        }
        System.out.println(st);


    }
}
