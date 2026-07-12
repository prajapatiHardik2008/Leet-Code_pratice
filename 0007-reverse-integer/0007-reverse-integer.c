
int reverse(int x){
     int  rev = 0 ;
    int tmp;
    while(x != 0)
    {
        tmp = x % 10 ;
        x = x / 10;
            if(rev > INT_MAX / 10 || (rev == INT_MAX/10 && tmp > 7))
            {
                return 0;
            }
            else if ( rev < INT_MIN / 10 || (rev == INT_MIN/10 && tmp < -8 ))
            {
                return 0;
            }
        rev = (rev * 10) + tmp ;
    }
    
    return rev;
}