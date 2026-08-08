class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # Put in set, lazy initialization, if not then add, if return false
        seen = set();

        for num in nums:
            if num in seen:
                return True
            seen.add(num)

        return False

        