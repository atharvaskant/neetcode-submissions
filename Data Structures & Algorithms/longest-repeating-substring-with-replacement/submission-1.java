class Solution {
    public int characterReplacement(String s, int k) {

        int[] count = new int[26];

        int maxFrequency = 0;
        int maxLength = 0;
        int i=0, j=0;

        while(j < s.length()) {

            count[s.charAt(j)-'A']++;
            maxFrequency = Math.max(maxFrequency, count[s.charAt(j)-'A']);
                        while((j-i+1) - maxFrequency > k) {
                count[s.charAt(i)-'A']--;
                i++;
            }
            maxLength = Math.max(maxLength, j-i+1);
            j++;
            
        }
        return maxLength;
        
    }
    
}
