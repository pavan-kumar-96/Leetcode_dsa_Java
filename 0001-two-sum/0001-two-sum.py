class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n=len(nums)
        sum=0
        for i in range(n):
            for j in range(i+1,n):
                sum=nums[i]+nums[j]
                if sum==target:
                    return(i,j)