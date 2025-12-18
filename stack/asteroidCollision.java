import java.util.*;

public class asteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int num : asteroids) {
            if (num > 0) {
                st.push(num);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(num)) {
                    st.pop();
                }
                if (st.isEmpty() || st.peek() < 0) {
                    st.push(num);
                } else if (st.peek() == Math.abs(num)) {
                    st.pop();
                }
            }
        }

        int[] res = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        asteroidCollision obj = new asteroidCollision();
        int[] asteroids = {5, 10, -5};
        int[] result = obj.asteroidCollision(asteroids);
        System.out.println(Arrays.toString(result));
    }
}
