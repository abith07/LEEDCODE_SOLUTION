class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        ArrayList<Character>al=new ArrayList<>();
        int count=0;
        for(int i=0;i<allowed.length();i++){
            al.add(allowed.charAt(i));
        }
        for(int i=0;i<words.length;i++){
            String wo=words[i];
            boolean ans=true;
            for(int j=0;j<wo.length();j++){
                if(!al.contains(wo.charAt(j))){
                    ans=false;
                    break;

                }
            }
                if(ans==true){
                    count++;
                }
            }

        
        return count;

        

        
    }
}