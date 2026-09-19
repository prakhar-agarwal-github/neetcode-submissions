class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1)
            return nums.length;

        Set<Integer> set = new HashSet<Integer>();

        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(length, maxLength);
            }
        }

        return maxLength;
    }
}
