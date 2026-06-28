class Solution {
    public double angleClock(int hour, int minutes) {
       if(Math.abs( (double)((30*hour) - (5.5 * minutes)) )  > 180 )
       {
       return  360 - ( Math.abs( (double)((30*hour) - (5.5 * minutes)) ) ); 
       }
       return Math.abs( (double)((30*hour) - (5.5 * minutes)) );
    }
}