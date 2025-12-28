class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> find = new HashSet<>();
        int repate = -1;
        for (int i = 0; i < nums.length; i++) {
            if (!find.contains(nums[i])) {
                find.add(nums[i]);
            } else {
                repate = nums[i];
            }
        }
        int missing = -1;
        for (int i = 1; i <= nums.length; i++) {
            if (!find.contains(i)) {
                missing = i;
                break;
            }
        }
        return new int []{repate,missing};
    }
}