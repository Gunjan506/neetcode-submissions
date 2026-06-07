class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        // for(int i=0;i<nums.length;i++){
        //     int ele = nums[i];
        for(int ele:nums){
            xor = xor^ele;
        }
        return xor;
    }
}
