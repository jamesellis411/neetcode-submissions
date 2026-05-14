class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // K most frequent elements makes me think to use a bucket sorting algorithm
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // After we have the hashmap for (num : frequency), we want to create an array to store them
        List<Integer>[] list = new List[nums.length + 1]; // freq is at most nums.length
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            if (list[freq] == null){
                list[freq] = new ArrayList<>();
            }
            list[freq].add(num);
        }

        // Now we want to loop through our bucket list and add highest freq(s) to resulting int[]
        int[] res = new int[k];
        int idx = 0;
        for (int i = nums.length; i >=0; i--){
            if (list[i] != null){
                for (int num : list[i]){
                    res[idx] = num;
                    idx++;
                    if (idx >= k){ // check to prevent overwriting past k elements
                        return res;
                    }
                }
            }
        }
        return res;
    }
}