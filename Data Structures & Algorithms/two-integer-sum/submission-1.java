class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length==0) {
            return new int[] {0, 0};
        }
        for (int i=0; i < nums.length; i++) {
            int n1 = nums[i];
            for (int j=i+1; j < nums.length; j++) {
                int n2 = nums[j];
                if (n1 + n2 == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {0, 0};
    }
}
