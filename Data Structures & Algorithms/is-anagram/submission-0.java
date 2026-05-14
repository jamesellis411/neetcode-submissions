class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            int value = map.getOrDefault(c, 0);
            map.put(c, value + 1);
        }

        for (char c : t.toCharArray()){
            int value = map.getOrDefault(c, 0);
            map.put(c, value - 1);
        }

        for (Character c : map.keySet()){
            if (map.get(c) != 0){
                return false;
            }
        }
        return true;
    }
}
