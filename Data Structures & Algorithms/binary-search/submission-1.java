class Solution {

    public int search(int[] nums, int target) {
        return fun(nums, 0, nums.length - 1, target);
    }

    public int fun(int[] nums, int s, int e, int target) {

        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] < target) {
            return fun(nums, mid + 1, e, target);
        } else {
            return fun(nums, s, mid - 1, target);
        }
    }
}