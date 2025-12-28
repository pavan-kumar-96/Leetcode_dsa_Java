class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        HashMap<Character, Integer> pair = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            pair.put(stones.charAt(i), pair.getOrDefault(stones.charAt(i), 0) + 1);
        }
        for (int i = 0; i < jewels.length(); i++) {
            if (pair.containsKey(jewels.charAt(i))) {
                ans = ans + pair.get(jewels.charAt(i));
            }
        }
        return ans; 
    }
}