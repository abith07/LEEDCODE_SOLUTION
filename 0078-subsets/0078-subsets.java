class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ar=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        solve(nums,ar,list,0);
        return ar;

        
    }
    public void solve(int nums[],List<List<Integer>>ar,ArrayList<Integer>list,int start){
        if(start==nums.length){
            ar.add(new ArrayList<>(list));
            return;
        }
        else{
            list.add(nums[start]);
            solve(nums,ar,list,start+1);
            list.remove(list.size()-1);
             solve(nums,ar,list,start+1);

        }
    }
}