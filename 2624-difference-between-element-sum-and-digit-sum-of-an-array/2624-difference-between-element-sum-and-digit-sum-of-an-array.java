class Solution {
    public int differenceOfSum(int[] nums) {
        ArrayList<Integer>a1=new ArrayList<>();
        ArrayList<Integer>a2=new ArrayList<>();
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];

        }
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            while(a!=0){
                int rem=a%10;
                ans=ans+rem;
                a=a/10;
            }
        }
        return Math.abs(sum-ans);
    }
}

        