bool isPalindrome(int x) {
    if(x < 0 || (x % 10 == 0 && x != 0))
    {
        return false;
    }
    int rem = 0 ,tmp = x;
    long rev_num = 0 ;
    
    while(tmp != 0)
    {
        rem = tmp % 10;
        rev_num = (rev_num*10)+rem;
        tmp = tmp / 10;
    }
    if(rev_num == x)
    {
       return true;
    }
    else
    {
        return false;
    }
}