class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        int[] result = new int[queries.length];
        long[] prefixSum = new long[n + 1];
        long[] count = new long[n + 1]; // non-zero digits count
        long[] power = new long[n + 1];
        long[] preConcat = new long[n + 1]; // stores concat number
        int MOD = 1_000_000_007;

        power[0] = 1;
        for (int i = 0; i < n; i++) {
            // Power precompute
            power[i + 1] = (power[i] * 10) % MOD;
            
            // Prefix Sum
            prefixSum[i + 1] = prefixSum[i] + (s.charAt(i) - '0');
            
            // Concat number and Count
            if (s.charAt(i) == '0') {
                preConcat[i + 1] = preConcat[i];
                count[i + 1] = count[i];
            } else {
                preConcat[i + 1] = ((preConcat[i] * 10) + (s.charAt(i) - '0')) % MOD;
                count[i + 1] = count[i] + 1;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            long sum = (prefixSum[r + 1] - prefixSum[l]) % MOD;

            // Range extraction for non-zero digits
            long leftPart = preConcat[l];
            long rightPart = preConcat[r + 1];
            long diff = count[r + 1] - count[l];
            
            // Formula: rightPart - (leftPart * 10^diff)
            long range = (rightPart - (leftPart * power[(int)diff]) % MOD + MOD) % MOD;

            result[i] = (int)((range * sum) % MOD);
        }
        return result;
    }
}