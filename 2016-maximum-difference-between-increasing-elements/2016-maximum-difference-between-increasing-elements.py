class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        n=len(nums)
        low=nums[0]
        ans=-1
        for j in range(1,n):
                    if low < nums[j]:
                        temp=nums[j]-low
                        ans=max(ans,temp)
                    low=min(low,nums[j])
        return ans