class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        #Same number of characters -> early exit if len s != len t
        if len(s) != len(t):
            return False
        return sorted(s) == sorted(t)

        #I know you can sort strings, if sorted, then when you compare, they should be identical, so you can do a direct comparison

        # This would be O(n+m) complexity because you ahve to compare each character in s and t, where len(s) = n, len(t) = m
        