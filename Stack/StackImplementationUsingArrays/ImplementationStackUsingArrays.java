package Stack.StackImplementationUsingArrays;
import java.util.Stack;
public class ImplementationStackUsingArrays {

    public static class Stack{
        int[] data = new int[10];
        int index = 0;

        void push(int val) {
            data[index] = val;
            index++;
        }
        int peek() {
            if (index == 0) {
                System.out.println("Stack is Empty");  
                return -1;
            }
            return data[index-1];
        }

        int pop(){
            if (index == 0) {
                System.err.println("Stack is Empty");
                return -1;
            }
            int top = data[index-1];
            data[index-1] = 0;
            index--;
            return top;
        }

        void Display() {
            for(int i = 0; i <= index-1; i++){
                System.out.print(data[i]+" ");
            }System.out.println();
        }

        int size() {
            int size = 0;
            for(int i = 0; i<= index-1; i++){
                size++;
            }
            return size;
        }

       boolean isEmpty() {
            if (size() == 0) {
                return true;
            }else{
                return false;
            }

       }

       boolean isFull(){
        if (size() > 0) {
            return true;
        }else{
            return false;
        }
       }

       int capacity() {
            return data.length;
       }



    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.Display();
        st.push(6);
        st.Display();

        st.pop();
        st.Display();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());


        Stack rt = new Stack();
        System.out.println(rt.isEmpty());
        System.out.println(rt.isFull());

        System.out.println(st.capacity());

    }
}
