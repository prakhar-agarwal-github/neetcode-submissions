class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] charArray = s.toCharArray();

        while (i < j) {
            while (i < j && !alphaNum(charArray[i])) {
                i++;
            }

            while (j > i && !alphaNum(charArray[j])) {
                j--;
            }

            if (Character.toLowerCase(charArray[i]) != Character.toLowerCase(charArray[j])) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9');
    }
}
