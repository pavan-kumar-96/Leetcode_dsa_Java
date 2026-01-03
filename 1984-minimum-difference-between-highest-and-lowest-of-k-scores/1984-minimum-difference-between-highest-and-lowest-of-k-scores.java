class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int j = i + k - 1;
            int temp = nums[j] - nums[i];
            ans = Math.min(ans, temp);
        }
        return ans;
    }
}