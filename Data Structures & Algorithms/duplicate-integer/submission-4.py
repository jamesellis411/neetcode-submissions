class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:

        # et, store each value in the set, lazy initialization, O(n)

        seen = set()
        for n in nums:
            if n in seen:
                return True
            seen.add(n)
        return False
            

        
        