class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        HashSet<Character> hs = new HashSet<>();
        int l = 0;
        for (int r = 0; r < n; r++) {
            if (!hs.contains(s.charAt(r))) {
                hs.add(s.charAt(r));
            } else {
                while (hs.contains(s.charAt(r))) {
                    hs.remove(s.charAt(l));
                    l++;
                }
                hs.add(s.charAt(r));
            }

            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}