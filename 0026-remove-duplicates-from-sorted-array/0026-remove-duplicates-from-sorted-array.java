class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        int unique = 1;
        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
                unique++;
            }
        }
        return unique;
    }
}