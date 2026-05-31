class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = 0;
        int maxdiff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            int first = i;
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[first] + nums[left] + nums[right];
                int difference = Math.abs(sum - target);
                if (difference < maxdiff) {
                    maxdiff = difference;
                    result = sum;
                }
                if (sum == target) {
                    return result;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}