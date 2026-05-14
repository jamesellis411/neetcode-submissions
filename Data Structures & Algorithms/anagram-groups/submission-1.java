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
        List<List<String>> anagrams = new ArrayList<>();
        for (String key : map.keySet()){
            anagrams.add(map.get(key));
        }
        return anagrams;
    }
}
