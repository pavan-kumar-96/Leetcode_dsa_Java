class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> prefix = new ArrayList<>();
        ArrayList<Integer> suffix = new ArrayList<>();
        prefix.add(nums[0]);
        for (int i = 1; i < n; i++) {
            prefix.add(prefix.get(i - 1) + nums[i]);
        }
        suffix.add(nums[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            suffix.add(suffix.get(suffix.size() - 1) + nums[i]);
        }
        java.util.Collections.reverse(suffix);
        for (int j = 0; j < n; j++) {
            int leftSum = prefix.get(j) - nums[j];   
            int rightSum = suffix.get(j) - nums[j];
            if (leftSum == rightSum) {
                return j;
            }
        }
        return -1;
    }
}