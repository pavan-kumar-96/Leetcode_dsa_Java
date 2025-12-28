class Solution {
    public static int right(int nums[], int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    public static int left(int nums[], int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    public int maximumCount(int[] nums) {
        int ans = 0;
        int target = 0;

        int neg = left(nums, target); 
        int pos = nums.length - (right(nums, target) + 1);

        ans = Math.max(neg, pos);
        return ans;
    }
}