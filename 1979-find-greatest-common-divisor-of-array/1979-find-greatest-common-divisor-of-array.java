import java.util.Arrays;
class Solution {
    public int findGCD(int[] nums) {
        int a = Arrays.stream(nums).max().getAsInt();
        int b = Arrays.stream(nums).min().getAsInt();
        //int gcd = 0;

        while(b != 0 )
        {
            int rem = a % b;
            a = b ;
            b = rem; 
        }
        return a;
    }
}