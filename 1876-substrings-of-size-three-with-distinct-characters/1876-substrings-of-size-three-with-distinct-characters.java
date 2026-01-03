class Solution {
    public static boolean fun(String s,int k) {
        int n = s.length();
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(s.charAt(i));
        }
        if (hs.size() == k) {
            return true;
        } else {
            return false;
        }
    }
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int sl = 3;
        int count = 0;
        for (int i = 0; i <= n - sl; i++) {
            int j = i + sl - 1;
            boolean temp = fun(s.substring(i, j + 1),3);
            if (temp) {
                count++;
            }

        }
        return count;        
    }
}