class Solution {
    public static boolean isPossible(int positions[], int m, int mid) {
        int prev = positions[0];
        m -= 1;
        for (int i = 1; i < positions.length; i++) {
            int val = positions[i];
            if (val - prev >= mid) {
                m -= 1;
                prev = positions[i];
            }
            if (m <= 0) {
                return true;
            }
        }
        return false;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1;
        int r = (int) Math.pow(10, 9);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(position, m, mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }
}