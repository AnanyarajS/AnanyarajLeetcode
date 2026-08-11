class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        this.st = new Stack<>();
    }

    public void push(int val) {
        long value = val;

        if (st.isEmpty()) {
            min = value;
            st.push(value);
            return;
        }

        if (min > value) {
            st.push(2 * value - min);
            min = value;
        } else {
            st.push(value);
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long a = st.pop();

        if (a < min) {
            min = 2 * min - a;
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long x = st.peek();

        if (min < x) {
            return (int) x;
        }

        return (int) min;
    }

    public int getMin() {
        return (int) min;
    }
}