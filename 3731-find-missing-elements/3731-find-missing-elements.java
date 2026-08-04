class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE, max =  Integer.MIN_VALUE;
        for(int num : nums)
        {
            set.add(num);
            if(num > max)
            {
                max = num;
            }
            if(num < min)
            {
                min = num;
            }
        }

        for(int i = min; i <= max ; i++)
        {
            if(!set.contains(i))
            {
                res.add(i);
            }
        }
    
    return res;
    }

}