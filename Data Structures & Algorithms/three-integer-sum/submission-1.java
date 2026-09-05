class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            HashSet<Integer> temp = new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                int required = -(nums[i]+nums[j]);
                if(temp.contains(required))
                {
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(required);
                    Collections.sort(res);
                    set.add(res);
                }
                temp.add(nums[j]);
            }
        }
        List<List<Integer>> list =  new ArrayList<>(set);
        return list;
    }
}
