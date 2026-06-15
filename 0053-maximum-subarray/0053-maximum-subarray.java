class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int bestending = nums[0];
        int ans = nums[0];
        for (int j = 1; j < n; j++) {
            int v1 = bestending + nums[j];
            int v2 = nums[j];
            bestending = Math.max(v1, v2);
            ans = Math.max(ans, bestending);
        }
        return ans;
    }
}