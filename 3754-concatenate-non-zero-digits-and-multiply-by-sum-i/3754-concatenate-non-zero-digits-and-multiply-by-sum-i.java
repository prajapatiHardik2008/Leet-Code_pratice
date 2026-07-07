class Solution {
    public long sumAndMultiply(int n) {
       String s =   String.valueOf(n);
       long sum = 0,num = 0;
       for(int i = 0 ; i < s.length(); i++)
       {
        int digi =  s.charAt(i) - '0';
        if(digi > 0)
        {
            sum += digi;
            num = (num * 10 ) + digi;
        }
       }
       num = num * sum;
       return num;
    }
}