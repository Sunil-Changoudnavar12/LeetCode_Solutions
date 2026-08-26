class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int num = nums.length - k;

        return nums[num];
    }
}