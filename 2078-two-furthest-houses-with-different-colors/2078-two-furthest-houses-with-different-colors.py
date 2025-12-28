class Solution:
    def maxDistance(self, colors: List[int]) -> int:
        ans=0
        n=len(colors)
        for i in range(n-1,-1,-1):
            if colors[i]!=colors[0]:
                temp=abs(i)
                ans=max(ans,temp)
                break
        for i in range(n):
            if colors[i]!=colors[n-1]:
                temp=abs(n-i-1)
                ans=max(ans,temp)
                break
        return ans