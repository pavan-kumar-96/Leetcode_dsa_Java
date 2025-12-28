class Solution(object):
    def minimumDifference(self, nums, k):
        ans = float("inf")
        nums.sort()
        l=0
        for r in range(len(nums)):
            if(r-l == k):
                l+=1
            if(r-l+1 == k):
                ans=min(ans, nums [r]-nums[l])
        return ans