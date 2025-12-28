class Solution {
    public int atMost(int[]arr,int k){
        int l = 0;
        int temp = 0;
        int ans = 0;
        int countarr = 0;
        for (int r = 0; r < arr.length; r++) {
            if (arr[r] % 2 != 0) {
                temp++;
            }
            while (temp > k) {
                if (arr[l] % 2 != 0) {
                    temp--;
                }
                l++;
            }
            ans += r - l + 1;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int finalanswer=atMost(nums,k)-atMost(nums,k-1);
        return finalanswer;
    }
}