class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        int leftmin=nums[0];
        for (int i = 1; i < nums.length; i++) {
            int val=nums[i];
            if(leftmin<val){
                ans=Math.max(ans,val-leftmin);
            }
            leftmin=Math.min(leftmin,val);
        }
        return ans;
    }
}