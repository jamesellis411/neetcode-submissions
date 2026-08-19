class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # i != j, nums[j] = target - nums[i]

        # one pass, where if goal ! in seen, add to seen and move on

        seen = {}

        for i, n in enumerate(nums):
            goal = target - n
            if goal in seen:
                return [seen[goal], i]
            seen[n] = i