class Solution {
    public static String rev(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String a = words[i];
                if (a.equals("0")) {
                    break;
                }
                String b = words[j];
                String revb = rev(b);
                if (revb.equals(a)) {
                    ans++;
                    words[j] = "0";
                    break;
                }
            }
        }
        return ans;
    }
}