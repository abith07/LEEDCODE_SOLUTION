class Solution {
    public String truncateSentence(String s, int k) {
        String res[]=s.split(" ");
        String ans="";
        for(int i=0;i<k;i++){
           
            ans=ans+res[i]+" ";

        }
        return ans.trim();
        
    }
}