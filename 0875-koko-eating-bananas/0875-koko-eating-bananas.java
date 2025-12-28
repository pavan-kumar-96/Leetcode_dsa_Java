class Solution {
    public static boolean isPossible(int piles[], int h, int k) {
        int ans = 0;
        for (int i = 0; i < piles.length; i++) {
            ans = piles[i] / k;
            if (piles[i] % k != 0) {
                ans++;
            }
            h -= ans;
            if (h < 0) {
                return false;
            }
        }
        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = (int) Math.pow(10, 9);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(piles, h, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}