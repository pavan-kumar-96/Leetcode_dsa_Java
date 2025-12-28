class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        duplicate= 0
        missing= 0
        s=set()
        for i in range(len(nums)):
            val=nums[i]
            if val not in s:
                s.add(val)
            else:
                duplicate=val
        for i in range(1,len(nums)+1):
            if i not in s:
                missing=i
        return[duplicate,missing]