class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ret = 0, count = 0;
        for (int num : nums){
            if (num == 0){
                ret = Math.max(ret, count);
                count = 0;
            } else {
                count++;
            }
        }
        return Math.max(ret, count);
    }
}