class Solution {
    public int countKeyChanges(String s) {
        String b=s.toLowerCase();
        int count=0;
        for(int i=0;i<b.length()-1;i++){
            if(b.charAt(i)!=b.charAt(i+1)){
                count++;
            }

        }
        return count;
        
    }
}