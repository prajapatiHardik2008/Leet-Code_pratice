class Solution {
    public int countCommas(int n) {

        if (n < 1000)
            return 0;

        if (n < 1000000)
            return n - 999;

        if (n < 1000000000)
            return 999000 + (n - 999999) * 2;

        return 999000 + 1998000000 + (n - 999999999) * 3;
    }
}