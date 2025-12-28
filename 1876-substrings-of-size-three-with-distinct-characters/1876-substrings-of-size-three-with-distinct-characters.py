class Solution(object):
    def countGoodSubstrings(self, s):
        n=len(s)
        ans=0
        k=3
        l=0
        dici={}
        for r in range(n):
            if s[r] in dici:
                dici[s[r]]+=1
            else:
                dici[s[r]]=1
            if r-l==k:
                dici[s[l]]-=1
                if dici[s[l]]==0:
                    dici.pop(s[l])
                l+=1
            if len(dici)==k:
                ans+=1
        return ans