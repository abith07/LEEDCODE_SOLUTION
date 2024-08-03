class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int sum=0;
        int ans=0;
        List<Integer>li=new ArrayList<>();
         //List<Integer>l2=new ArrayList<>();
        for(int i=nums.size()-1;i>=0;i--){
            ans++;
            if(nums.get(i)<=k){
                if(!li.contains(nums.get(i)))
                {
                li.add(nums.get(i));
                if(li.size()==k){return ans;}
                }
            }
        }
        return ans;
            
            

          
           

        
        
    }
}