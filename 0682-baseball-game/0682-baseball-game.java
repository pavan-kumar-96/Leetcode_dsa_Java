class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (operations[i].equals("+")) {
                int p1 = st.pop();
                int p2 = st.peek();
                st.push(p1);
                st.push(p1 + p2);
            } else if (operations[i].equals("D")) {
                int p1 = st.peek();
                st.push(p1 + p1);
            } else if (operations[i].equals("C")) {
                st.pop();
            } else {
                st.push(Integer.valueOf(operations[i]));
            }
        }
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        return ans;
    }
}