class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ar=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
         Arrays.sort(nums);
        solve(nums,ar,list,0);
        return ar;

        
    }
    public void solve(int nums[],List<List<Integer>>ar,ArrayList<Integer>list,int start){
        
        if(start==nums.length){
            if(!ar.contains(list)){
            ar.add(new ArrayList<>(list));
           
            return;
           
        }
        }
        else{
            list.add(nums[start]);
            solve(nums,ar,list,start+1);
            list.remove(list.size()-1);
             solve(nums,ar,list,start+1);

        }
        
    }

}