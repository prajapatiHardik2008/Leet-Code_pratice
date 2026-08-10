import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++)
        {
            int moreNeeded = target - nums[i];
            if(mpp.containsKey(moreNeeded))
            {
                return new int[] { mpp.get(moreNeeded), i };
            }
            mpp.put(nums[i], i);
        }
        return new int[] {};
    }
}