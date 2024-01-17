package Stack;
import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2); 
        st.push(3); 
        st.push(4); 
        st.push(5); 
        System.out.println(st);

        Stack<Integer> temp = new Stack<>();
        while (st.size() > 0) {
            temp.push(st.pop());
        }
        Stack<Integer> temp2 = new Stack<>();
        while (temp.size() > 0) {
            temp2.push(temp.pop());

        }

        while (temp2.size() > 0) {
            st.push(temp2.pop());

        }
        System.out.println(st);
 
    }
}
