class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        arr[0] = start;
        int res = 0 ^ arr[0];
        for(int i  = 1; i < n ; i ++ )
        {
            arr[i] = start + 2;
            res ^= arr[i];
            start += 2;
        }
        return res;
    }
}