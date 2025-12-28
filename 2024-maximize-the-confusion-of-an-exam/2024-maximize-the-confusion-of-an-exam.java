class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int cntt = 0;
        int cntf = 0;
        int ans = 0;
        int l = 0;
        for (int r = 0; r < answerKey.length(); r++) {
            char cr = answerKey.charAt(r);
            if (cr == 'T') {
                cntt++;
            } else {
                cntf++;
            }
            while (Math.min(cntt, cntf) > k) {
                char cl = answerKey.charAt(l);
                if (cl == 'T') {
                    cntt--;
                } else {
                    cntf--;
                }
                l++;
            }
            ans = Math.max(ans, r - l + 1);

        }
        return ans;
    }
}