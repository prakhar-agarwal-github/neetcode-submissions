class Solution {
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder("");

        for (String str : strs) {
            int length = str.length();

            encoded.append(length).append("#").append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int hashIdx = str.indexOf("#", i);

            int length = Integer.parseInt(str.substring(i, hashIdx));

            int start = hashIdx + 1;

            String s = str.substring(start, start + length);

            result.add(s);

            i = start + length;
        }

        return result;
    }
}