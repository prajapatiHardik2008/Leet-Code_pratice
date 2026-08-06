class Solution {
    public int getpro(int n){
        int pro  =  1 ;
        while(n != 0)
        {
            pro *= n % 10;
            n /= 10;
        }
        return pro;
    }
    public int smallestNumber(int n, int t) {
       int rem  = n % 10 ;
       while(true)
       {
        if(getpro(n) % t == 0)
        {
            return n;
        }
        n++;
       }
    }

}