class Solution {
    public long countCommas(long n) {
        long totalCommas = 0;
        
        for (long threshold = 1000; threshold <= n; threshold *= 1000) {
            totalCommas += (n - threshold + 1);
            
            // Prevent 64-bit signed long overflow on next multiplication
            if (threshold > Long.MAX_VALUE / 1000) {
                break;
            }
        }
        
        return totalCommas;
    }
}