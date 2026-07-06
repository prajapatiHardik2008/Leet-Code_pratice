class Solution {
    public int subtractProductAndSum(int n) {
        if(n == 0)
        {
            return 0;
        }
        int sum = 0,mul = 1,rem;
        while(n != 0)
        {
            rem = n % 10;
            sum += rem;
            mul *= rem;
            n /= 10; 
        }
        return (mul - sum);
    }
}