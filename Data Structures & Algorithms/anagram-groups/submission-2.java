class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs){
            char[] chArray = s.toCharArray();
            Arrays.sort(chArray);
            String sortedStr = new String(chArray);
            if (map.get(sortedStr)!=null){
                map.get(sortedStr).add(s);
            } else {
                map.put(sortedStr, new ArrayList<>());
                map.get(sortedStr).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }
}
