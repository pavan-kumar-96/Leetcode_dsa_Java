class Solution {
    public int totalFruit(int[] fruits) {
        int k = 2;
        int n = fruits.length;
        int result = 0;
        int l = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int r = 0; r < n; r++) {
            hm.put(fruits[r], hm.getOrDefault(fruits[r], 0) + 1);

            while (hm.size() > k) {
                hm.put(fruits[l], hm.get(fruits[l]) - 1);
                if (hm.get(fruits[l]) == 0) {
                    hm.remove(fruits[l]);
                }
                l++;
            }
            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}