package Stack;
import java.util.Stack;
public class DisplayStack {


        
    //  Display Recursively a Stack reverse order
    //  Display Recursively a Stack reverse order
    static void Display1(Stack<Integer> st){
        if (st.size() == 0) {
            return;
        }
        int top = st.pop();
        System.out.print(top+"  ");
        Display1(st);
        st.push(top);
        System.out.println(st);

        
    }
    
    //  Display Recursively a Stack reverse order
    //  Display Recursively a Stack reverse order
    static void Display(Stack<Integer> st){
        if (st.size() == 0) {
            return;
        }
        System.out.print(st.pop()+"  ");
        Display(st);
        System.out.println(st);

        
    }


    
    //  Display Recursively a Stack
    //  Display Recursively a Stack

    static void DisplayRecersively(Stack<Integer> st) {
        if (st.size() == 0) {
            return;
        }
        Stack<Integer> temp = new Stack<>();
        temp.push(st.pop());
        DisplayRecersively(st);
        st.push(temp.pop());
        System.out.print(st.peek()+"  ");
                

    }

    //  Display Recursively a Stack
    //  Display Recursively a Stack
    static void DisplayRec(Stack<Integer> st){
        if (st.size() == 0) {
            return;
        }
        int top = st.pop();
        DisplayRec(st);
        System.out.print(top+"  ");
        st.push(top);

        
    }





    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // System.out.println(st);
        // Display1(st);
        DisplayRec(st);

        // Stack<Integer> temp = new Stack<>();

        // while (st.size() > 0) {
        //     temp.push(st.pop());
        // }

        // while (temp.size() > 0) {
        //     st.push(temp.peek());
        //     System.out.print(st.peek()+"  ");
        //     temp.pop();
        // }


        // Stack<Integer> temp = new Stack<>();

        // while (st.size() > 0) {
        //     temp.push(st.pop());
        // }

        // while (temp.size() > 0) {
        //    int x = temp.pop();
        //    System.out.print(x+"  ");
        //    st.push(x);
        // }

        // int n = st.size();
        // int data[] = new int[n];

        // for(int i = n-1; i > 0; i--){
        //     data[i] = st.pop();
        // }

        // for(int i = 1; i < n; i++){
        //     System.err.print(data[i]+"  ");
        //     st.push(data[i]);
        // }


    }
}
