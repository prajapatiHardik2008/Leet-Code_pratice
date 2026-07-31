class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left; i<= right; i++)
        {
            if(isSelfdivid(i))
            {
                res.add(i);
            }
        }
        return res;
    }
    public boolean isSelfdivid(int num)
    {
        int org = num;
        while(num > 0)
        {
            int rem = num % 10 ;
            if( rem == 0 || org % rem != 0)
            {
                return false;
            }
        num /= 10;
        }
        return true;
    }
}