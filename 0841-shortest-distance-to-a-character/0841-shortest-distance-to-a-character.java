class Solution {
    public int[] shortestToChar(String s, char c) {
        char[]arr=s.toCharArray();
        ArrayList<Integer>al=new ArrayList<>();
           ArrayList<Integer>aas=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==c){
                al.add(i);
            }

        }
        for(int i=0;i<s.length();i++){
            int co=0;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<al.size();j++){
                co=Math.abs(i-al.get(j));
                if(co<min){
                min=co;
                }
            }


                
                aas.add(min);
            
        }
        int res[]=new int[aas.size()];
        for(int i=0;i<res.length;i++){
            res[i]=aas.get(i);
        }
        return res;
        
    }
}