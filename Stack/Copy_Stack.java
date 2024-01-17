package Stack;
import java.util.Stack;;
public class Copy_Stack {
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
            temp.push(st.peek());
            st.pop();

        }
        System.out.println(temp);
        Stack<Integer> temp2 = new Stack<>();

        while (temp.size() > 0) {
            temp2.push(temp.pop());
        }


        System.out.println(temp2);


    }
}
