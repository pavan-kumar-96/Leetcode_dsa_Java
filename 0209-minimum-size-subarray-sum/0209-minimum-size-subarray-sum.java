class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int n = nums.length;
        int l = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int i = l; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
                result = Math.min(result, i - l + 1);
                l++;
                sum -= nums[l - 1];
            }
        }
        if (result == Integer.MAX_VALUE) {
            return 0;
        } else {
            return result;
        } 
    }
}