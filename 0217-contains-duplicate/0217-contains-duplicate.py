class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        dici={}
        for key in nums:
            if key not in dici:
                dici[key]=1
            else:
                dici[key]=dici[key]+1
        ans=False
        for i in dici:
            if dici[i]>=2:
                ans=True
                break
            else:
                ans=False
        return ans