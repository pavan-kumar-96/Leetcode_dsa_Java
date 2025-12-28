class Solution {
    public static boolean isPossible(int[] nums, int threshold, int k) {
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int ans = val / k;
            if (val % k != 0) {
                ans++;
            }
            threshold -= ans;
            if (threshold < 0) {
                return false;
            }
        }
        return true;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = (int) Math.pow(10, 6);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(nums, threshold, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}