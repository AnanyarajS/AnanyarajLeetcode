class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];
            boolean alive = true;

            while (!st.empty() && st.peek() > 0 && curr < 0) {
                if (Math.abs(st.peek()) < Math.abs(curr)) {
                    st.pop();
                } else if (Math.abs(st.peek()) == Math.abs(curr)) {
                    st.pop();
                    alive = false;
                    break;
                } else {
                    alive = false;
                    break;
                }
            }

            if (alive) {
                st.push(curr);
            }
        }

        int[] arr = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }

        return arr;
    }
}
