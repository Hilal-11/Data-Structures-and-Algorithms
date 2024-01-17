package Stack;
import java.util.Stack;
public class DeleteAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

    int index = 2;
    System.out.println(st);
    Stack<Integer> temp = new Stack<>();

    while (st.size() > index) {
        temp.push(st.pop());
    }
    temp.pop();

    while (temp.size() > 0) {
        st.push(temp.pop());
    }
    System.out.println(st);
     
       

    }
}
