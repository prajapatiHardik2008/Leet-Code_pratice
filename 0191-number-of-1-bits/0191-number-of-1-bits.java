class Solution {
    public int hammingWeight(int n) {
        //String binaryNum = Integer.toBinaryString(n); 
        return Integer.bitCount(n);
    }
}