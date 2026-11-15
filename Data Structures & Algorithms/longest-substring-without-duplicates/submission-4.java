class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0, i=0, j=0;
        Map<Character, Integer> map = new HashMap<>();
        while(j < s.length()) {
            if(map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            maxLength = Math.max(j-i+1, maxLength);
            map.put(s.charAt(j), j);
            j++;
        }
        return maxLength;
        
    }
}
