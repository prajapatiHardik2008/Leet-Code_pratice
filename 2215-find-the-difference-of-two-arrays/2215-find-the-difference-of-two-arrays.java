class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums1)
        {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums2)
        {
            set2.add(num);
        }
        int maxr = Math.max(nums1.length, nums2.length);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();
        
        for(int i = 0 ; i< nums1.length; i++)
        {
            if(!set2.contains(nums1[i]))
            {
                answer1.add(nums1[i]);
                set2.add(nums1[i]);
            }
            
        }
        for(int i = 0 ; i< nums2.length; i++)
        {
            if(!set1.contains(nums2[i]))
            {
                answer2.add(nums2[i]);
                set1.add(nums2[i]);
            }
        }
        ans.add(answer1);
        ans.add(answer2);
        return ans;

    }
}