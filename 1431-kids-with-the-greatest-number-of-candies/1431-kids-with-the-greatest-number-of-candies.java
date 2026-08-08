class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        int target = 0; 
        for(int ele: candies)
        {
            if (ele > target)
            {
                target = ele;
            }
        }

        for(int ele : candies)
        {
            if(ele+extraCandies >= target)
            {
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }

    return ans;
    }
}