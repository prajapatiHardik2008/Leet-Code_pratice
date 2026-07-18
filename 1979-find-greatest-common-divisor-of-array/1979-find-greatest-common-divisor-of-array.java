import java.util.Arrays;
class Solution {
    public int findGCD(int[] nums) {
        //int a = Arrays.stream(nums).max().getAsInt();
        //int b = Arrays.stream(nums).min().getAsInt();
        //int gcd = 0;
        int min = nums[0];
        int max = nums[0];
        for(int i = 0 ; i< nums.length ; i++)
        {
            if(nums[i] < min)
            {
                min = nums[i];

            }
            if(nums[i] > max)
            {
                max = nums[i];
            }
        }
        return calGcd(max,min);

        
    }
    public int calGcd(int a , int b)
    {
        while(b != 0 )
        {
            int rem = a % b;
            a = b ;
            b = rem; 
        }
        return a;
    }
}
