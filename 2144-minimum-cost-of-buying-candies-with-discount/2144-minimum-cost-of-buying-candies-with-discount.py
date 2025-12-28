class Solution(object):
    def minimumCost(self, cost):
        cost.sort()
        n=len(cost)
        ans=0
        took=0
        for i in range(n-1,-1,-1):
            if took==2:
                took=0
            else:
                ans+=cost[i]
                took+=1
        return ans