import java.util.*;

public class QusingStack {

    static class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public MyQueue() {
        }

        public void push(int x) {
            while (!s1.isEmpty()) {
                s2.push(s1.peek());
                s1.pop();
            }
            s1.push(x);
            while (!s2.isEmpty()) {
                s1.push(s2.peek());
                s2.pop();
            }
        }

        public int pop() {
            int value = s1.peek();
            s1.pop();
            return value;
        }

        public int peek() {
            return s1.peek();
        }

        public boolean empty() {
            return s1.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}
