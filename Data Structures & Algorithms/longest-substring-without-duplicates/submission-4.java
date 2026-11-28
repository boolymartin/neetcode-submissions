class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int highest = 0;
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            highest = Math.max(highest, i - left + 1);
        }
        return highest;
    }
}