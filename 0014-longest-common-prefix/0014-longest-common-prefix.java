class Solution {
    public String longestCommonPrefix(String[] strs) {
       
        String ans="";
            for(int i=0;i<strs[0].length();i++){
                boolean aa=true;
                for(int j=1;j<strs.length;j++){
                    if(i+1>strs[j].length()){
                        return ans;

                    }
                    if(strs[0].charAt(i)!=strs[j].charAt(i)){
                        aa=false;
                        break;
                        
                    }
                }
                if(aa==true){
                ans=ans+strs[0].charAt(i);
            }
            else{
                break;
            }
            }
        return ans;
        
    }
}