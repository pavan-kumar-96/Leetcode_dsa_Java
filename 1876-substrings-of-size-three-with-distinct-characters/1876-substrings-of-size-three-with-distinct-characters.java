class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        int l = 0;
        int sl = 3;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            if (r - l == sl) {
                char tch = s.charAt(l);
                hm.put(tch, hm.get(tch) - 1);
                if (hm.get(tch) == 0) {
                    hm.remove(tch);
                }
                l++;
            }

            if (hm.size() == sl) {
                ans += 1;
            }
        }
        return ans;
    }
}