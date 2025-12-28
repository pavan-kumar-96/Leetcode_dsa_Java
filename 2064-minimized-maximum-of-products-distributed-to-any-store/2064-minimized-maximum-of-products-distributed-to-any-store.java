class Solution {
    public static boolean isPossible(int quantities[], int n, int mid) {
        int temp = 0;
        for (int i = 0; i < quantities.length; i++) {
            temp = quantities[i] / mid;
            if (quantities[i] % mid != 0) {
                temp++;
            }
            n -= temp;
            if (n < 0) {
                return false;
            }

        }
        return true;
    }

    public int minimizedMaximum(int n, int[] quantities) {
        int l = 1;
        int r = (int) Math.pow(10, 5);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(quantities, n, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}