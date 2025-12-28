class Solution {
    public static boolean fun(HashMap<Character, Integer> hm, HashMap<Character, Integer> hma) {
        if (hm.size() != hma.size()) {
            return false;
        }
        for (char k : hm.keySet()) {
            if (!hma.containsKey(k)) {
                return false;
            }
            int a = hm.get(k);
            int b = hma.get(k);
            if (a != b) {
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> hms = new HashMap<>();

        HashMap<Character, Integer> hmp = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            hmp.put(p.charAt(i), hmp.getOrDefault(p.charAt(i), 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int l = 0;
        int k = p.length();
        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);
            hms.put(ch, hms.getOrDefault(ch, 0) + 1);

            if (r - l == k) {
                char chl = s.charAt(l);
                hms.put(chl, hms.get(chl) - 1);
                if (hms.get(chl) == 0) {
                    hms.remove(chl);
                }
                l++;
            }
            if (r - l + 1 == k) {
                boolean valid = fun(hms, hmp);
                if (valid) {
                    ans.add(l);
                }
            }

        }
        return ans;
    }
}