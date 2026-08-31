class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int ans = 0;
        for (Integer key : map.keySet()) {
            if(map.get(key) > nums.length / 2 && map.get(key) > ans)
            {
                ans = key;
            }
        }
        return ans;
    }
}