class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int n: nums){
            numSet.add(n);
        }

        int longestStreak = 0;

        for (int n: numSet){
            if (!numSet.contains(n-1)) {
                int currentStreak = 1;
                while (numSet.contains(n + currentStreak)){
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
