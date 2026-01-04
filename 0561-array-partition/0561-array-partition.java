class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sl = 2;
        int temp = 0;
        for (int i = 0; i < n - sl + 1; i = i + 2) {
            int j = i + sl - 1;
            temp += Math.min(nums[i], nums[j]);
        }
        return temp;
    }
}