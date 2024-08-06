class Solution {
    public boolean checkIfPangram(String sentence) {
        ArrayList<Character>al=new ArrayList<>();
        for(int i=0;i<sentence.length();i++){
            if(!al.contains(sentence.charAt(i))){
                al.add(sentence.charAt(i));
            }
        }
        if(al.size()==26){
            return true;
        }
        return false;
        
    }
}