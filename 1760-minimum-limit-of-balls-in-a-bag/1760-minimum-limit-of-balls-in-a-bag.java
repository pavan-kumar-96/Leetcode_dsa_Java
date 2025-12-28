class Solution {
    public static boolean isPossible(int nums[], int maxOperations, int mid) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = nums[i] / mid;
            if (nums[i] % mid == 0) {
                ans--;
            }
            maxOperations -= ans;
            if (maxOperations < 0) {
                return false;
            }
        }
        return true;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int l = 1;
        int r = (int) Math.pow(10, 9);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(nums, maxOperations, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}