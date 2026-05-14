class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1]; // at most frequency = nums.length
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            if (buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }

        int[] res = new int[k]; // at most k elements
        int idx = 0;

        for (int freq = nums.length; freq >= 1; freq--){
            if (buckets[freq] != null){
                for (int num : buckets[freq]){
                    res[idx] = num;
                    idx++;
                    if (idx == k){
                        return res;
                    }
                }
            }
        }

        return res;
    }
}
