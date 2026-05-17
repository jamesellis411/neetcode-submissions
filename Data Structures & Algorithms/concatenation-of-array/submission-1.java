class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] ret = new int[2*l];
        int idx = 0;
        for (int i = 0; i < 2; i++){
            for (int num : nums){
                ret[idx++] = num;
            }
        }
        return ret;
    }
}