class Solution {

    public boolean isAnagram(String s, String t) {
        int[] sMap = new int[26];
        int[] tMap = new int[26];

        for (Character ch:s.toCharArray()) {
            sMap[ch - 'a']++;
        }

        for (Character ch:t.toCharArray()) {
            tMap[ch - 'a']++;
        }
        
        for (int i=0; i< 26; i++) {
            if (sMap[i] != tMap[i]) {
                return false;
            }
        }

        return true;
    }

        
}
