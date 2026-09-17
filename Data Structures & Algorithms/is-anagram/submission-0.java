class Solution {
    public String sort(String str) {
        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        return new String(chars);
    }

    public boolean isAnagram(String s, String t) {

        return sort(s).equals(sort(t));

    }
}
