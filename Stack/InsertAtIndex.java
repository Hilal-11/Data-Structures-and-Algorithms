package Stack;

import java.util.Stack;

public class InsertAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        int elm = 10;
        int idx = 4;
        Stack<Integer> temp = new Stack<>();
        while (st.size() > idx) {
            temp.push(st.pop());
        }
        temp.push(elm);

        while (temp.size() > 0) {
            st.push(temp.pop());
        }

        System.out.println(st);
        


     }
}
