class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashSet = set()
        for n in nums:
            hashSet.add(n)
        
        return len(hashSet) != len(nums)