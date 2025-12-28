class Solution:
    def maxDistance(self, colors: List[int]) -> int:
        ans=0
        n=len(colors)
        for i in range(n):
            for j in range(i+1,n):
                if colors[i]!=colors[j]:
                    temp=abs(i-j)
                    ans=max(ans,temp)
        return ans