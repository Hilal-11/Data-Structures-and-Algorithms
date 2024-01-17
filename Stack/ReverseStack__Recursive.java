package Stack;
import java.util.Stack;
public class ReverseStack__Recursive {
    public static void insertAtBottom(Stack<Integer> st , int top){
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            rt.push(st.pop()); 
        }

        st.push(top);

        while (rt.size() > 0) {
            st.push(rt.pop());
        }
    }
    public static void ReverseStack(Stack<Integer> st){
        if (st.size() == 1) {
            return;
        }
        int top = st.pop();
        ReverseStack(st);
        insertAtBottom(st , top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        ReverseStack(st);
        System.out.println(st);

    }
}
