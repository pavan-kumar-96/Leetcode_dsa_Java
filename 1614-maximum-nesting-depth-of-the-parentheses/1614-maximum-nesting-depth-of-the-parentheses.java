class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int depth = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
                depth += 1;
            } else if (ch == ')') {
                st.pop();
                depth -= 1;
            } else {
                st.push(ch);
            }
            ans = Math.max(ans, depth);
        }
        return ans;
    }
}