class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split("\\s+");
        String aa="";
       
        for(int i=arr.length-1;i>=0;i--){
            aa=aa+arr[i]+" ";
            
        }
        return aa.trim();
        
    }
}