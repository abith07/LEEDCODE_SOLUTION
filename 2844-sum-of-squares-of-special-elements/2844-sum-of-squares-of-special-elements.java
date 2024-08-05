class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int count=0;
            if(n%(i+1)==0){
                count=nums[i]*nums[i];
                ans=ans+count;

            }
        }
        return ans;
        
    }
}