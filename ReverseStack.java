import java.util.Stack;

public class ReverseStack {

    public static void reversest1(Stack<Integer> st1) {
        if (st1.isEmpty()) {
            return; // No elements to reverse
        }

        Stack<Integer> st2 = new Stack<>();

        while (!st1.isEmpty()) {
            int temp = st1.pop();
            while (!st2.isEmpty() && st2.peek() > temp) {
                st1.push(st2.pop());
            }
            st2.push(temp);
        }

        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        reversest1(st);
        System.out.println(st);
    }
}
