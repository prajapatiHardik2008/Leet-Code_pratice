class Solution {
    public int countOdds(int low, int high) {
        if(low > 0)
            {
                int hres  =  (high%2 == 0)?high/2:((high/2)+1);
                int lres = low/2;
                int result = hres - lres;
              return result;
            }   
            else{
        int res = (high%2 == 0)?high/2:((high/2)+1);
        return res;
            }
    }
}