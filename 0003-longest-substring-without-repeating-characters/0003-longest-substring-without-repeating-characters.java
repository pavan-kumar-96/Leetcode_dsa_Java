class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> hs = new HashSet<>();
        int result = 0;
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
            result = Math.max(result, r - l + 1);
        }
        return result;    
    }
}