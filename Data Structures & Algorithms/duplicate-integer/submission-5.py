class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # return True if duplicate, false otherwise
        # set for storing, lazy initialization, use set over hashmap bc only need unique values

        seen = set()

        for num in nums:
            if num in seen:
                return True
            seen.add(num)

        return False