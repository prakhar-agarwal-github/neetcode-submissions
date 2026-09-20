class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // stop if fixed number is already > 0 after sorting
            if (nums[i] > 0)
                break;

            if (i > 0 && nums[i - 1] == nums[i])
                continue;
            int fixed = nums[i];

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = fixed + nums[left] + nums[right];

                if (sum == 0) {
                    list.add(new ArrayList<>(List.of(fixed, nums[left], nums[right])));
                    left++;
                    right--;

                    // skip duplicate left values AFTER moving
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // skip duplicate right values AFTER moving
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return list;
    }
}
