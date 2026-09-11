class Solution {

    public int totalNumbers(int[] digits) {

        int[] count = new int[10];

        // Frequency of each digit
        for (int d : digits) {
            count[d]++;
        }

        int ans = 0;

        // Check every 3-digit number
        for (int num = 100; num <= 998; num += 2) {

            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            // Temporarily use the digits
            if (count[a] > 0) {
                count[a]--;

                if (count[b] > 0) {
                    count[b]--;

                    if (count[c] > 0) {
                        ans++;
                    }

                    count[b]++;
                }

                count[a]++;
            }
        }

        return ans;
    }
}