class Solution {
    public String longestCommonPrefix(String[] strs) {
        String a=strs[0];
        String z="";
        for(int i=0;i<a.length();i++){
            int count=0;
            for(int j=1;j<strs.length;j++){

                if(i+1>strs[j].length()){ return z;}

                if(a.charAt(i)==strs[j].charAt(i)){
                    count++;
                }
            }
                if(count==strs.length-1){
                    z=z+a.charAt(i);
                }
                else{
                    return z;
                }
        }




            
        return z;
        
    }
}