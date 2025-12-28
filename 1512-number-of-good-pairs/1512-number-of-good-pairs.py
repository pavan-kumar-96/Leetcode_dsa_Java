class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        dici={}
        for key in nums:
            if key in dici:
                dici[key]+=1
            else:
                dici[key]=1
        ans=0
        for i in dici:
            n=dici[i]
            temp=n*(n-1)//2
            ans=ans+temp
        return ans