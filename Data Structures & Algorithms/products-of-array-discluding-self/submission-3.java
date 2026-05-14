class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] retval = new int[n];
        int prod = 1, zeros = 0;

        for (int num : nums){
            if(num == 0){
                zeros++;
            } else {
                prod *= num;
            }
        }

        for (int i = 0; i < n; i++){
            if (nums[i] == 0){
                retval[i] = (zeros > 1) ? 0 : prod;
            } else {
                retval[i] = (zeros > 0) ? 0 : prod / nums[i];
            }
        }

        return retval;
    }
}  
