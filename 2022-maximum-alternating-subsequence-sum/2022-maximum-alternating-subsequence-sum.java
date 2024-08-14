class Solution {
    public long maxAlternatingSum(int[] nums) {
        long odd = 0;
        long even=0;
        for (int i=0;i<nums.length;i++) {
            even = Math.max(even, odd + nums[i]);
            odd = even - nums[i];
        }
        return even;
    }
}