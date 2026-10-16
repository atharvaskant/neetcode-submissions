class Solution {
    public boolean isPalindrome(String s) {

        char[] ch = s.toCharArray();

        int l = 0, r = ch.length - 1;

        while (l < r) {

            char left = Character.toLowerCase(ch[l]);
            char right = Character.toLowerCase(ch[r]);

            if (!isAlphaNumeric(left)) {
                l++;
            } else if (!isAlphaNumeric(right)) {
                r--;
            } else if (left == right) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    boolean isAlphaNumeric(char ch) {
        if ((ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')) {
            return true;
        }

        return false;
    }
}
