class Solution {
    public int maxProduct(int n) {
       int max = 0;
        int maxsec = 0;
        while(n != 0)
        {
            int rem = n % 10;
            if(rem > max)
            {
                maxsec = max;
                max = rem;
            }
            else if(rem > maxsec)
            {
                maxsec = rem;
            }
            n /= 10;
        }
        return max * maxsec;
    }
}