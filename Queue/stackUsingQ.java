import java.util.*;

public class stackUsingQ {

    static class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public MyStack() {
        }

        public void push(int x) {
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
            q1.add(x);
            while (!q2.isEmpty()) {
                q1.add(q2.peek());
                q2.remove();
            }
        }

        public int pop() {
            int value = q1.peek();
            q1.remove();
            return value;
        }

        public int top() {
            return q1.peek();
        }

        public boolean empty() {
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println(obj.top());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}
