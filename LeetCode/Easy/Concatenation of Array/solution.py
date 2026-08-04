class Solution(object):
    def getConcatenation(self, nums):
    
        
        return nums*2
        
    #or
        ans = []
        for i in range(len(nums)):
            ans.append(nums[i])
        for i in range(len(nums)):
            ans.append(nums[i])
        return ans

        
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        