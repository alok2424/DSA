import java.util.*;
class StockSpanner {
    // Stack stores: [price, span]
    private Stack<int[]> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        // Pop and accumulate spans of smaller or equal prices
        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.pop()[1];
        }

        st.push(new int[]{price, span});
        return span;
    }
}
