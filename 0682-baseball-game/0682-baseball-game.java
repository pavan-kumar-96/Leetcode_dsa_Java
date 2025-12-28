class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];
            if (s.equals("+")) {
                int p1 = st.pop();
                int p2 = st.peek();
                st.push(p1);
                st.push(p1 + p2);
            } else if (s.equals("D")) {
                int num = st.peek();
                st.push(num * 2);
            } else if (s.equals("C")) {
                st.pop();
            } else {
                st.push(Integer.valueOf(s));
            }
        }
        int ans = 0;
        for (int j : st) {
            ans += j;
        }
        return ans;
    }
}