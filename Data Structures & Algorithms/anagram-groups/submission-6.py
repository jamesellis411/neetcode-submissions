class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #Return a list of sublists
        # Anagram means (sorted) strX = strY

        map = {}

        for word in strs:
            sortWord = "".join(sorted(word))
            map.setdefault(sortWord, []).append(word)

        return list(map.values())