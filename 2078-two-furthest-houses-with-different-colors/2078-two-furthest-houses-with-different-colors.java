class Solution {
    public int maxDistance(int[] colors) {
        int ans = 0;
        for (int i = 0; i < colors.length - 1; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                if (colors[i] != colors[j]) {
                    int temp = Math.abs(i - j);
                    ans = Math.max(ans, temp);
                }
            }
        }
        return ans;
    }
}