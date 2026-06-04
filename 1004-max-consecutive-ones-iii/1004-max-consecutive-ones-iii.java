class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int res = Integer.MIN_VALUE;
        int temp=0;
        int l = 0;
        for (int h = 0; h < n; h++) {
            if (nums[h] == 0) {
                temp++;
            }

            while (temp > k) {
                if (nums[l] == 0) {
                    temp--;
                }
                l++;
            }
            res = Math.max(res, h - l + 1);
        }
        return res;
    }
}