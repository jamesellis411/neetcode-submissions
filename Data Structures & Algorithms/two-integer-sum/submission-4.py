class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # i != j, and we can assume there is always an answer
        # returning an array of the two indicies for i, j, so we need to keep track, thinking we use a hashmap where <n, i>

        seen = {}

        for i, n in enumerate(nums):
            goal = target - n
            if goal in seen:
                return [seen[goal], i]
            seen[n] = i