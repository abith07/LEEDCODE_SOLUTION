class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;
        int max=1;
        Arrays.sort(nums);
        if(nums.length==0){
                return 0;
            }

        for(int i=0;i<=nums.length-2;i++){
            
            if(nums[i]+1==nums[i+1]){
                count++;
                if(count>max){
                    max=count;
                }
            }
                else if(nums[i]==nums[i+1]){
                    continue;
                }
            
            else{
                
                count=1;
            }
        }
        return max;
        
    }
}