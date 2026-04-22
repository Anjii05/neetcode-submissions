class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        java.util.HashSet<Integer> window = new java.util.HashSet<>();

        for (int right = 0; right < nums.length; right++) {

            // 1. Check duplicate
            if (window.contains(nums[right])) {
                return true;
            }

            // 2. Add current element
            window.add(nums[right]);

            // 3. Maintain window size (at most k)
            if (window.size() > k) {
                window.remove(nums[right - k]);
            }
        }

        return false;
    }
}