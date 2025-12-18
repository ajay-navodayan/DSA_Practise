import java.util.*;

public class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int val) {
        st.push(val);
        if (min.isEmpty() || val <= min.peek()) min.push(val);
    }

    public void pop() {
        if (st.pop().equals(min.peek())) min.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(3);
        ms.push(1);
        ms.push(2);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
    }
}

