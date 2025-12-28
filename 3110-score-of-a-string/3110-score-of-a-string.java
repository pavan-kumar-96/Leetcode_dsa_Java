class Solution {
    public int scoreOfString(String s) {
        int temp = 0;
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char A = s.charAt(i);
            char B = s.charAt(i + 1);
            int first = A;
            int second = B;
            temp = Math.abs(first - second);
            ans = ans + temp;

        }
        return ans;
    }
}