class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        return helper(nums, 0);

        
    }

    List<List<Integer>> helper(int[] nums, int i) {

        List<List<Integer>> result = new ArrayList<>();

        if(i == nums.length) {
            result.add(new ArrayList<>());
            return result;
        }

        List<List<Integer>> subsets = helper(nums, i+1);
        
        for(List<Integer> subset : subsets) {
            List<Integer> with = new ArrayList<>(subset);
            with.add(nums[i]);
            result.add(with);

            List<Integer> without = new ArrayList<>(subset);
            result.add(without);
        }

        return result;

    }
}
