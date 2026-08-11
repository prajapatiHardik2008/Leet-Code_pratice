class Solution {
    public int getsum(int[] nums)
    {
        int sum = nums[0];
        for(int i = 0 ; i< nums.length -1 ; i++ )
        {
            if (nums[i+1] == nums[i]+1)
            {
                sum+=nums[i+1];
            }
            else{
                break;
            }
        }
        return sum;
    }
    public int missingInteger(int[] nums) {
        int sum = getsum(nums);
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        
        while (set.contains(sum)) {
            sum++;
        }
        
        return sum;   
    }
}