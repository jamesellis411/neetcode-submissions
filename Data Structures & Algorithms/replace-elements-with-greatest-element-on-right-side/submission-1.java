class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ret = new int[n];
        int rightMax = -1;

        for (int i = n-1; i >= 0; i--){
            ret[i] = rightMax;
            rightMax = Math.max(arr[i], rightMax);
        } 

        return ret;
    }
}