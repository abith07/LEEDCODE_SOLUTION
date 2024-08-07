class Solution {
    public List<Boolean> kidsWithCandies(int[] can, int ex) {
        int max=0;
        for(int i=0;i<can.length;i++){
            if(can[i]>max){
                max=can[i];
            }

        }
        ArrayList<Boolean>al=new ArrayList<>();
        for(int i=0;i<can.length;i++){
            if((ex+can[i])<max){
                al.add(false);
            }
            else{
                al.add(true);
            }
        }
        return al;
        
    }
}