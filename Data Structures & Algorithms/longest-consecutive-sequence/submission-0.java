class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        
        for(int num:nums) {
            set.add(num);
        }

        int streak = 0;
        
        for(int num:nums) {
            int count = 0;
            if(!set.contains(num-1)) {
                while(set.contains(num)) {
                    num++;
                    count++;
                }
            }
            streak = Math.max(count, streak);
        }
        return streak;
    }
}
