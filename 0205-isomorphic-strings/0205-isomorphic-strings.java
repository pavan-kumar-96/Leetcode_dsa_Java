class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> isomorphic = new HashMap<>();
        HashMap<Character, Character> revisomorphic = new HashMap<>();
        Boolean ans = true;
        for (int i = 0; i < s.length(); i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if (!isomorphic.containsKey(sch) && !revisomorphic.containsKey(tch)) {
                isomorphic.put(sch, tch);
                revisomorphic.put(tch, sch);
            } else if ((isomorphic.containsKey(sch) && isomorphic.get(sch) != tch) ||(revisomorphic.containsKey(tch) && revisomorphic.get(tch) != sch)){
                ans = false;
                break;
            }
        }
        return ans;
        
    }
}