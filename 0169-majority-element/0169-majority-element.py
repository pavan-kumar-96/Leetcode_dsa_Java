class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n=len(nums)
        ans=-1
        dici={}
        for key in nums:
            if key not in dici:
                dici[key]=1
            else:
                dici[key]=dici[key]+1
        temp=n//2
        for i in dici:
            val=dici[i]
            if val>temp:
                ans=i
        return ans