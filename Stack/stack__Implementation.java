package Stack;
import java.util.Stack;
class stack{
    public static void main(String[] args) {

       Stack<Integer> st = new Stack<>();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       st.push(5);

    //    System.out.println(st);
    //    System.out.println(st.peek());
    //    System.out.println(st.size());
    //    System.out.println(st.isEmpty());

    //    st.pop();
    //    System.out.println(st);

    // while (st.size() > 1) {
    //     st.pop();
      
    // }
    //   System.err.println(st);


    while (st.size() > 3) {
        st.pop();
    }
    System.out.println(st.peek());
    System.out.println(st);

    //    System.out.println(st);
    //    System.out.println(st.peek());
    //    st.pop();
    //    System.out.println(st);
    //    System.out.println(st.peek());


    //     System.out.println(st);

    //    Stack<Integer> rs = new Stack<>();
    // while (st.size() > 0) {
    //         rs.push(st.peek());
    //         st.pop();
    //    }

    // //    System.out.println(rs);
    // Stack<Integer> ts = new Stack<>();
    // while (rs.size() > 0) {
    //         ts.push(rs.peek());
    //         rs.pop();
    //    }

    // //    System.out.println(ts);

    //     while (ts.size() > 0) {
    //         st.push(ts.peek());
    //         ts.pop();
    //    }
    //    System.out.println(st);

      



        
    }
}