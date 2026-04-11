class Solution {
    public static void reverse(int a, int b, int nums[]) {
        while (a < b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(0, n - k - 1, nums);
        reverse(n - k, n - 1, nums);
        reverse(0, n - 1, nums);
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }

    }
}