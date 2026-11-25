class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> n2 = new HashSet<>();

        for (int i=0; i < nums.length; i++) {
            if (!n2.contains(nums[i])) {
                n2.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }
}