class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0, i=0, j=0;
        Set<Character> set = new HashSet<>();
        while(j < s.length()) {
            while(set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }
            maxLength = Math.max(j-i+1, maxLength);
            set.add(s.charAt(j));
            j++;
        }
        return maxLength;
        
    }
}
